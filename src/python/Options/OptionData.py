from datetime import datetime

from Utilities import datetime_to_str, ms_to_datetime


class OptionData:

    def __init__(self, jsondata):
        self.valid = False

        self.name = jsondata['symbol']
        tmp = self.name.split("_")
        self.code = tmp[0]

        self.expiration = datetime.strptime(tmp[1][:6], '%m%d%y')

        self.symbol = jsondata['symbol']
        self.description = jsondata['description']
        self.type = jsondata['putCall']

        self.oi = jsondata['openInterest']

        if self.oi > 0:
            self.tradeTime = ms_to_datetime(jsondata['tradeTimeInLong'])
            self.quoteTime = ms_to_datetime(jsondata['quoteTimeInLong'])
            self.expirationDate = ms_to_datetime(jsondata['expirationDate'])

            tmp = jsondata['volatility']
            self.volatility = float(tmp)

            self.delta = jsondata['delta']
            self.gamma = jsondata['gamma']
            self.theta = jsondata['theta']
            self.vega = jsondata['vega']
            self.rho = jsondata['rho']

            self.strike = jsondata['strikePrice']
            self.bid = jsondata['bid']
            self.ask = jsondata['ask']
            self.last = jsondata['last']
            self.mark = jsondata['mark']
            self.volume = jsondata['totalVolume']
            self.daysToExpiration = jsondata['daysToExpiration']

            self.valid = True

    def __str__(self):
        dt = datetime_to_str(self.expiration)
        ret = "{:s}, {:s}, {:s}, {:d}, {:d}, {:d}, {:.2f}, {:.2f}, {:.2f}, {:.2f}, {:.2f}, {:.2f}". \
            format(self.code,
                   self.type,
                   dt,
                   self.oi,
                   self.volume,
                   self.daysToExpiration,
                   self.strike,
                   self.bid,
                   self.ask,
                   self.last,
                   self.mark,
                   self.volatility)
        return ret
