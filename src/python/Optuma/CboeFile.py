import csv
import os
from datetime import date, datetime


def process_raw_files():
    dirpath = f"C:/Users/Computer/Downloads"
    outdirpath = f"D:/PycharmProjects/pythonProject/data"

    header = "Expiration,Calls,CLast,CNet,CBid,CAsk,CVol,CIV,CDelta,CGamma,COI,Strike,Puts,PLast,PNet,PBid,PAsk,PVol," \
             "PIV,PDelta,PGamma,POI,UL,DDATE\n "

    files = os.listdir(dirpath)
    for infile in files:
        if infile.endswith('.dat'):
            infilename = os.path.join(dirpath, infile)
            with open(infilename) as inf:
                lines = inf.readlines()
                s = lines[0].replace("^", "")
                code = s.split()[0].lower()
                fname = os.path.join(outdirpath, "{}-options-py.dat".format(code))
                print("{} to {}".format(infilename, fname))
                lastprice = s.split(',')[1]
                idx = lines[1].find('@')
                datadate = lines[1][:idx].replace(" ", "")
                # print(fname)
            with open(fname, 'w') as of:
                knt = 1
                for line in lines:
                    if knt == 1:
                        of.write(header)
                    elif knt < 4:
                        pass
                    else:
                        s = "{},{},{}\n".format(line.strip(), lastprice, datadate)
                        of.write(s)
                    knt += 1

            os.remove(infilename)


def process_cboe_data(code):
    today = date.today()

    inf = "../data/{}-options-py.dat".format(code)
    print("Processing {}".format(inf))
    with open(inf) as csv_file:
        data = csv.DictReader(csv_file)

        pt = int(0)
        cl = int(0)
        poi = int(0)
        coi = int(0)
        knt = int(0)
        civ = float(0.0)
        piv = float(0.0)
        for row in data:
            # print(row)
            s = row['Expiration'].strip()
            dat = datetime.strptime(s, '%m/%d/%Y')
            delta = dat.date() - today
            ul = float(row['UL'])
            s = row['DDATE']
            datedat = datetime.strptime(s, '%b%d%Y')
            if 14 < delta.days < 31:
                strike = float(row['Strike'])
                if (ul - 5.01) < strike < (ul + 5.01):
                    # print(dat, today, delta.days)
                    cv = float(row['PIV']) * 100.0
                    pv = float(row['CIV']) * 100.0
                    piv += cv
                    civ += pv
                    knt += 1
                    print(dat.strftime("%Y-%b-%d"), ul, strike, cv, pv, knt)

            pt += int(row['PVol'])
            cl += int(row['CVol'])
            poi += int(row['POI'])
            coi += int(row['COI'])

        calliv = civ / float(knt)
        putiv = piv / float(knt)
        iv = (calliv + putiv) / 2.0
        pcost = float(100000.0)
        ccost = float(101000.0)
        poicost = float(500000.0)
        coicost = float(500000.0)
        return pt, cl, poi, coi, calliv, putiv, iv, ul, pcost, ccost, poicost, coicost


if __name__ == '__main__':
    process_raw_files()

    ptO, clO, poiO, coiO, callivO, putivO, ivO = process_cboe_data("OEX")
    print("{} {} {} {} {:.2f} {:.2f} {:.2f}".format(ptO, clO, poiO, coiO, callivO, putivO, ivO))
