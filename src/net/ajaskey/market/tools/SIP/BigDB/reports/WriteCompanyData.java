package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.BigDB.MarketTools;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;

public class WriteCompanyData {

  public static void writeHeader(PrintWriter pw) {

    final DateTime now = new DateTime();
    now.setSdf(Utils.sdfFull);

    pw.printf("Created : %s\t%s%n", now, "This file is subject to change without notice.");
    pw.println("Pre-filtered for US companies over $12 and average trading volume of at least 100K." + Utils.NL);

    pw.println("Seq : this quarter versus last quarter.");
    pw.println("QoQ : this quarter versus same quarter a year ago.");
    pw.println("YoY : last 12m versus 12m a year ago.\n\n--------------------------");
  }

  public static void write(PrintWriter pw, CompanyDerived cdr) {

    pw.println();

    final FieldData fd = cdr.getFd();

    pw.println(cdr.getSalesQdata().fmtGrowth4Q("Sales 12m"));
    pw.println(cdr.getGrossOpIncQdata().fmtGrowth4Q("Ops Income 12m"));
    pw.println(cdr.getNetIncQdata().fmtGrowth4Q("Net Income 12m"));
    pw.println(cdr.getIntTotQdata().fmtGrowth4Q("Interest 12m"));
    //
    final double totdebt = MarketTools.getStDebtQtr(fd)[2] + MarketTools.getLtDebtQtr(fd)[2];
    double intrate = 0.0;
    if (totdebt > 0.0) {
      intrate = cdr.getIntTotQdata().getTtm() / totdebt;
    }
    pw.printf("\tInterest Rate     :%14.2f%%%n", intrate * 100.0);
    final double expInt = (cdr.getStDebtQdata().get(1) + cdr.getLtDebtQdata().get(1)) * intrate;
    pw.printf("\tEst Interest 12m  :%s M%n", SipOutput.fmt(expInt, 14, 2));

    //

    pw.println("\n" + cdr.getCashFromOpsQdata().fmtGrowth4Q("Cash <- Ops 12m"));
    pw.println(cdr.getCapExQdata().fmtGrowth4Q("  CapEx 12m"));
    if (cdr.getDividendQdata().getTtm() > 0.0) {
      final double dyld = cdr.getDividendQdata().getTtm() / MarketTools.getPrice(fd) * 100.0;
      pw.printf("\t  Dividends 12m   : %s M (Yield=%.2f%%)%n", Utils.fmt(cdr.getDivCostQdata().getTtm(), 13), dyld);

    }
    else {
      pw.printf("\t  Dividends 12m   : %s M%n", Utils.fmt(cdr.getDivCostQdata().getTtm(), 13));
    }

    pw.printf("\t    FCF 12m       : %s M %s%n", Utils.fmt(cdr.getFcfQdata().getTtm(), 13), "[Cash from Operations - CapEx - Dividends]");

    pw.printf("\tCash <- Fin 12m   : %s M %s%n", Utils.fmt(cdr.getCashFromFinQdata().getTtm(), 13),
        "[Movement of cash between a firm and its owners/creditors : borrowing, debt repayment, dividend paid, equity financing.]");

    pw.printf("\t  Net Cash 12m    : %s M %s%n", Utils.fmt(cdr.getNetcashflowQdata().getTtm(), 13), "[Cash from Ops + Cash from Financing]");

    pw.printf("\tCash <- Inv 12m   : %s M %s%n", Utils.fmt(cdr.getCashFromInvQdata().getTtm(), 13),
        "[Purchases and sales of long-term assets such as plant and machinery - assumed infrequent.]");

    pw.printf("\t  Cash Flow 12m   : %s M %s%n", Utils.fmt(cdr.getCashflowQdata().getTtm(), 13),
        "[Cash from Ops + Cash from Financing + Cash from Investing]");

    pw.println(Utils.NL + cdr.getCurrAssetsQdata().fmtGrowth1Q("Current Assets"));
    pw.println(cdr.getCashQdata().fmtGrowth1Q("  Cash"));
    pw.println(cdr.getAcctRxQdata().fmtGrowth1Q("  Acct Rx"));
    pw.println(cdr.getStInvestQdata().fmtGrowth1Q("  ST Invest"));
    pw.println(cdr.getInventoryQdata().fmtGrowth1Q("  Inventory"));
    pw.println(cdr.getOtherCurrAssetsQdata().fmtGrowth1Q("  Other"));

    pw.println(cdr.getCurrLiabQdata().fmtGrowth1Q("Current Liabs"));
    pw.println(cdr.getAcctPayableQdata().fmtGrowth1Q("  Acct Pay"));
    pw.println(cdr.getStDebtQdata().fmtGrowth1Q("  ST Debt"));
    pw.println(cdr.getOtherCurrLiabQdata().fmtGrowth1Q("  Other"));

    pw.printf("\tWorking Capital   : %s M (Ratio=%.2f)%n", Utils.fmt(cdr.getWorkingCapitalQdata().getMostRecent(), 13),
        cdr.getCurrentRatioQdata().getMostRecent());
    pw.printf("\tWC + FCF          : %s M%n", Utils.fmt(cdr.getWcFcfQdata().getMostRecent(), 13));

    //

    double bvps = 0.0;
    if (cdr.getSharesQdata().getMostRecent() > 0.0) {
      bvps = cdr.getEquityQdata().getMostRecent() / cdr.getSharesQdata().getMostRecent();
    }
    else if (MarketTools.getFloatshr(fd) > 0.0) {
      bvps = cdr.getEquityQdata().getMostRecent() / MarketTools.getFloatshr(fd);
    }
    final String bv = String.format("%n%s\t- BVPS : %.2f", cdr.getEquityQdata().fmtGrowth1Q("Sharehldr Equity"), bvps);
    pw.println(bv);

    pw.println(cdr.getGoodwillQdata().fmtGrowth1Q("Goodwill"));

    double taps = 0.0;
    if (cdr.getSharesQdata().getMostRecent() > 0.0) {
      taps = cdr.getTanAssetsQdata().getMostRecent() / cdr.getSharesQdata().getMostRecent();
    }
    else if (MarketTools.getFloatshr(fd) > 0.0) {
      taps = cdr.getTanAssetsQdata().getMostRecent() / MarketTools.getFloatshr(fd);
    }
    final String ta = String.format("%s\t- TAPS : %.2f", cdr.getTanAssetsQdata().fmtGrowth1Q("Tangible Assets"), taps);
    pw.println(ta);

    pw.println(cdr.getLtDebtQdata().fmtGrowth1Q("LT Debt"));
    if (cdr.getEquityQdata().getMostRecent() > 0.0) {
      pw.printf("\tLT Debt to Equity : %s%n", Utils.fmt(cdr.getLtDebtQdata().getMostRecent() / cdr.getEquityQdata().getMostRecent(), 13));
    }
    else {
      pw.printf("\tLT Debt Tan Asset : %s%n", Utils.fmt(cdr.getLtDebtQdata().getMostRecent() / cdr.getTanAssetsQdata().getMostRecent(), 13));
    }

    pw.println(Utils.NL + cdr.getNetMarginQdata().fmtGrowth1QNoUnit("Net Margin"));
    pw.println(cdr.getOpMarginQdata().fmtGrowth1QNoUnit("Op Margin"));
    pw.println(cdr.getRoeQdata().fmtGrowth1QNoUnit("ROE"));
    // System.out.println(ca.roeQdata);
    pw.println(cdr.getPeQdata().fmtGrowth1QNoUnit("PE"));
    pw.printf("\tQ0 Est Growth     : %13.2f %% (%.2f to %.2f)%n", cdr.getQ0EstGrowth(), cdr.getEpsDilContQdata().dArr[4], cdr.getEpsEstQ0());
    pw.printf("\tY1 Est Growth     : %13.2f %% (%.2f to %.2f)%n", cdr.getY1EstGrowth(), cdr.getEpsDilContQdata().getPrevTtm(), cdr.getEpsEstY1());
    pw.printf("\tY2 Est Growth     : %13.2f %% (%.2f to %.2f)%n", cdr.getY2EstGrowth(), cdr.getEpsEstY1(), cdr.getEpsEstY2());

    pw.printf("%n\tFloat             : %s M%n", Utils.fmt(MarketTools.getFloatshr(fd), 13));
    double d = MarketTools.getInsiderOwnership(fd);
    pw.printf("\tInsiders          : %s %%%n", Utils.fmt(d, 13));
    d = MarketTools.getInstOwnership(fd);
    pw.printf("\tInstitutions      : %s %% (Number %s)%n", Utils.fmt(d, 13), Utils.ifmt(MarketTools.getInstShareholders(fd), 5));

    if (MarketTools.getVolume10d(fd) > 999) {
      pw.printf("\tAvg Daily Vol     : %s M%n", Utils.fmt(MarketTools.getVolume10d(fd) / 1000.0, 13));
    }
    else {
      pw.printf("\tAvg Daily Vol     : %s K%n", Utils.lfmt(MarketTools.getVolume10d(fd), 13));
    }

    double turnover = 0.0;
    if (MarketTools.getVolumeMonth3m(fd) > 0.0) {
      turnover = MarketTools.getFloatshr(fd) / (MarketTools.getVolume10d(fd) / 1000.0);
    }
    pw.printf("\tTurnover Float    : %s days%n", Utils.fmt(turnover, 13));
    pw.printf("\tRS                : %s%n", Utils.fmt(cdr.getRs(), 13));
    // pw.printf("\tZScore : %s%n", Utils.fmt(ca.zdata.getzScore(), 13));

  }

