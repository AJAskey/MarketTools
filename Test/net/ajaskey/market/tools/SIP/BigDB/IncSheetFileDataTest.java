package net.ajaskey.market.tools.SIP.BigDB;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import net.ajaskey.common.TextUtils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData;

class IncSheetFileDataTest {

  public static void main(final String[] args) {

    testReadData();
  }

//  static void testReadData() {
  @Test
  static void testReadData() {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%d/Q%d/", TestData.year, TestData.quarter);
    final String tail = String.format("%dQ%d.txt", TestData.year, TestData.quarter);

    String head = String.format("CompanyInfo-");
    final String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readSipData(ffname);

    head = String.format("IncSheet-");
    head = "Income-";
    IncSheetFileData.readSipData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);

    final IncSheetFileData ifd = IncSheetFileData.find(TestData.ticker);

    System.out.println(ifd);

    IncSheetFileDataTest.readIncSheetTestData("D:/dev/eclipse-workspace/Market/Test/Data/INCSHEET-2020Q1-TestData.txt");

    Assert.assertEquals("MSFT", ifd.getTicker());
    Assert.assertEquals("Microsoft Corporation", ifd.getName());
    Assert.assertEquals("M - Nasdaq", ifd.getExchange());

    assertArrayEquals("salesY", IncSheetFileDataTest.salesY, ifd.getSalesYr(), 0.005);
    assertArrayEquals("salesQ", IncSheetFileDataTest.salesQ, ifd.getSalesQtr(), 0.005);

    assertArrayEquals("cogsY", IncSheetFileDataTest.cogsY, ifd.getCogsYr(), 0.005);
    assertArrayEquals("cogsQ", IncSheetFileDataTest.cogsQ, ifd.getCogsQtr(), 0.005);

    assertArrayEquals("grossIncY", IncSheetFileDataTest.grossIncY, ifd.getGrossIncYr(), 0.005);
    assertArrayEquals("grossIncQ", IncSheetFileDataTest.grossIncQ, ifd.getGrossIncQtr(), 0.005);

    assertArrayEquals("rdY", IncSheetFileDataTest.rdY, ifd.getRdYr(), 0.005);
    assertArrayEquals("rdQ", IncSheetFileDataTest.rdQ, ifd.getRdQtr(), 0.005);

    assertArrayEquals("depreciationY", IncSheetFileDataTest.depreciationY, ifd.getDepreciationYr(), 0.005);
    assertArrayEquals("depreciationQ", IncSheetFileDataTest.depreciationQ, ifd.getDepreciationQtr(), 0.005);

    assertArrayEquals("intExpY", IncSheetFileDataTest.intExpY, ifd.getIntExpYr(), 0.005);
    assertArrayEquals("intExpQ", IncSheetFileDataTest.intExpQ, ifd.getIntExpQtr(), 0.005);

    assertArrayEquals("unusualIncY", IncSheetFileDataTest.unusualIncY, ifd.getUnusualIncYr(), 0.005);
    assertArrayEquals("unusualIncQ", IncSheetFileDataTest.unusualIncQ, ifd.getUnusualIncQtr(), 0.005);

    assertArrayEquals("totalOpExpY", IncSheetFileDataTest.totalOpExpY, ifd.getTotalOpExpYr(), 0.005);
    assertArrayEquals("totalOpExpQ", IncSheetFileDataTest.totalOpExpQ, ifd.getTotalOpExpQtr(), 0.005);

    assertArrayEquals("intExpNonOpY", IncSheetFileDataTest.intExpNonOpY, ifd.getIntExpNonOpYr(), 0.005);
    assertArrayEquals("intExpNonOpQ", IncSheetFileDataTest.intExpNonOpQ, ifd.getIntExpNonOpQtr(), 0.005);

    assertArrayEquals("otherIncY", IncSheetFileDataTest.otherIncY, ifd.getOtherIncYr(), 0.005);
    assertArrayEquals("otherIncQ", IncSheetFileDataTest.otherIncQ, ifd.getOtherIncQtr(), 0.005);

