package net.ajaskey.market.tools.SIP.BigDB;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import net.ajaskey.common.TextUtils;
import net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;

class BalSheetFileDataTest {

  @Test
  void testReadData() {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%d/Q%d/", TestData.year, TestData.quarter);
    final String tail = String.format("%dQ%d.txt", TestData.year, TestData.quarter);

    String head = String.format("CompanyInfo-");
    final String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readSipData(ffname);

    head = String.format("BalSheet-");
    head = "BalSheet-";
    BalSheetFileData.readSipData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);

    final BalSheetFileData bfd = BalSheetFileData.find(TestData.ticker);

    System.out.println(bfd);

    BalSheetFileDataTest.readBalSheetTestData("D:/dev/eclipse-workspace/Market/Test/Data/BALSHEET-2020Q1-TestData.txt");

    Assert.assertEquals("MSFT", bfd.getTicker());
    Assert.assertEquals("Microsoft Corporation", bfd.getName());
    Assert.assertEquals("M - Nasdaq", bfd.getExchange());

    // System.out.println(SipOutput.buildArray("CashY", cashY, 10, 0));
    // System.out.println(SipOutput.buildArray("CashQ", cashQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.cashY, bfd.getCashYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.cashQ, bfd.getCashQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("stInvestY", stInvestY, 10, 0));
    // System.out.println(SipOutput.buildArray("stInvestQ", stInvestQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.stInvestY, bfd.getStInvestYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.stInvestQ, bfd.getStInvestQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("acctRxY", acctRxY, 10, 0));
    // System.out.println(SipOutput.buildArray("acctRxQ", acctRxQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.acctRxY, bfd.getAcctRxYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.acctRxQ, bfd.getAcctRxQtr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.stInvestQ, bfd.getStInvestQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("inventoryY ", inventoryY, 10, 0));
    // System.out.println(SipOutput.buildArray("inventoryQ", inventoryQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.inventoryY, bfd.getInventoryYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.inventoryQ, bfd.getInventoryQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("otherCurrAssetY", otherCurrAssetsY,
    // 10, 0));
    // System.out.println(SipOutput.buildArray("otherCurrAssetQ", otherCurrAssetsQ,
    // 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.otherCurrAssetsY, bfd.getOtherCurrAssetsYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.otherCurrAssetsQ, bfd.getOtherCurrAssetsQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("currAssetY", currAssetsY, 10, 0));
    // System.out.println(SipOutput.buildArray("currAssetQ", currAssetsQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.currAssetsY, bfd.getCurrAssetsYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.currAssetsQ, bfd.getCurrAssetsQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("netFixedAssetY", netFixedAssetsY,
    // 10, 0));
    // System.out.println(SipOutput.buildArray("netFixedAssetQ", netFixedAssetsQ,
    // 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.netFixedAssetsY, bfd.getNetFixedAssetsYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.netFixedAssetsQ, bfd.getNetFixedAssetsQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("ltInvestY", ltInvestY, 10, 0));
    // System.out.println(SipOutput.buildArray("ltInvestQ", ltInvestQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.ltInvestY, bfd.getLtInvestYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.ltInvestQ, bfd.getLtInvestQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("goodwillY", goodwillY, 10, 0));
    // System.out.println(SipOutput.buildArray("goodwillQ", goodwillQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.goodwillY, bfd.getGoodwillYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.goodwillQ, bfd.getGoodwillQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("otherLtAssetsY", otherLtAssetsY, 10,
    // 0));
    // System.out.println(SipOutput.buildArray("otherLtAssetsQ", otherLtAssetsQ, 10,
    // 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.otherLtAssetsY, bfd.getOtherLtAssetsYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.otherLtAssetsQ, bfd.getOtherLtAssetsQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("totalAssetsY", totalAssetsY, 10,
    // 0));
    // System.out.println(SipOutput.buildArray("totalAssetsQ", totalAssetsQ, 10,
    // 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.totalAssetsY, bfd.getTotalAssetsYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.totalAssetsQ, bfd.getTotalAssetsQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("acctPayableY", acctPayableY, 10,
    // 0));
    // System.out.println(SipOutput.buildArray("acctPayableQ", acctPayableQ, 10,
    // 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.acctPayableY, bfd.getAcctPayableYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.acctPayableQ, bfd.getAcctPayableQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("stDebtY", stDebtY, 10, 0));
    // System.out.println(SipOutput.buildArray("stDebtQ", stDebtQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.stDebtY, bfd.getStDebtYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.stDebtQ, bfd.getStDebtQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("otherCurrLiabY", otherCurrLiabY, 10,
    // 0));
    // System.out.println(SipOutput.buildArray("otherCurrLiabQ", otherCurrLiabQ, 10,
    // 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.otherCurrLiabY, bfd.getOtherCurrLiabYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.otherCurrLiabQ, bfd.getOtherCurrLiabQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("currLiabY", currLiabY, 10, 0));
    // System.out.println(SipOutput.buildArray("currLiabQ", currLiabQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.currLiabY, bfd.getCurrLiabYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.currLiabQ, bfd.getCurrLiabQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("ltDebtY", ltDebtY, 10, 0));
    // System.out.println(SipOutput.buildArray("ltDebtQ", ltDebtQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.ltDebtY, bfd.getLtDebtYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.ltDebtQ, bfd.getLtDebtQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("otherLtLiabY", otherLtLiabY, 10,
    // 0));
    // System.out.println(SipOutput.buildArray("otherLtLiabQ", otherLtLiabQ, 10,
    // 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.otherLtLiabY, bfd.getOtherLtLiabYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.otherLtLiabQ, bfd.getOtherLtLiabQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("totalLiabY", totalLiabY, 10, 0));
    // System.out.println(SipOutput.buildArray("totalLiabQ", totalLiabQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.totalLiabY, bfd.getTotalLiabYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.totalLiabQ, bfd.getTotalLiabQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("prefStockY", prefStockY, 10, 0));
    // System.out.println(SipOutput.buildArray("prefStockQ", prefStockQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.prefStockY, bfd.getPrefStockYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.prefStockQ, bfd.getPrefStockQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("equityY", equityY, 10, 0));
    // System.out.println(SipOutput.buildArray("equityQ", equityQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.equityY, bfd.getEquityYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.equityQ, bfd.getEquityQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("liabEquityY", liabEquityY, 10, 0));
    // System.out.println(SipOutput.buildArray("liabEquityQ", liabEquityQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.liabEquityY, bfd.getLiabEquityYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.liabEquityQ, bfd.getLiabEquityQtr(), 0.005);

