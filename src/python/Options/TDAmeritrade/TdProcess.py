import json
from datetime import datetime, timedelta, date

from OptionData import OptionData
from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import call_tda
from Utilities import ms_to_datetime, datetime_to_str


def process(data):
    retlist = []
    for expdate in data.keys():
        for strike in data[expdate].keys():
            for option in data[expdate][strike]:
                jd = OptionData(option)
                retlist.append(jd)
    return retlist


def buildstr(data):
    tmp = "{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}{}".format(
        data.type, datetime_to_str(data.expiration),
        data.daysToExpiration, data.strike, data.oi, data.volume,
        data.bid, data.ask, data.last, data.mark,
        data.volatility, data.delta, data.gamma, data.theta, data.vega, data.rho,
        datetime_to_str(data.tradeTime),
        "\n")
    ret = tmp.replace("nan,", "0.0,")
    return ret


def header(file, cod, underlying):
    file.write("Type,Expiration,Days,Strike,OI,Volume,Bid,Ask,Last,Mark,")
    file.write("IV,Delta,Gamma,Theta,Vega,Rho,LastTrade,,")
    file.write(cod)
    file.write(",")
    file.write(str(underlying))
    file.write("\n")


if __name__ == '__main__':
    # code = 'SPY'

    etf_codes = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEO', 'IEZ', 'IGE', 'IGV', 'IHE', 'ITA', 'IWM', 'IYT',
                 'KIE', 'KRE', 'PICK', 'RING', 'SLV', 'SMH', 'UUP', 'WOOD', 'XHB', 'XLB', 'XLC', 'XLE',
                 'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT', 'QQQ', 'SPY']

    test_codes = ['SPY', 'QQQ']

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    for code in test_codes:

        p = dict(apikey=td_api_key, symbol=code)
        content = call_tda(url, p)

        if content['status'] == "SUCCESS":

            ul = content['underlyingPrice']

            calls = process(content['callExpDateMap'])
            puts = process(content['putExpDateMap'])

            strToday = date.today().strftime("%Y%m%d")
            filename = "out/{c}-{d}.csv".format(c=code, d=strToday)
            print(filename)
            with open(filename, 'w') as fp:
                header(fp, code, ul)
                for c in calls:
                    if c.valid:
                        if c.mark > 0.099:
                            fp.write(buildstr(c))
                for p in puts:
                    if p.valid:
                        if p.mark > 0.099:
                            fp.write(buildstr(p))
