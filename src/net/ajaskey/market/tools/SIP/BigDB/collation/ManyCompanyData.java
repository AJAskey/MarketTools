package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.util.ArrayList;
import java.util.List;

public class ManyCompanyData {

  public static List<ManyCompanyData> createList(List<String> tickers) {

    List<ManyCompanyData> retList = new ArrayList<>();

    for (String ticker : tickers) {

      ManyCompanyData mcd = new ManyCompanyData(OneCompanyData.getCompany(ticker), ticker);
      retList.add(mcd);
    }

    return retList;
  }
  public List<OneCompanyData> ocdList = new ArrayList<>();

  public String               ticker;

  public ManyCompanyData(List<OneCompanyData> list, String ticker) {
    this.ticker = ticker;
    this.ocdList = list;
  }

  @Override
  public String toString() {
    String ret = String.format("%s : %d%n", this.ticker, this.ocdList.size());
    return ret;
  }
}
