import json
import sys
import traceback
from datetime import date
from datetime import timedelta

from TDAmeritrade.TDA_Interface import call_tda

from TDAmeritrade import td_api_key

if __name__ == '__main__':
    c = 'SPY'
    today = date.today()
    startdate = today + timedelta(days=7)
    stopdate = today + timedelta(days=31)
    print(startdate, stopdate)
    code = 'SPY'

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"
    p = dict(apikey=td_api_key, symbol=code)
    content = call_tda(url, p)

    calls = content['callExpDateMap']
    with open("out/calls.json", 'w') as c_file:
        print(json.dump(calls, indent=4, fp=c_file))

    puts = content['putExpDateMap']
    with open("out/puts.json", 'w') as p_file:
        print(json.dump(puts, indent=4, fp=p_file))

    strToday = today.strftime("%Y%m%d")
    filename = "out/{c}-{d}.json".format(c=code, d=strToday)
    print("Writing : ", filename)
    with open(filename, 'w') as json_file:
        json.dump(content, indent=4, fp=json_file)
