from datetime import datetime

from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import call_tda
from Utilities import ms_to_datetime, datetime_to_ms


def process(code, scaler, outfile=""):
    # start_date = datetime(2020, 7, 1)
    start_date = datetime(1980, 1, 1)
    start_ms = datetime_to_ms(start_date)

    end_date = datetime.now()
    end_ms = datetime_to_ms(end_date)

    url = r"https://api.tdameritrade.com/v1/marketdata/{}/pricehistory".format(code)
    p = dict(apikey=td_api_key, periodType='month', frequencyType='daily', startDate=start_ms, endDate=end_ms)
    content = call_tda(url, p)

    cnd = content['candles']
    # print_json(cnd)

    for val in cnd:
        close = float(val['close']) / scaler
        dt = ms_to_datetime(val['datetime'])
        tmp = dt.strftime("%Y-%m-%d")
        str = "{}, {:.2f}".format(tmp, close)
        print(str)
    print(code)


if __name__ == '__main__':
    # process("VIX", 1.0)
    process("TLT", 100.0)
