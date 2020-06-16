package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigLists {

  private static List<String>   companySummaryList = new ArrayList<>();
  public static List<FieldData> quarterlyList      = new ArrayList<>();

  public static void setCompanySummaries() {
    for (FieldData fd : quarterlyList) {
      String s = String.format("%s\t%s\t%s", fd.getTicker(), fd.getCompanyInfo().getName(), fd.getCompanyInfo().getExchange());
      companySummaryList.add(s);
    }

    Collections.sort(companySummaryList);

  }

  public static List<FieldDataYear> allDataList = new ArrayList<>();

  private static void init(int first, int last) {
    for (int i = first; i <= last; i++) {
      allDataList.add(new FieldDataYear(i));
    }
  }

  public static void setLists(int yr, int qtr, List<FieldData> fdList) {

    if (allDataList.size() == 0) {
      init(2019, 2020);
    }
    FieldDataQuarter fdq = new FieldDataQuarter(yr, qtr, fdList);
    for (FieldDataYear fdy : allDataList) {
      if (fdy.getYear() == yr) {
        fdy.set(qtr, fdq);
        return;
      }
    }
    System.out.printf("Warning -- SetLists : Data not found. Year=%d Quarter=%d%n", yr, qtr);
  }

  public static String getReport() {
    String ret = "";
    for (FieldDataYear fdy : allDataList) {
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
}
