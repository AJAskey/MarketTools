import csv
import math
from datetime import datetime, timedelta

from Optuma.ETF_Processor import get_exch
from Tda_Options import optumaPricePath, td_api_key
from Tda_Options.TDA_Interface import call_tda

header = ['code', 'dat', 'open', 'high', 'low', 'close', 'volume', 'oi']


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


def process_rvol(code, td):
    close = []
    tdscaler = 252.0 / float(td)

    exch = get_exch(code)
    path = optumaPricePath + exch + '/' + code[0:1] + '/' + code + '.csv'
    print(path)

    with open(path) as f:
        data = csv.DictReader(f, fieldnames=header)
        prev = float(0.0)
        close.clear()
        for row in data:
            close.append(row['close'])

    knt = 0
    preval = float(0.0)
    summ = float(0.0)
    for val in reversed(close):
        if knt > 0 and preval > 0.0:
            nlog = math.log(float(val) / preval) ** 2
            summ += nlog
        knt += 1
        if knt >= td:
            break
        preval = float(val)

    num = summ * tdscaler
    rv = math.sqrt(num) * 100.0

    return rv


if __name__ == '__main__':
    c = "SPY"
    rvol = process_rvol_rt(c, 22)
    print()
    print(rvol)
