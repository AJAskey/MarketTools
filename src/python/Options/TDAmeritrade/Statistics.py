class Statistics:

    def __init__(self, symbol):
        self.code = symbol

        self.totalPutsOi = 0
        self.totalPutsVol = 0
        self.dollarPutsOi = 0.0
        self.dollarPutsVol = 0.0

        self.totalCallsOi = 0
        self.totalCallsVol = 0
        self.dollarCallsOi = 0.0
        self.dollarCallsVol = 0.0

        self.putcall = 0.0
        self.putcallio = 0.0
        self.dollarputcall = 0.0
        self.dollarputcalloi = 0.0

    def __str__(self):
        ret = "{}:\n\tPut Vol     : {:,d}\n\tCall Vol    : {:,d}\n\tPut OI      : {:,d}\n\tCall OI     : {:,d}".format(
            self.code, self.totalPutsVol, self.totalCallsVol, self.totalPutsOi, self.totalCallsOi)
        ret += "\n\tPut/Call    : {:.2f}\n\tOI Put/Call : {:.2f}".format(self.putcall, self.putcallio)

        ret += "\n\tPut Vol $     : {:,d}\n\tCall Vol $    : {:,d}\n\tPut OI $      : {:,d}\n\tCall OI $     : {:,d}". \
            format(int(self.dollarPutsVol), int(self.dollarCallsVol), int(self.dollarPutsOi), int(self.dollarCallsOi))
        ret += "\n\tPut/Call $    : {:.2f}\n\tOI Put/Call $ : {:.2f}".format(self.dollarputcall, self.dollarputcalloi)
        return ret

    def calc(self):
        self.putcall = self.totalPutsVol / self.totalCallsVol
        self.putcallio = self.totalPutsOi / self.totalCallsOi
        self.dollarputcall = self.dollarPutsVol / self.dollarCallsVol
        self.dollarputcalloi = self.dollarPutsOi / self.dollarCallsOi
