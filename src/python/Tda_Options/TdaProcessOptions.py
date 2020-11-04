import sys
import traceback
from datetime import date
from datetime import timedelta

from Optuma.ETF_Processor import etf_codes
from Tda_Options import td_api_key
from Tda_Options.RealizedVol import process_rvol
from Tda_Options.TDA_Interface import call_tda


def get_iv(code, typ):
    url = r"https://api.tdameritrade.com/v1/marketdata/chains"
    p = dict(apikey=td_api_key, symbol=code, range='NTM', strikeCount=2)
    content = call_tda(url, p)
    if type == "CALL":
        print("Underlying price : ", content['underlyingPrice'])

    cm = content['callExpDateMap']
    pm = content['putExpDateMap']

    # print(json.dumps(cm, indent=4))

    # print(content['underlyingPrice'])

    if typ == 'CALL':
        iv = process_iv(cm)
    else:
        iv = process_iv(pm)

    return float(iv)


def process_iv(jsondata):
    ivtot = float(0.0)
    knt = int(0)
    for expdate in jsondata.keys():
        # print('expdate --> ', expdate, ' --> ', data[expdate])
        for strike in jsondata[expdate].keys():
            # print(" strike --> ", strike)
            for option in jsondata[expdate][strike]:
                # print("   option --> ", option)
                # for od in option.keys():
                #     print('     ' +od, ' ::: ', option[od])
                daz = int(option['daysToExpiration'])
                if 14 < daz < 31:
                    iv = float(option['volatility'])
                    ivtot += iv
                    knt += 1
                    print(option['symbol'], iv, ivtot, knt, daz)
    avgiv = float(0.0)
    if knt > 0:
        avgiv = ivtot / knt
    return avgiv


if __name__ == '__main__':
    c = 'SPY'
    today = date.today()
    startdate = today + timedelta(days=7)
    stopdate = today + timedelta(days=31)
    print(startdate, stopdate)

    outdata = []
    # for c in ['IEZ']:
    for c in etf_codes:
        try:
            civ = get_iv(c, 'CALL')
            piv = get_iv(c, 'PUT')
            rvol = process_rvol(c, 22)
            cratio = float(0.0)
            pratio = float(0.0)
            if rvol > 0.0:
                cratio = ((civ / rvol) - 1.0) * 100.0
                pratio = ((piv / rvol) - 1.0) * 100.0
                if piv > 0.0:
                    ratio = (civ / piv * 100.0) - 100.0
                else:
                    ratio = float(0.0)
                s = "{}, {}, {}, {}, {}, {}, {}\n".format(c, rvol, civ, cratio, piv, pratio, ratio)
                outdata.append(s)
                print("{}\n\tRVOL        = {:.2f}".format(c, rvol))
                print(f"\tCIV         = {civ:.2f} Call Premium = {cratio:.2f}")
                print(f"\tPIV         = {piv:.2f} Put Premium  = {pratio:.2f}")
                print(f"\tCall to Put = {ratio:.2f}")
        except Exception as e:
            print(e)
            traceback.print_exc(file=sys.stdout)

    with open("D:/dev/MarketTools - dev/lists/OptionVol.csv", 'w') as option_file:
        option_file.write("Code, RVOL, CIV, CPrem, PIV, PPrem, CallToPut\n")
        for data in outdata:
            option_file.write(data)
