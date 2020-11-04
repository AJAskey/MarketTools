etf_codes = ['BOTZ', 'DIA', 'GLD', 'HYG', 'IAI', 'IBB', 'IEO', 'IEZ', 'IGE', 'IGV', 'IHE', 'ITA', 'IWM', 'IYT',
             'KIE', 'KRE', 'OEX', 'PICK', 'RING', 'SLV', 'SOXX', 'UUP', 'WOOD', 'XHB', 'XLB', 'XLC', 'XLE',
             'XLF', 'XLI', 'XLK', 'XLP', 'XLRE', 'XLU', 'XLV', 'XLY', 'XRT', 'QQQ', 'SPY', 'VIX', 'VIXY']


def get_exch(code):
    ret = "US"
    if code == 'OEX':
        ret = "WI"
    elif code == "VIX":
        ret = "CBOE"

    return ret