  /**
   * 
   * @param pw
   * @param cdr
   */
  public static void writeCompanyInfo(PrintWriter pw, CompanyDerived cdr) {

    final FieldData fd = cdr.getFd();

    pw.println(" " + fd.getTicker());
    pw.printf("\t%s : %s, %s%n", fd.getName(), MarketTools.getCity(fd), MarketTools.getState(fd));

    final String index = ", " + MarketTools.getSnpIndexStr(fd);
    final String exch = ", " + fd.getExchange().toString();

    pw.printf("\t%s, %s%s%s%n", fd.getSector(), fd.getIndustry(), index, exch);
    String sNumEmp = "?";
    if (MarketTools.getNumEmployees(fd) > 0) {
      sNumEmp = Utils.ifmt(MarketTools.getNumEmployees(fd), 12);
    }
    pw.printf("\tEmployees     : %s%n", sNumEmp);
    if (MarketTools.getNumEmployees(fd) > 0) {
      final double d = cdr.getGrossIncQdata().getTtm() / MarketTools.getNumEmployees(fd) * CompanyDerived.MILLION;
      final int i = (int) d;
      pw.printf("\tOpInc per Emp : $%s%n", Utils.ifmt(i, 11));
    }

    final String dat = MarketTools.getLatestQtrEps(fd).format("yyyy-MMM-dd");
    pw.printf("\t10Q Date      :  %s%n", dat);

    pw.printf("\tPrice         :  %11.2f%n", MarketTools.getPrice(fd));
    pw.printf("%n\tMarket Cap        : %s M%n", Utils.fmt(MarketTools.getMktCap(fd), 13));

    pw.println(cdr.getSharesQdata().fmtGrowth1Q("Shares"));
    final double sc = cdr.getSharesQdata().deltaQ(1, 2);
    if (sc < -0.250) {
      final double bbest = Math.abs(sc) * ((MarketTools.getPrice52hi(fd) + MarketTools.getPrice52lo(fd)) / 2.0);
      pw.printf("\tShare Change 12m  : %s M (Buyback Est= $%sM)%n", Utils.fmt(sc, 13), Utils.fmt(bbest, 1));
    }
  }

