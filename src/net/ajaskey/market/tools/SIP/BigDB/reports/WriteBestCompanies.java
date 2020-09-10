package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;
import net.ajaskey.market.misc.Debug;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.Scans;

public class WriteBestCompanies {

  /**
   *
   * @param dList
   * @return
   */
  public static List<CompanyDerived> findBest(List<CompanyDerived> dRList) {

    final List<CompanyDerived> zList = new ArrayList<>();

    final DateTime now = new DateTime();
    now.setSdf(Utils.sdfFull);

    for (final CompanyDerived cdr : dRList) {

//      if (cdr.getFd().getTicker().equalsIgnoreCase("BHVN")) {
//        System.out.println("BVHN");
//      }

      FieldData fd = cdr.getFd();
      String ticker = fd.getTicker();

      final int qtrs = cdr.getSalesQdata().getQuarterDataKnt();
      if (!Scans.checkMinValue(ticker, " Sales Quarters of data", (double) qtrs, 4.0)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " Sales QoQ", cdr.getSalesQdata().getQoQ(), 10.0)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " Sales YoY", cdr.getSalesQdata().getYoY(), 10.0)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " NetIncome Neg", cdr.getNetIncQdata().getMostRecent(), 0.01)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " NetIncome TTM Neg", cdr.getNetIncQdata().getTtm(), 0.01)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " NetIncome QoQ", cdr.getNetIncQdata().getQoQ(), 25.0)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " Cash from Operations Neg", cdr.getCashFromOpsQdata().getMostRecent(), 0.01)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " Cash from Operations TTM Neg", cdr.getCashFromOpsQdata().getTtm(), 0.01)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " OpMargin", cdr.getOpMarginQdata().getMostRecent(), 10.0)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " NetMargin", cdr.getNetMarginQdata().getMostRecent(), 10.0)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " Equity Neg", cdr.getEquityQdata().getMostRecent(), 0.0)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " ROE", cdr.getRoeQdata().getMostRecent(), 10.0)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " EPS QoQ", cdr.getEpsDilContQdata().getQoQ(), 25.0)) {
        continue;
      }
      if (!Scans.checkMinValue(ticker, " EPS YoY", cdr.getEpsDilContQdata().getYoY(), 20.0)) {
        continue;
      }

      if (!Scans.checkMinValue(ticker, " EPS Q0 Growth Est", cdr.getEpsEstQ0Growth(), 25.0)) {
        continue;
      }

      final boolean earnEst = cdr.getEpsEstQ0() < 0.0 || cdr.getEpsEstY1() < 0.0;
      if (earnEst) {
        final String s = ticker + " Negative earnings estimates";
        Debug.LOGGER.info(String.format("  %-15s%n", s));
        continue;
      }

//      if (!Scans.checkMinValue(ticker, " GrossOpIncome", cdr.getGrossIncQdata().getMostRecent(), 0.01)) {
//        continue;
//      }
//

//
//      if (!Scans.checkMinValue(ticker, " Cash from Operations", cdr.getCashFromOpsQdata().getMostRecent(), 0.01)) {
//        continue;
//      }

//

//

//
//      if (!Scans.checkMinValue(ticker, " Sharehold Equity Growth", cdr.getNetIncQdata().getQseqQ(), 5.0)) {
//        continue;
//      }
//
//      if (!Scans.checkMinValue(ticker, " Insiders", fd.getShareData().getInsiderOwnership(), 1.0)) {
//        continue;
//      }

//      if (!Scans.checkMaxValue(ticker, " Interest Paid", , 5.0)) {
//        continue;
//      }
//
//      if (!Scans.checkMinValue(ticker, " OpInc Growth 3Yr", f, 0.0)) {
//        continue;
//      }
//
//      final double fcfwc = cd.freeCashFlow + cd.workingCapital;
//      if (!Scans.checkMinValue(ticker, " FCFWS", fcfwc, 0.01)) {
//        continue;
//      }
//
//      if (!Scans.checkMaxValue(ticker, " SupplyDemand", cd.turnover, Reports.supplyDemandLWM)) {
//        continue;
//      }
//
//      if (!Scans.checkMaxValue(ticker, " Price vs 52 Week High", cd.pricePercOff52High, 50.0)) {
//        continue;
//      }
//

      zList.add(cdr);

    }

    return zList;

  }

  /**
   *
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    Debug.init("debug/BestCompany.dbg");

    List<CompanyDerived> dRList = Scans.findMajor(2020, 3, 20.0, 500000L);

    final List<CompanyDerived> dList = WriteBestCompanies.findBest(dRList);

    try (PrintWriter pw = new PrintWriter("sipout/BestCompanies.txt")) {

      for (final CompanyDerived cdr : dList) {
        WriteCompanyData.writeCompanyInfo(pw, cdr);
        WriteCompanyData.write(pw, cdr);
        WriteCompanyData.writeQuarterly(pw, cdr);
        pw.println("");
      }
    }

    System.out.println("Done.");
  }

}
