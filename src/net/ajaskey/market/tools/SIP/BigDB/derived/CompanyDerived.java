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
import net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum;
import net.ajaskey.market.tools.SIP.BigDB.MarketTools;
import net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;

/**
 * This class contains data and methods used to aggregate financial and price
 * data.
 */
public class CompanyDerived {

  public static final double MILLION = 1000000.0;

  private static List<CompanyDerived> agList = new ArrayList<>();

  public static List<CompanyDerived> getAgList() {
    return CompanyDerived.agList;
  }

  public static double getMillion() {
    return CompanyDerived.MILLION;
  }

  /**
   *
   * @param yr  year
   * @param qtr quarter
   * @param ft  TEXT, BINARY, BIG_BINARY
   */
  public static void loadDb(int yr, int qtr, FiletypeEnum ft) {
    FieldData.setQMemory(yr, qtr, FiletypeEnum.BIG_BINARY);
  }

  /**
   *
   * @param tickers
   * @param yr
   * @param qtr
   * @param fdList
   */
  public static List<CompanyDerived> processList(List<String> tickers, int yr, int qtr, List<FieldData> fdList) {

    CompanyDerived.agList.clear();

    for (final FieldData fd : fdList) {

      for (final String t : tickers) {

        if (t.trim().equalsIgnoreCase(fd.getTicker())) {

          final CompanyDerived ca = new CompanyDerived(yr, qtr, fd);
          if (ca.valid) {
            CompanyDerived.agList.add(ca);
          }

        }
      }
    }
    return CompanyDerived.agList;
  }

