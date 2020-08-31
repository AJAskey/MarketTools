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

import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;

public class ZData {

  private final static double arKnob            = 0.95;
  private final static double gwKnob            = 0.10;
  private final static double inventoryKnob     = 0.95;
  private final static double ltAssetsKnob      = 0.15;
  private final static double ltInvestmentsKnob = 0.85;
  private final static String NL                = Utils.NL;
  private final static double stAssetsKnob      = 0.98;
  private final static double stInvestmentsKnob = 0.99;
  private final static String TAB               = Utils.TAB;
  private static int          zKnt              = 0;
  private static String       zStr              = "";

  public static double getArknob() {
    return ZData.arKnob;
  }

  public static double getGwknob() {
    return ZData.gwKnob;
  }

  public static double getInventoryknob() {
    return ZData.inventoryKnob;
  }

  public static double getLtassetsknob() {
    return ZData.ltAssetsKnob;
  }

  public static double getLtinvestmentsknob() {
    return ZData.ltInvestmentsKnob;
  }

  public static double getStassetsknob() {
    return ZData.stAssetsKnob;
  }

  public static double getStinvestmentsknob() {
    return ZData.stInvestmentsKnob;
  }

  public static int getzKnt() {
    return ZData.zKnt;
  }

  public static String getzStr() {
    return ZData.zStr;
  }

  private CompanyDerived cdr;
  private double         zAdjInc;
  private double         zAdjScr;
  private double         zCash;
  private double         zCashFromOps;
  private double         zCashFlow;
  private double         zDebt;
  private double         zDividend;
  private double         zEquity;
  private double         zLtDebtEquity;
  private double         zIncome;
  private double         zInterestRate;
  private boolean        zIsZombie;
  private double         zKeepItRunning;
  private double         zNet;
  private double         zEps;
  private double         zSales;
  private double         zGrowth3Yr;
  private double         zWorkingCapital;
  private double         zScore;

  private String dbgStr;

  /**
   * This method serves as a constructor for the class.
   *
   */
  public ZData(CompanyDerived cdr) {

    this.cdr = cdr;
    this.zCashFromOps = 0.0;
    this.zCashFlow = 0.0;
    this.zSales = 0.0;
    this.zNet = 0.0;
    this.zEps = 0.0;
    this.zEquity = 0.0;
    this.zLtDebtEquity = 0.0;
    this.zIncome = 0.0;
    this.zInterestRate = 0.0;
    this.zAdjInc = 0.0;
    this.zDividend = 0.0;
    this.zCash = 0.0;
    this.zDebt = 0.0;
    this.zScore = 0.0;
    this.zAdjScr = 0.0;
    this.zKeepItRunning = 0.0;
    this.zIsZombie = false;
    this.zGrowth3Yr = 0.0;
    this.zWorkingCapital = 0.0;

    this.dbgStr = this.calc();
  }

  /**
   * Calculates the Zombie Score
   */
  private String calc() {

    dbgStr = Utils.NL + cdr.getFd().getTicker() + Utils.NL;

    double qtr;
    double ttm;
    double seq;

    if (this.cdr.getFd().getTicker().equalsIgnoreCase("ICPT")) {
      System.out.println();
    }

    /**
     * Sales
     */

    qtr = this.cdr.getSalesQdata().getQoQ();
    ttm = this.cdr.getSalesQdata().getYoY();
    dbgStr += SipOutput.buildArray("Sales         ", cdr.getSalesQdata().dArr, 10, 2) + Utils.NL;
    dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, cdr.getSalesQdata().getTtm(), cdr.getSalesQdata().getPrevTtm());
    if (this.cdr.getSalesQdata().getQoQ() < 0.0) {
      this.zSales += Math.abs(Math.max(-17.5, qtr));
      dbgStr += String.format("\tMost recent QoQ growth neg - zSales : %.2f\t%.2f\n", this.zSales, qtr);
    }
    if (this.cdr.getSalesQdata().getYoY() < 0.0) {
      this.zSales += Math.abs(Math.max(-17.5, ttm));
      dbgStr += String.format("\tMost recent YoY growth neg - zSales : %.2f\t%.2f\n", this.zSales, ttm);
    }