    assertArrayEquals("preTaxIncY", IncSheetFileDataTest.preTaxIncY, ifd.getPreTaxIncYr(), 0.005);
    assertArrayEquals("preTaxIncQ", IncSheetFileDataTest.preTaxIncQ, ifd.getPreTaxIncQtr(), 0.005);

    assertArrayEquals("incTaxY", IncSheetFileDataTest.incTaxY, ifd.getIncTaxYr(), 0.005);
    assertArrayEquals("incTaxQ", IncSheetFileDataTest.incTaxQ, ifd.getIncTaxQtr(), 0.005);

    assertArrayEquals("incAfterTaxY", IncSheetFileDataTest.incAfterTaxY, ifd.getIncAfterTaxYr(), 0.005);
    assertArrayEquals("incAfterTaxQ", IncSheetFileDataTest.incAfterTaxQ, ifd.getIncAfterTaxQtr(), 0.005);

    assertArrayEquals("adjToIncY", IncSheetFileDataTest.adjToIncY, ifd.getAdjToIncYr(), 0.005);
    assertArrayEquals("adjToIncQ", IncSheetFileDataTest.adjToIncQ, ifd.getAdjToIncQtr(), 0.005);

    assertArrayEquals("incPrimaryEpsY", IncSheetFileDataTest.incPrimaryEpsY, ifd.getIncPrimaryEpsYr(), 0.005);
    assertArrayEquals("incPrimaryEpsQ", IncSheetFileDataTest.incPrimaryEpsQ, ifd.getIncPrimaryEpsQtr(), 0.005);

    assertArrayEquals("nonrecurringItemsY", IncSheetFileDataTest.nonrecurringItemsY, ifd.getNonrecurringItemsYr(), 0.005);
    assertArrayEquals("nonrecurringItemsQ", IncSheetFileDataTest.nonrecurringItemsQ, ifd.getNonrecurringItemsQtr(), 0.005);

    assertArrayEquals("netIncY", IncSheetFileDataTest.netIncY, ifd.getNetIncYr(), 0.005);
    assertArrayEquals("netIncQ", IncSheetFileDataTest.netIncQ, ifd.getNetIncQtr(), 0.005);

    assertArrayEquals("epsY", IncSheetFileDataTest.epsY, ifd.getEpsYr(), 0.005);
    assertArrayEquals("epsQ", IncSheetFileDataTest.epsQ, ifd.getEpsQtr(), 0.005);

    assertArrayEquals("epsContY", IncSheetFileDataTest.epsContY, ifd.getEpsContYr(), 0.005);
    assertArrayEquals("epsContQ", IncSheetFileDataTest.epsContQ, ifd.getEpsContQtr(), 0.005);

    assertArrayEquals("epsDilContY", IncSheetFileDataTest.epsDilContY, ifd.getEpsDilContYr(), 0.005);
    assertArrayEquals("epsDilContQ", IncSheetFileDataTest.epsDilContQ, ifd.getEpsDilContQtr(), 0.005);

    assertArrayEquals("epsDilY", IncSheetFileDataTest.epsDilY, ifd.getEpsDilYr(), 0.005);
    assertArrayEquals("epsDilQ", IncSheetFileDataTest.epsDilQ, ifd.getEpsDilQtr(), 0.005);

