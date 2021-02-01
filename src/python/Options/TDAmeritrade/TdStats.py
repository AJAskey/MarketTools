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

    etf_codes = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEO', 'IEZ', 'IGE', 'IGV', 'IHE', 'ITA', 'IWM', 'IYT',
                 'KIE', 'KRE', 'PICK', 'RING', 'SLV', 'SMH', 'UUP', 'WOOD', 'XHB', 'XLB', 'XLC', 'XLE',
                 'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT', 'QQQ', 'SPY']

    main_codes = ['XLB', 'XLE', 'XLF', 'XLI', 'XLK', 'XLP', 'XLU', 'XLV', 'XLY', 'XHB', 'XRT', 'SMH',
                  'IBB', 'IWM', 'DIA', 'QQQ', 'SPY']

    stock_codes = ['AAXN', 'ADI', 'ALB', 'AMAT', 'APPS', 'ATVI', 'AVGO', 'CALX', 'CHGG', 'CORT', 'CI', 'CZR',
                   'DAR', 'DFS', 'DKS', 'DM', 'ENTG', 'EMR', 'ETSY', 'FTAI', 'GM', 'GNRC', 'HALO',
                   'IAC', 'IIVI', 'IPHI', 'JNJ', 'KLAC', 'KKR', 'KMX', 'LLY', 'LRCX', 'LYV', 'NDAQ',
                   'NFLX', 'NTLA', 'ON', 'PACB', 'QCOM', 'QRVO', 'REGI', 'SCCO', 'SHAK', 'SNPS', 'TER',
                   'TSCO', 'TWLO', 'TXN', 'VUZI']

    bond_codes = ['TLT']

    test_codes = ['GME', 'SPCE']

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    statlist = []
    totstats = Statistics("Combined")

    for code in main_codes:

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
                stats.putpremium = ((stats.putiv / stats.realvol) - 1.0) * 100.0
                stats.callpremium = ((stats.calliv / stats.realvol) - 1.0) * 100.0

            totstats.code += " " + code

            totstats.totalPutsVol += stats.totalPutsVol
            totstats.totalCallsVol += stats.totalCallsVol
            totstats.totalPutsOi += stats.totalPutsOi
            totstats.totalCallsOi += stats.totalCallsOi

            totstats.dollarPutsVol += stats.dollarPutsVol
            totstats.dollarCallsVol += stats.dollarCallsVol
            totstats.dollarPutsOi += stats.dollarPutsOi
            totstats.dollarCallsOi += stats.dollarCallsOi

            stats.calc()
            statlist.append(stats)

        else:
            print("Bad code : ", code)

    totstats.calc()
    print(totstats)

    with open("out/tdstats.txt", 'w') as fp:
        for stats in statlist:
            fp.write("{}\n".format(stats))
        fp.write("\n{}\n".format(totstats))
