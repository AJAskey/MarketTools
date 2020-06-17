package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigLists {

  private static List<String>   companySummaryList = new ArrayList<>();
  public static List<FieldData> quarterlyList      = new ArrayList<>();

  public static List<FieldDataYear> allDataList = new ArrayList<>();

  public static List<IndividualCompanyData> getCompany(String ticker) {
    final List<IndividualCompanyData> ret = new ArrayList<>();
    for (final FieldDataYear fdy : BigLists.allDataList) {
      if (fdy.isInUse()) {
        final IndividualCompanyData icd = new IndividualCompanyData(ticker, fdy);
        ret.add(icd);
      }
    }
    return ret;
  }

  public static String getReport() {
    String ret = "";
    for (final FieldDataYear fdy : BigLists.allDataList) {
      if (fdy.isInUse()) {
        ret += String.format("%d%n", fdy.getYear());
        if (fdy.getQ1() != null) {
          ret += String.format("  Q1 : %d%n", fdy.getQ1().fieldDataList.size());
        }
        if (fdy.getQ2() != null) {
          ret += String.format("  Q2 : %d%n", fdy.getQ2().fieldDataList.size());
        }
        if (fdy.getQ3() != null) {
          ret += String.format("  Q3 : %d%n", fdy.getQ3().fieldDataList.size());
        }
        if (fdy.getQ4() != null) {
          ret += String.format("  Q4 : %d%n", fdy.getQ4().fieldDataList.size());
        }
      }
    }
    return ret;
  }

  private static void init(int first, int last) {
    for (int i = first; i <= last; i++) {
      BigLists.allDataList.add(new FieldDataYear(i));
    }
  }

  public static void setCompanySummaries() {
    for (final FieldData fd : BigLists.quarterlyList) {
      final String s = String.format("%s\t%s\t%s", fd.getTicker(), fd.getCompanyInfo().getName(), fd.getCompanyInfo().getExchange());
      BigLists.companySummaryList.add(s);
    }

    Collections.sort(BigLists.companySummaryList);

  }

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
}
