/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Original author : Andy Askey (ajaskey34@gmail.com)
 */
package net.ajaskey.market.tools.SIP.BigDB.derived;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum;
import net.ajaskey.market.tools.SIP.BigDB.reports.Fundamentals;

/**
 * This class contains data and methods used to aggregate financial and price
 * data.
 */
public class CompanyAggregate {

  private static List<CompanyAggregate> agList = new ArrayList<>();

  /**
   *
   * @param yr  year
   * @param qtr quarter
   * @param ft  TEXT, BINARY, BIG_BINARY
   */
  public static void loadDb(int yr, int qtr, FiletypeEnum ft) {
    FieldData.setQMemory(yr, qtr, FiletypeEnum.BIG_BINARY);
  }

  public static void main(final String[] args) throws FileNotFoundException {

    final int yr = 2020;
    final int qtr = 2;
    final FiletypeEnum ft = FiletypeEnum.BIG_BINARY;

    CompanyAggregate.loadDb(2020, 2, FiletypeEnum.BIG_BINARY);

    final List<String> tickers = new ArrayList<>();
    tickers.add("MSFT");
    tickers.add("W");

    final List<FieldData> fdList = FieldData.getQFromDb(yr, qtr, ft);

    CompanyAggregate.processList(tickers, yr, qtr, fdList);
    CompanyAggregate.write();

  }

  /**
   *
   * @param tickers
   * @param yr
   * @param qtr
   * @param fdList
   */
  public static void processList(List<String> tickers, int yr, int qtr, List<FieldData> fdList) {

    CompanyAggregate.agList.clear();

    for (final FieldData fd : fdList) {

      for (final String t : tickers) {

        if (t.trim().equalsIgnoreCase(fd.getTicker())) {

          final CompanyAggregate ca = new CompanyAggregate(yr, qtr, fd);
          if (ca.valid) {
            CompanyAggregate.agList.add(ca);
          }

        }
      }
    }
  }

  private QuarterlyDouble acctPay;
  private QuarterlyDouble acctRx;
  private QuarterlyDouble capex;
  private QuarterlyDouble cash;
  private QuarterlyDouble cashfin;
  private double          cashflow;
  private QuarterlyDouble cashinv;
  private QuarterlyDouble cashops;
  private QuarterlyDouble cogs;
  private QuarterlyDouble currAssets;
  private QuarterlyDouble currLiab;
  private QuarterlyDouble dividend;
  private QuarterlyDouble equity;
  private FieldData       fd;
  private QuarterlyDouble goodwill;
  private QuarterlyDouble grossOpInc;
  private QuarterlyDouble intTot;
  private QuarterlyDouble inventory;
  private QuarterlyDouble ltDebt;
  private QuarterlyDouble net;
  private double          netcashflow;
  private QuarterlyDouble otherAssets;
  private QuarterlyDouble otherLiab;
  private int             quarter;
  private QuarterlyDouble sales;
  private QuarterlyDouble shares;
  private QuarterlyDouble stDebt;
  private QuarterlyDouble stInvest;
  private boolean         valid;
  private int             year;

