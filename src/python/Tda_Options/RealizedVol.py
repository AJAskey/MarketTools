import csv
import math

from Optuma.ETF_Processor import get_exch
from Tda_Options import optumaPricePath

header = ['code', 'dat', 'open', 'high', 'low', 'close', 'volume', 'oi']


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
    c = "VIX"
    ex = get_exch(c)
    rvol = process_rvol(c, 20)
    print()
    print(rvol)
