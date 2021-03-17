import time

from TDAmeritrade import td_api_key
from TDAmeritrade.OptionData import OptionData
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


def build_list(fname):
    ret = []
    f = open(file=fname, encoding='utf-8')
    for line in f:
        c = line.split(',')
        cc = c[0].strip()
        if cc != "Code":
            ret.append(cc)
    f.close()
    return ret


if __name__ == '__main__':

    codes1 = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEZ', 'IGV', 'ITA', 'IWM', 'IYT', 'JKG', 'JKJ',
              'KIE', 'KRE', 'PICK', 'PPH', 'QQQ', 'RING', 'SLV', 'SMH', 'SPY', 'TLT', 'USRT', 'WOOD', 'XHB', 'XLB',
              'XLC', 'XLE', 'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT']
    codes1.sort()

    codes2 = ['AAPL', 'AMZN', 'BBY', 'BDX', 'BLL', 'CAT', 'CMCSA', 'COP', 'CRM', 'CSCO', 'DD', 'DHI', 'FIS',
              'GILD', 'GOOG', 'HD', 'HLT', 'IP', 'JNJ', 'JPM', 'KMI', 'KO', 'LB', 'LMT', 'MCD', 'MSFT', 'NVDA',
              'PG', 'PH', 'TMO', 'UNH', 'UPS', 'V', 'VZ', 'WMT', 'XOM']
    codes2.sort()

    watchlist = build_list("D:/dev/MarketTools - dev/lists/watchlist.csv")

    codes12 = codes1 + codes2
    codes12w = codes1 + codes2 + watchlist

    zombie_codes = build_list("D:/dev/eclipse-markettools/MarketTools/sipout/Zombies2-sc.txt")
    zombie_codes.sort()

    tmp_codes = set(codes12w + zombie_codes)
    all_codes = list(tmp_codes)
    all_codes.sort()

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    statlist = []

    knt = 0
    for code in all_codes:

        knt += 1
        if knt > 10:
            time.sleep(3.33)
            knt = 0

        p = dict(apikey=td_api_key, symbol=code)
        content = call_tda(url, p)
        try:
            if content['status'] == "SUCCESS":
                print("Processing : ", code)

                ul = content['underlyingPrice']

                stats = Statistics(code)

                process(content['callExpDateMap'], stats)
                process(content['putExpDateMap'], stats)

                stats.calliv = get_avg_iv(content['callExpDateMap'], ul, False)
                stats.putiv = get_avg_iv(content['putExpDateMap'], ul, False)
                try:
                    stats.realvol = get_realvol(code, 22)
                except:
                    stats.realvol = 0.0
                if stats.realvol > 0.0:
                    stats.premium = ((stats.avgiv / stats.realvol) - 1.0) * 100.0

                stats.calc()
                statlist.append(stats)

            else:
                print("Bad code : ", code)
        except:
            print("Exception code : ", code)
            time.sleep(15.0)

    with open("D:/Dev/MarketTools - dev/lists/OptionVol.csv", 'w') as fp:
        fp.write("CODE,IV,RealVol,Prem,Puts,Calls,PC,Put$,Call$,PC$,PutsOI,CallsOI,PCOI,Put$OI,Call$OI,PC$OI,")
        fp.write("IV,Prem\n")
        for stats in statlist:
            fp.write("{},{:.2f},{:.2f},{:.1f},{:d},{:d},{:.2f},{:d},{:d},{:.2f},".format(
                stats.code, stats.avgiv, stats.realvol, stats.premium,
                stats.totalPutsVol, stats.totalCallsVol, stats.putcall,
                int(stats.dollarPutsVol * 100.0), int(stats.dollarCallsVol * 100.0), stats.dollarputcall * 100.0))
            fp.write("{:d},{:d},{:.2f},{:d},{:d},{:.2f},".format(
                stats.totalPutsOi, stats.totalCallsOi, stats.putcallio,
                int(stats.dollarPutsOi * 100.0), int(stats.dollarCallsOi * 100.0), stats.dollarputcalloi))
            fp.write("{:.2f},{:.2f}\n".format(stats.avgiv, stats.premium))
