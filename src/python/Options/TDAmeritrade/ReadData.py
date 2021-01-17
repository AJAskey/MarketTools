import json
from datetime import date
from datetime import timedelta

import tdconfig
from Tda_Options.TDA_Interface import call_tda

codes = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEO', 'IEZ', 'IGE', 'IGV', 'IHE', 'ITA', 'IWM', 'IYT',
         'KIE', 'KRE', 'OEX', 'PICK', 'QQQ', 'RING', 'SLV', 'SOXX', 'SPY', 'UUP', 'VIXY', 'WOOD', 'XHB', 'XLB', 'XLC',
         'XLE',
         'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT']

# codes = ['SPY']

if __name__ == '__main__':
    today = date.today()
    print("Today's date:", today)

    # today1 = today + timedelta(days=10)
    # today2 = today + timedelta(days=31)
    # print(today1, today2)

    strToday = today.strftime("%Y%m%d")

    for code in codes:
        url = r"https://api.tdameritrade.com/v1/marketdata/chains"
        p = dict(apikey=tdconfig.td_api_key, symbol=code)
        content = call_tda(url, p)

        filename = "../data/{c}-{d}.json".format(c=code, d=strToday)
        print("Writing : ", filename)
        with open(filename, 'w') as json_file:
            json.dump(content, indent=4, fp=json_file)