    /**
     * Cash Flow from Ops
     */
    qtr = this.cdr.getCashFromOpsQdata().getQoQ();
    ttm = this.cdr.getCashFromOpsQdata().getYoY();
    dbgStr += SipOutput.buildArray("Cash From Ops ", cdr.getCashFromOpsQdata().dArr, 10, 2) + Utils.NL;
    dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, cdr.getCashFromOpsQdata().getTtm(), cdr.getCashFromOpsQdata().getPrevTtm());
    if (qtr < 0.0) {
      this.zCashFromOps += 15.0;
      dbgStr += String.format("\tMost recent QoQ CashFromOps growth neg adding 15.0 - zCashFromOps : %.2f\n", this.zCashFromOps);
    }
    if (ttm < 0.0) {
      this.zCashFromOps += 15.0;
      dbgStr += String.format("\tMost recent YoY CashFromOps growth neg adding 15.0 - zCashFromOps : %.2f\n", this.zCashFromOps);
    }
    if (this.cdr.getFcfQdata().getMostRecent() < 0.0) {
      this.zCashFromOps += 10.0;
      dbgStr += String.format("\tFCF neg adding 10 - zCashFromOps : %.2f\t%.2f\n", this.zCashFromOps, this.cdr.getFcfQdata().getMostRecent());
    }
    this.zScore += this.zCashFromOps;

    /**
     * Cash Flow
     */
    qtr = this.cdr.getCashflowQdata().getMostRecent();
    dbgStr += SipOutput.buildArray("Cash Flow ", cdr.getCashflowQdata().dArr, 10, 2) + Utils.NL;
    dbgStr += String.format("\tCash : %.2f\n", this.cdr.getCashQdata().getMostRecent());
    if (qtr < 0.0) {
      if (this.cdr.getCashQdata().getMostRecent() > 0.0) {
        double tmp = Math.abs(qtr / this.cdr.getCashQdata().getMostRecent() * 100.0);
        this.zCashFlow = Math.min(35.0, tmp);
        dbgStr += String.format("\tMost recent CashFlow neg - zCashFlow : %.2f\t%.2f\n", this.zCashFlow, tmp);
      }
      else {
        this.zCashFlow += 35.0;
        dbgStr += String.format("\tMost recent CashFlow neg adding 35.0 - zCashFlow : %.2f\n", this.zCashFlow);
      }
    }
    this.zScore += this.zCashFlow;

    /**
     * Net income
     */
    qtr = this.cdr.getNetIncQdata().getQoQ();
    ttm = this.cdr.getNetIncQdata().getYoY();
    dbgStr += SipOutput.buildArray("Net Income ", cdr.getNetIncQdata().dArr, 10, 2) + Utils.NL;
    dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, cdr.getNetIncQdata().getTtm(), cdr.getNetIncQdata().getPrevTtm());
    if (this.cdr.getNetIncQdata().getMostRecent() < 0.0) {
      this.zNet += 35;
      dbgStr += String.format("\tMost recent Net Income neg adding 35.0 - zNet : %.2f\n", this.zNet);
    }
    else {
      if (qtr < 0.0) {
        this.zNet += Math.abs(Math.max(-17.5, qtr));
        dbgStr += String.format("\tMost recent QoQ Net Income growth neg - zNet : %.2f\t%.2f\n", this.zNet, qtr);
      }
      if (ttm < 0.0) {
        this.zNet += Math.abs(Math.max(-17.5, ttm));
        dbgStr += String.format("\tMost recent YoY Net Income growth neg - zNet : %.2f\t%.2f\n", this.zNet, ttm);
      }
    }
    this.zScore += this.zNet;

    /**
     * Equity
     */
    seq = this.cdr.getEquityQdata().getQseqQ();
    dbgStr += SipOutput.buildArray("Equity ", cdr.getEquityQdata().dArr, 10, 2) + Utils.NL;
    dbgStr += String.format("\tQtoQ : %.2f%%%n", seq);
    if (this.cdr.getEquityQdata().getMostRecent() < 0.0) {
      if (seq > 0.0) {
        this.zEquity += 35.0;
        dbgStr += String.format("\tEquity neg adding 35.0 - zEquity : %.2f\n", this.zEquity);

      }
      else {
        this.zEquity += 50.0;
        dbgStr += String.format("\tEquity neg and Most recent growth neg adding 50.0 - zEquity : %.2f\n", this.zEquity);
      }
    }
    else {
      if (seq < 0.0) {
        this.zEquity += Math.abs(Math.max(-35.0, seq));
        dbgStr += String.format("\tEquity Most recent growth neg - zEquity : %.2f\t%.2f\n", this.zEquity, seq);
      }
      if (this.cdr.getEquityQdata().getMostRecent() > 0.0) {
        double ltDtoE = this.cdr.getLtDebtQdata().getMostRecent() / this.cdr.getEquityQdata().getMostRecent();
        dbgStr += SipOutput.buildArray("LT Debt ", cdr.getLtDebtQdata().dArr, 10, 2) + Utils.NL;
        if (ltDtoE > 1.0) {
          double tmp = ltDtoE * 5.0;
          this.zLtDebtEquity = Math.min(35.0, tmp);
          dbgStr += String.format("\tLT Debt to Equity - zLtDebtEquity : %.2f\t%.2f\n", this.zLtDebtEquity, tmp);
        }
      }
    }
    this.zScore += this.zEquity + this.zLtDebtEquity;

    /**
     * EPS Estimate Q0 Growth
     */
    qtr = this.cdr.getEpsEstQ0Growth();
    dbgStr += String.format("EPS Growth Est : %.2f%n", qtr);
    if (qtr < 0.0) {
      this.zEps += Math.abs(Math.max(-35.0, qtr));
      dbgStr += String.format("\tEPS Growth neg - zEPS : %.2f\t%.2f\t%.2f\t%.2f\n", this.zEps, qtr, this.cdr.getEpsEstQ0(),
          this.cdr.getEpsDilContQdata().get(4));
    }
    this.zScore += this.zEps;

    /**
     * Interest Rate
     */
    this.zInterestRate = Math.min(35.0, (this.cdr.getCurrInterestRate() * 100.0));
    this.zScore += this.zInterestRate;

    /**
     * 
     * Growth
     */
    double y1net = this.cdr.getFd().getIncSheetData().getNetIncYr()[1];
    double y4net = this.cdr.getFd().getIncSheetData().getNetIncYr()[4];
    double gr = FieldData.getChange(y1net, y4net);
    dbgStr += String.format("LT Net Growth : %.2f\t%.2f\t%.2f%n", gr, y1net, y4net);
    if (gr < 0.0) {
      this.zGrowth3Yr = Math.abs(Math.max(-35.0, gr));
      dbgStr += String.format("\tLT Net Growth - zGrowth3Yr : %.2f\t%.2f\n", this.zGrowth3Yr, gr);
    }
    this.zScore += this.zGrowth3Yr;

    /**
     * Working Capital
     */
    double ratio = 0.0;
    if (this.cdr.getCurrAssetsQdata().getMostRecent() > 0.0) {
      double tmp = this.cdr.getCurrLiabQdata().get(1) / this.cdr.getCurrAssetsQdata().getMostRecent();
      dbgStr += String.format("Working Capital : %.2f\t%.2f\t%.2f%n", tmp, this.cdr.getCurrLiabQdata().get(1),
          this.cdr.getCurrAssetsQdata().getMostRecent());
      if (tmp > 1.0) {
        ratio = tmp * 10.0;
        this.zWorkingCapital = Math.min(35.0, ratio);
        dbgStr += String.format("\tLT WC neg - zWorkingCapital : %.2f\t%.2f\n", this.zWorkingCapital, ratio);
      }
    }
    this.zScore += this.zWorkingCapital;

    return dbgStr;
  }

  public CompanyDerived getCd() {
    return this.cdr;
  }

  public double getzAdjInc() {
    return this.zAdjInc;
  }

  public double getzAdjScr() {
    return this.zAdjScr;
  }

  public double getzSales() {
    return this.zSales;
  }

  public double getzCash() {
    return this.zCash;
  }

  public double getzCashFlow() {
    return this.zCashFromOps;
  }

  public double getzDebt() {
    return this.zDebt;
  }

  public double getzDividend() {
    return this.zDividend;
  }

  public double getzIncome() {
    return this.zIncome;
  }

  public double getzKeepItRunning() {
    return this.zKeepItRunning;
  }

  public double getzNet() {
    return this.zNet;
  }

  public double getzEps() {
    return this.zEps;
  }

  public double getzScore() {
    return this.zScore;
  }

  public boolean iszIsZombie() {
    return this.zIsZombie;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {

    String ret = "";
    ret += ZData.TAB + "Zombie Score       : " + SipOutput.fmt(this.zScore, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Sales            : " + SipOutput.fmt(this.zSales, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Cash From Ops    : " + SipOutput.fmt(this.zCashFromOps, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Cash Flow        : " + SipOutput.fmt(this.zCashFlow, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Net              : " + SipOutput.fmt(this.zNet, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Eps Est          : " + SipOutput.fmt(this.zEps, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Equity           : " + SipOutput.fmt(this.zEquity, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Interest Rate    : " + SipOutput.fmt(this.zInterestRate, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  LtDebt to Equity : " + SipOutput.fmt(this.zLtDebtEquity, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Growth 3Yr       : " + SipOutput.fmt(this.zGrowth3Yr, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  WC               : " + SipOutput.fmt(this.zWorkingCapital, 13, 2) + ZData.NL;
    ret += dbgStr + ZData.NL;

    if (this.zIsZombie) {
      ret += ZData.TAB + "Is ZOMBIE!" + ZData.NL;
    }
    return ret;
  }

  public double getzInterestRate() {
    return zInterestRate;
  }

  public double getzLtDebtEquity() {
    return zLtDebtEquity;
  }

  public double getzGrowth3Yr() {
    return zGrowth3Yr;
  }

  public double getzWorkingCapital() {
    return zWorkingCapital;
  }

}
