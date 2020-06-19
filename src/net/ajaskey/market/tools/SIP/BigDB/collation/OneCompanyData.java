package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.BigLists;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;

/**
 * This class contains procedures for returning one company data from the DB.
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
public class OneCompanyData {

  /**
   * Returns all requested data for ticker supplied
   * 
   * @param ticker
   * @return One instance in list for each year of data
   */
  public static List<OneCompanyData> getCompany(String ticker) {

    final List<OneCompanyData> ret = new ArrayList<>();

    for (final FieldDataYear fdy : BigLists.allDataList) {
      if (fdy.isInUse()) {
        final OneCompanyData icd = new OneCompanyData(ticker, fdy);
        ret.add(icd);
      }
    }
    return ret;
  }

  private FieldData    q1;
  private FieldData    q2;
  private FieldData    q3;
  private FieldData    q4;
  private final String ticker;
  private final int    year;

  /**
   * Constructor is private for use by internal procedures
   * 
   * @param t
   * @param fdy
   */
  private OneCompanyData(String t, FieldDataYear fdy) {

    this.q1 = null;
    this.q2 = null;
    this.q3 = null;
    this.q4 = null;

    this.year = fdy.getYear();
    this.ticker = t;
    if (fdy.quarterDataAvailable(1)) {
      for (final FieldData fd : fdy.getQuarterData(1).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q1 = fd;
          break;
        }
      }
    }
    if (fdy.quarterDataAvailable(2)) {
      for (final FieldData fd : fdy.getQuarterData(2).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q2 = fd;
          break;
        }
      }
    }
    if (fdy.quarterDataAvailable(3)) {
      for (final FieldData fd : fdy.getQuarterData(3).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q3 = fd;
          break;
        }
      }
    }
    if (fdy.quarterDataAvailable(4)) {
      for (final FieldData fd : fdy.getQuarterData(4).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q4 = fd;
          break;
        }
      }
    }

  }

  /**
   * getter allowing for external loops to retrieve quarter data
   *
   * @param qtr
   * @return corresponding quarter data
   */
  public FieldData getQ(int qtr) {
    FieldData ret = null;
    if (qtr == 1) {
      ret = this.q1;
    }
    else if (qtr == 2) {
      ret = this.q2;
    }
    else if (qtr == 3) {
      ret = this.q3;
    }
    else if (qtr == 4) {
      ret = this.q4;
    }

    return ret;
  }

  public FieldData getQ1() {
    return this.q1;
  }

  public FieldData getQ2() {
    return this.q2;
  }

  public FieldData getQ3() {
    return this.q3;
  }

  public FieldData getQ4() {
    return this.q4;
  }

  public String getTicker() {
    return this.ticker;
  }

  public int getYear() {
    return this.year;
  }

  @Override
  public String toString() {
    String ret = String.format("%s %s%n", this.ticker, this.year);
    if (this.q1 != null) {
      ret += String.format(" %d Q1  : %s%n", this.year, this.q1.getCompanyInfo().toString());
    }
    if (this.q2 != null) {
      ret += String.format(" %d Q2  : %s%n", this.year, this.q2.getCompanyInfo().toString());
    }
    if (this.q3 != null) {
      ret += String.format(" %d Q3  : %s%n", this.year, this.q3.getCompanyInfo().toString());
    }
    if (this.q4 != null) {
      ret += String.format(" %d Q4  : %s%n", this.year, this.q4.getCompanyInfo().toString());
    }
    return ret;
  }

}
