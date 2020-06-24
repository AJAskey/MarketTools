package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;
import net.ajaskey.market.misc.Debug;
import net.ajaskey.market.tools.SIP.CompanyData;
import net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;

public class FundamentalReports extends Fundamentals {

  public static void write() throws FileNotFoundException {

    System.out.println("Writing Fundamental Report");

    Utils.makeDir("out/CompanyReports");

    final List<CompanyData> bestList = new ArrayList<>();

    /**
     *
     */
    int knt = 0;
    try (PrintWriter pw = new PrintWriter("out/Companies.txt")) {

      final DateTime now = new DateTime();
      now.setSdf(Utils.sdfFull);

      pw.printf("Created : %s\t%s%n", now, "This file is subject to change without notice.");
      pw.println("Pre-filtered for US companies over $12 and average trading volume of at least 100K." + Utils.NL);

      pw.println("Seq : this quarter versus last quarter.");
      pw.println("QoQ : this quarter versus same quarter a year ago.");
      pw.println("YoY : last 12m versus 12m a year ago.\n\n--------------------------");

      for (final FieldData fd : fdList) {

        String lq = fd.getLatestQtrEps().toString().trim();
        if (lq.length() < 8) {
          continue;
        }

        final boolean earnEst = fd.getEpsQ1() < 0.0 && fd.getEpsQ0() < 0.0;
        if (earnEst) {
          final String s = fd.getTicker() + " Negative earings estimates";
          Debug.log(String.format("  %-15s%n", s));
          continue;
        }

        printHeaderData(pw, fd);

        pw.printf("%n\tFloat             : %s M%n", Utils.fmt(fd.getFloatshr(), 13));
        double d = fd.getInsiderOwnership();
        pw.printf("\tInsiders          : %s %%%n", Utils.fmt(d, 13));
        d = fd.getInstOwnership();
        pw.printf("\tInstitutions      : %s %% (Number %s)%n", Utils.fmt(d, 13), Utils.ifmt(fd.getInstShareholders(), 5));

        if (fd.getVolume10d() > 999) {
          pw.printf("\tAvg Daily Vol     : %s M%n", Utils.fmt(((double) fd.getVolume10d() / 1000.0), 13));
        }
        else {
          pw.printf("\tAvg Daily Vol     : %s K%n", Utils.lfmt(fd.getVolume10d(), 13));
        }

        double turnover = 0.0;
        if (fd.getVolumeMonth3m() > 0.0) {
          turnover = fd.getFloatshr() / ((double) fd.getVolume10d() / 1000.0);
        }
        pw.printf("\tTurnover Float    : %s days%n", Utils.fmt(turnover, 13));

//        this.WriteShareData(pw, cd);
        pw.println();

//        pw.println(fd.id.sales.fmtGrowthQY("Sales 12m"));
//        pw.println(fd.id.incomeEps.fmtGrowthQY("Income EPS 12m"));
//        pw.printf("\tOpInc Growth 3Y   : %13.2f%%%n", fd.opInc3yrGrowth);
//        pw.println();
//
//        bestList.add(cd);

        knt++;

      }
    }
//    System.out.printf("Total Best Companies found : %d%n", knt);
//
//    try (PrintWriter pw = new PrintWriter("out/best-list.txt")) {
//      for (final CompanyData cd : bestList) {
//        pw.printf(" $%s", fd.getTicker());
//        // System.out.println("*adding to goodlist :" + fd.getTicker());
//        CompanyData.addToGoodList(cd);
//      }
//    }

  }

  private static boolean checkMinValue(final String ticker, final String desc, final double val, final double min) {

    boolean ret = true;

    if (val < min) {
      final String s = ticker + desc;
      Debug.log(String.format("  %-15s Value : %.2f is less than Min : %.2f%n", s, val, min));
      ret = false;
    }

    return ret;
  }

  private static boolean checkMaxValue(final String ticker, final String desc, final double val, final double max) {

    boolean ret = true;

    if (val > max) {
      final String s = ticker + desc;
      Debug.log(String.format("  %-15s Value : %.2f is greater than Max : %.2f%n", s, val, max));
      ret = false;
    }

    return ret;
  }