  /**
   *
   * @throws FileNotFoundException
   */
  public static void write(int yr, int qtr) throws FileNotFoundException {

    System.out.println("Writing Fundamental Report");

    Utils.makeDir("out");

    new ArrayList<>();

    final String fname = String.format("out/Companies-%dQ%d.txt", yr, qtr);

    try (PrintWriter pw = new PrintWriter(fname)) {

      final DateTime now = new DateTime();
      now.setSdf(Utils.sdfFull);

      pw.printf("Created : %s\t%s%n", now, "This file is subject to change without notice.");
      pw.println("Pre-filtered for US companies over $12 and average trading volume of at least 100K." + Utils.NL);

      pw.println("Seq : this quarter versus last quarter.");
      pw.println("QoQ : this quarter versus same quarter a year ago.");
      pw.println("YoY : last 12m versus 12m a year ago.\n\n--------------------------");

      for (final CompanyDerived ca : CompanyDerived.agList) {

        final FieldData fd = ca.fd;

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
          final double d = ca.grossIncQdata.getTtm() / MarketTools.getNumEmployees(fd) * CompanyDerived.MILLION;
          final int i = (int) d;
          pw.printf("\tOpInc per Emp : $%s%n", Utils.ifmt(i, 11));
        }

        final String dat = MarketTools.getLatestQtrEps(fd).format("yyyy-MMM-dd");
        pw.printf("\t10Q Date      :  %s%n", dat);

        pw.printf("\tPrice         :  %11.2f%n", MarketTools.getPrice(fd));
        pw.printf("%n\tMarket Cap        : %s M%n", Utils.fmt(MarketTools.getMktCap(fd), 13));

        pw.println(ca.sharesQdata.fmtGrowth1Q("Shares"));
        final double sc = ca.sharesQdata.deltaQ(1, 2);
        if (sc < -0.250) {
          final double bbest = Math.abs(sc) * ((MarketTools.getPrice52hi(fd) + MarketTools.getPrice52lo(fd)) / 2.0);
          pw.printf("\tShare Change 12m  : %s M (Buyback Est= $%sM)%n", Utils.fmt(sc, 13), Utils.fmt(bbest, 1));
        }

        pw.println("\n" + ca.salesQdata.fmtGrowth4Q("Sales 12m"));
        pw.println(ca.cogsQdata.fmtGrowth4Q("COGS 12m"));
        pw.println(ca.grossOpIncQdata.fmtGrowth4Q("Ops Income 12m"));
        pw.println(ca.netIncQdata.fmtGrowth4Q("Net Income 12m"));
        pw.println(ca.intTotQdata.fmtGrowth4Q("Interest 12m"));
        //
        final double totdebt = MarketTools.getStDebtQtr(fd)[1] + MarketTools.getLtDebtQtr(fd)[1];
        double intrate = 0.0;
        if (totdebt > 0.0) {
          intrate = ca.intTotQdata.getTtm() / totdebt * 100.0;
        }
        pw.printf("\tInterest Rate     :%14.2f%%%n", intrate);
        //

        pw.println("\n" + ca.cashFromOpsQdata.fmtGrowth4Q("Cash <- Ops 12m"));
        pw.println(ca.capExQdata.fmtGrowth4Q("  CapEx 12m"));
        if (ca.dividendQdata.getTtm() > 0.0) {
          final double dyld = ca.dividendQdata.getTtm() / MarketTools.getPrice(fd) * 100.0;
          pw.printf("\t  Dividends 12m   : %s M (Yield=%.2f%%)%n", Utils.fmt(ca.divCostQdata.getTtm(), 13), dyld);

        }
        else {
          pw.printf("\t  Dividends 12m   : %s M%n", Utils.fmt(ca.divCostQdata.getTtm(), 13));
        }

        pw.printf("\t    FCF 12m       : %s M %s%n", Utils.fmt(ca.fcfQdata.getTtm(), 13), "[Cash from Operations - CapEx - Dividends]");

        pw.printf("\tCash <- Fin 12m   : %s M %s%n", Utils.fmt(ca.cashFromFinQdata.getTtm(), 13),
            "[Movement of cash between a firm and its owners/creditors : borrowing, debt repayment, dividend paid, equity financing.]");

        pw.printf("\t  Net Cash 12m    : %s M %s%n", Utils.fmt(ca.netcashflowQdata.getTtm(), 13), "[Cash from Ops + Cash from Financing]");

        pw.printf("\tCash <- Inv 12m   : %s M %s%n", Utils.fmt(ca.cashFromInvQdata.getTtm(), 13),
            "[Purchases and sales of long-term assets such as plant and machinery - assumed infrequent.]");

        pw.printf("\t  Cash Flow 12m   : %s M %s%n", Utils.fmt(ca.cashflowQdata.getTtm(), 13),
            "[Cash from Ops + Cash from Financing + Cash from Investing]");

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

        pw.printf("\tWorking Capital   : %s M (Ratio=%.2f)%n", Utils.fmt(ca.workingCapitalQdata.getMostRecent(), 13),
            ca.currentRatioQdata.getMostRecent());
        pw.printf("\tWC + FCF          : %s M%n", Utils.fmt(ca.wcfcfQdata.getMostRecent(), 13));

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

        pw.println(Utils.NL + ca.netMarginQdata.fmtGrowth1Q("Net Margin"));
        pw.println(ca.opMarginQdata.fmtGrowth1Q("Op Margin"));
        pw.println(ca.roeQdata.fmtGrowth1Q("ROE"));
        // System.out.println(ca.roeQdata);
        pw.println(ca.peQdata.fmtGrowth1Q("PE"));

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

        pw.println();

      }
    }
  }

  private QuarterlyDouble acctPayableQdata;
  private QuarterlyDouble acctRxQdata;
  private QuarterlyDouble adjToIncQdata;
  private QuarterlyDouble bvpsQdata;
  private QuarterlyDouble capExQdata;
  private QuarterlyDouble cashflowQdata;
  private QuarterlyDouble cashFromFinQdata;
  private QuarterlyDouble cashFromInvQdata;
  private QuarterlyDouble cashFromOpsQdata;
  private QuarterlyDouble cashQdata;
  private QuarterlyDouble cogsQdata;
  private QuarterlyDouble currAssetsQdata;
  private QuarterlyDouble currentRatioQdata;
  private QuarterlyDouble currLiabQdata;
  private QuarterlyDouble depreciationQdata;
  private QuarterlyDouble divCostQdata;
  private QuarterlyDouble dividendQdata;
  private QuarterlyDouble epsContQdata;
  private QuarterlyDouble epsDilContQdata;
  private QuarterlyDouble epsDilQdata;
  private QuarterlyDouble epsQdata;
  private QuarterlyDouble equityQdata;
  private QuarterlyDouble fcfQdata;
  private FieldData       fd;
  private QuarterlyDouble goodwillQdata;
  private QuarterlyDouble grossIncQdata;
  private QuarterlyDouble grossOpIncQdata;
  private QuarterlyDouble incAfterTaxQdata;
  private QuarterlyDouble incPrimaryEpsQdata;
  private QuarterlyDouble incTaxQdata;
  private QuarterlyDouble intExpNonOpQdata;
  private QuarterlyDouble intExpQdata;
  private QuarterlyDouble intTotQdata;
  private QuarterlyDouble inventoryQdata;
  private QuarterlyDouble liabEquityQdata;
  private QuarterlyDouble ltDebtQdata;
  private QuarterlyDouble ltInvestQdata;
  private QuarterlyDouble netcashflowQdata;
  private QuarterlyDouble netFixedAssetsQdata;
  private QuarterlyDouble netIncQdata;
  private QuarterlyDouble netMarginQdata;
  private QuarterlyDouble nonrecurringItemsQdata;
  private QuarterlyDouble opMarginQdata;
  private QuarterlyDouble otherCurrAssetsQdata;
  private QuarterlyDouble otherCurrLiabQdata;
  private QuarterlyDouble otherIncQdata;
  private QuarterlyDouble otherLtAssetsQdata;
  private QuarterlyDouble otherLtLiabQdata;
  private QuarterlyDouble peQdata;
  private QuarterlyDouble prefStockQdata;
  private QuarterlyDouble preTaxIncQdata;
  private QuarterlyDouble pricesQdata;
  private int             quarter;
  private QuarterlyDouble rdQdata;
  private QuarterlyDouble roeQdata;
  private QuarterlyDouble salesQdata;
  private QuarterlyDouble sharesQdata;
  private QuarterlyDouble stDebtQdata;
  private QuarterlyDouble stInvestQdata;
  private QuarterlyDouble tanAssetsQdata;
  private QuarterlyDouble totalAssetsQdata;
  private QuarterlyDouble totalLiabQdata;
  private QuarterlyDouble totalOpExpQdata;
  private QuarterlyDouble unusualIncQdata;
  private boolean         valid;
  private QuarterlyDouble wcfcfQdata;
  private QuarterlyDouble workingCapitalQdata;
  private int             year;

  /**
   * Constructor
   *
   * @param tickers
   * @param yr
   * @param qtr
   * @param ft
   */
  public CompanyDerived(int yr, int qtr, FieldData fd) {

    try {
      this.year = yr;
      this.quarter = qtr;
      if (fd != null) {
        System.out.println("Setting fd : " + fd.getTicker());
        this.fd = fd;

        this.sharesQdata = new QuarterlyDouble(MarketTools.getSharesQtr(fd));
        this.pricesQdata = new QuarterlyDouble(MarketTools.getPricesQtr(fd));

        this.adjToIncQdata = new QuarterlyDouble(MarketTools.getAdjToIncQtr(fd));
        this.cogsQdata = new QuarterlyDouble(MarketTools.getCogsQtr(fd));
        this.depreciationQdata = new QuarterlyDouble(MarketTools.getDepreciationQtr(fd));
        this.dividendQdata = new QuarterlyDouble(MarketTools.getDividendQtr(fd));
        this.epsContQdata = new QuarterlyDouble(MarketTools.getEpsContQtr(fd));
        this.epsDilContQdata = new QuarterlyDouble(MarketTools.getEpsDilContQtr(fd));
        this.epsDilQdata = new QuarterlyDouble(MarketTools.getEpsDilQtr(fd));
        this.epsQdata = new QuarterlyDouble(MarketTools.getEpsQtr(fd));
        this.grossIncQdata = new QuarterlyDouble(MarketTools.getGrossIncQtr(fd));
        this.grossOpIncQdata = new QuarterlyDouble(MarketTools.getGrossOpIncQtr(fd));
        this.incAfterTaxQdata = new QuarterlyDouble(MarketTools.getIncAfterTaxQtr(fd));
        this.incPrimaryEpsQdata = new QuarterlyDouble(MarketTools.getIncPrimaryEpsQtr(fd));
        this.incTaxQdata = new QuarterlyDouble(MarketTools.getIncTaxQtr(fd));
        this.intExpNonOpQdata = new QuarterlyDouble(MarketTools.getIntExpNonOpQtr(fd));
        this.intExpQdata = new QuarterlyDouble(MarketTools.getIntExpQtr(fd));
        this.netIncQdata = new QuarterlyDouble(MarketTools.getNetIncQtr(fd));
        this.nonrecurringItemsQdata = new QuarterlyDouble(MarketTools.getNonrecurringItemsQtr(fd));
        this.otherIncQdata = new QuarterlyDouble(MarketTools.getOtherIncQtr(fd));
        this.preTaxIncQdata = new QuarterlyDouble(MarketTools.getPreTaxIncQtr(fd));
        this.rdQdata = new QuarterlyDouble(MarketTools.getRdQtr(fd));
        this.salesQdata = new QuarterlyDouble(MarketTools.getSalesQtr(fd));
        this.totalOpExpQdata = new QuarterlyDouble(MarketTools.getTotalOpExpQtr(fd));
        this.unusualIncQdata = new QuarterlyDouble(MarketTools.getUnusualIncQtr(fd));

        this.acctPayableQdata = new QuarterlyDouble(MarketTools.getAcctPayableQtr(fd));
        this.acctRxQdata = new QuarterlyDouble(MarketTools.getAcctRxQtr(fd));
        this.bvpsQdata = new QuarterlyDouble(MarketTools.getBvpsQtr(fd));
        this.cashQdata = new QuarterlyDouble(MarketTools.getCashQtr(fd));
        this.currAssetsQdata = new QuarterlyDouble(MarketTools.getCurrAssetsQtr(fd));
        this.currLiabQdata = new QuarterlyDouble(MarketTools.getCurrLiabQtr(fd));
        this.equityQdata = new QuarterlyDouble(MarketTools.getEquityQtr(fd));
        this.goodwillQdata = new QuarterlyDouble(MarketTools.getGoodwillQtr(fd));
        this.inventoryQdata = new QuarterlyDouble(MarketTools.getInventoryQtr(fd));
        this.liabEquityQdata = new QuarterlyDouble(MarketTools.getLiabEquityQtr(fd));
        this.ltDebtQdata = new QuarterlyDouble(MarketTools.getLtDebtQtr(fd));
        this.ltInvestQdata = new QuarterlyDouble(MarketTools.getLtInvestQtr(fd));
        this.netFixedAssetsQdata = new QuarterlyDouble(MarketTools.getNetFixedAssetsQtr(fd));
        this.otherCurrAssetsQdata = new QuarterlyDouble(MarketTools.getOtherCurrAssetsQtr(fd));
        this.otherCurrLiabQdata = new QuarterlyDouble(MarketTools.getOtherCurrLiabQtr(fd));
        this.otherLtAssetsQdata = new QuarterlyDouble(MarketTools.getOtherLtAssetsQtr(fd));
        this.otherLtLiabQdata = new QuarterlyDouble(MarketTools.getOtherLtLiabQtr(fd));
        this.prefStockQdata = new QuarterlyDouble(MarketTools.getPrefStockQtr(fd));
        this.stDebtQdata = new QuarterlyDouble(MarketTools.getStDebtQtr(fd));
        this.stInvestQdata = new QuarterlyDouble(MarketTools.getStInvestQtr(fd));

        this.capExQdata = new QuarterlyDouble(MarketTools.getCapExQtr(fd));
        this.cashFromFinQdata = new QuarterlyDouble(MarketTools.getCashFromFinQtr(fd));
        this.cashFromInvQdata = new QuarterlyDouble(MarketTools.getCashFromInvQtr(fd));
        this.cashFromOpsQdata = new QuarterlyDouble(MarketTools.getCashFromOpsQtr(fd));

        this.derived();

        this.valid = true;
      }
    }
    catch (final Exception e) {
      this.valid = false;
      e.printStackTrace();
    }

  }

  public QuarterlyDouble getAcctPayableQdata() {
    return this.acctPayableQdata;
  }

  public QuarterlyDouble getAcctRxQdata() {
    return this.acctRxQdata;
  }

  public QuarterlyDouble getAdjToIncQdata() {
    return this.adjToIncQdata;
  }

  public QuarterlyDouble getBvpsQdata() {
    return this.bvpsQdata;
  }

  public QuarterlyDouble getCapExQdata() {
    return this.capExQdata;
  }

  public QuarterlyDouble getCashflowQdata() {
    return this.cashflowQdata;
  }

  public QuarterlyDouble getCashFromFinQdata() {
    return this.cashFromFinQdata;
  }

  public QuarterlyDouble getCashFromInvQdata() {
    return this.cashFromInvQdata;
  }

  public QuarterlyDouble getCashFromOpsQdata() {
    return this.cashFromOpsQdata;
  }

  public QuarterlyDouble getCashQdata() {
    return this.cashQdata;
  }

  public QuarterlyDouble getCogsQdata() {
    return this.cogsQdata;
  }

  public QuarterlyDouble getCurrAssetsQdata() {
    return this.currAssetsQdata;
  }

  public QuarterlyDouble getCurrentRatioQdata() {
    return this.currentRatioQdata;
  }

  public QuarterlyDouble getCurrLiabQdata() {
    return this.currLiabQdata;
  }

  public QuarterlyDouble getDepreciationQdata() {
    return this.depreciationQdata;
  }

  public QuarterlyDouble getDivCostQdata() {
    return this.divCostQdata;
  }

  public QuarterlyDouble getDividendQdata() {
    return this.dividendQdata;
  }

  public QuarterlyDouble getEpsContQdata() {
    return this.epsContQdata;
  }

  public QuarterlyDouble getEpsDilContQdata() {
    return this.epsDilContQdata;
  }

  public QuarterlyDouble getEpsDilQdata() {
    return this.epsDilQdata;
  }

  public QuarterlyDouble getEpsQdata() {
    return this.epsQdata;
  }

  public QuarterlyDouble getEquityQdata() {
    return this.equityQdata;
  }

  public QuarterlyDouble getFcfQdata() {
    return this.fcfQdata;
  }

  public QuarterlyDouble getGoodwillQdata() {
    return this.goodwillQdata;
  }

  public QuarterlyDouble getGrossIncQdata() {
    return this.grossIncQdata;
  }

  public QuarterlyDouble getGrossOpIncQdata() {
    return this.grossOpIncQdata;
  }

  public QuarterlyDouble getIncAfterTaxQdata() {
    return this.incAfterTaxQdata;
  }

  public QuarterlyDouble getIncPrimaryEpsQdata() {
    return this.incPrimaryEpsQdata;
  }

  public QuarterlyDouble getIncTaxQdata() {
    return this.incTaxQdata;
  }

  public QuarterlyDouble getIntExpNonOpQdata() {
    return this.intExpNonOpQdata;
  }

  public QuarterlyDouble getIntExpQdata() {
    return this.intExpQdata;
  }

  public QuarterlyDouble getIntTotQdata() {
    return this.intTotQdata;
  }

  public QuarterlyDouble getInventoryQdata() {
    return this.inventoryQdata;
  }

  public QuarterlyDouble getLiabEquityQdata() {
    return this.liabEquityQdata;
  }

  public QuarterlyDouble getLtDebtQdata() {
    return this.ltDebtQdata;
  }

  public QuarterlyDouble getLtInvestQdata() {
    return this.ltInvestQdata;
  }

  public QuarterlyDouble getNetcashflowQdata() {
    return this.netcashflowQdata;
  }

  public QuarterlyDouble getNetFixedAssetsQdata() {
    return this.netFixedAssetsQdata;
  }

  public QuarterlyDouble getNetIncQdata() {
    return this.netIncQdata;
  }

  public QuarterlyDouble getNetMarginQdata() {
    return this.netMarginQdata;
  }

  public QuarterlyDouble getNonrecurringItemsQdata() {
    return this.nonrecurringItemsQdata;
  }

  public QuarterlyDouble getOpMarginQdata() {
    return this.opMarginQdata;
  }

  public QuarterlyDouble getOtherCurrAssetsQdata() {
    return this.otherCurrAssetsQdata;
  }

  public QuarterlyDouble getOtherCurrLiabQdata() {
    return this.otherCurrLiabQdata;
  }

  public QuarterlyDouble getOtherIncQdata() {
    return this.otherIncQdata;
  }

  public QuarterlyDouble getOtherLtAssetsQdata() {
    return this.otherLtAssetsQdata;
  }

  public QuarterlyDouble getOtherLtLiabQdata() {
    return this.otherLtLiabQdata;
  }

  public QuarterlyDouble getPeQdata() {
    return this.peQdata;
  }

  public QuarterlyDouble getPrefStockQdata() {
    return this.prefStockQdata;
  }

  public QuarterlyDouble getPreTaxIncQdata() {
    return this.preTaxIncQdata;
  }

  public QuarterlyDouble getPricesQdata() {
    return this.pricesQdata;
  }

  public int getQuarter() {
    return this.quarter;
  }

  public QuarterlyDouble getRdQdata() {
    return this.rdQdata;
  }

  public QuarterlyDouble getRoeQdata() {
    return this.roeQdata;
  }

  public QuarterlyDouble getSalesQdata() {
    return this.salesQdata;
  }

  public QuarterlyDouble getSharesQdata() {
    return this.sharesQdata;
  }

  public QuarterlyDouble getStDebtQdata() {
    return this.stDebtQdata;
  }

  public QuarterlyDouble getStInvestQdata() {
    return this.stInvestQdata;
  }

  public QuarterlyDouble getTanAssetsQdata() {
    return this.tanAssetsQdata;
  }

  public QuarterlyDouble getTotalAssetsQdata() {
    return this.totalAssetsQdata;
  }

  public QuarterlyDouble getTotalLiabQdata() {
    return this.totalLiabQdata;
  }

  public QuarterlyDouble getTotalOpExpQdata() {
    return this.totalOpExpQdata;
  }

  public QuarterlyDouble getUnusualIncQdata() {
    return this.unusualIncQdata;
  }

  public QuarterlyDouble getWcfcfQdata() {
    return this.wcfcfQdata;
  }

  public QuarterlyDouble getWorkingCapitalQdata() {
    return this.workingCapitalQdata;
  }

  public int getYear() {
    return this.year;
  }

  public boolean isValid() {
    return this.valid;
  }

  /**
   * Calculates Derived Data
   */
  private void derived() {

    final double ncf[] = new double[9];
    for (int i = 0; i < ncf.length; i++) {
      ncf[i] = this.cashFromOpsQdata.get(i) + this.cashFromFinQdata.get(i);
    }
    this.netcashflowQdata = new QuarterlyDouble(ncf);

    final double cf[] = new double[9];
    for (int i = 0; i < cf.length; i++) {
      cf[i] = this.cashFromOpsQdata.get(i) + this.cashFromInvQdata.get(i) + this.cashFromFinQdata.get(i);
    }
    this.cashflowQdata = new QuarterlyDouble(cf);

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

    final double gwArr[] = new double[9];
    for (int i = 0; i < gwArr.length; i++) {
      gwArr[i] = this.currAssetsQdata.get(i) - this.goodwillQdata.get(i);
    }
    this.goodwillQdata = new QuarterlyDouble(gwArr);

    final double tanArr[] = new double[9];
    for (int i = 0; i < tanArr.length; i++) {
      tanArr[i] = this.currAssetsQdata.get(i) - this.goodwillQdata.get(i);
    }
    this.tanAssetsQdata = new QuarterlyDouble(tanArr);

    final double intArr[] = new double[9];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = MarketTools.getIntExpQtr(this.fd)[i] + MarketTools.getIntExpNonOpQtr(this.fd)[i];
    }
    this.intTotQdata = new QuarterlyDouble(intArr);

    final double wcArr[] = new double[9];
    for (int i = 0; i < wcArr.length; i++) {
      wcArr[i] = this.currAssetsQdata.get(i) - this.currLiabQdata.get(i);
    }
    this.workingCapitalQdata = new QuarterlyDouble(wcArr);

    final double crArr[] = new double[9];
    for (int i = 0; i < crArr.length; i++) {
      crArr[i] = this.currAssetsQdata.get(i) / this.currLiabQdata.get(i);
    }
    this.currentRatioQdata = new QuarterlyDouble(crArr);

    final double fcfArr[] = new double[6];
    for (int i = 0; i < fcfArr.length; i++) {
      fcfArr[i] = this.cashFromOpsQdata.get(i) - this.capExQdata.get(i) - this.dividendQdata.get(i) * this.sharesQdata.get(i);
    }
    this.fcfQdata = new QuarterlyDouble(fcfArr);

    final double wcfcfArr[] = new double[6];
    for (int i = 0; i < wcfcfArr.length; i++) {
      wcfcfArr[i] = this.workingCapitalQdata.getMostRecent() + this.fcfQdata.getTtm();
    }
    this.wcfcfQdata = new QuarterlyDouble(wcfcfArr);

    final double divArr[] = new double[6];
    for (int i = 0; i < divArr.length; i++) {
      divArr[i] = this.dividendQdata.get(i) * this.sharesQdata.get(i);
    }
    this.divCostQdata = new QuarterlyDouble(divArr);

    final double nMarArr[] = new double[6];
    for (int i = 0; i < nMarArr.length; i++) {
      if (this.salesQdata.get(i) != 0.0) {
        nMarArr[i] = this.netIncQdata.get(i) / this.salesQdata.get(i) * 100.0;
      }
      else {
        nMarArr[i] = 0.0;
      }
    }
    this.netMarginQdata = new QuarterlyDouble(nMarArr);

    final double oMarArr[] = new double[6];
    for (int i = 0; i < oMarArr.length; i++) {
      if (this.salesQdata.get(i) != 0.0) {
        oMarArr[i] = this.grossOpIncQdata.get(i) / this.salesQdata.get(i) * 100.0;
      }
      else {
        oMarArr[i] = 0.0;
      }
    }
    this.opMarginQdata = new QuarterlyDouble(oMarArr);

