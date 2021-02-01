from OptionData import OptionData
from TDAmeritrade import td_api_key
from TDAmeritrade.Statistics import Statistics
from TDAmeritrade.TDA_Interface import call_tda
from TDAmeritrade.TdProcess import get_avg_iv, get_realvol

totalPuts = 0
totalCalls = 0
valuePuts = 0.0
valueCalls = 0.0


def process(data, opts):
    for expdate in data.keys():
        for strike in data[expdate].keys():
            for option in data[expdate][strike]:
                jd = OptionData(option)
                if jd.valid:
                    if jd.oi > 0:
                        if jd.mark > 0.0:
                            if jd.type == "PUT":
                                opts.totalPutsOi += jd.oi
                                opts.totalPutsVol += jd.volume
                                opts.dollarPutsOi += float(jd.oi) * float(jd.last)
                                opts.dollarPutsVol += float(jd.volume) * float(jd.last)
                            elif jd.type == "CALL":
                                opts.totalCallsOi += jd.oi
                                opts.totalCallsVol += jd.volume
                                opts.dollarCallsOi += float(jd.oi) * float(jd.last)
                                opts.dollarCallsVol += float(jd.volume) * float(jd.last)


if __name__ == '__main__':

    codes = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEZ', 'IGV', 'ITA', 'IWM', 'IYT', 'JKG', 'JKJ',
             'KIE', 'KRE', 'PICK', 'PPH', 'QQQ', 'RING', 'SLV', 'SMH', 'SPY', 'TLT', 'USRT', 'WOOD', 'XHB', 'XLB',
             'XLC', 'XLE', 'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT']

    test_codes = ['SPY', 'QQQ']

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    statlist = []

    for code in codes:

        p = dict(apikey=td_api_key, symbol=code)
        content = call_tda(url, p)

        if content['status'] == "SUCCESS":
            print("Processing : ", code)

            ul = content['underlyingPrice']

            stats = Statistics(code)

            process(content['callExpDateMap'], stats)
            process(content['putExpDateMap'], stats)

            stats.calliv = get_avg_iv(content['callExpDateMap'], ul, False)
            stats.putiv = get_avg_iv(content['putExpDateMap'], ul, False)
            stats.realvol = get_realvol(code, 22)
            if stats.realvol > 0.0:
                stats.premium = ((stats.avgiv / stats.realvol) - 1.0) * 100.0

            stats.calc()
            statlist.append(stats)

        else:
            print("Bad code : ", code)

    with open("D:/Dev/MarketTools - dev/lists/OptionVol.csv", 'w') as fp:
        fp.write("CODE,IV,RealVol,Prem,Puts,Calls,PC,Put$,Call$,PC$,PutsOI,CallsOI,PCOI,Put$OI,Call$OI,PC$OI,")
        fp.write("IV,Prem\n")
        for stats in statlist:
            fp.write("{},{:.2f},{:.2f},{:.1f},{:d},{:d},{:.2f},{:d},{:d},{:.2f},".format(
                stats.code, stats.avgiv, stats.realvol, stats.premium,
                stats.totalPutsVol, stats.totalCallsVol, stats.putcall,
                int(stats.dollarPutsVol), int(stats.dollarCallsVol), stats.dollarputcall))
            fp.write("{:d},{:d},{:.2f},{:d},{:d},{:.2f},".format(
                stats.totalPutsOi, stats.totalCallsOi, stats.putcallio,
                int(stats.dollarPutsOi), int(stats.dollarCallsOi), stats.dollarputcalloi))
            fp.write("{:.2f},{:.2f}\n".format(stats.avgiv, stats.premium))