  /**
   * Constructor
   *
   * @param tickers
   * @param yr
   * @param qtr
   * @param ft
   */
  public CompanyAggregate(int yr, int qtr, FieldData fd) {

    try {
      this.year = yr;
      this.quarter = qtr;
      System.out.println("Setting fd : " + fd.getTicker());
      this.fd = fd;
      this.sales = new QuarterlyDouble(fd.getSalesQtr());
      this.cogs = new QuarterlyDouble(fd.getCogsQtr());
      this.grossOpInc = new QuarterlyDouble(fd.getGrossIncQtr());
      this.net = new QuarterlyDouble(fd.getNetIncQtr());
      this.cash = new QuarterlyDouble(fd.getCashQtr());
      this.capex = new QuarterlyDouble(fd.getCashData().getCapExQtr());
      this.cashops = new QuarterlyDouble(fd.getCashData().getCashFromOpsQtr());
      this.dividend = new QuarterlyDouble(fd.getDividendQtr());
      this.cashfin = new QuarterlyDouble(fd.getCashFromFin());
      this.cashinv = new QuarterlyDouble(fd.getCashFromInv());
      this.acctRx = new QuarterlyDouble(fd.getAcctRxQtr());
      this.stInvest = new QuarterlyDouble(fd.getStInvestQtr());
      this.inventory = new QuarterlyDouble(fd.getInventoryQtr());
      this.otherAssets = new QuarterlyDouble(fd.getOtherCurrAssetsQtr());
      this.acctPay = new QuarterlyDouble(fd.getAcctPayableQtr());
      this.stDebt = new QuarterlyDouble(fd.getStDebtQtr());
      this.otherLiab = new QuarterlyDouble(fd.getOtherCurrLiabQtr());
      this.equity = new QuarterlyDouble(fd.getEquityQtr());
      this.ltDebt = new QuarterlyDouble(fd.getLtDebtQtr());
      this.goodwill = new QuarterlyDouble(fd.getGoodwillQtr());
      this.shares = new QuarterlyDouble(fd.getSharesQ());

      this.process();

      this.valid = true;
    }
    catch (final Exception e) {
      this.valid = false;
      e.printStackTrace();
    }

  }

