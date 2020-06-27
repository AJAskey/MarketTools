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

  private FieldData fd;
  private int       quarter;
  private boolean   valid;
  private int       year;

  //
  private QuarterlyDouble sharesQdata;

  private QuarterlyDouble adjToIncQdata;
  private QuarterlyDouble cogsQdata;
  private QuarterlyDouble depreciationQdata;
  private QuarterlyDouble dividendQdata;
  private QuarterlyDouble epsContQdata;
  private QuarterlyDouble epsDilContQdata;
  private QuarterlyDouble epsDilQdata;
  private QuarterlyDouble epsQdata;
  private QuarterlyDouble grossIncQdata;
  private QuarterlyDouble grossOpIncQdata;
  private QuarterlyDouble incAfterTaxQdata;
  private QuarterlyDouble incPrimaryEpsQdata;
  private QuarterlyDouble incTaxQdata;
  private QuarterlyDouble intExpNonOpQdata;
  private QuarterlyDouble intExpQdata;
  private QuarterlyDouble netIncQdata;
  private QuarterlyDouble nonrecurringItemsQdata;
  private QuarterlyDouble otherIncQdata;
  private QuarterlyDouble preTaxIncQdata;
  private QuarterlyDouble rdQdata;
  private QuarterlyDouble salesQdata;
  private QuarterlyDouble totalOpExpQdata;
  private QuarterlyDouble unusualIncQdata;

  private QuarterlyDouble acctPayableQdata;
  private QuarterlyDouble acctRxQdata;
  private QuarterlyDouble bvpsQdata;
  private QuarterlyDouble cashQdata;
  private QuarterlyDouble currAssetsQdata;
  private QuarterlyDouble currLiabQdata;
  private QuarterlyDouble equityQdata;
  private QuarterlyDouble goodwillQdata;
  private QuarterlyDouble inventoryQdata;
  private QuarterlyDouble liabEquityQdata;
  private QuarterlyDouble ltDebtQdata;
  private QuarterlyDouble ltInvestQdata;
  private QuarterlyDouble netFixedAssetsQdata;
  private QuarterlyDouble otherCurrAssetsQdata;
  private QuarterlyDouble otherCurrLiabQdata;
  private QuarterlyDouble otherLtAssetsQdata;
  private QuarterlyDouble otherLtLiabQdata;
  private QuarterlyDouble prefStockQdata;
  private QuarterlyDouble stDebtQdata;
  private QuarterlyDouble stInvestQdata;
  private QuarterlyDouble totalAssetsQdata;
  private QuarterlyDouble totalLiabQdata;
  private QuarterlyDouble capExQdata;
  private QuarterlyDouble cashFromFinQdata;
  private QuarterlyDouble cashFromInvQdata;
  private QuarterlyDouble cashFromOpsQdata;

  private QuarterlyDouble intTotQdata;
  private double          cashflow;
  private double          netcashflow;
  private QuarterlyDouble tanAssetsQdata;
  private double          workingCapital;
  private double          currentRatio;
  private double          fcf;
  private double          wcfcf;

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

      //

      this.sharesQdata = new QuarterlyDouble(fd.getSharesQ());

      this.adjToIncQdata = new QuarterlyDouble(fd.getAdjToIncQtr());
      this.cogsQdata = new QuarterlyDouble(fd.getCogsQtr());
      this.depreciationQdata = new QuarterlyDouble(fd.getDepreciationQtr());
      this.dividendQdata = new QuarterlyDouble(fd.getDividendQtr());
      this.epsContQdata = new QuarterlyDouble(fd.getEpsContQtr());
      this.epsDilContQdata = new QuarterlyDouble(fd.getEpsDilContQtr());
      this.epsDilQdata = new QuarterlyDouble(fd.getEpsDilQtr());
      this.epsQdata = new QuarterlyDouble(fd.getEpsQtr());
      this.grossIncQdata = new QuarterlyDouble(fd.getGrossIncQtr());
      this.grossOpIncQdata = new QuarterlyDouble(fd.getGrossOpIncQtr());
      this.incAfterTaxQdata = new QuarterlyDouble(fd.getIncAfterTaxQtr());
      this.incPrimaryEpsQdata = new QuarterlyDouble(fd.getIncPrimaryEpsQtr());
      this.incTaxQdata = new QuarterlyDouble(fd.getIncTaxQtr());
      this.intExpNonOpQdata = new QuarterlyDouble(fd.getIntExpNonOpQtr());
      this.intExpQdata = new QuarterlyDouble(fd.getIntExpQtr());
      this.netIncQdata = new QuarterlyDouble(fd.getNetIncQtr());
      this.nonrecurringItemsQdata = new QuarterlyDouble(fd.getNonrecurringItemsQtr());
      this.otherIncQdata = new QuarterlyDouble(fd.getOtherIncQtr());
      this.preTaxIncQdata = new QuarterlyDouble(fd.getPreTaxIncQtr());
      this.rdQdata = new QuarterlyDouble(fd.getRdQtr());
      this.salesQdata = new QuarterlyDouble(fd.getSalesQtr());
      this.totalOpExpQdata = new QuarterlyDouble(fd.getTotalOpExpQtr());
      this.unusualIncQdata = new QuarterlyDouble(fd.getUnusualIncQtr());

      this.acctPayableQdata = new QuarterlyDouble(fd.getAcctPayableQtr());
      this.acctRxQdata = new QuarterlyDouble(fd.getAcctRxQtr());
      this.bvpsQdata = new QuarterlyDouble(fd.getBvpsQtr());
      this.cashQdata = new QuarterlyDouble(fd.getCashQtr());
      this.currAssetsQdata = new QuarterlyDouble(fd.getCurrAssetsQtr());
      this.currLiabQdata = new QuarterlyDouble(fd.getCurrLiabQtr());
      this.equityQdata = new QuarterlyDouble(fd.getEquityQtr());
      this.goodwillQdata = new QuarterlyDouble(fd.getGoodwillQtr());
      this.inventoryQdata = new QuarterlyDouble(fd.getInventoryQtr());
      this.liabEquityQdata = new QuarterlyDouble(fd.getLiabEquityQtr());
      this.ltDebtQdata = new QuarterlyDouble(fd.getLtDebtQtr());
      this.ltInvestQdata = new QuarterlyDouble(fd.getLtInvestQtr());
      this.netFixedAssetsQdata = new QuarterlyDouble(fd.getNetFixedAssetsQtr());
      this.otherCurrAssetsQdata = new QuarterlyDouble(fd.getOtherCurrAssetsQtr());
      this.otherCurrLiabQdata = new QuarterlyDouble(fd.getOtherCurrLiabQtr());
      this.otherLtAssetsQdata = new QuarterlyDouble(fd.getOtherLtAssetsQtr());
      this.otherLtLiabQdata = new QuarterlyDouble(fd.getOtherLtLiabQtr());
      this.prefStockQdata = new QuarterlyDouble(fd.getPrefStockQtr());
      this.stDebtQdata = new QuarterlyDouble(fd.getStDebtQtr());
      this.stInvestQdata = new QuarterlyDouble(fd.getStInvestQtr());

      this.capExQdata = new QuarterlyDouble(fd.getCapExQtr());
      this.cashFromFinQdata = new QuarterlyDouble(fd.getCashFromFinQtr());
      this.cashFromInvQdata = new QuarterlyDouble(fd.getCashFromInvQtr());
      this.cashFromOpsQdata = new QuarterlyDouble(fd.getCashFromOpsQtr());

      this.derived();

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
  private void derived() {

    this.netcashflow = this.cashFromOpsQdata.getTtm() + this.cashFromFinQdata.getTtm();
    this.cashflow = this.netcashflow + this.cashFromInvQdata.getTtm();

    final double cAssets[] = new double[9];
    for (int i = 0; i < cAssets.length; i++) {
      cAssets[i] = this.acctRxQdata.get(i) + this.stInvestQdata.get(i) + this.inventoryQdata.get(i) + this.otherCurrAssetsQdata.get(i)
          + this.cashQdata.get(i);
    }
    this.currAssetsQdata = new QuarterlyDouble(cAssets);

    final double cliab[] = new double[9];
    for (int i = 0; i < cliab.length; i++) {
      cliab[i] = this.acctPayableQdata.get(i) + this.stDebtQdata.get(i) + this.otherCurrLiabQdata.get(i);
    }
    this.currLiabQdata = new QuarterlyDouble(cliab);

    final double gArr[] = new double[9];
    for (int i = 0; i < gArr.length; i++) {
      gArr[i] = this.currAssetsQdata.get(i) - this.goodwillQdata.get(i);
    }
    this.goodwillQdata = new QuarterlyDouble(gArr);

    final double tArr[] = new double[9];
    for (int i = 0; i < tArr.length; i++) {
      tArr[i] = this.currAssetsQdata.get(i) - this.goodwillQdata.get(i);
    }
    tanAssetsQdata = new QuarterlyDouble(tArr);

    final double intArr[] = new double[9];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = this.fd.getIntExpQtr()[i] + this.fd.getIntExpNonOpQtr()[i];
    }
    this.intTotQdata = new QuarterlyDouble(intArr);

    workingCapital = this.currAssetsQdata.getMostRecent() - this.currLiabQdata.getMostRecent();
    currentRatio = this.currAssetsQdata.getMostRecent() / this.currLiabQdata.getMostRecent();

    fcf = this.cashFromOpsQdata.getTtm() - this.capExQdata.getTtm() - this.dividendQdata.getTtm() * this.sharesQdata.getTtmAvg();
    wcfcf = workingCapital + fcf;
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

        pw.println(ca.sharesQdata.fmtGrowth1Q("Shares"));
        final double sc = ca.sharesQdata.deltaQ(1, 2);
        if (sc < -0.250) {
          final double bbest = Math.abs(sc) * ((fd.getPrice52hi() + fd.getPrice52lo()) / 2.0);
          pw.printf("\tShare Change 12m  : %s M (Buyback Est= $%sM)%n", Utils.fmt(sc, 13), Utils.fmt(bbest, 1));
        }

        pw.println("\n" + ca.salesQdata.fmtGrowth4Q("Sales 12m"));
        pw.println(ca.cogsQdata.fmtGrowth4Q("COGS 12m"));
        pw.println(ca.grossOpIncQdata.fmtGrowth4Q("Ops Income 12m"));
        pw.println(ca.netIncQdata.fmtGrowth4Q("Net Income 12m"));
        pw.println(ca.intTotQdata.fmtGrowth4Q("Interest 12m"));
        //
        final double totdebt = fd.getStDebtQtr()[1] + fd.getLtDebtQtr()[1];
        double intrate = 0.0;
        if (totdebt > 0.0) {
          intrate = ca.intTotQdata.getTtm() / totdebt * 100.0;
        }
        pw.printf("\tInterest Rate     :%14.2f%%%n", intrate);
        //

        pw.println("\n" + ca.cashFromOpsQdata.fmtGrowth4Q("Cash <- Ops 12m"));
        pw.println(ca.capExQdata.fmtGrowth4Q("  CapEx 12m"));
        if (fd.getDividendQtr()[1] > 0.0) {
          final double div = ca.dividendQdata.getTtm() * ca.sharesQdata.getTtmAvg();
          final double dyld = ca.dividendQdata.getTtm() / fd.getPrice() * 100.0;
          pw.printf("\t  Dividends 12m   : %s M (Yield=%.2f%%)%n", Utils.fmt(div, 13), dyld);

        }
        else {
          final double d = ca.dividendQdata.getTtm() * ca.sharesQdata.getTtmAvg();
          pw.printf("\t  Dividends 12m   : %s M%n", Utils.fmt(d, 13));
        }

        pw.printf("\t    FCF 12m       : %s M %s%n", Utils.fmt(ca.fcf, 13), "[Cash from Operations - CapEx - Dividends]");

        pw.printf("\tCash <- Fin 12m   : %s M %s%n", Utils.fmt(ca.cashFromFinQdata.getTtm(), 13),
            "[Movement of cash between a firm and its owners/creditors : borrowing, debt repayment, dividend paid, equity financing.]");

        pw.printf("\t  Net Cash 12m    : %s M %s%n", Utils.fmt(ca.netcashflow, 13), "[Cash from Ops + Cash from Financing]");

        pw.printf("\tCash <- Inv 12m   : %s M %s%n", Utils.fmt(ca.cashFromInvQdata.getTtm(), 13),
            "[Purchases and sales of long-term assets such as plant and machinery - assumed infrequent.]");

        pw.printf("\t  Cash Flow 12m   : %s M %s%n", Utils.fmt(ca.cashflow, 13), "[Cash from Ops + Cash from Financing + Cash from Investing]");

        //

        pw.println(Utils.NL + ca.currAssetsQdata.fmtGrowth1Q("Current Assets"));
        pw.println(ca.cashQdata.fmtGrowth1Q("  Cash"));
        pw.println(ca.acctRxQdata.fmtGrowth1Q("  Acct Rx"));
        pw.println(ca.stInvestQdata.fmtGrowth1Q("  ST Invest"));
        pw.println(ca.inventoryQdata.fmtGrowth1Q("  Inventory"));
        pw.println(ca.otherCurrAssetsQdata.fmtGrowth1Q("  Other"));

        pw.println(ca.currLiabQdata.fmtGrowth1Q("Current Liabs"));
        pw.println(ca.acctPayableQdata.fmtGrowth1Q("  Acct Pay"));
        pw.println(ca.stDebtQdata.fmtGrowth1Q("  ST Debt"));
        pw.println(ca.otherCurrLiabQdata.fmtGrowth1Q("  Other"));

        pw.printf("\tWorking Capital   : %s M (Ratio=%.2f)%n", Utils.fmt(ca.workingCapital, 13), ca.currentRatio);
        pw.printf("\tWC + FCF          : %s M%n", Utils.fmt(ca.wcfcf, 13));

        //

        pw.println(Utils.NL + ca.equityQdata.fmtGrowth1Q("Sharehldr Equity"));
        pw.println(ca.goodwillQdata.fmtGrowth1Q("Goodwill"));
        pw.println(ca.tanAssetsQdata.fmtGrowth1Q("Tangible Assets"));
        pw.println(ca.ltDebtQdata.fmtGrowth1Q("LT Debt"));
        if (ca.equityQdata.getMostRecent() > 0.0) {
          pw.printf("\tLT Debt to Equity : %s%n", Utils.fmt(ca.ltDebtQdata.getMostRecent() / ca.equityQdata.getMostRecent(), 13));
        }
        else {
          pw.printf("\tLT Debt Tan Asset : %s%n", Utils.fmt(ca.ltDebtQdata.getMostRecent() / ca.tanAssetsQdata.getMostRecent(), 13));
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
