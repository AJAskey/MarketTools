package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.BigLists;
import net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum;

/**
 * This class contains procedures for generating text reports.
 *
 * @author Andy Askey
 * 
 *         <p>
 *         Copyright (c) 2020, Andy Askey. All rights reserved.
 *         </p>
 *         <p>
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 *
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 *         </p>
 *
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 *         </p>
 *
 */
public class Reports {

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

    String ret = Reports.header(yr, qtr);

    for (final FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            final FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (final FieldData fd : fdq.fieldDataList) {
              final String s = Reports.companyLine(fd);
              ret += s;
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

    for (final int year : yrs) {

      ret += String.format("%n----------%d Q1----------------%n%n", year);
      ret += Reports.companySummary(year, 1);
      ret += String.format("%n----------%d Q2----------------%n%n", year);
      ret += Reports.companySummary(year, 2);
      ret += String.format("%n----------%d Q3----------------%n%n", year);
      ret += Reports.companySummary(year, 3);
      ret += String.format("%n----------%d Q4----------------%n%n", year);
      ret += Reports.companySummary(year, 4);

      // System.out.println(ret);

    }

    // System.out.println(ret);
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
      ret += Reports.header(yr, qtr);
    }

    for (final FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            final FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (final FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getDowIndex().equals(index)) {
                String s = "";
                if (tickersOnly) {
                  s = String.format("%s%n", fd.getTicker());
                }
                else {
                  s = Reports.companyLine(fd);
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
      ret += Reports.header(yr, qtr);
    }

    for (final FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            final FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (final FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getExchange().equals(exch)) {
                String s = "";
                if (tickersOnly) {
                  s = String.format("%s%n", fd.getTicker());
                }
                else {
                  s = Reports.companyLine(fd);
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
      ret += Reports.header(yr, qtr);
    }
    for (final FieldDataYear fdy : BigLists.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            final FieldDataQuarter fdq = fdy.getQuarterData(qtr);

            for (final FieldData fd : fdq.fieldDataList) {
              if (fd.getCompanyInfo().getSnpIndex().equals(index)) {
                String s = "";
                if (tickersOnly) {
                  s = String.format("%s%n", fd.getTicker());
                }
                else {
                  s = Reports.companyLine(fd);
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

  private static String header(int yr, int qtr) {
    return String.format("Summary of requested Company Ticker, Name, Exchange SnP, Dow for year %d quarter %d%n", yr, qtr);
  }

  public static List<String> outputToList(String str) {
    final List<String> ret = new ArrayList<>();
    final String[] fld = str.split(Utils.NL);

    for (final String s : fld) {
      ret.add(s);
    }

    return ret;
  }
}
