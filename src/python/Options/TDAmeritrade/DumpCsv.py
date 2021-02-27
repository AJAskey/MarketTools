from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import get_tda_list
from Utilities import datetime_to_str

if __name__ == '__main__':
    codes = ['XLB', 'XLE', 'XLF', 'XLI', 'XLK', 'XLP', 'XLU', 'XLV', 'XLY', 'XHB', 'XRT', 'SMH',
             'IBB', 'IWM', 'DIA', 'QQQ', 'SPY']

    code = 'SPY'
    trade_days = float(8.0)

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    p = dict(apikey=td_api_key, symbol=code)
    ul, daList = get_tda_list(url, p, 10, 200, "PUT")
    ul_plus = ul * 1.05
    ul_minus = ul * 0.95
    str = "{} {:.2f} {:.2f} {:.2f}".format(code, ul_minus, ul, ul_plus)
    print(str)
    for data in daList:

        if ul_minus < data.strike < ul_plus:
            pts = data.strike - ul_minus
            delta_price = abs(data.delta * pts)
            theta_price = abs(data.theta * trade_days)
            price = float(delta_price - theta_price)
            if price > 0.0:
                chg = price / data.mark * 100.0
                new_price = data.mark + price

                str = "{} {} {} {:d} :: {:.2f} {:.4f} {:.4f} {:d} :: Mark={:.2f} {:.2f} {:.2f} {:.2f} {:.2f} {" \
                      ":.1f}%".format(data.type, data.strike, datetime_to_str(data.expiration),
                                      data.daysToExpiration,
                                      pts, data.delta, data.theta, int(data.volatility),
                                      data.mark, delta_price, theta_price, price, new_price, chg)
                print(str)
