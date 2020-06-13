package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

public class IncSheetFileData {

  private final String   name;
  private final String   ticker;
  private final String   exchange;
  private final String   sector;
  private final String   industry;
  private final double[] salesQtr;
  private final double[] salesYr;
  private final double[] cogsQtr;
  private final double[] cogsYr;
  private final double[] GrossIncQtr;
  private final double[] GrossIncYr;
  private final double[] rdQtr;
  private final double[] rdYr;
  private final double[] depreciationQtr;
  private final double[] depreciationYr;
  private final double[] intExpQtr;
  private final double[] intExpYr;
  private final double[] unusualIncQtr;
  private final double[] unusualIncYr;
  private final double[] totalOpExpQtr;
  private final double[] totalOpExpYr;
  private final double[] grossOpExpQtr;
  private final double[] grossOpExpYr;
  private final double[] intExpNonOpQtr;
  private final double[] intExpNonOpYr;
  private final double[] otherIncQtr;
  private final double[] otherIncYr;
  private final double[] preTaxIncQtr;
  private final double[] preTaxIncYr;
  private final double[] incTaxQtr;
  private final double[] incTaxYr;
  private final double[] incAfterTaxQtr;
  private final double[] incAfterTaxYr;
  private final double[] adjToIncQtr;
  private final double[] adjToIncYr;
  private final double[] incPrimaryEpsQtr;
  private final double[] incPrimaryEpsYr;
  private final double[] nonrecurringItemsQtr;
  private final double[] nonrecurringItemsYr;
  private final double[] netIncQtr;
  private final double[] netIncYr;
  private final double[] epsQtr;
  private final double[] epsYr;
  private final double[] epsContQtr;
  private final double[] epsContYr;
  private final double[] epsDilQtr;
  private final double[] epsDilYr;
  private final double[] epsDilContQtr;
  private final double[] epsDilContYr;
  private final double[] dividendQtr;
  private final double[] dividendYr;

  /**
   * Constructor
   *
   * @param strFldQtr
   * @param strFldYr
   */
  public IncSheetFileData(String[] strFldQtr, String[] strFldYr) {

    this.name = strFldQtr[0].trim();
    this.ticker = strFldQtr[1].trim();
    this.exchange = strFldQtr[2].trim();
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

    this.GrossIncQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.GrossIncYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
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

    this.grossOpExpQtr = SipUtils.parseDoubles(strFldQtr, ptr, 8);
    this.grossOpExpYr = this.slideIncYearData(SipUtils.parseDoubles(strFldYr, ptr, flds));
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

  public String getExchange() {
    return this.exchange;
  }

  public double[] getGrossIncQtr() {
    return this.GrossIncQtr;
  }

  public double[] getGrossIncYr() {
    return this.GrossIncYr;
  }

  public double[] getGrossOpExpQtr() {
    return this.grossOpExpQtr;
  }

  public double[] getGrossOpExpYr() {
    return this.grossOpExpYr;
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

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, this.exchange, this.sector, this.industry);
    ret += SipOutput.buildArray("  salesQtr             : ", this.salesQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  salesYr              : ", this.salesYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  cogsQtr              : ", this.cogsQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  cogsYr               : ", this.cogsYr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  GrossIncQtr          : ", this.GrossIncQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  GrossIncYr           : ", this.GrossIncYr, 1, 3) + Utils.NL;
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
    ret += SipOutput.buildArray("  grossOpExpQtr        : ", this.grossOpExpQtr, 1, 3) + Utils.NL;
    ret += SipOutput.buildArray("  grossOpExpYr         : ", this.grossOpExpYr, 1, 3) + Utils.NL;
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

  private static List<IncSheetFileData> ifdList = new ArrayList<>();

  /**
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

  public static int getListCount() {
    return IncSheetFileData.ifdList.size();
  }

  /**
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
   *
   * @param filenameQtr
   * @param filenameYr
   * @return
   */
  public static void readData(String filenameQtr, String filenameYr) {

    final List<String> isdDataQtr = TextUtils.readTextFile(filenameQtr, true);
    final List<String> isdDataYr = TextUtils.readTextFile(filenameYr, true);

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
}