  /**
   * 
   * @param pw
   * @param cdr
   */
  public static void writeQuarterly(PrintWriter pw, CompanyDerived cdr) {
    pw.printf("%n\t---------- Quarterly Changes ---------%n\t                   Q1              Q5%n");
    pw.printf("\tSales      %12.2f %15.2f %10.2f%%%n", cdr.getSalesQdata().get(1), cdr.getSalesQdata().get(5), cdr.getSalesQdata().getQoQ());
    pw.printf("\tOpInc      %12.2f %15.2f %10.2f%%%n", cdr.getGrossOpIncQdata().get(1), cdr.getGrossOpIncQdata().get(5),
        cdr.getGrossOpIncQdata().getQoQ());
    pw.printf("\tNet        %12.2f %15.2f %10.2f%%%n", cdr.getNetIncQdata().get(1), cdr.getNetIncQdata().get(5), cdr.getNetIncQdata().getQoQ());
    pw.printf("\tEPS        %12.2f %15.2f %10.2f%%%n", cdr.getEpsDilContQdata().get(1), cdr.getEpsDilContQdata().get(5),
        cdr.getEpsDilContQdata().getQoQ());
    pw.printf("\tEPS Est Q0 %12.2f %15.2f %10.2f%%%n", cdr.getEpsEstQ0(), cdr.getEpsDilContQdata().get(4), cdr.getEpsEstQ0Growth());

    pw.printf("\tCash Ops   %12.2f %15.2f %10.2f%%%n", cdr.getCashFromOpsQdata().get(1), cdr.getCashFromOpsQdata().get(5),
        cdr.getCashFromOpsQdata().getQoQ());
    pw.printf("\tCash Flow  %12.2f %15.2f %10.2f%%%n", cdr.getCashflowQdata().get(1), cdr.getCashflowQdata().get(5), cdr.getCashflowQdata().getQoQ());

    pw.printf("\tAcct Rec   %12.2f %15.2f %10.2f%%%n", cdr.getAcctRxQdata().get(1), cdr.getAcctRxQdata().get(5), cdr.getAcctRxQdata().getQoQ());
    pw.printf("\tAcct Pay   %12.2f %15.2f %10.2f%%%n", cdr.getAcctPayableQdata().get(1), cdr.getAcctPayableQdata().get(5),
        cdr.getAcctPayableQdata().getQoQ());
  }

  /**
   *
   * @param fname
   * @param agList
   * @throws FileNotFoundException
   */
  public static void writeEstimates(String fname, List<CompanyDerived> agList) throws FileNotFoundException {

    try (PrintWriter pw = new PrintWriter(fname)) {
      pw.println("Ticker, Sector, Industry, MarketCap(M), Float(M), Estimate");
      for (final CompanyDerived cdr : agList) {
        double chg = 0.0;
        final double q4 = cdr.getEpsDilContQdata().get(4);
        if (q4 != 0.0) {
          final FieldData fd = cdr.getFd();
          chg = (cdr.getEpsEstQ0() - q4) / Math.abs(q4);
          final String sector = fd.getSector().replace(",", ";");
          final String industry = fd.getIndustry().replace(",", ";");
          final long mktcap = (long) fd.getShareData().getMktCap();
          final long flt = (long) fd.getShareData().getFloatshr();
          pw.printf("%s,%s,%s,%d,%d,%f%n", fd.getTicker(), sector, industry, mktcap, flt, chg);
        }
      }
    }

  }

}
