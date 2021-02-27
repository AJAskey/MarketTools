from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import get_tda_list
from Utilities import datetime_to_str

if __name__ == '__main__':
    codes = ['XLB', 'XLE', 'XLF', 'XLI', 'XLK', 'XLP', 'XLU', 'XLV', 'XLY', 'XHB', 'XRT', 'SMH',
             'IBB', 'IWM', 'DIA', 'QQQ', 'SPY']

    code = 'SPY'
    trade_days = float(8.0)
    drop_percent = float(0.95)

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    p = dict(apikey=td_api_key, symbol=code)
    ul, daList = get_tda_list(url, p, 10, 200, 1000, 10, "PUT")
    ul_minus = ul * 0.80
    price_drop = ul * (1.0 - drop_percent)
    str = "{} -> Analyzing puts with UL from {:.2f} to {:.2f}\n".format(code, ul_minus, ul)
    print(str)
    for data in daList:

        if data.strike > ul_minus:
            if data.strike < ul:
                if data.mark < 3.0:
                    pts = price_drop
                    delta_price = abs(data.delta * pts)
                    theta_price = abs(data.theta * trade_days)
                    price = float(delta_price - theta_price)
                    str = "\nProcessing {}".format(data)
                    print(str)
                    if price > 0.0:
                        chg = price / data.mark * 100.0
                        new_price = data.mark + price

                        exp = datetime_to_str(data.expiration)
                        str1 = "{} {} {} {:d}".format(data.type, data.strike, exp, data.daysToExpiration)
                        str2 = " {:.2f} {:.4f} {:.4f} {:d}".format(pts, data.delta, data.theta, int(data.volatility))
                        str3 = " Mark={:.2f} {:.2f} {:.2f} {:.2f} {:.2f} {:.1f}".format(data.mark, delta_price,
                                                                                        theta_price, price, new_price,
                                                                                        chg)
                        print("\n{}\n{}\n{}".format(str1, str2, str3))
