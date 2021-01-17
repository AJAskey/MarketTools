import sys
import traceback

from Tda_Options import td_api_key
from Tda_Options.TDA_Interface import call_tda

debug = False


def process_option(cntnt):
    puts = 0
    calls = 0
    put_oi = 0
    call_oi = 0
    put_cost = 0.0
    call_cost = 0.0
    poi_cost = 0.0
    coi_cost = 0.0

    cm = cntnt['callExpDateMap']
    pm = cntnt['putExpDateMap']

    for expdate in cm.keys():
        for strike in cm[expdate].keys():
            # print(" strike --> ", strike)
            for option in cm[expdate][strike]:
                last = float(option['last'])
                v = int(option['totalVolume'])
                vdol = float(option['totalVolume']) * last * 100.0
                oi = int(option['openInterest'])
                oidol = float(option['openInterest']) * last * 100.0

                if debug:
                    x = v + oi
                    if x > 0:
                        sym = option['symbol']
                        print("{}\t{:10.2f}\t{:10d}\t{:,d}\t{:10d}\t{:,d}".format(sym, last, v, int(vdol), oi, int(oidol)))

                calls += v
                call_cost += vdol
                call_oi += oi
                coi_cost += oidol

    for expdate in pm.keys():
        for strike in pm[expdate].keys():
            # print(" strike --> ", strike)
            for option in pm[expdate][strike]:
                last = float(option['last'])
                v = int(option['totalVolume'])
                vdol = float(option['totalVolume']) * last * 100.0
                oi = int(option['openInterest'])
                oidol = float(option['openInterest']) * last * 100.0

                if debug:
                    x = v + oi
                    if x > 0:
                        sym = option['symbol']
                        print("{}\t{:10.2f}\t{:10d}\t{:,d}\t{:10d}\t{:,d}".format(sym, last, v, int(vdol), oi, int(oidol)))

                puts += v
                put_cost += vdol
                put_oi += oi
                poi_cost += oidol

    return puts, calls, put_oi, call_oi, put_cost, call_cost, poi_cost, coi_cost


if __name__ == '__main__':
    debug = True
    # for c in etf_codes:
    for c in ["SPY", "QQQ"]:
        try:
            url = r"https://api.tdameritrade.com/v1/marketdata/chains"
            p = dict(apikey=td_api_key, symbol=c)
            content = call_tda(url, p)
            pt, cl, poi, coi, pcost, ccost, poicost, coicost = process_option(content)
            if cl > 0 and coi > 0:
                s = "{:,}".format(int(pcost * 100))
                print("{}, {:10d}, {:10d}, {:6.2f}, {:10d}, {:10d}, {:6.2f}, {}, {:10d}, {}, "
                      "{:13d}".
                      format(c, pt, cl, float(pt / cl), poi, coi, float(poi / coi), s,
                             int(ccost * 100), int(poicost * 100), int(coicost * 100)))
        except Exception as e:
            print(e)
            traceback.print_exc(file=sys.stdout)
