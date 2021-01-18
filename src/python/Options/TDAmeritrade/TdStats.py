import json

from OptionData import OptionData
from TDAmeritrade import td_api_key
from TDAmeritrade.Statistics import Statistics
from TDAmeritrade.TDA_Interface import call_tda


totalPuts = 0
totalCalls = 0
valuePuts = 0.0
valueCalls = 0.0


def process(data, s):
    for expdate in data.keys():
        for strike in data[expdate].keys():
            for option in data[expdate][strike]:
                jd = OptionData(option)
                if jd.valid:
                    if jd.oi > 0:
                        if jd.mark > 0.0:
                            if jd.type == "PUT":
                                s.totalPutsOi += jd.oi
                                s.totalPutsVol += jd.volume
                            elif jd.type == "CALL":
                                s.totalCallsOi += jd.oi
                                s.totalCallsVol += jd.volume


if __name__ == '__main__':

    etf_codes = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEO', 'IEZ', 'IGE', 'IGV', 'IHE', 'ITA', 'IWM', 'IYT',
                 'KIE', 'KRE', 'PICK', 'RING', 'SLV', 'SMH', 'UUP', 'WOOD', 'XHB', 'XLB', 'XLC', 'XLE',
                 'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT', 'QQQ', 'SPY']

    test_codes = ['SPY', 'QQQ']

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    statlist = []

    for code in test_codes:

        p = dict(apikey=td_api_key, symbol=code)
        content = call_tda(url, p)

        if content['status'] == "SUCCESS":
            stats = Statistics(code)

            process(content['callExpDateMap'], stats)
            process(content['putExpDateMap'], stats)

            statlist.append(stats)

    for s in statlist:
        s.calc()
        print(s)
