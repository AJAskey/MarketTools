package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

public class BalSheetFileData {

  private final String   name;
  private final String   ticker;
  private final String   exchange;
  private final String   sector;
  private final String   industry;
  private final double[] cashQtr;
  private final double[] cashYr;
  private final double[] stInvestQtr;
  private final double[] stInvestYr;
  private final double[] acctRxQtr;
  private final double[] acctRxYr;
  private final double[] inventoryQtr;
  private final double[] inventoryYr;
  private final double[] otherCurrAssetsQtr;
  private final double[] otherCurrAssetsYr;
  private final double[] currAssetsQtr;
  private final double[] currAssetsYr;
  private final double[] netFixedAssetsQtr;
  private final double[] netFixedAssetsYr;
  private final double[] ltInvestQtr;
  private final double[] ltInvestYr;
  private final double[] goodwillQtr;
  private final double[] goodwillYr;
  private final double[] otherLtAssetsQtr;
  private final double[] otherLtAssetsYr;
  private final double[] totalAssetsQtr;
  private final double[] totalAssetsYr;
  private final double[] acctPayableQtr;
  private final double[] acctPayableYr;
  private final double[] stDebtQtr;
  private final double[] stDebtYr;
  private final double[] otherCurrLiabQtr;
  private final double[] otherCurrLiabYr;
  private final double[] currLiabQtr;
  private final double[] currLiabYr;
  private final double[] ltDebtQtr;
  private final double[] ltDebtYr;
  private final double[] otherLtLiabQtr;
  private final double[] otherLtLiabYr;
  private final double[] totalLiabQtr;
  private final double[] totalLiabYr;
  private final double[] prefStockQtr;
  private final double[] prefStockYr;
  private final double[] equityQtr;
  private final double[] equityYr;
  private final double[] liabEquityQtr;
  private final double[] liabEquityYr;
  private final double[] bvpsQtr;
  private final double[] bvpsYr;

  /**
   * 
   * @param fldQtr
   * @param fldYr
   */
  public BalSheetFileData(String[] fldQtr, String[] fldYr) {

    this.name = fldQtr[0].trim();
    this.ticker = fldQtr[1].trim();
    this.exchange = fldQtr[2].trim();
    this.sector = fldQtr[3].trim();
    this.industry = fldQtr[4].trim();

    int ptrQtr = 5;
    int ptrYr = 5;
    this.cashQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.cashYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);
    // debug("MSFT", ticker, "Cash", cashYr, cashQtr);

