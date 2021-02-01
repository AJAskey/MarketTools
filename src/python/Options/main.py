from Utilities import read_json, datadir, print_json

if __name__ == '__main__':
    filename = datadir + "/SPY-20210119.json"
    data = read_json(filename)
    print_json(data)