    // System.out.println(SipOutput.buildArray("bvpsY", bvpsY, 10, 0));
    // System.out.println(SipOutput.buildArray("bvpsQ", bvpsQ, 10, 0));
    Assert.assertArrayEquals(BalSheetFileDataTest.bvpsY, bfd.getBvpsYr(), 0.005);
    Assert.assertArrayEquals(BalSheetFileDataTest.bvpsQ, bfd.getBvpsQtr(), 0.005);
  }

  static double[] cashY            = new double[8];
  static double[] cashQ            = new double[9];
  static double[] stInvestY        = new double[8];
  static double[] stInvestQ        = new double[9];
  static double[] acctRxY          = new double[8];
  static double[] acctRxQ          = new double[9];
  static double[] inventoryY       = new double[8];
  static double[] inventoryQ       = new double[9];
  static double[] otherCurrAssetsY = new double[8];
  static double[] otherCurrAssetsQ = new double[9];
  static double[] currAssetsY      = new double[8];
  static double[] currAssetsQ      = new double[9];
  static double[] netFixedAssetsY  = new double[8];
  static double[] netFixedAssetsQ  = new double[9];
  static double[] ltInvestY        = new double[8];
  static double[] ltInvestQ        = new double[9];
  static double[] goodwillY        = new double[8];
  static double[] goodwillQ        = new double[9];
  static double[] otherLtAssetsY   = new double[8];
  static double[] otherLtAssetsQ   = new double[9];
  static double[] totalAssetsY     = new double[8];
  static double[] totalAssetsQ     = new double[9];
  static double[] acctPayableY     = new double[8];
  static double[] acctPayableQ     = new double[9];
  static double[] stDebtY          = new double[8];
  static double[] stDebtQ          = new double[9];
  static double[] otherCurrLiabY   = new double[8];
  static double[] otherCurrLiabQ   = new double[9];
  static double[] currLiabY        = new double[8];
  static double[] currLiabQ        = new double[9];
  static double[] ltDebtY          = new double[8];
  static double[] ltDebtQ          = new double[9];
  static double[] otherLtLiabY     = new double[8];
  static double[] otherLtLiabQ     = new double[9];
  static double[] totalLiabY       = new double[8];
  static double[] totalLiabQ       = new double[9];
  static double[] prefStockY       = new double[8];
  static double[] prefStockQ       = new double[9];
  static double[] equityY          = new double[8];
  static double[] equityQ          = new double[9];
  static double[] liabEquityY      = new double[8];
  static double[] liabEquityQ      = new double[9];
  static double[] bvpsY            = new double[8];
  static double[] bvpsQ            = new double[9];

  /**
   * Read bal sheet test data.
   *
   * @param filename the filename
   */
  private static void readBalSheetTestData(String filename) {

    final List<String> data = TextUtils.readTextFile(filename, true);

    // TextUtils.print(data);

    final String patternY = " Y";
    final String patternQ = " Q";

    for (final String s : data) {

      boolean isYear = false;
      int num = 0;
      double val = 0.0;
      if (s.contains(patternY)) {
        isYear = true;
        final int idx = s.indexOf(patternY);
        String n = s.substring(idx + 2, idx + 3);
        num = Integer.parseInt(n);
        n = s.substring(idx + 4);
        val = Double.parseDouble(n.trim());
      }
      else if (s.contains(patternQ)) {
        isYear = false;
        final int idx = s.indexOf(patternQ);
        String n = s.substring(idx + 2, idx + 3);
        num = Integer.parseInt(n);
        n = s.substring(idx + 4);
        val = Double.parseDouble(n.trim());
      }

      if (s.contains("Cash ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.cashY, BalSheetFileDataTest.cashQ, val, num, isYear);
      }
      else if (s.contains("ST investments ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.stInvestY, BalSheetFileDataTest.stInvestQ, val, num, isYear);
      }
      else if (s.contains("Accounts receivable ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.acctRxY, BalSheetFileDataTest.acctRxQ, val, num, isYear);
      }
      else if (s.contains("Inventory ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.inventoryY, BalSheetFileDataTest.inventoryQ, val, num, isYear);
      }
      else if (s.contains("Other current assets ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.otherCurrAssetsY, BalSheetFileDataTest.otherCurrAssetsQ, val, num, isYear);
      }
      else if (s.contains("Current assets ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.currAssetsY, BalSheetFileDataTest.currAssetsQ, val, num, isYear);
      }
      else if (s.contains("Net fixed assets ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.netFixedAssetsY, BalSheetFileDataTest.netFixedAssetsQ, val, num, isYear);
      }
      else if (s.contains("LT investments ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.ltInvestY, BalSheetFileDataTest.ltInvestQ, val, num, isYear);
      }
      else if (s.contains("Goodwill and intangibles ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.goodwillY, BalSheetFileDataTest.goodwillQ, val, num, isYear);
      }
      else if (s.contains("Other LT assets ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.otherLtAssetsY, BalSheetFileDataTest.otherLtAssetsQ, val, num, isYear);
      }
      else if (s.contains("Total assets ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.totalAssetsY, BalSheetFileDataTest.totalAssetsQ, val, num, isYear);
      }
      else if (s.contains("Accounts payable ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.acctPayableY, BalSheetFileDataTest.acctPayableQ, val, num, isYear);
      }
      else if (s.contains("ST debt ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.stDebtY, BalSheetFileDataTest.stDebtQ, val, num, isYear);
      }
      else if (s.contains("Other current liabilities ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.otherCurrLiabY, BalSheetFileDataTest.otherCurrLiabQ, val, num, isYear);
      }
      else if (s.contains("Current liabilities ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.currLiabY, BalSheetFileDataTest.currLiabQ, val, num, isYear);
      }
      else if (s.contains("LT debt ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.ltDebtY, BalSheetFileDataTest.ltDebtQ, val, num, isYear);
      }
      else if (s.contains("Other LT liabilities ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.otherLtLiabY, BalSheetFileDataTest.otherLtLiabQ, val, num, isYear);
      }
      else if (s.contains("Total liabilities ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.totalLiabY, BalSheetFileDataTest.totalLiabQ, val, num, isYear);
      }
      else if (s.contains("Preferred stock ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.prefStockY, BalSheetFileDataTest.prefStockQ, val, num, isYear);
      }
      else if (s.contains("Liabilities and equity ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.liabEquityY, BalSheetFileDataTest.liabEquityQ, val, num, isYear);
      }
      else if (s.contains("equity ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.equityY, BalSheetFileDataTest.equityQ, val, num, isYear);
      }
      else if (s.contains("bvps ")) {
        BalSheetFileDataTest.set(BalSheetFileDataTest.bvpsY, BalSheetFileDataTest.bvpsQ, val, num, isYear);
      }
    }

  }

  /**
   *
   * @param y
   * @param q
   * @param val
   * @param num
   * @param isYear
   */
  private static void set(double[] y, double[] q, double val, int num, boolean isYear) {
    if (isYear) {
      y[num] = val;
    }
    else {
      q[num] = val;
    }

  }

//  Cash Y1 11356
//  ST investments Y1   122463
//  Accounts receivable Y1  29524
//  Inventory Y7    1938
//  Other current assets Y1 10146
//  Current assets Y7   101466
//  Net fixed assets Y1 43856
//  LT investments Y7   10844
//  Goodwill and intangibles Y1 49776
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
//  equity Y7   78944
//  Liabilities and equity Y1   286556
//  bvps Y7 9.43

}