    assertArrayEquals("dividendY", IncSheetFileDataTest.dividendY, ifd.getDividendYr(), 0.005);
    assertArrayEquals("dividendQ", IncSheetFileDataTest.dividendQ, ifd.getDividendQtr(), 0.005);
  }

  private static void assertArrayEquals(String desc, double[] test, double[] data, double precision) {
    System.out.println();
    System.out.println(SipOutput.buildArray(desc + "T", test, 10, 2));
    System.out.println(SipOutput.buildArray(desc + "D", data, 10, 2));
    try {
      Assert.assertArrayEquals(test, data, precision);
      System.out.printf("%s passed.%n", desc);
    }
    catch (AssertionError e) {
      System.out.printf("%s failed.%n", desc);
      // e.printStackTrace();
      throw e;
    }
  }

  static double[] salesY             = new double[8];
  static double[] salesQ             = new double[9];
  static double[] cogsY              = new double[8];
  static double[] cogsQ              = new double[9];
  static double[] grossIncY          = new double[8];
  static double[] grossIncQ          = new double[9];
  static double[] rdY                = new double[8];
  static double[] rdQ                = new double[9];
  static double[] depreciationY      = new double[8];
  static double[] depreciationQ      = new double[9];
  static double[] intExpY            = new double[8];
  static double[] intExpQ            = new double[9];
  static double[] unusualIncY        = new double[8];
  static double[] unusualIncQ        = new double[9];
  static double[] totalOpExpY        = new double[8];
  static double[] totalOpExpQ        = new double[9];
  static double[] intExpNonOpY       = new double[8];
  static double[] intExpNonOpQ       = new double[9];
  static double[] otherIncY          = new double[8];
  static double[] otherIncQ          = new double[9];
  static double[] preTaxIncY         = new double[8];
  static double[] preTaxIncQ         = new double[9];
  static double[] incTaxY            = new double[8];
  static double[] incTaxQ            = new double[9];
  static double[] incAfterTaxY       = new double[8];
  static double[] incAfterTaxQ       = new double[9];
  static double[] adjToIncY          = new double[8];
  static double[] adjToIncQ          = new double[9];
  static double[] incPrimaryEpsY     = new double[8];
  static double[] incPrimaryEpsQ     = new double[9];
  static double[] nonrecurringItemsY = new double[8];
  static double[] nonrecurringItemsQ = new double[9];
  static double[] netIncY            = new double[8];
  static double[] netIncQ            = new double[9];
  static double[] epsY               = new double[8];
  static double[] epsQ               = new double[9];
  static double[] epsContY           = new double[8];
  static double[] epsContQ           = new double[9];
  static double[] epsDilContY        = new double[8];
  static double[] epsDilContQ        = new double[9];
  static double[] epsDilY            = new double[8];
  static double[] epsDilQ            = new double[9];
  static double[] dividendY          = new double[8];
  static double[] dividendQ          = new double[9];

  final static int YEARLY    = 1;
  final static int QUARTERLY = 2;
  final static int TTM       = 0;

  /**
   * Read bal sheet test data.
   *
   * @param filename the filename
   */
  private static void readIncSheetTestData(String filename) {

    final List<String> data = TextUtils.readTextFile(filename, true);

    // TextUtils.print(data);

    final String patternY = " Y";
    final String patternQ = " Q";
    final String pattern12 = " 12M";

    for (final String s : data) {

      int timing = -1;
      int num = 0;
      double val = 0.0;
      if (s.toUpperCase().contains(patternY)) {
        timing = YEARLY;
        final int idx = s.toUpperCase().indexOf(patternY);
        String ss = s.substring(idx + 2, idx + 3);
        num = Integer.parseInt(ss);
        ss = s.substring(idx + 4);
        val = Double.parseDouble(ss.trim());
      }
      else if (s.toUpperCase().contains(patternQ)) {
        timing = QUARTERLY;
        final int idx = s.indexOf(patternQ);
        String ss = s.toUpperCase().substring(idx + 2, idx + 3);
        num = Integer.parseInt(ss);
        ss = s.substring(idx + 4);
        val = Double.parseDouble(ss.trim());
      }
      else if (s.toUpperCase().contains(pattern12)) {
        timing = TTM;
        final int idx = s.toUpperCase().indexOf(pattern12);
        num = 0;
        String ss = s.substring(idx + 5);
        val = Double.parseDouble(ss.trim());
      }

      if (timing > -1) {
        if (s.contains("Sales ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.salesY, IncSheetFileDataTest.salesQ, val, num, timing);
        }
        else if (s.contains("Cost of goods sold ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.cogsY, IncSheetFileDataTest.cogsQ, val, num, timing);
        }
        else if (s.contains("Gross income ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.grossIncY, IncSheetFileDataTest.grossIncQ, val, num, timing);
        }
        else if (s.contains("Research and development ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.rdY, IncSheetFileDataTest.rdQ, val, num, timing);
        }
        else if (s.contains("Depreciation ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.depreciationY, IncSheetFileDataTest.depreciationQ, val, num, timing);
        }
        else if (s.contains("Interest expense ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.intExpY, IncSheetFileDataTest.intExpQ, val, num, timing);
        }
        else if (s.contains("Unusual income ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.unusualIncY, IncSheetFileDataTest.unusualIncQ, val, num, timing);
        }
        else if (s.contains("Total operating expenses ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.totalOpExpY, IncSheetFileDataTest.totalOpExpQ, val, num, timing);
        }
        else if (s.contains("Interest expense-non-op. ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.intExpNonOpY, IncSheetFileDataTest.intExpNonOpQ, val, num, timing);
        }
        else if (s.contains("Other income ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.otherIncY, IncSheetFileDataTest.otherIncQ, val, num, timing);
        }
        else if (s.contains("Pre-tax income ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.preTaxIncY, IncSheetFileDataTest.preTaxIncQ, val, num, timing);
        }
        else if (s.contains("Income tax ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.incTaxY, IncSheetFileDataTest.incTaxQ, val, num, timing);
        }
        else if (s.contains("Income after taxes ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.incAfterTaxY, IncSheetFileDataTest.incAfterTaxQ, val, num, timing);
        }
        else if (s.contains("Adjustments to income ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.adjToIncY, IncSheetFileDataTest.adjToIncQ, val, num, timing);
        }
        else if (s.contains("Income for primary EPS ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.incPrimaryEpsY, IncSheetFileDataTest.incPrimaryEpsQ, val, num, timing);
        }
        else if (s.contains("Nonrecurring items ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.nonrecurringItemsY, IncSheetFileDataTest.nonrecurringItemsQ, val, num, timing);
        }
        else if (s.contains("Net income ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.netIncY, IncSheetFileDataTest.netIncQ, val, num, timing);
        }
        else if (s.contains("EPS ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.epsY, IncSheetFileDataTest.epsQ, val, num, timing);
        }
        else if (s.contains("EPS-Continuing ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.epsContY, IncSheetFileDataTest.epsContQ, val, num, timing);
        }
        else if (s.contains("EPS-Diluted Continuing ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.epsDilContY, IncSheetFileDataTest.epsDilContQ, val, num, timing);
        }
        else if (s.contains("EPS-Diluted ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.epsDilY, IncSheetFileDataTest.epsDilQ, val, num, timing);
        }
        else if (s.contains("Dividend ")) {
          IncSheetFileDataTest.set(IncSheetFileDataTest.dividendY, IncSheetFileDataTest.dividendQ, val, num, timing);
        }
      }
    }

  }

  /**
   *
   * @param y
   * @param q
   * @param val
   * @param num
   * @param timing
   */
  private static void set(double[] y, double[] q, double val, int num, int timing) {
    if (val < -9990000000.9) {
      val = 0.0;
    }
    if (timing == YEARLY) {
      y[num] = val;
    }
    else if (timing == QUARTERLY) {
      q[num] = val;
    }
    else if (timing == TTM) {
      y[0] = val;
    }

  }

//  sales Y1 11356
//  ST investments Y1   122463
//  Accounts receivable Y1  29524
//  rd Y7    1938
//  Other current assets Y1 10146
//  Current assets Y7   101466
//  Net fixed assets Y1 43856
//  LT investments Y7   10844
//  intExpNonOp and intangibles Y1 49776
//  Other LT assets Y7  2392
//  Total assets Y1 286556
//  Accounts payable Y7 4828
//  ST debt Y1  5833
//  Other current liabilities Y7    29590
//  Current liabilities Y1  69420
//  LT debt Y7  12601
//  Other LT liabilities Y1 41887
//  Total liabilities Y7    63487
//  Preferred stock Y1  0
//  epsDilCont Y7   78944
//  Liabilities and epsDilCont Y1   286556
//  dividend Y7 9.43

}
