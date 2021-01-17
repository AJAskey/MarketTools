import json
from datetime import datetime, timedelta

from OptionData import OptionData
from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import call_tda
from Utilities import ms_to_datetime, datetime_to_str


def process(data):
    retlist = []
    for expdate in data.keys():
        for strike in data[expdate].keys():
            for option in data[expdate][strike]:
                jd = OptionData(option)
                retlist.append(jd)
    return retlist


if __name__ == '__main__':
    code = 'SPY'

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"
    p = dict(apikey=td_api_key, symbol=code)
    content = call_tda(url, p)

    if content['status'] == "SUCCESS":

        ul = content['underlyingPrice']

        calls = process(content['callExpDateMap'])
        puts = process(content['putExpDateMap'])

        for c in calls:
            if c.valid:
                print(c)
        for p in puts:
            if p.valid:
                print(p)

        print('Underlying : ', ul)

