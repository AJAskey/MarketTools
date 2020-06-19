package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;

public class BigLists {

//  private static List<String>   companySummaryList = new ArrayList<>();
//  public static List<FieldData> quarterlyList      = new ArrayList<>();

  public static List<FieldDataYear> allDataList = new ArrayList<>();

//  public static List<OneCompanyData> getCompany(String ticker) {
//    final List<OneCompanyData> ret = new ArrayList<>();
//    for (final FieldDataYear fdy : BigLists.allDataList) {
//      if (fdy.isInUse()) {
//        final OneCompanyData icd = new OneCompanyData(ticker, fdy);
//        ret.add(icd);
//      }
//    }
//    return ret;
//  }

  public static void setLists(int yr, int qtr, List<FieldData> fdList) {

    if (BigLists.allDataList.size() == 0) {
      BigLists.init(2019, 2020);
    }
    final FieldDataQuarter fdq = new FieldDataQuarter(yr, qtr, fdList);
    for (final FieldDataYear fdy : BigLists.allDataList) {
      if (fdy.getYear() == yr) {
        fdy.set(qtr, fdq);
        return;
      }
    }
    System.out.printf("Warning -- SetLists : Data not found. Year=%d Quarter=%d%n", yr, qtr);
  }

//  public static void setCompanySummaries() {
//    for (final FieldData fd : BigLists.quarterlyList) {
//      final String s = String.format("%s\t%s\t%s", fd.getTicker(), fd.getCompanyInfo().getName(), fd.getCompanyInfo().getExchange());
//      BigLists.companySummaryList.add(s);
//    }
//
//    Collections.sort(BigLists.companySummaryList);
//
//  }

  private static void init(int first, int last) {
    for (int i = first; i <= last; i++) {
      BigLists.allDataList.add(new FieldDataYear(i));
    }
  }
}
