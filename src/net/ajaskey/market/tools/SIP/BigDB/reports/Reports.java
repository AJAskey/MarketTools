package net.ajaskey.market.tools.SIP.BigDB.reports;

import net.ajaskey.market.tools.SIP.BigDB.BigLists;
import net.ajaskey.market.tools.SIP.BigDB.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.FieldDataYear;
import net.ajaskey.market.tools.SIP.BigDB.SnpEnum;

public class Reports {

  private static String header(int yr, int qtr) {
    return String.format("Summary of requested Company Ticker, Name, SnP, Dow, Exchange for year %d quarter %d%n", yr, qtr);
  }

  private static String companyLine(FieldData fd) {
    return String.format("%-10s\t%-50s\t%-15s\t%-8s\t%-1s%n", fd.getTicker(), fd.getCompanyInfo().getName(), fd.getCompanyInfo().getExchange(),
        fd.getCompanyInfo().getSnpIndex(), fd.getCompanyInfo().getDowIndex(), fd.getCompanyInfo().getExchange());
  }

  public static String companySummary(int yr, int qtr) {

    String ret = header(yr, qtr);

    for (FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (FieldData fd : fdq.fieldDataList) {
              String s = companyLine(fd);
              ret += s;
            }
          }
        }
        break;
      }
    }
    return ret;
  }

  public static String getSnpIndex(int yr, int qtr, SnpEnum index) {

    String ret = header(yr, qtr);

    for (FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getSnpIndex().equals(index)) {
                String s = companyLine(fd);
                ret += s;
              }
            }
          }
        }
        break;
      }
    }
    return ret;
  }

  public static String getDowIndex(int yr, int qtr, DowEnum index) {

    String ret = header(yr, qtr);

    for (FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getDowIndex().equals(index)) {
                String s = companyLine(fd);
                ret += s;
              }
            }
          }
        }
        break;
      }
    }
    return ret;
  }

  public static String companySummary(int[] yrs) {

    String ret = "";

    for (int year : yrs) {

      ret += String.format("%n----------%d Q1----------------%n%n", year);
      ret += companySummary(year, 1);
      ret += String.format("%n----------%d Q2----------------%n%n", year);
      ret += companySummary(year, 2);
      ret += String.format("%n----------%d Q3----------------%n%n", year);
      ret += companySummary(year, 3);
      ret += String.format("%n----------%d Q4----------------%n%n", year);
      ret += companySummary(year, 4);

      // System.out.println(ret);

    }

    // System.out.println(ret);
    return ret;
  }

}
