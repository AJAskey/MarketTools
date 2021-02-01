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

        self.oi = int(jsondata['openInterest'])

        if self.oi > 0:

            self.daysToExpiration = jsondata['daysToExpiration']
            if self.daysToExpiration > 2:

                self.strike = float(jsondata['strikePrice'])

                self.tradeTime = ms_to_datetime(jsondata['tradeTimeInLong'])
                self.quoteTime = ms_to_datetime(jsondata['quoteTimeInLong'])
                self.expirationDate = ms_to_datetime(jsondata['expirationDate'])

                self.volatility = float(jsondata['volatility'])
                self.tvalue = float(jsondata['theoreticalOptionValue'])

                self.delta = float(jsondata['delta'])
                self.gamma = float(jsondata['gamma'])
                self.theta = float(jsondata['theta'])
                self.vega = float(jsondata['vega'])
                self.rho = float(jsondata['rho'])

                self.bid = float(jsondata['bid'])
                self.ask = float(jsondata['ask'])
                self.last = float(jsondata['last'])
                self.mark = float(jsondata['mark'])
                self.volume = int(jsondata['totalVolume'])

                self.premium = 0.0
                if self.mark > 0.0:
                    self.premium = (abs(self.delta) + self.theta) / self.mark

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
