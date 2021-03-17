import json
from datetime import date

from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import call_tda

codes = ['SPY']

if __name__ == '__main__':
    today = date.today()
    print("Today's date:", today)

    strToday = today.strftime("%Y%m%d")

    for code in codes:
        url = r"https://api.tdameritrade.com/v1/marketdata/chains"
        p = dict(apikey=td_api_key, symbol=code)
        content = call_tda(url, p)

        if content['status'] == "SUCCESS":
            filename = "out/{c}-{d}.json".format(c=code, d=strToday)
            print("Writing : ", filename)
            with open(filename, 'w') as json_file:
                json.dump(content, indent=2, ensure_ascii=True, fp=json_file)