  private static void printHeaderData(final PrintWriter pw, final FieldData fd) {

    pw.println(" " + fd.getTicker());
    pw.printf("\t%s : %s, %s%n", fd.getName(), fd.getCity(), fd.getState());

    String index = ", " + fd.getSnpIndexStr();
    String exch = ", " + fd.getExchange().toString();

    pw.printf("\t%s, %s%s%s%n", fd.getSector(), fd.getIndustry(), index, exch);
    // pw.printf("\t%s%n", fd.industry);
    String sNumEmp = "?";
    if (fd.getNumEmployees() > 0) {
      sNumEmp = Utils.ifmt(fd.getNumEmployees(), 12);
    }
    pw.printf("\tEmployees     : %s%n", sNumEmp);
    if (fd.getNumEmployees() > 0) {
      final double d = FieldData.getTtm(fd.getGrossIncQtr()) / fd.getNumEmployees() * MILLION;
      final int i = (int) d;
      pw.printf("\tOpInc per Emp : $%s%n", Utils.ifmt(i, 11));
    }

    final String dat = fd.getLatestQtrEps().format("yyyy-MMM-dd"); // Utils.stringDate(fd.eoq);
    pw.printf("\t10Q Date      :  %s%n", dat);

    pw.printf("\tPrice         :  %11.2f%n", fd.getPrice());
    pw.printf("%n\tMarket Cap        : %s M%n", Utils.fmt(fd.getMktCap(), 13));

    QuarterlyDouble shares = new QuarterlyDouble(fd.getSharesQ());
    pw.println(shares.fmtGrowth1Q("Shares"));
    final double sc = shares.deltaQ(1, 2);
    if (sc < -0.250) {
      final double bbest = Math.abs(sc) * ((fd.getPrice52hi() + fd.getPrice52lo()) / 2.0);
      pw.printf("\tShare Change 12m  : %s M (Buyback Est= $%sM)%n", Utils.fmt(sc, 13), Utils.fmt(bbest, 1));
    }

    QuarterlyDouble sales = new QuarterlyDouble(fd.getSalesQtr());
    QuarterlyDouble cogs = new QuarterlyDouble(fd.getCogsQtr());
    QuarterlyDouble grossOpInc = new QuarterlyDouble(fd.getGrossIncQtr());
    QuarterlyDouble net = new QuarterlyDouble(fd.getNetIncQtr());

    double tArr[] = new double[9];
    for (int i = 0; i < tArr.length; i++) {
      tArr[i] = fd.getIntExpQtr()[i] + fd.getIntExpNonOpQtr()[i];
    }
    QuarterlyDouble intTot = new QuarterlyDouble(tArr);

    pw.println("\n" + sales.fmtGrowth4Q("Sales 12m"));
    pw.println(cogs.fmtGrowth4Q("COGS 12m"));
    pw.println(grossOpInc.fmtGrowth4Q("Ops Income 12m"));
    pw.println(net.fmtGrowth4Q("Net Income 12m"));
    pw.println(intTot.fmtGrowth4Q("Interest 12m"));
//
    final double totdebt = fd.getStDebtQtr()[1] + fd.getLtDebtQtr()[1];
    double intrate = 0.0;
    if (totdebt > 0.0) {
      intrate = intTot.getTtm() / totdebt * 100.0;
    }
    pw.printf("\tInterest Rate     :%14.2f%%%n", intrate);
//
    QuarterlyDouble cash = new QuarterlyDouble(fd.getCashQtr());
    QuarterlyDouble capex = new QuarterlyDouble(fd.getCashData().getCapExQtr());
    QuarterlyDouble cashops = new QuarterlyDouble(fd.getCashData().getCashFromOpsQtr());
    QuarterlyDouble dividend = new QuarterlyDouble(fd.getDividendQtr());

    pw.println("\n" + cashops.fmtGrowth4Q("Cash <- Ops 12m"));
    pw.println(capex.fmtGrowth4Q("  CapEx 12m"));
    if (fd.getDividendQtr()[1] > 0.0) {
      double div = dividend.getTtm() * shares.getTtmAvg();
      double dyld = dividend.getTtm() / fd.getPrice() * 100.0;
      pw.printf("\t  Dividends 12m   : %s M (Yield=%.2f%%)%n", Utils.fmt(div, 13), dyld);

    }
    else {
      double d = dividend.getTtm() * shares.getTtmAvg();
      pw.printf("\t  Dividends 12m   : %s M%n", Utils.fmt(d, 13));
    }

    double fcf = cashops.getTtm() - capex.getTtm() - (dividend.getTtm() * shares.getTtmAvg());

    QuarterlyDouble cashfin = new QuarterlyDouble(fd.getCashFromFin());
    QuarterlyDouble cashinv = new QuarterlyDouble(fd.getCashFromInv());

    double netcashflow = cashops.getTtm() + cashfin.getTtm();
    double cashflow = netcashflow + cashinv.getTtm();

    pw.printf("\t    FCF 12m       : %s M %s%n", Utils.fmt(fcf, 13), "[Cash from Operations - CapEx - Dividends]");

    pw.printf("\tCash <- Fin 12m   : %s M %s%n", Utils.fmt(cashfin.getTtm(), 13),
        "[Movement of cash between a firm and its owners/creditors : borrowing, debt repayment, dividend paid, equity financing.]");

    pw.printf("\t  Net Cash 12m    : %s M %s%n", Utils.fmt(netcashflow, 13), "[Cash from Ops + Cash from Financing]");

    pw.printf("\tCash <- Inv 12m   : %s M %s%n", Utils.fmt(cashinv.getTtm(), 13),
        "[Purchases and sales of long-term assets such as plant and machinery - assumed infrequent.]");

    pw.printf("\t  Cash Flow 12m   : %s M %s%n", Utils.fmt(cashflow, 13), "[Cash from Ops + Cash from Financing + Cash from Investing]");

    //

    QuarterlyDouble acctRx = new QuarterlyDouble(fd.getAcctRxQtr());
    QuarterlyDouble stInvest = new QuarterlyDouble(fd.getStInvestQtr());
    QuarterlyDouble inventory = new QuarterlyDouble(fd.getInventoryQtr());
    QuarterlyDouble otherAssets = new QuarterlyDouble(fd.getOtherCurrAssetsQtr());

    double aArr[] = new double[9];
    for (int i = 0; i < aArr.length; i++) {
      aArr[i] = acctRx.get(i) + stInvest.get(i) + inventory.get(i) + otherAssets.get(i) + cash.get(i);
    }
    QuarterlyDouble currAssets = new QuarterlyDouble(aArr);

    pw.println(Utils.NL + currAssets.fmtGrowth1Q("Current Assets"));
    pw.println(cash.fmtGrowth1Q("  Cash"));
    pw.println(acctRx.fmtGrowth1Q("  Acct Rx"));
    pw.println(stInvest.fmtGrowth1Q("  ST Invest"));
    pw.println(inventory.fmtGrowth1Q("  Inventory"));
    pw.println(otherAssets.fmtGrowth1Q("  Other"));

    QuarterlyDouble acctPay = new QuarterlyDouble(fd.getAcctPayableQtr());
    QuarterlyDouble stDebt = new QuarterlyDouble(fd.getStDebtQtr());
    QuarterlyDouble otherLiab = new QuarterlyDouble(fd.getOtherCurrLiabQtr());

    double cArr[] = new double[9];
    for (int i = 0; i < cArr.length; i++) {
      cArr[i] = acctPay.get(i) + stDebt.get(i) + otherLiab.get(i);
    }
    QuarterlyDouble currLiab = new QuarterlyDouble(cArr);

    pw.println(currLiab.fmtGrowth1Q("Current Liabs"));
    pw.println(acctPay.fmtGrowth1Q("  Acct Pay"));
    pw.println(stDebt.fmtGrowth1Q("  ST Debt"));
    pw.println(otherLiab.fmtGrowth1Q("  Other"));

    double wc = currAssets.getMostRecent() - currLiab.getMostRecent();
    double cr = currAssets.getMostRecent() / currLiab.getMostRecent();
    double wcfcf = wc + fcf;

    pw.printf("\tWorking Capital   : %s M (Ratio=%.2f)%n", Utils.fmt(wc, 13), cr);
    pw.printf("\tWC + FCF          : %s M%n", Utils.fmt(wcfcf, 13));

//

    QuarterlyDouble equity = new QuarterlyDouble(fd.getEquityQtr());
    QuarterlyDouble ltDebt = new QuarterlyDouble(fd.getLtDebtQtr());
    QuarterlyDouble goodwill = new QuarterlyDouble(fd.getGoodwillQtr());

    double gArr[] = new double[9];
    for (int i = 0; i < gArr.length; i++) {
      gArr[i] = currAssets.get(i) - goodwill.get(i);
    }
    QuarterlyDouble tanAssets = new QuarterlyDouble(gArr);

    pw.println(Utils.NL + equity.fmtGrowth1Q("Sharehldr Equity"));
    pw.println(goodwill.fmtGrowth1Q("Goodwill"));
    pw.println(tanAssets.fmtGrowth1Q("Tangible Assets"));
    pw.println(ltDebt.fmtGrowth1Q("LT Debt"));
    if (equity.getMostRecent() > 0.0) {
      pw.printf("\tLT Debt to Equity : %s%n", Utils.fmt(ltDebt.getMostRecent() / equity.getMostRecent(), 13));
    }
    else {
      pw.printf("\tLT Debt Tan Asset : %s%n", Utils.fmt(ltDebt.getMostRecent() / tanAssets.getMostRecent(), 13));
    }

  }

}