//    final double pe2Arr[] = new double[6];
//    for (int i = 0; i < pe2Arr.length; i++) {
//      if (this.netIncQdata.get(i) != 0.0) {
//        final double pe = this.pricesQdata.get(i) / (this.netIncQdata.get(i) / this.sharesQdata.get(i));
//        pe2Arr[i] = pe;
//      }
//      else {
//        pe2Arr[i] = 0.0;
//      }
//    }
// this.peQdata = new QuarterlyDouble(pe2Arr);

    final double peArr[] = new double[6];
    double eps = this.epsContQdata.getTtm();
    for (int i = 0; i < peArr.length; i++) {
      peArr[i] = 0.0;
    }
    if (eps > 0.0) {
      peArr[1] = this.pricesQdata.get(1) / eps;
    }
    eps = this.epsContQdata.get2QTtm();
    if (eps > 0.0) {
      peArr[2] = this.pricesQdata.get(2) / eps;
    }
    eps = this.epsContQdata.getPrevTtm();
    if (eps > 0.0) {
      peArr[5] = this.pricesQdata.get(5) / eps;
    }
    this.peQdata = new QuarterlyDouble(peArr);

    final double roeArr[] = new double[6];
    double net = this.netIncQdata.getTtm();
    double eq = this.equityQdata.getTtm();
    for (int i = 0; i < roeArr.length; i++) {
      roeArr[i] = 0.0;
    }
    if (net > 0.0 && eq > 0.0) {
      roeArr[1] = net / eq * 100.0;
    }
    net = this.netIncQdata.get2QTtm();
    eq = this.equityQdata.get2QTtm();
    if (net > 0.0 && eq > 0.0) {
      roeArr[2] = net / eq * 100.0;
    }
    net = this.netIncQdata.getPrevTtm();
    eq = this.equityQdata.getPrevTtm();
    if (net > 0.0 && eq > 0.0) {
      roeArr[5] = net / eq * 100.0;
    }
    this.roeQdata = new QuarterlyDouble(roeArr);

  }

}
