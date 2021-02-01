import json
import math
from datetime import datetime, timedelta

from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import call_tda
from Utilities import read_json


def process_rvol_rt(code, td):
    tdscaler = 252.0 / float(td)

    today = datetime.now()
    dldays = -1 * ((td * 7 / 5) + 25)
    days = today + timedelta(days=dldays)
    stdate = int(days.timestamp() * 1000)

    url = r"https://api.tdameritrade.com/v1/marketdata/{}/pricehistory".format(code)
    p = dict(apikey=td_api_key, periodType='month', frequencyType='daily', startDate=stdate)
    content = call_tda(url, p)

    cnd = content['candles']

    knt = int(0)
    preval = float(0.0)
    summ = float(0.0)
    for val in reversed(cnd):
        close = float(val['close'])
        if knt > 0 and preval > 0.0:
            nlog = math.log(close / preval) ** 2
            summ += nlog
        knt += 1
        if knt > td:
            break
        preval = close
        ms = val['datetime']
        dt = datetime.fromtimestamp(ms / 1000)
        # print(dt, close, knt)

    num = summ * tdscaler
    rv = math.sqrt(num) * 100.0

    return rv


if __name__ == '__main__':
    # jsondata = read_json('TDAmeritrade/data/spy.json')
    rvol = process_rvol_rt('PACB', 22)
    print(rvol)
