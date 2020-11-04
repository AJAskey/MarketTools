import traceback

from Optuma.ETF_Processor import etf_codes
from Tda_Options import td_api_key
from Tda_Options.PutCall_Processor import process_option
from Tda_Options.RealizedVol import process_rvol
from Tda_Options.TDA_Interface import call_tda
from Tda_Options.TdaProcessOptions import get_iv

if __name__ == '__main__':

    outdata = []
    # for c in ['SPY']:
    for c in etf_codes:
        url = r"https://api.tdameritrade.com/v1/marketdata/chains"
        p = dict(apikey=td_api_key, symbol=c)
        content = call_tda(url, p)

        try:
            civ = get_iv(c, 'CALL')
            piv = get_iv(c, 'PUT')
            rvol = process_rvol(c, 22)
            cratio = float(0.0)
            pratio = float(0.0)
            if rvol > 0.0:
                cratio = ((civ / rvol) - 1.0) * 100.0
                pratio = ((piv / rvol) - 1.0) * 100.0
                prem = (cratio + pratio) / 2.0

                if piv > 0.0:
                    ratio = (civ / piv * 100.0) - 100.0
                else:
                    ratio = float(0.0)

                s = "{}, {}, {}, {}, {}, {}, {}, {}".format(c, rvol, prem, civ, cratio, piv, pratio, ratio)

                print("{}\n\tRVOL        = {:.2f}\tPremium      = {:.2f}".format(c, rvol, prem))
                print(f"\tCIV         = {civ:.2f}\tCall Premium = {cratio:.2f}")
                print(f"\tPIV         = {piv:.2f}\tPut Premium  = {pratio:.2f}")
                print(f"\tCall to Put = {ratio:.2f}")

                pt, cl, poi, coi, pcost, ccost, poicost, coicost = process_option(content)

                pc = float(0.0)
                if cl > 0:
                    pc = float(pt) / float(cl)
                pcoi = float(0.0)
                prem = float(0.0)
            if coi > 0:
                pcoi = float(poi) / float(coi)
            pval = int(pcost * 100 / 1000000)
            cval = int(ccost * 100 / 1000000)
            poival = int(poicost * 100 / 1000000)
            coival = int(coicost * 100 / 1000000)

            crat = float(0.0)
            if coival > 0:
                crat = float(poival / coival)
            s1 = "{}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}".format(
                pt, cl, pc, poi, coi, pcoi, pval, cval, poival, coival, crat)
            s2 = "{}, {}\n".format(s, s1)
            outdata.append(s2)

        except Exception as e:
            print(e)
            traceback.print_exc(file=sys.stdout)

with open("D:/dev/MarketTools - dev/lists/OptionVol.csv", 'w') as option_file:
    option_file.write(
        f"Code, RVOL, Prem, CIV, CPrem, PIV, PPrem, CallToPut, Puts, Calls, PC, POI, COI, POICOI, PCost(M), CCost(M), "
        f"POICost(M), COICost(M), Cost Ratio\n")
    for data in outdata:
        option_file.write(data)
