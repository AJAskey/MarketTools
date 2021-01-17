from datetime import datetime, timedelta


def ms_to_datetime(ms):
    utc_time = datetime(1970, 1, 1) + timedelta(milliseconds=ms)
    return utc_time


def datetime_to_str(dt):
    return dt.strftime("%Y-%b-%d")
