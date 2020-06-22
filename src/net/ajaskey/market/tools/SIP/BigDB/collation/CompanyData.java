package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum;

/**
 * This class contains procedures for collecting data directly from the DB
 * files. It is much faster than ingesting the entire DB into memories using
 * FieldData.parseSipData(year, quarter).
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
public class CompanyData {

  /**
   * Returns a list of companies with FieldData for each quarter of requested
   * ticker list.
   *
   * @param tickers
   * @return List of CompanyData
   */
  public static List<CompanyData> getCompanies(List<String> tickers) {
    final List<CompanyData> retList = new ArrayList<>();
    for (final String ticker : tickers) {
      final CompanyData cd = CompanyData.getCompany(ticker);
      retList.add(cd);
    }
    return retList;
  }

  /**
   * Returns a list of CompanyData for tickers, the year, and quarter requested.
   *
   * @param tickers List of string ticker values,
   * @param year
   * @param quarter
   * @return
   */
  public static List<CompanyData> getCompanies(List<String> tickers, int year, int quarter) {
    final List<CompanyData> ret = new ArrayList<>();

    for (final String ticker : tickers) {

      final CompanyData cd = new CompanyData(ticker);
      final FieldData fd = CompanyData.getCompany(ticker, year, quarter);
      cd.fdList.add(fd);
      ret.add(cd);
    }
    return ret;
  }

  /**
   * Returns a CompanyData for each quarter of requested ticker
   *
   * @param ticker
   * @return CompanyData
   */
  public static CompanyData getCompany(String ticker) {

    final CompanyData cd = new CompanyData(ticker);

    final String[] ext = { "txt", "gz" };
    final List<File> fList = Utils.getDirTree(FieldData.outbasedir, ext);
    for (final File f : fList) {
      if (f.getName().startsWith(ticker.toUpperCase() + "-")) {
        // System.out.println(f.getAbsolutePath());
        final int yr = CompanyData.parseYear(f.getName());
        final int qtr = CompanyData.parseQuarter(f.getName());
        final FieldData fd = FieldData.readDbData(yr, qtr, ticker.toUpperCase());
        fd.setYear(yr);
        fd.setQuarter(qtr);
        cd.fdList.add(fd);
      }

    }
    return cd;
  }

  /**
   * Returns FieldData for ticker, year, and quarter of requested
   *
   * @param ticker
   * @return CompanyData
   */
  public static FieldData getCompany(String ticker, int year, int quarter) {

    final FieldData ret = FieldData.readDbData(year, quarter, ticker);

    return ret;
  }

  /**
   * Returns a list of tickers from the requesting Dow index
   *
   * @param index
   * @param year
   * @param quarter
   * @return List of String
   */
  public static List<String> getTickers(DowEnum index, int year, int quarter) {
    final List<String> ret = new ArrayList<>();

    final List<File> files = CompanyData.getFiles(year, quarter);

    List<String> input = null;
    for (final File f : files) {
      if (f.getName().endsWith(".gz")) {
        input = TextUtils.readGzipFile(f, true);
      }
      else {
        input = TextUtils.readTextFile(f, true);
      }

      final CompanyFileData cfd = CompanyFileData.readFromDb(input);
      if (cfd.getDowIndex() == index) {
        ret.add(cfd.getTicker());
      }
    }
    return ret;
  }

  /**
   * Returns a list of tickers from the requested market exchange.
   *
   * @param index
   * @param year
   * @param quarter
   * @return
   */
  public static List<String> getTickers(ExchEnum index, int year, int quarter) {
    final List<String> ret = new ArrayList<>();

    final List<File> files = CompanyData.getFiles(year, quarter);

    List<String> input = null;
    for (final File f : files) {
      if (f.getName().endsWith(".gz")) {
        input = TextUtils.readGzipFile(f, true);
      }
      else {
        input = TextUtils.readTextFile(f, true);
      }

      final CompanyFileData cfd = CompanyFileData.readFromDb(input);
      if (cfd.getExchange() == index) {
        ret.add(cfd.getTicker());
      }
    }
    return ret;
  }

  /**
   * Returns a list of tickers for the year and quarter requested.
   *
   * @param year
   * @param quarter
   * @return
   */
  public static List<String> getTickers(int year, int quarter) {
    final List<String> ret = new ArrayList<>();
    final String[] ext = { "txt", "gz" };
    final String dir = String.format("%s%d/Q%d", FieldData.outbasedir, year, quarter);
    final List<File> fList = Utils.getDirTree(dir, ext);
    for (final File f : fList) {
      final String name = f.getName();
      final int idx = name.indexOf("-fundamental");
      final String s = name.substring(0, idx);
      ret.add(s);
    }
    return ret;
  }

  /**
   * Returns of list of tickers from the requested SnP index
   *
   * @param index
   * @param year
   * @param quarter
   * @return List of String
   */
  public static List<String> getTickers(SnpEnum index, int year, int quarter) {

    final List<String> ret = new ArrayList<>();

    final List<File> files = CompanyData.getFiles(year, quarter);

    List<String> input = null;
    for (final File f : files) {
      if (f.getName().endsWith(".gz")) {
        input = TextUtils.readGzipFile(f, true);
      }
      else {
        input = TextUtils.readTextFile(f, true);
      }

      final CompanyFileData cfd = CompanyFileData.readFromDb(input);
      if (cfd.getSnpIndex() == index) {
        ret.add(cfd.getTicker());
      }
    }
    return ret;
  }

  /**
   * Private procedure to get all files for a year and quarter.
   *
   * @param year
   * @param quarter
   * @return List of File
   */
  private static List<File> getFiles(int year, int quarter) {
    final List<File> ret = new ArrayList<>();
    final String[] ext = { "txt", "gz" };
    final String dir = String.format("%s%d/Q%d", FieldData.outbasedir, year, quarter);
    final List<File> fList = Utils.getDirTree(dir, ext);
    for (final File f : fList) {
      ret.add(f);
    }
    return ret;
  }

  /**
   *
   * @param ticker
   * @param tickers
   * @return
   */
  private static boolean isTickerInList(String ticker, List<String> tickers) {
    for (final String s : tickers) {
      if (s.equalsIgnoreCase(ticker)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Private procedure to parse the ticker out of the file name.
   *
   * @param name
   * @return
   */
  private static String parseName(String name) {
    String ret = "";
    try {
      final int idx = name.indexOf("-fundamental-data-");
      ret = name.substring(0, idx);
    }
    catch (final Exception e) {
      ret = "";
    }
    return ret;
  }

  /**
   * Private procedure to parse the quarter out of the file name.
   *
   * @param name
   * @return
   */
  private static int parseQuarter(String name) {
    int ret = 0;
    try {
      final int idx = name.indexOf("-data-");
      final String sQtr = name.substring(idx + 11, idx + 12);
      ret = Integer.parseInt(sQtr);
    }
    catch (final Exception e) {
      ret = 0;
    }
    return ret;
  }

  /**
   * Private procedure to parse the year out of the file name.
   *
   * @param name
   * @return
   */
  private static int parseYear(String name) {
    int ret = 0;
    try {
      final int idx = name.indexOf("-data-");
      final String sYr = name.substring(idx + 6, idx + 10);
      ret = Integer.parseInt(sYr);
    }
    catch (final Exception e) {
      ret = 0;
    }
    return ret;
  }

  private List<FieldData> fdList = new ArrayList<>();
  private String          ticker;

  public List<FieldData> getFdList() {
    return fdList;
  }

  public String getTicker() {
    return ticker;
  }

  /**
   * Constructor
   *
   * @param tick
   */
  public CompanyData(String tick) {
    this.ticker = tick;
  }

}