    ptrQtr += 8;
    ptrYr += 7;
    this.stInvestQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.stInvestYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);
    // debug("MSFT", ticker, "stInvest", stInvestYr, stInvestQtr);

    ptrQtr += 8;
    ptrYr += 7;
    this.acctRxQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.acctRxYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.inventoryQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.inventoryYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.otherCurrAssetsQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.otherCurrAssetsYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.currAssetsQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.currAssetsYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.netFixedAssetsQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.netFixedAssetsYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.ltInvestQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.ltInvestYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.goodwillQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.goodwillYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.otherLtAssetsQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.otherLtAssetsYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.totalAssetsQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.totalAssetsYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.acctPayableQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.acctPayableYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.stDebtQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.stDebtYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.otherCurrLiabQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.otherCurrLiabYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.currLiabQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.currLiabYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.ltDebtQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.ltDebtYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.otherLtLiabQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.otherLtLiabYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.totalLiabQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.totalLiabYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.prefStockQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.prefStockYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.equityQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.equityYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.liabEquityQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.liabEquityYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);

    ptrQtr += 8;
    ptrYr += 7;
    this.bvpsQtr = SipUtils.parseDoubles(fldQtr, ptrQtr, 8);
    this.bvpsYr = SipUtils.parseDoubles(fldYr, ptrYr, 7);
  }

  private void debug(String code, String ticker, String desc, double[] yr, double[] qtr) {
    if (code.equals(ticker)) {
      System.out.println(SipOutput.buildArray(desc, yr, yr.length - 1, 3));
      System.out.println(SipOutput.buildArray(desc, qtr, qtr.length - 1, 3));
    }
  }

  public double[] getAcctPayableQtr() {
    return this.acctPayableQtr;
  }

  public double[] getAcctPayableYr() {
    return this.acctPayableYr;
  }

  public double[] getAcctRxQtr() {
    return this.acctRxQtr;
  }

  public double[] getAcctRxYr() {
    return this.acctRxYr;
  }

  public double[] getBvpsQtr() {
    return this.bvpsQtr;
  }

  public double[] getBvpsYr() {
    return this.bvpsYr;
  }

  public double[] getCashQtr() {
    return this.cashQtr;
  }

  public double[] getCashYr() {
    return this.cashYr;
  }

  public double[] getCurrAssetsQtr() {
    return this.currAssetsQtr;
  }

  public double[] getCurrAssetsYr() {
    return this.currAssetsYr;
  }

  public double[] getCurrLiabQtr() {
    return this.currLiabQtr;
  }

  public double[] getCurrLiabYr() {
    return this.currLiabYr;
  }

  public double[] getEquityQtr() {
    return this.equityQtr;
  }

  public double[] getEquityYr() {
    return this.equityYr;
  }

  public String getExchange() {
    return this.exchange;
  }

  public double[] getGoodwillQtr() {
    return this.goodwillQtr;
  }

  public double[] getGoodwillYr() {
    return this.goodwillYr;
  }

  public String getIndustry() {
    return this.industry;
  }

  public double[] getInventoryQtr() {
    return this.inventoryQtr;
  }

  public double[] getInventoryYr() {
    return this.inventoryYr;
  }

  public double[] getLiabEquityQtr() {
    return this.liabEquityQtr;
  }

  public double[] getLiabEquityYr() {
    return this.liabEquityYr;
  }

  public double[] getLtDebtQtr() {
    return this.ltDebtQtr;
  }

  public double[] getLtDebtYr() {
    return this.ltDebtYr;
  }

  public double[] getLtInvestQtr() {
    return this.ltInvestQtr;
  }

  public double[] getLtInvestYr() {
    return this.ltInvestYr;
  }

  public String getName() {
    return this.name;
  }

  public double[] getNetFixedAssetsQtr() {
    return this.netFixedAssetsQtr;
  }

  public double[] getNetFixedAssetsYr() {
    return this.netFixedAssetsYr;
  }

  public double[] getOtherCurrAssetsQtr() {
    return this.otherCurrAssetsQtr;
  }

  public double[] getOtherCurrAssetsYr() {
    return this.otherCurrAssetsYr;
  }

  public double[] getOtherCurrLiabQtr() {
    return this.otherCurrLiabQtr;
  }

  public double[] getOtherCurrLiabYr() {
    return this.otherCurrLiabYr;
  }

  public double[] getOtherLtAssetsQtr() {
    return this.otherLtAssetsQtr;
  }

  public double[] getOtherLtAssetsYr() {
    return this.otherLtAssetsYr;
  }

  public double[] getOtherLtLiabQtr() {
    return this.otherLtLiabQtr;
  }

  public double[] getOtherLtLiabYr() {
    return this.otherLtLiabYr;
  }

  public double[] getPrefStockQtr() {
    return this.prefStockQtr;
  }

  public double[] getPrefStockYr() {
    return this.prefStockYr;
  }

  public String getSector() {
    return this.sector;
  }

  public double[] getStDebtQtr() {
    return this.stDebtQtr;
  }

  public double[] getStDebtYr() {
    return this.stDebtYr;
  }

  public double[] getStInvestQtr() {
    return this.stInvestQtr;
  }

  public double[] getStInvestYr() {
    return this.stInvestYr;
  }

  public String getTicker() {
    return this.ticker;
  }

  public double[] getTotalAssetsQtr() {
    return this.totalAssetsQtr;
  }

  public double[] getTotalAssetsYr() {
    return this.totalAssetsYr;
  }

  public double[] getTotalLiabQtr() {
    return this.totalLiabQtr;
  }

  public double[] getTotalLiabYr() {
    return this.totalLiabYr;
  }

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, this.exchange, this.sector, this.industry);
    ret += SipOutput.buildArray("  CashQtr        : ", this.cashQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  CashYr         : ", this.cashYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  stInvestQtr    : ", this.stInvestQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  stInvestYr     : ", this.stInvestYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  acctRxQtr          : ", this.acctRxQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  acctRxYr           : ", this.acctRxYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  inventoryQtr   : ", this.inventoryQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  inventoryYr    : ", this.inventoryYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oCurrAssetsQtr : ", this.otherCurrAssetsQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oCurrAssetsYr  : ", this.otherCurrAssetsYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  CurrAssetsQtr  : ", this.currAssetsQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  CurrAssetsYr   : ", this.currAssetsYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  NetFixedAssQtr : ", this.netFixedAssetsQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  NetFixedAssYr  : ", this.netFixedAssetsYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  ltInvestQtr    : ", this.ltInvestQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  ltInvestYr     : ", this.ltInvestYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  goodwillQtr    : ", this.goodwillQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  goodwillYr     : ", this.goodwillYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oLtAssetsQtr   : ", this.otherLtAssetsQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oLtAssetsYr    : ", this.otherLtAssetsYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  totalAssetsQtr : ", this.totalAssetsQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  totalAssetsYr  : ", this.totalAssetsYr, 1, 0) + Utils.NL;

    ret += SipOutput.buildArray("  acctPayableQtr : ", this.acctPayableQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  acctPayableYr  : ", this.acctPayableYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  stDebtQtr      : ", this.stDebtQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  stDebtYr       : ", this.stDebtYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oCurrLiabQtr   : ", this.otherCurrLiabQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oCurrLiabYr    : ", this.otherCurrLiabYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  currLiabQtr    : ", this.currLiabQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  currLiabYr     : ", this.currLiabYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  ltDebtQtr      : ", this.ltDebtQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  ltDebtYr       : ", this.ltDebtYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oLtLiabQtr     : ", this.otherLtLiabQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  oLtLiabYr      : ", this.otherLtLiabYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  totalLiabQtr   : ", this.totalLiabQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  totalLiabYr    : ", this.totalLiabYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  prefStockQtr   : ", this.prefStockQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  prefStockYr    : ", this.prefStockYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  equityQtr      : ", this.equityQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  equityYr       : ", this.equityYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  liabEquityQtr  : ", this.liabEquityQtr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  liabEquityYr   : ", this.liabEquityYr, 1, 0) + Utils.NL;
    ret += SipOutput.buildArray("  bvpsQtr        : ", this.bvpsQtr, 1, 4) + Utils.NL;
    ret += SipOutput.buildArray("  bvpsYr         : ", this.bvpsYr, 1, 2) + Utils.NL;

    return ret;
  }

  private static List<BalSheetFileData> bfdList = new ArrayList<>();

  /**
   *
   * @param ticker
   * @return
   */
  public static BalSheetFileData find(String ticker) {
    for (final BalSheetFileData bs : BalSheetFileData.bfdList) {
      if (bs.getTicker().equalsIgnoreCase(ticker)) {
        return bs;
      }
    }
    return null;
  }

  /**
   *
   * @return
   */
  public static String listToString() {
    String ret = "";
    for (final BalSheetFileData bs : BalSheetFileData.bfdList) {
      ret += bs.toString();
    }
    return ret;
  }

  /**
   *
   * @param filenameQtr
   * @param filenameYr
   * @return
   */
  public static void readData(String filenameQtr, String filenameYr) {

    final List<String> bsdDataQtr = TextUtils.readTextFile(filenameQtr, true);
    final List<String> bsdDataYr = TextUtils.readTextFile(filenameYr, true);

    for (int i = 0; i < bsdDataQtr.size(); i++) {

      final String[] fldQtr = bsdDataQtr.get(i).replace("\"", "").split(Utils.TAB);
      final String[] fldYr = bsdDataYr.get(i).replace("\"", "").split(Utils.TAB);

      if (!fldQtr[1].equals(fldYr[1])) {

        System.out.printf("BSD Not equal : %s : %s%n", fldQtr[1], fldYr[1]);

      }
      else {

        final BalSheetFileData bsd = new BalSheetFileData(fldQtr, fldYr);
        BalSheetFileData.bfdList.add(bsd);

      }
    }
  }

  public static int getListCount() {
    return bfdList.size();
  }
}
