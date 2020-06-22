package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.BigLists;
import net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum;
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

            final FieldDataQuarter fdq = fdy.getQ(qtr);

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
    }
    return ret;
  }

  public static String memoryOverview() {

    String ret = "";

    for (int year = BigLists.startYear; year <= BigLists.endYear; year++) {

      FieldDataYear fdy = BigLists.getYear(year);
      if (fdy != null) {

        ret += String.format("%n----------%d Q1----------------%n", year);
        int qtr = 1;
        int knt = 0;
        if (fdy.quarterDataAvailable(qtr)) {
          knt = fdy.getQ(qtr).fieldDataList.size();
        }
        ret += String.format("  Companies : %d%n", knt);

        ret += String.format("%n----------%d Q2----------------%n", year);
        qtr = 2;
        knt = 0;
        if (fdy.quarterDataAvailable(qtr)) {
          knt = fdy.getQ(qtr).fieldDataList.size();
        }
        ret += String.format("  Companies : %d%n", knt);

        ret += String.format("%n----------%d Q3----------------%n", year);
        qtr = 3;
        knt = 0;
        if (fdy.quarterDataAvailable(qtr)) {
          knt = fdy.getQ(qtr).fieldDataList.size();
        }
        ret += String.format("  Companies : %d%n", knt);

        ret += String.format("%n----------%d Q4----------------%n", year);
        qtr = 4;
        knt = 0;
        if (fdy.quarterDataAvailable(qtr)) {
          knt = fdy.getQ(qtr).fieldDataList.size();
        }
        ret += String.format("  Companies : %d%n", knt);
      }
    }
    return ret;
  }

  /**
   * Returns a list of String for all tickers found matching the input index
   * value.
   *
   * @param yr
   * @param qtr
   * @param index       - INDUSTRIAL, TRANPORTATION, UTILITY
   * @param tickersOnly True output is only tickers. False if a summary of company
   *                    is returned.
   * @return A NL delimited string of data
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

            final FieldDataQuarter fdq = fdy.getQ(qtr);

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
   * Returns a list of String for all tickers found matching the input exch value.
   *
   * @param yr
   * @param qtr
   * @param exch        - NYSE, NASDAQ, AMEX, OTC
   * @param tickersOnly True output is only tickers. False if a summary of company
   *                    is returned.
   * @return A NL delimited string of data
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

            final FieldDataQuarter fdq = fdy.getQ(qtr);

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

  /**
   * Returns a list of String for all tickers found matching the input index
   * value.
   *
   * @param yr
   * @param qtr
   * @param index       - SP500, SP400, SP600
   * @param tickersOnly True output is only tickers. False if a summary of company
   *                    is returned.
   * @return A NL delimited string of data
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

            final FieldDataQuarter fdq = fdy.getQ(qtr);

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

  /**
   * Procedure takes a NL delimited string and returns a list of strings.
   *
   * @param str NL delimited string from previous report
   * @return List of String
   */
  public static List<String> outputToList(String str) {
    final List<String> ret = new ArrayList<>();
    final String[] fld = str.split(Utils.NL);

    for (final String s : fld) {
      ret.add(s);
    }

    return ret;
  }

  /**
   * 
   * @param fd
   * @return
   */
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
  private static String header(int yr, int qtr) {
    return String.format("Summary of requested Company Ticker, Name, Exchange SnP, Dow for year %d quarter %d%n", yr, qtr);
  }

  /**
   * 
   * @param ticker
   * @return
   */
  public static List<String> getCompanyNetIncome(String ticker) {

    List<String> ret = new ArrayList<>();

    List<OneCompanyData> ocdList = OneCompanyData.getCompany(ticker);

    for (OneCompanyData ocd : ocdList) {
      double net = ocd.getQ2().getIncSheetData().getNetIncYr()[0];
      String s = String.format("%d : %f", ocd.getYear(), net);
      ret.add(s);
    }

    return ret;
  }

  public static List<String> getCompanyNetIncome(String ticker, int startYr, int endYr, int quarter) {

    List<String> ret = new ArrayList<>();

    for (int yr = startYr; yr <= endYr; yr++) {
      FieldData fd = FieldData.getFromDb(ticker, yr, quarter, FiletypeEnum.BINARY);
      String s = String.format("%d : %f", yr, fd.getIncSheetData().getNetIncYr()[0]);
      ret.add(s);
    }

    return ret;

  }

}
