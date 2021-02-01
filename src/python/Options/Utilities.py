import json
from datetime import datetime, timedelta

datadir = "D:/dev/MarketTools - dev/data/tda-option-json"


def ms_to_datetime(ms):
    utc_time = datetime(1970, 1, 1) + timedelta(milliseconds=ms)
    return utc_time


def datetime_to_ms(dt):
    d = int(dt.timestamp() * 1000)
    return d


def datetime_to_str(dt):
    return dt.strftime("%Y-%b-%d")


def read_json(filename):
    with open(filename) as f:
        data = json.load(f)
    return data


def print_json(data):
    print(json.dumps(data, ensure_ascii=True, indent=2))
