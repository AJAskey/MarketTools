package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

/**
 * This class contains procedures for reading Estimate SIP data and writing to
 * the DB.
 *
 * @author Andy Askey
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
public class CashFileData implements Serializable {

  /**
   * 
   */
  private static final long         serialVersionUID = 1L;
  /**
   * Stores all EstimateFileDate read in from DB.
   */
  private static List<CashFileData> cashfdList       = new ArrayList<>();

  /**
   * Returns the EstimateFileData instance for requested ticker.
   *
   * @param ticker
   * @return
   */
  public static CashFileData find(String ticker) {
    for (final CashFileData c : CashFileData.cashfdList) {
      if (c.getTicker().equalsIgnoreCase(ticker)) {
        return c;
      }
    }
    return null;
  }

  public CashFileData(CashFileData cfd) {
    if (cfd != null) {
      this.capExQtr = cfd.capExQtr;
      this.cashFromOpsQtr = cfd.cashFromOpsQtr;
      this.cashFromInvQtr = cfd.cashFromInvQtr;
      this.cashFromFinQtr = cfd.cashFromFinQtr;
      this.ticker = cfd.ticker;
    }
    else {
      this.ticker = "";
    }
  }

  /**
   * Returns the number of instances in the list read from the DB.
   *
   * @return
   */
  public static int getListCount() {
    return CashFileData.cashfdList.size();
  }

  /**
   * Returns a string containing text for all data in the list read from the DB.
   *
   * @return
   */
  public static String listToString() {
    String ret = "";
    for (final CashFileData c : CashFileData.cashfdList) {
      ret += c.toString();
    }
    return ret;
  }

  /**
   * Parses data and fills data structures from DB files.
   *
   * @param data
   * @return
   */
  public static CashFileData readFromDb(List<String> data) {

    final CashFileData cfd = new CashFileData();

    for (final String s : data) {

      final String[] tfld = s.split(":");

      final String fld = tfld[0].trim();

      String val = "";
      if (tfld.length > 1) {
        val = tfld[1].trim();
      }

      if (fld.equals("ticker")) {
        cfd.ticker = val;
      }
      else if (fld.equals("capex")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        cfd.capExQtr = dArr;
      }
      else if (fld.equals("cash from financing")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        cfd.cashFromFinQtr = dArr;
      }
      else if (fld.equals("cash from investing")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        cfd.cashFromInvQtr = dArr;
      }
      else if (fld.equals("cash from operations")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        cfd.cashFromOpsQtr = dArr;
      }
    }
    return cfd;

  }

  /**
   * Reads the data from SIP tab delimited files and fills data structures.
   *
   * @param filename
   * @return
   */
  public static void readSipData(String filename) {

    final List<String> cashData = TextUtils.readTextFile(filename, true);
    for (final String s : cashData) {
      final String[] fld = s.replace("\"", "").split(Utils.TAB);
      final CashFileData cashfd = new CashFileData(fld);
      CashFileData.cashfdList.add(cashfd);
    }

  }

  private double[] capExQtr;
  private double[] cashFromOpsQtr;
  private double[] cashFromInvQtr;
  private double[] cashFromFinQtr;
  private String   ticker;

  public static List<CashFileData> getCashfdList() {
    return cashfdList;
  }

  public double[] getCapExQtr() {
    return capExQtr;
  }

  public double[] getCashFromOpsQtr() {
    return cashFromOpsQtr;
  }

  public double[] getCashFromInvQtr() {
    return cashFromInvQtr;
  }

  public double[] getCashFromFinQtr() {
    return cashFromFinQtr;
  }

  public String getTicker() {
    return ticker;
  }

  /**
   * Constructor - package level.
   */
  CashFileData() {
    ticker = "";
  }

  /**
   * Constructor fills data structures.
   *
   * @param filename
   * @return
   */
  CashFileData(String[] fld) {

    this.ticker = fld[0].trim();
    int ptr = 1;
    this.capExQtr = SipUtils.parseDoubles(fld, ptr, 8);
    ptr += 8;
    this.cashFromFinQtr = SipUtils.parseDoubles(fld, ptr, 8);
    ptr += 8;
    this.cashFromInvQtr = SipUtils.parseDoubles(fld, ptr, 8);
    ptr += 8;
    this.cashFromOpsQtr = SipUtils.parseDoubles(fld, ptr, 8);

  }

  /**
   * Creates string of formatted data structures.
   *
   * @return String
   */
  public String toDbOutput() {
    String ret = "";

    ret += String.format("  capex                 : %s%n", SipOutput.buildArray("", this.capExQtr, 10, 3, 1));
    ret += String.format("  cash from financing   : %s%n", SipOutput.buildArray("", this.cashFromFinQtr, 10, 3, 1));
    ret += String.format("  cash from investing   : %s%n", SipOutput.buildArray("", this.cashFromInvQtr, 10, 3, 1));
    ret += String.format("  cash from operations  : %s%n", SipOutput.buildArray("", this.cashFromOpsQtr, 10, 3, 1));

    return ret;
  }

  @Override
  public String toString() {
    String ret = "";
    return ret;
  }

  public static void clearList() {
    cashfdList.clear();
  }

  public static void main(final String[] args) throws FileNotFoundException {

    readSipData("data/CASH-2020Q2.TXT");

    for (CashFileData c : cashfdList) {
      System.out.println(c.ticker);
      System.out.println(c.toDbOutput());
    }

  }
}