  /**
   * Calculates Derived Data
   */
  private void process() {

    this.netcashflow = this.cashops.getTtm() + this.cashfin.getTtm();
    this.cashflow = this.netcashflow + this.cashinv.getTtm();

    final double cAssets[] = new double[9];
    for (int i = 0; i < cAssets.length; i++) {
      cAssets[i] = this.acctRx.get(i) + this.stInvest.get(i) + this.inventory.get(i) + this.otherAssets.get(i) + this.cash.get(i);
    }
    this.currAssets = new QuarterlyDouble(cAssets);

    final double cliab[] = new double[9];
    for (int i = 0; i < cliab.length; i++) {
      cliab[i] = this.acctPay.get(i) + this.stDebt.get(i) + this.otherLiab.get(i);
    }
    this.currLiab = new QuarterlyDouble(cliab);

    final double gArr[] = new double[9];
    for (int i = 0; i < gArr.length; i++) {
      gArr[i] = this.currAssets.get(i) - this.goodwill.get(i);
    }
    this.goodwill = new QuarterlyDouble(gArr);

    final double intArr[] = new double[9];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = this.fd.getIntExpQtr()[i] + this.fd.getIntExpNonOpQtr()[i];
    }
    this.intTot = new QuarterlyDouble(intArr);
  }

  /**
   *
   * @throws FileNotFoundException
   */
  public static void write() throws FileNotFoundException {

    System.out.println("Writing Fundamental Report");

    Utils.makeDir("out");

    new ArrayList<>();

    try (PrintWriter pw = new PrintWriter("out/Companies.txt")) {

      final DateTime now = new DateTime();
      now.setSdf(Utils.sdfFull);

      pw.printf("Created : %s\t%s%n", now, "This file is subject to change without notice.");
      pw.println("Pre-filtered for US companies over $12 and average trading volume of at least 100K." + Utils.NL);

      pw.println("Seq : this quarter versus last quarter.");
      pw.println("QoQ : this quarter versus same quarter a year ago.");
      pw.println("YoY : last 12m versus 12m a year ago.\n\n--------------------------");

      for (final CompanyAggregate ca : CompanyAggregate.agList) {

        final FieldData fd = ca.fd;

        pw.println(" " + fd.getTicker());
        pw.printf("\t%s : %s, %s%n", fd.getName(), fd.getCity(), fd.getState());

        final String index = ", " + fd.getSnpIndexStr();
        final String exch = ", " + fd.getExchange().toString();

        pw.printf("\t%s, %s%s%s%n", fd.getSector(), fd.getIndustry(), index, exch);
        String sNumEmp = "?";
        if (fd.getNumEmployees() > 0) {
          sNumEmp = Utils.ifmt(fd.getNumEmployees(), 12);
        }
        pw.printf("\tEmployees     : %s%n", sNumEmp);
        if (fd.getNumEmployees() > 0) {
          final double d = FieldData.getTtm(fd.getGrossIncQtr()) / fd.getNumEmployees() * Fundamentals.MILLION;
          final int i = (int) d;
          pw.printf("\tOpInc per Emp : $%s%n", Utils.ifmt(i, 11));
        }

        final String dat = fd.getLatestQtrEps().format("yyyy-MMM-dd"); // Utils.stringDate(fd.eoq);
        pw.printf("\t10Q Date      :  %s%n", dat);

        pw.printf("\tPrice         :  %11.2f%n", fd.getPrice());
        pw.printf("%n\tMarket Cap        : %s M%n", Utils.fmt(fd.getMktCap(), 13));

        pw.println(ca.shares.fmtGrowth1Q("Shares"));
        final double sc = ca.shares.deltaQ(1, 2);
        if (sc < -0.250) {
          final double bbest = Math.abs(sc) * ((fd.getPrice52hi() + fd.getPrice52lo()) / 2.0);
          pw.printf("\tShare Change 12m  : %s M (Buyback Est= $%sM)%n", Utils.fmt(sc, 13), Utils.fmt(bbest, 1));
        }

        pw.println("\n" + ca.sales.fmtGrowth4Q("Sales 12m"));
        pw.println(ca.cogs.fmtGrowth4Q("COGS 12m"));
        pw.println(ca.grossOpInc.fmtGrowth4Q("Ops Income 12m"));
        pw.println(ca.net.fmtGrowth4Q("Net Income 12m"));
        pw.println(ca.intTot.fmtGrowth4Q("Interest 12m"));
        //
        final double totdebt = fd.getStDebtQtr()[1] + fd.getLtDebtQtr()[1];
        double intrate = 0.0;
        if (totdebt > 0.0) {
          intrate = ca.intTot.getTtm() / totdebt * 100.0;
        }
        pw.printf("\tInterest Rate     :%14.2f%%%n", intrate);
        //

        pw.println("\n" + ca.cashops.fmtGrowth4Q("Cash <- Ops 12m"));
        pw.println(ca.capex.fmtGrowth4Q("  CapEx 12m"));
        if (fd.getDividendQtr()[1] > 0.0) {
          final double div = ca.dividend.getTtm() * ca.shares.getTtmAvg();
          final double dyld = ca.dividend.getTtm() / fd.getPrice() * 100.0;
          pw.printf("\t  Dividends 12m   : %s M (Yield=%.2f%%)%n", Utils.fmt(div, 13), dyld);

        }
        else {
          final double d = ca.dividend.getTtm() * ca.shares.getTtmAvg();
          pw.printf("\t  Dividends 12m   : %s M%n", Utils.fmt(d, 13));
        }

        final double fcf = ca.cashops.getTtm() - ca.capex.getTtm() - ca.dividend.getTtm() * ca.shares.getTtmAvg();

        pw.printf("\t    FCF 12m       : %s M %s%n", Utils.fmt(fcf, 13), "[Cash from Operations - CapEx - Dividends]");

        pw.printf("\tCash <- Fin 12m   : %s M %s%n", Utils.fmt(ca.cashfin.getTtm(), 13),
            "[Movement of cash between a firm and its owners/creditors : borrowing, debt repayment, dividend paid, equity financing.]");

        pw.printf("\t  Net Cash 12m    : %s M %s%n", Utils.fmt(ca.netcashflow, 13), "[Cash from Ops + Cash from Financing]");

        pw.printf("\tCash <- Inv 12m   : %s M %s%n", Utils.fmt(ca.cashinv.getTtm(), 13),
            "[Purchases and sales of long-term assets such as plant and machinery - assumed infrequent.]");

        pw.printf("\t  Cash Flow 12m   : %s M %s%n", Utils.fmt(ca.cashflow, 13), "[Cash from Ops + Cash from Financing + Cash from Investing]");

        //

        pw.println(Utils.NL + ca.currAssets.fmtGrowth1Q("Current Assets"));
        pw.println(ca.cash.fmtGrowth1Q("  Cash"));
        pw.println(ca.acctRx.fmtGrowth1Q("  Acct Rx"));
        pw.println(ca.stInvest.fmtGrowth1Q("  ST Invest"));
        pw.println(ca.inventory.fmtGrowth1Q("  Inventory"));
        pw.println(ca.otherAssets.fmtGrowth1Q("  Other"));

        pw.println(ca.currLiab.fmtGrowth1Q("Current Liabs"));
        pw.println(ca.acctPay.fmtGrowth1Q("  Acct Pay"));
        pw.println(ca.stDebt.fmtGrowth1Q("  ST Debt"));
        pw.println(ca.otherLiab.fmtGrowth1Q("  Other"));

        final double wc = ca.currAssets.getMostRecent() - ca.currLiab.getMostRecent();
        final double cr = ca.currAssets.getMostRecent() / ca.currLiab.getMostRecent();
        final double wcfcf = wc + fcf;

        pw.printf("\tWorking Capital   : %s M (Ratio=%.2f)%n", Utils.fmt(wc, 13), cr);
        pw.printf("\tWC + FCF          : %s M%n", Utils.fmt(wcfcf, 13));

        //

        final double gArr[] = new double[9];
        for (int i = 0; i < gArr.length; i++) {
          gArr[i] = ca.currAssets.get(i) - ca.goodwill.get(i);
        }
        final QuarterlyDouble tanAssets = new QuarterlyDouble(gArr);

        pw.println(Utils.NL + ca.equity.fmtGrowth1Q("Sharehldr Equity"));
        pw.println(ca.goodwill.fmtGrowth1Q("Goodwill"));
        pw.println(tanAssets.fmtGrowth1Q("Tangible Assets"));
        pw.println(ca.ltDebt.fmtGrowth1Q("LT Debt"));
        if (ca.equity.getMostRecent() > 0.0) {
          pw.printf("\tLT Debt to Equity : %s%n", Utils.fmt(ca.ltDebt.getMostRecent() / ca.equity.getMostRecent(), 13));
        }
        else {
          pw.printf("\tLT Debt Tan Asset : %s%n", Utils.fmt(ca.ltDebt.getMostRecent() / tanAssets.getMostRecent(), 13));
        }

        pw.printf("%n\tFloat             : %s M%n", Utils.fmt(fd.getFloatshr(), 13));
        double d = fd.getInsiderOwnership();
        pw.printf("\tInsiders          : %s %%%n", Utils.fmt(d, 13));
        d = fd.getInstOwnership();
        pw.printf("\tInstitutions      : %s %% (Number %s)%n", Utils.fmt(d, 13), Utils.ifmt(fd.getInstShareholders(), 5));

        if (fd.getVolume10d() > 999) {
          pw.printf("\tAvg Daily Vol     : %s M%n", Utils.fmt(fd.getVolume10d() / 1000.0, 13));
        }
        else {
          pw.printf("\tAvg Daily Vol     : %s K%n", Utils.lfmt(fd.getVolume10d(), 13));
        }

        double turnover = 0.0;
        if (fd.getVolumeMonth3m() > 0.0) {
          turnover = fd.getFloatshr() / (fd.getVolume10d() / 1000.0);
        }
        pw.printf("\tTurnover Float    : %s days%n", Utils.fmt(turnover, 13));

        pw.println();

      }
    }
  }

}
