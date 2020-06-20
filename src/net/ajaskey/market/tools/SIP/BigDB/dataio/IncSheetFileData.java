package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

/**
 * This class contains procedures for reading SIP income statement data and
 * writing to the DB.
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
public class IncSheetFileData {

  /**
   * Stores all IncSheetFileDate read in from DB.
   */
  private static List<IncSheetFileData> ifdList = new ArrayList<>();

  /**
   * Returns the IncSheetFileData instance for requested ticker.
   *
   * @param ticker
   * @return
   */
  public static IncSheetFileData find(String ticker) {
    for (final IncSheetFileData is : IncSheetFileData.ifdList) {
      if (is.getTicker().equalsIgnoreCase(ticker)) {
        return is;
      }
    }
    return null;
  }

  /**
   * Returns the number of instances in the list read from the DB.
   *
   * @return
   */
  public static int getListCount() {
    return IncSheetFileData.ifdList.size();
  }

  /**
   * Returns a string containing text for all data in the list read from the DB.
   *
   * @return
   */
  public static String listToString() {
    String ret = "";
    for (final IncSheetFileData is : IncSheetFileData.ifdList) {
      ret += is.toString();
    }
    return ret;
  }

  /**
   * Parses data and fills data structures from DB files.
   *
   * @param data
   * @return
   */
  public static IncSheetFileData readFromDb(List<String> data) {

    final IncSheetFileData ifd = new IncSheetFileData();

    for (final String s : data) {

      final String[] tfld = s.split(":");

      final String fld = tfld[0].trim();

      // System.out.println(fld);

      if (tfld.length > 1) {
        tfld[1].trim();
      }

      if (fld.equals("sales Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setSalesQ(dArr);
      }
      else if (fld.equals("sales Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setSalesY(dArr);
      }
      else if (fld.equals("cogs Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setCogsQ(dArr);
      }
      else if (fld.equals("cogs Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setCogsY(dArr);
      }
      else if (fld.equals("gross inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setgrossIncQ(dArr);
      }
      else if (fld.equals("gross inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setgrossIncY(dArr);
      }
      else if (fld.equals("rd Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setRdQ(dArr);
      }
      else if (fld.equals("rd Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setRdY(dArr);
      }
      else if (fld.equals("depreciation Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setDepreciationQ(dArr);
      }
      else if (fld.equals("depreciation Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setDepreciationY(dArr);
      }

      else if (fld.equals("int exp Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setIntExpQ(dArr);
      }
      else if (fld.equals("int exp Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setIntExpY(dArr);
      }
      else if (fld.equals("unusual inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setUnusualIncQ(dArr);
      }
      else if (fld.equals("unusual inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setUnusualIncY(dArr);
      }
      else if (fld.equals("total op exp Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setTotalOpExpQ(dArr);
      }
      else if (fld.equals("total op exp Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setTotalOpExpY(dArr);
      }
      else if (fld.equals("gross op inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setGrossOpIncQ(dArr);
      }
      else if (fld.equals("gross op inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setGrossOpIncY(dArr);
      }
      else if (fld.equals("int exp noop Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setIntExpNoOpQ(dArr);
      }
      else if (fld.equals("int exp noop Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setIntExpNoOpY(dArr);
      }
      else if (fld.equals("other inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setOtherIncQ(dArr);
      }
      else if (fld.equals("other inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setOtherIncY(dArr);
      }
      else if (fld.equals("pre-tax inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setPretaxIncQ(dArr);
      }
      else if (fld.equals("pre-tax inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setPretaxIncY(dArr);
      }
      else if (fld.equals("inc tax Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setIncTaxQ(dArr);
      }
      else if (fld.equals("inc tax Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setIncTaxY(dArr);
      }
      else if (fld.equals("inc after tax Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setIncAfterTaxQ(dArr);
      }
      else if (fld.equals("inc after tax Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setIncAfterTaxY(dArr);
      }
      else if (fld.equals("adj to inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setAdjToIncQ(dArr);
      }
      else if (fld.equals("adj to inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setAdjToIncY(dArr);
      }
      else if (fld.equals("inc primary eps Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setIncPrimaryEpsQ(dArr);
      }
      else if (fld.equals("inc primary eps Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setIncPrimaryEpsY(dArr);
      }
      else if (fld.equals("non-recur items Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setNonRecurItemsQ(dArr);
      }
      else if (fld.equals("non-recur items Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setNonRecurItemsY(dArr);
      }
      else if (fld.equals("net inc Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setNetIncQ(dArr);
      }
      else if (fld.equals("net inc Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setNetIncY(dArr);
      }
      else if (fld.equals("eps Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setEpsQ(dArr);
      }
      else if (fld.equals("eps Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setEpsY(dArr);
      }
      else if (fld.equals("eps dil Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setEpsDilQ(dArr);
      }
      else if (fld.equals("eps dil Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setEpsDilY(dArr);
      }
      else if (fld.equals("eps cont Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setEpsContQ(dArr);
      }
      else if (fld.equals("eps cont Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setEpsContY(dArr);
      }
      else if (fld.equals("eps dil cont Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setEpsDilContQ(dArr);
      }
      else if (fld.equals("eps dil cont Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setEpsDilContY(dArr);
      }
      else if (fld.equals("dividend Qtr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 1);
        ifd.setEpsDividendQ(dArr);
      }
      else if (fld.equals("dividend Yr")) {
        final double[] dArr = SipUtils.parseArrayDoubles(tfld[1], 0);
        ifd.setEpsDividendY(dArr);
      }
    }

    return ifd;

  }

  /**
   * Reads the data from SIP tab delimited files and fills data structures.
   *
   * @param filenameQtr
   * @param filenameYr
   */
  public static void readSipData(String filenameQtr, String filenameYr) {

    List<String> isdDataQtr = null;
    List<String> isdDataYr = null;
    try {
      isdDataQtr = TextUtils.readTextFile(filenameQtr, true);
      isdDataYr = TextUtils.readTextFile(filenameYr, true);

      if (isdDataQtr.size() < 100) {
        System.out.printf("Warning ... Invalid File %s%n", filenameQtr);
        return;
      }
      if (isdDataYr.size() < 100) {
        System.out.printf("Warning ... Invalid File %s%n", filenameYr);
        return;
      }
    }
    catch (Exception e) {
      System.out.printf("Warning ... File not found %s or %s%n", filenameQtr, filenameYr);
      return;
    }

    for (int i = 0; i < isdDataQtr.size(); i++) {

      final String[] fldQtr = isdDataQtr.get(i).replace("\"", "").split(Utils.TAB);
      final String[] fldYr = isdDataYr.get(i).replace("\"", "").split(Utils.TAB);

      if (!fldQtr[1].equals(fldYr[1])) {

        System.out.printf("ISD Not equal : %s : %s%n", fldQtr[1], fldYr[1]);

      }
      else {

        final IncSheetFileData isd = new IncSheetFileData(fldQtr, fldYr);
        IncSheetFileData.ifdList.add(isd);

      }
    }
  }

  private double[] adjToIncQtr;
  private double[] adjToIncYr;
  private double[] cogsQtr;
  private double[] cogsYr;
  private double[] depreciationQtr;
  private double[] depreciationYr;
  private double[] dividendQtr;
  private double[] dividendYr;
  private double[] epsContQtr;
  private double[] epsContYr;
  private double[] epsDilContQtr;
  private double[] epsDilContYr;
  private double[] epsDilQtr;
  private double[] epsDilYr;
  private double[] epsQtr;
  private double[] epsYr;
  private ExchEnum exchange;
  private double[] grossIncQtr;
  private double[] grossIncYr;
  private double[] grossOpIncQtr;
  private double[] grossOpIncYr;
  private double[] incAfterTaxQtr;
  private double[] incAfterTaxYr;
  private double[] incPrimaryEpsQtr;
  private double[] incPrimaryEpsYr;
  private double[] incTaxQtr;
  private double[] incTaxYr;
  private String   industry;
  private double[] intExpNonOpQtr;
  private double[] intExpNonOpYr;
  private double[] intExpQtr;
  private double[] intExpYr;
  private String   name;
  private double[] netIncQtr;
  private double[] netIncYr;
  private double[] nonrecurringItemsQtr;
  private double[] nonrecurringItemsYr;
  private double[] otherIncQtr;
  private double[] otherIncYr;
  private double[] preTaxIncQtr;
  private double[] preTaxIncYr;
  private double[] rdQtr;
  private double[] rdYr;
  private double[] salesQtr;
  private double[] salesYr;
  private String   sector;
  private String   ticker;
  private double[] totalOpExpQtr;
  private double[] totalOpExpYr;
  private double[] unusualIncQtr;
  private double[] unusualIncYr;

  /**
   * Constructor - package level.
   */
  IncSheetFileData() {
    // TODO Auto-generated constructor stub
  }

  /**
   * Constructor fills data structures.
   *
   * @param strFldQtr
   * @param strFldYr
   */
  IncSheetFileData(String[] strFldQtr, String[] strFldYr) {

    this.name = strFldQtr[0].trim();
    this.ticker = strFldQtr[1].trim();
    this.exchange = FieldData.convertExchange(strFldQtr[2].trim());
    this.sector = strFldQtr[3].trim();
    this.industry = strFldQtr[4].trim();

    final int flds = 8;
    int ptr = 5;

    this.salesQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.salesYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.cogsQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.cogsYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.grossIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.grossIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.rdQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.rdYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.depreciationQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.depreciationYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.intExpQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.intExpYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.unusualIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.unusualIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.totalOpExpQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.totalOpExpYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.grossOpIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.grossOpIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.intExpNonOpQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.intExpNonOpYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.otherIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.otherIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.preTaxIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.preTaxIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.incTaxQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.incTaxYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.incAfterTaxQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.incAfterTaxYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.adjToIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.adjToIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.incPrimaryEpsQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.incPrimaryEpsYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.nonrecurringItemsQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.nonrecurringItemsYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.netIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.netIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.epsQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.epsYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.epsContQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.epsContYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.epsDilQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.epsDilYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.epsDilContQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.epsDilContYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

    this.dividendQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.dividendYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
    ptr += flds;

  }

  public double[] getAdjToIncQtr() {
    return this.adjToIncQtr;
  }

  public double[] getAdjToIncYr() {
    return this.adjToIncYr;
  }

  public double[] getCogsQtr() {
    return this.cogsQtr;
  }

  public double[] getCogsYr() {
    return this.cogsYr;
  }

  public double[] getDepreciationQtr() {
    return this.depreciationQtr;
  }

  public double[] getDepreciationYr() {
    return this.depreciationYr;
  }

  public double[] getDividendQtr() {
    return this.dividendQtr;
  }

  public double[] getDividendYr() {
    return this.dividendYr;
  }

  public double[] getEpsContQtr() {
    return this.epsContQtr;
  }

  public double[] getEpsContYr() {
    return this.epsContYr;
  }

  public double[] getEpsDilContQtr() {
    return this.epsDilContQtr;
  }

  public double[] getEpsDilContYr() {
    return this.epsDilContYr;
  }

  public double[] getEpsDilQtr() {
    return this.epsDilQtr;
  }

  public double[] getEpsDilYr() {
    return this.epsDilYr;
  }

  public double[] getEpsQtr() {
    return this.epsQtr;
  }

  public double[] getEpsYr() {
    return this.epsYr;
  }

  public ExchEnum getExchange() {
    return this.exchange;
  }

  public double[] getGrossIncQtr() {
    return this.grossIncQtr;
  }

  public double[] getGrossIncYr() {
    return this.grossIncYr;
  }

  public double[] getGrossOpExpQtr() {
    return this.grossOpIncQtr;
  }

  public double[] getGrossOpExpYr() {
    return this.grossOpIncYr;
  }

  public double[] getIncAfterTaxQtr() {
    return this.incAfterTaxQtr;
  }

  public double[] getIncAfterTaxYr() {
    return this.incAfterTaxYr;
  }

  public double[] getIncPrimaryEpsQtr() {
    return this.incPrimaryEpsQtr;
  }

  public double[] getIncPrimaryEpsYr() {
    return this.incPrimaryEpsYr;
  }

  public double[] getIncTaxQtr() {
    return this.incTaxQtr;
  }

  public double[] getIncTaxYr() {
    return this.incTaxYr;
  }

  public String getIndustry() {
    return this.industry;
  }

  public double[] getIntExpNonOpQtr() {
    return this.intExpNonOpQtr;
  }

  public double[] getIntExpNonOpYr() {
    return this.intExpNonOpYr;
  }

  public double[] getIntExpQtr() {
    return this.intExpQtr;
  }

  public double[] getIntExpYr() {
    return this.intExpYr;
  }

  public String getName() {
    return this.name;
  }

  public double[] getNetIncQtr() {
    return this.netIncQtr;
  }

  public double[] getNetIncYr() {
    return this.netIncYr;
  }

  public double[] getNonrecurringItemsQtr() {
    return this.nonrecurringItemsQtr;
  }

  public double[] getNonrecurringItemsYr() {
    return this.nonrecurringItemsYr;
  }

  public double[] getOtherIncQtr() {
    return this.otherIncQtr;
  }

  public double[] getOtherIncYr() {
    return this.otherIncYr;
  }

  public double[] getPreTaxIncQtr() {
    return this.preTaxIncQtr;
  }

  public double[] getPreTaxIncYr() {
    return this.preTaxIncYr;
  }

  public double[] getRdQtr() {
    return this.rdQtr;
  }

  public double[] getRdYr() {
    return this.rdYr;
  }

  public double[] getSalesQtr() {
    return this.salesQtr;
  }

  public double[] getSalesYr() {
    return this.salesYr;
  }

  public String getSector() {
    return this.sector;
  }

  public String getTicker() {
    return this.ticker;
  }

  public double[] getTotalOpExpQtr() {
    return this.totalOpExpQtr;
  }

  public double[] getTotalOpExpYr() {
    return this.totalOpExpYr;
  }

  public double[] getUnusualIncQtr() {
    return this.unusualIncQtr;
  }

  public double[] getUnusualIncYr() {
    return this.unusualIncYr;
  }

  /**
   * Creates string of formatted data structures.
   *
   * @return String
   */
  public String toDbOutput() {
    String ret = "";
    ret += String.format("  sales Qtr           : %s%n", SipOutput.buildArray("", this.salesQtr, 10, 2, 1));
    ret += String.format("  sales Yr            : %s%n", SipOutput.buildArray("", this.salesYr, 10, 2, 0));
    ret += String.format("  cogs Qtr            : %s%n", SipOutput.buildArray("", this.cogsQtr, 10, 2, 1));
    ret += String.format("  cogs Yr             : %s%n", SipOutput.buildArray("", this.cogsYr, 10, 2, 0));
    ret += String.format("  gross inc Qtr       : %s%n", SipOutput.buildArray("", this.grossIncQtr, 10, 2, 1));
    ret += String.format("  gross inc Yr        : %s%n", SipOutput.buildArray("", this.grossIncYr, 10, 2, 0));
    ret += String.format("  rd Qtr              : %s%n", SipOutput.buildArray("", this.rdQtr, 10, 2, 1));
    ret += String.format("  rd Yr               : %s%n", SipOutput.buildArray("", this.rdYr, 10, 2, 0));
    ret += String.format("  depreciation Qtr    : %s%n", SipOutput.buildArray("", this.depreciationQtr, 10, 2, 1));
    ret += String.format("  depreciation Yr     : %s%n", SipOutput.buildArray("", this.depreciationYr, 10, 2, 0));
    ret += String.format("  int exp Qtr         : %s%n", SipOutput.buildArray("", this.intExpQtr, 10, 2, 1));
    ret += String.format("  int exp Yr          : %s%n", SipOutput.buildArray("", this.intExpYr, 10, 2, 0));
    ret += String.format("  unusual inc Qtr     : %s%n", SipOutput.buildArray("", this.unusualIncQtr, 10, 2, 1));
    ret += String.format("  unusual inc Yr      : %s%n", SipOutput.buildArray("", this.unusualIncYr, 10, 2, 0));
    ret += String.format("  total op exp Qtr    : %s%n", SipOutput.buildArray("", this.totalOpExpQtr, 10, 2, 1));
    ret += String.format("  total op exp Yr     : %s%n", SipOutput.buildArray("", this.totalOpExpYr, 10, 2, 0));
    ret += String.format("  gross op inc Qtr    : %s%n", SipOutput.buildArray("", this.grossOpIncQtr, 10, 2, 1));
    ret += String.format("  gross op inc Yr     : %s%n", SipOutput.buildArray("", this.grossOpIncYr, 10, 2, 1));
    ret += String.format("  int exp noop Qtr    : %s%n", SipOutput.buildArray("", this.intExpNonOpQtr, 10, 2, 1));
    ret += String.format("  int exp noop Yr     : %s%n", SipOutput.buildArray("", this.intExpNonOpYr, 10, 2, 0));
    ret += String.format("  other inc Qtr       : %s%n", SipOutput.buildArray("", this.otherIncQtr, 10, 2, 1));
    ret += String.format("  other inc Yr        : %s%n", SipOutput.buildArray("", this.otherIncYr, 10, 2, 0));
    ret += String.format("  pre-tax inc Qtr     : %s%n", SipOutput.buildArray("", this.preTaxIncQtr, 10, 2, 1));
    ret += String.format("  pre-tax inc Yr      : %s%n", SipOutput.buildArray("", this.preTaxIncYr, 10, 2, 0));
    ret += String.format("  inc tax Qtr         : %s%n", SipOutput.buildArray("", this.incTaxQtr, 10, 2, 1));
    ret += String.format("  inc tax Yr          : %s%n", SipOutput.buildArray("", this.incTaxYr, 10, 2, 0));
    ret += String.format("  inc after tax Qtr   : %s%n", SipOutput.buildArray("", this.incAfterTaxQtr, 10, 2, 1));
    ret += String.format("  inc after tax Yr    : %s%n", SipOutput.buildArray("", this.incAfterTaxYr, 10, 2, 0));
    ret += String.format("  adj to inc Qtr      : %s%n", SipOutput.buildArray("", this.adjToIncQtr, 10, 2, 1));
    ret += String.format("  adj to inc Yr       : %s%n", SipOutput.buildArray("", this.adjToIncYr, 10, 2, 0));
    ret += String.format("  inc primary eps Qtr : %s%n", SipOutput.buildArray("", this.incPrimaryEpsQtr, 10, 2, 1));
    ret += String.format("  inc primary eps Yr  : %s%n", SipOutput.buildArray("", this.incPrimaryEpsYr, 10, 2, 0));
    ret += String.format("  non-recur items Qtr : %s%n", SipOutput.buildArray("", this.nonrecurringItemsQtr, 10, 2, 1));
    ret += String.format("  non-recur items Yr  : %s%n", SipOutput.buildArray("", this.intExpNonOpYr, 10, 2, 0));
    ret += String.format("  net inc Qtr         : %s%n", SipOutput.buildArray("", this.netIncQtr, 10, 2, 1));
    ret += String.format("  net inc Yr          : %s%n", SipOutput.buildArray("", this.netIncYr, 10, 2, 0));
    ret += String.format("  eps Qtr             : %s%n", SipOutput.buildArray("", this.epsQtr, 10, 4, 1));
    ret += String.format("  eps Yr              : %s%n", SipOutput.buildArray("", this.epsYr, 10, 4, 0));
    ret += String.format("  eps cont Qtr        : %s%n", SipOutput.buildArray("", this.epsContQtr, 10, 4, 1));
    ret += String.format("  eps cont Yr         : %s%n", SipOutput.buildArray("", this.epsContYr, 10, 4, 0));
    ret += String.format("  eps dil Qtr         : %s%n", SipOutput.buildArray("", this.epsDilQtr, 10, 4, 1));
    ret += String.format("  eps dil Yr          : %s%n", SipOutput.buildArray("", this.epsDilYr, 10, 4, 0));
    ret += String.format("  eps dil cont Qtr    : %s%n", SipOutput.buildArray("", this.epsDilContQtr, 10, 4, 1));
    ret += String.format("  eps dil cont Yr     : %s%n", SipOutput.buildArray("", this.epsDilContYr, 10, 4, 0));
    ret += String.format("  dividend Qtr        : %s%n", SipOutput.buildArray("", this.dividendQtr, 10, 4, 1));
    ret += String.format("  dividend Yr         : %s%n", SipOutput.buildArray("", this.dividendYr, 10, 4, 0));

    return ret;
  }

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, FieldData.getExchangeStr(this.exchange), this.sector, this.industry);
    ret += SipOutput.buildArray("  salesQtr             : ", this.salesQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  salesYr              : ", this.salesYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  cogsQtr              : ", this.cogsQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  cogsYr               : ", this.cogsYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  GrossIncQtr          : ", this.grossIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  GrossIncYr           : ", this.grossIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  rdQtr                : ", this.rdQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  rdYr                 : ", this.rdYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  depreciationQtr      : ", this.depreciationQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  depreciationYr       : ", this.depreciationYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  intExpQtr            : ", this.intExpQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  intExpYr             : ", this.intExpYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  unusualIncQtr        : ", this.unusualIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  unusualIncYr         : ", this.unusualIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  totalOpExpQtr        : ", this.totalOpExpQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  totalOpExpYr         : ", this.totalOpExpYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  grossOpExpQtr        : ", this.grossOpIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  grossOpExpYr         : ", this.grossOpIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  intExpNonOpQtr       : ", this.intExpNonOpQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  intExpNonOpYr        : ", this.intExpNonOpYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  otherIncQtr          : ", this.otherIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  otherIncYr           : ", this.otherIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  preTaxIncQtr         : ", this.preTaxIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  preTaxIncYr          : ", this.preTaxIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  incTaxQtr            : ", this.incTaxQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  incTaxYr             : ", this.incTaxYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  incAfterTaxQtr       : ", this.incAfterTaxQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  incAfterTaxYr        : ", this.incAfterTaxYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  adjToIncQtr          : ", this.adjToIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  adjToIncYr           : ", this.adjToIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  incPrimaryEpsQtr     : ", this.incPrimaryEpsQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  incPrimaryEpsYr      : ", this.incPrimaryEpsYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  nonrecurringItemsQtr : ", this.nonrecurringItemsQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  nonrecurringItemsYr  : ", this.nonrecurringItemsYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  netIncQtr            : ", this.netIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  netIncYr             : ", this.netIncYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsQtr               : ", this.epsQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsYr                : ", this.epsYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsContQtr           : ", this.epsContQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsContYr            : ", this.epsContYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsDilQtr            : ", this.epsDilQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsDilYr             : ", this.epsDilYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsDilContQtr        : ", this.epsDilContQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  epsDilContYr         : ", this.epsDilContYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  dividentQtr          : ", this.dividendQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  dividendYr           : ", this.dividendYr, 1, 3) + Utils.NL;

    return ret;
  }

  /**
   * Sets name fields
   *
   * @param cfd CompanyFileData instance
   */
  void setNameFields(CompanyFileData cfd) {
    this.ticker = cfd.getTicker();
    this.name = cfd.getName();
    this.sector = cfd.getSector();
    this.industry = cfd.getIndustry();
    this.exchange = cfd.getExchange();

  }

  private void setAdjToIncQ(double[] dArr) {
    this.adjToIncQtr = dArr;
  }

  private void setAdjToIncY(double[] dArr) {
    this.adjToIncYr = dArr;
  }

  private void setCogsQ(double[] dArr) {
    this.cogsQtr = dArr;
  }

  private void setCogsY(double[] dArr) {
    this.cogsYr = dArr;
  }

  private void setDepreciationQ(double[] dArr) {
    this.depreciationQtr = dArr;
  }

  private void setDepreciationY(double[] dArr) {
    this.depreciationYr = dArr;
  }

  private void setEpsContQ(double[] dArr) {
    this.epsContQtr = dArr;
  }

  private void setEpsContY(double[] dArr) {
    this.epsContYr = dArr;
  }

  private void setEpsDilContQ(double[] dArr) {
    this.epsDilContQtr = dArr;
  }

  private void setEpsDilContY(double[] dArr) {
    this.epsDilContYr = dArr;
  }

  private void setEpsDilQ(double[] dArr) {
    this.epsDilQtr = dArr;
  }

  private void setEpsDilY(double[] dArr) {
    this.epsDilYr = dArr;
  }

  private void setEpsDividendQ(double[] dArr) {
    this.dividendQtr = dArr;
  }

  private void setEpsDividendY(double[] dArr) {
    this.dividendYr = dArr;
  }

  private void setEpsQ(double[] dArr) {
    this.epsQtr = dArr;
  }

  private void setEpsY(double[] dArr) {
    this.epsYr = dArr;
  }

  private void setgrossIncQ(double[] dArr) {
    this.grossIncQtr = dArr;
  }

  private void setgrossIncY(double[] dArr) {
    this.grossIncYr = dArr;
  }

  private void setGrossOpIncQ(double[] dArr) {
    this.grossOpIncQtr = dArr;
  }

  private void setGrossOpIncY(double[] dArr) {
    this.grossOpIncYr = dArr;
  }

  private void setIncAfterTaxQ(double[] dArr) {
    this.incAfterTaxQtr = dArr;
  }

  private void setIncAfterTaxY(double[] dArr) {
    this.incAfterTaxYr = dArr;
  }

  private void setIncPrimaryEpsQ(double[] dArr) {
    this.incPrimaryEpsQtr = dArr;
  }

  private void setIncPrimaryEpsY(double[] dArr) {
    this.incPrimaryEpsYr = dArr;
  }

  private void setIncTaxQ(double[] dArr) {
    this.incTaxQtr = dArr;
  }

  private void setIncTaxY(double[] dArr) {
    this.incTaxYr = dArr;
  }

  private void setIntExpNoOpQ(double[] dArr) {
    this.intExpNonOpQtr = dArr;
  }

  private void setIntExpNoOpY(double[] dArr) {
    this.intExpNonOpYr = dArr;
  }

  private void setIntExpQ(double[] dArr) {
    this.intExpQtr = dArr;
  }

  private void setIntExpY(double[] dArr) {
    this.intExpYr = dArr;
  }

  private void setNetIncQ(double[] dArr) {
    this.netIncQtr = dArr;
  }

  private void setNetIncY(double[] dArr) {
    this.netIncYr = dArr;
  }

  private void setNonRecurItemsQ(double[] dArr) {
    this.nonrecurringItemsQtr = dArr;
  }

  private void setNonRecurItemsY(double[] dArr) {
    this.nonrecurringItemsYr = dArr;
  }

  private void setOtherIncQ(double[] dArr) {
    this.otherIncQtr = dArr;
  }

  private void setOtherIncY(double[] dArr) {
    this.otherIncYr = dArr;
  }

  private void setPretaxIncQ(double[] dArr) {
    this.preTaxIncQtr = dArr;
  }

  private void setPretaxIncY(double[] dArr) {
    this.preTaxIncYr = dArr;
  }

  private void setRdQ(double[] dArr) {
    this.rdQtr = dArr;
  }

  private void setRdY(double[] dArr) {
    this.rdYr = dArr;
  }

  private void setSalesQ(double[] dArr) {
    this.salesQtr = dArr;
  }

  private void setSalesY(double[] dArr) {
    this.salesYr = dArr;
  }

  private void setTotalOpExpQ(double[] dArr) {
    this.totalOpExpQtr = dArr;
  }

  private void setTotalOpExpY(double[] dArr) {
    this.totalOpExpYr = dArr;
  }

  private void setUnusualIncQ(double[] dArr) {
    this.unusualIncQtr = dArr;
  }

  private void setUnusualIncY(double[] dArr) {
    this.unusualIncYr = dArr;
  }

  /**
   *
   * @param in
   * @return
   */
  private double[] slideIncYearData(double[] in) {

    final double[] ret = new double[in.length - 1];
    int knt = 0;
    for (int i = 1; i < in.length; i++) {
      ret[knt++] = in[i];
    }
    return ret;
  }
}
