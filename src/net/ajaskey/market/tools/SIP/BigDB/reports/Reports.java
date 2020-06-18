package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.BigLists;
import net.ajaskey.market.tools.SIP.BigDB.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.FieldDataYear;
import net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum;

public class Reports {

  private static String header(int yr, int qtr) {
    return String.format("Summary of requested Company Ticker, Name, Exchange SnP, Dow for year %d quarter %d%n", yr, qtr);
  }

  private static String companyLine(FieldData fd) {
    return String.format("%-10s\t%-50s\t%-15s\t%-8s\t%-1s%n", fd.getTicker(), fd.getCompanyInfo().getName(), fd.getCompanyInfo().getExchange(),
        fd.getCompanyInfo().getSnpIndexStr(), fd.getCompanyInfo().getDowIndexStr(), fd.getCompanyInfo().getExchange());
  }

  /**
   * 
   * @param yr
   * @param qtr
   * @return
   */
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

  /**
   * 
   * @param yr
   * @param qtr
   * @param index
   * @return
   */
  public static String getSnpIndex(int yr, int qtr, SnpEnum index, boolean tickersOnly) {

    String ret = "";
    if (!tickersOnly) {
      ret += header(yr, qtr);
    }
    for (FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getSnpIndex().equals(index)) {
                String s = "";
                if (tickersOnly) {
                  s = String.format("%s%n", fd.getTicker());
                }
                else {
                  s = companyLine(fd);
                }
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

  /**
   * 
   * @param yr
   * @param qtr
   * @param index
   * @return
   */
  public static String getDowIndex(int yr, int qtr, DowEnum index, boolean tickersOnly) {

    String ret = "";
    if (!tickersOnly) {
      ret += header(yr, qtr);
    }

    for (FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getDowIndex().equals(index)) {
                String s = "";
                if (tickersOnly) {
                  s = String.format("%s%n", fd.getTicker());
                }
                else {
                  s = companyLine(fd);
                }
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

  /**
   * 
   * @param yr
   * @param qtr
   * @param exch
   * @return
   */
  public static String getExchange(int yr, int qtr, ExchEnum exch, boolean tickersOnly) {

    String ret = "";
    if (!tickersOnly) {
      ret += header(yr, qtr);
    }

    for (FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getExchange().equals(exch)) {
                String s = "";
                if (tickersOnly) {
                  s = String.format("%s%n", fd.getTicker());
                }
                else {
                  s = companyLine(fd);
                }
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

  public static List<String> outputToList(String str) {
    List<String> ret = new ArrayList<>();
    String[] fld = str.split(Utils.NL);

    for (String s : fld) {
      ret.add(s);
    }

    return ret;
  }

}
