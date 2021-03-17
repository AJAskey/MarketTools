from TDAmeritrade import td_api_key
from TDAmeritrade.TDA_Interface import get_tda_list

if __name__ == '__main__':
    codes = ['XLB', 'XLE', 'XLF', 'XLI', 'XLK', 'XLP', 'XLU', 'XLV', 'XLY', 'XHB', 'XRT', 'SMH',
             'IBB', 'IWM', 'DIA', 'QQQ', 'SPY']

    code = 'SPY'
    trade_days = float(8.0)
    price_drop_percent = float(0.05)

    url = r"https://api.tdameritrade.com/v1/marketdata/chains"

    p = dict(apikey=td_api_key, symbol=code)
    ul, daList = get_tda_list(url=url, params=p, min_dte=10, max_dte=200, min_oi=1000, min_vol=10, opt_type="PUT")

    ul_chg = ul * price_drop_percent

    ul_minus = ul * 0.80
    str = "\n{} -> Analyzing puts with UL at {:.2f} and a drop of {:.2f} points".format(code, ul, ul_chg)
    print(str)
    for data in daList:

        if data.strike > ul_minus:
            if data.strike < ul:
                if data.last < 3.0:
                    delta_price = abs(data.delta * ul_chg)
                    theta_price = abs(data.theta * trade_days)
                    price_chg = float(delta_price - theta_price)
                    str = "\n--------------------------------------------------------\nProcessing {}".format(data)
                    print(str)

                    if price_chg > 0.0:
                        str = "  delta_price:{:.2f} theta_price:{:.2f} price:{:.2f}". \
                            format(delta_price, theta_price, price_chg)
                        print(str)

                        bot = data.last
                        sold = data.last + delta_price - theta_price
                        chg = price_chg / sold * 100.0
                        print("   buy price:{:.2f} new_price:{:.2f} chg:{:.1f}%".
                              format(bot, sold, chg))
