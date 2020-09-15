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
import net.ajaskey.market.tools.SIP.BigDB.MarketTools;

public class ZData {

  private final CompanyDerived cdr;
  private String               dbgStr;
  private final double         zAdjInc;
  private final double         zAdjScr;
  private final double         zCash;
  private double               zCashFlow;
  private double               zCashFromOps;
  private final double         zDebt;
  private final double         zDividend;
  private double               zEps;
  private double               zEquity;
  private double               zGrowth3Yr;
  private final double         zIncome;
  private double               zInterestRate;
  private final boolean        zIsZombie;
  private final double         zKeepItRunning;
  private double               zLtDebtEquity;
  private double               zNet;
  private double               zSales;
  private double               zScore;
  private double               zWorkingCapital;
  private double               zTangibleAssets;

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
    this.zTangibleAssets = 0.0;

    this.dbgStr = this.calc();
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

  public double getzEps() {
    return this.zEps;
  }

  public double getzGrowth3Yr() {
    return this.zGrowth3Yr;
  }

  public double getzIncome() {
    return this.zIncome;
  }

  public double getzInterestRate() {
    return this.zInterestRate;
  }

  public double getzKeepItRunning() {
    return this.zKeepItRunning;
  }

  public double getzLtDebtEquity() {
    return this.zLtDebtEquity;
  }

  public double getzNet() {
    return this.zNet;
  }

  public double getzSales() {
    return this.zSales;
  }

  public double getzScore() {
    return this.zScore;
  }

  public double getzWorkingCapital() {
    return this.zWorkingCapital;
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
    ret += Utils.TAB + "Zombie Score       : " + SipOutput.fmt(this.zScore, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Sales            : " + SipOutput.fmt(this.zSales, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Cash From Ops    : " + SipOutput.fmt(this.zCashFromOps, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Cash Flow        : " + SipOutput.fmt(this.zCashFlow, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Interest Rate    : " + SipOutput.fmt(this.zInterestRate, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Net              : " + SipOutput.fmt(this.zNet, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  EPS Est          : " + SipOutput.fmt(this.zEps, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Net Growth 3Yr   : " + SipOutput.fmt(this.zGrowth3Yr, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Equity           : " + SipOutput.fmt(this.zEquity, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  LtDebt to Equity : " + SipOutput.fmt(this.zLtDebtEquity, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Tangible Assets  : " + SipOutput.fmt(this.zTangibleAssets, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  Working Capital  : " + SipOutput.fmt(this.zWorkingCapital, 13, 2) + Utils.NL;
    // ret += this.dbgStr + Utils.NL;

    if (this.zIsZombie) {
      ret += Utils.TAB + "Is ZOMBIE!" + Utils.NL;
    }
    return ret;
  }

  /**
   * Calculates the Zombie Score
   */
  private String calc() {

    this.dbgStr = Utils.NL + this.cdr.getFd().getTicker() + Utils.NL;

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
    this.dbgStr += SipOutput.buildArray("Sales         ", this.cdr.getSalesQdata().dArr, 10, 2) + Utils.NL;
    this.dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    this.dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, this.cdr.getSalesQdata().getTtm(), this.cdr.getSalesQdata().getPrevTtm());
    if (qtr < 0.0) {
      this.zSales += Math.abs(Math.max(-10.0, qtr));
      this.dbgStr += String.format("\tMost recent Sales QoQ growth neg - zSales : %.2f\t%.2f\n", this.zSales, qtr);
    }
    else {
      this.zSales -= Math.min(15.0, qtr);
      this.dbgStr += String.format("\tMost recent Sales QoQ growth pos - zSales : %.2f\t%.2f\n", this.zSales, qtr);
    }
    if (ttm < 0.0) {
      this.zSales += Math.abs(Math.max(-10.0, ttm));
      this.dbgStr += String.format("\tMost recent Sales YoY growth neg - zSales : %.2f\t%.2f\n", this.zSales, ttm);
    }
    else {
      this.zSales -= Math.min(15.0, ttm);
      this.dbgStr += String.format("\tMost recent Sales YoY growth pos - zSales : %.2f\t%.2f\n", this.zSales, ttm);
    }
    this.zScore += this.zSales;

    /**
     * Cash from Ops
     */
    this.dbgStr += SipOutput.buildArray("Cash From Ops ", this.cdr.getCashFromOpsQdata().dArr, 10, 2) + Utils.NL;
    ttm = this.cdr.getCashFromOpsQdata().getTtm();
    if (ttm < 0.0) {
      this.zCashFromOps += 35.0;
      this.dbgStr += String.format("\tTTM Cash From Ops neg adding 35.0 - zNet : %.2f\t%.2f\n", this.zCashFromOps, ttm);
    }
    else {
      qtr = this.cdr.getCashFromOpsQdata().getQoQ();
      ttm = this.cdr.getCashFromOpsQdata().getYoY();
      this.dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
      this.dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, this.cdr.getCashFromOpsQdata().getTtm(),
          this.cdr.getCashFromOpsQdata().getPrevTtm());
      if (qtr < 0.0) {
        this.zCashFromOps += Math.abs(Math.max(-10.0, qtr));
        this.dbgStr += String.format("\tMost recent QoQ CashFromOps growth neg - zCashFromOps : %.2f\t%.2f\n", this.zCashFromOps, qtr);
      }
      if (ttm < 0.0) {
        this.zCashFromOps += Math.abs(Math.max(-10.0, ttm));
        this.dbgStr += String.format("\tMost recent YoY CashFromOps growth neg - zCashFromOps : %.2f\t%.2f\n", this.zCashFromOps, ttm);
      }

//      if (this.cdr.getFcfQdata().getMostRecent() < 0.0) {
//        this.zCashFromOps += 10.0;
//        this.dbgStr += String.format("\tFCF neg adding 10 - zCashFromOps : %.2f\t%.2f\n", this.zCashFromOps, this.cdr.getFcfQdata().getMostRecent());
//      }
    }
    this.zScore += this.zCashFromOps;

    /**
     * Cash Flow
     */
    ttm = this.cdr.getCashflowQdata().getTtm();
    this.dbgStr += SipOutput.buildArray("Cash Flow ", this.cdr.getCashflowQdata().dArr, 10, 2) + Utils.NL;
    this.dbgStr += String.format("\tCash Flow TTM : %.2f\n", ttm);
    if (ttm < 0.0) {
      double ratio = Math.abs(ttm / this.cdr.getSalesQdata().getTtm() * 100.0) + 15.0;
      this.zCashFlow += Math.min(35, ratio);
      this.dbgStr += String.format("\tTTM CashFlow neg - zCashFlow : %.2f\t%.2f\t%.2f\n", this.zCashFlow, ratio, this.cdr.getSalesQdata().getTtm());
    }
    this.zScore += this.zCashFlow;

    /**
     * Net income
     */
    this.dbgStr += SipOutput.buildArray("Net Income ", this.cdr.getNetIncQdata().dArr, 10, 2) + Utils.NL;
    qtr = this.cdr.getNetIncQdata().getQoQ();
    ttm = this.cdr.getNetIncQdata().getYoY();
    this.dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    this.dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, this.cdr.getNetIncQdata().getTtm(), this.cdr.getNetIncQdata().getPrevTtm());
    if (qtr < 0.0) {
      this.zNet += Math.abs(Math.max(-17.5, qtr));
      this.dbgStr += String.format("\tMost recent QoQ Net Income growth neg - zNet : %.2f\t%.2f\n", this.zNet, qtr);
    }
    if (ttm < 0.0) {
      this.zNet += Math.abs(Math.max(-17.5, ttm));
      this.dbgStr += String.format("\tMost recent YoY Net Income growth neg - zNet : %.2f\t%.2f\n", this.zNet, ttm);
    }
    this.zScore += this.zNet;

    /**
     * Equity
     */
    seq = this.cdr.getEquityQdata().getQseqQ();
    this.dbgStr += SipOutput.buildArray("Equity ", this.cdr.getEquityQdata().dArr, 10, 2) + Utils.NL;
    this.dbgStr += String.format("\tQtoQ : %.2f%%%n", seq);
    if (this.cdr.getEquityQdata().getMostRecent() <= 0.0) {
      if (seq > 0.0) {
        this.zEquity += 25.0;
        this.dbgStr += String.format("\tEquity neg - zEquity : %.2f\n", this.zEquity);

      }
      else {
        this.zEquity += 35.0;
        this.dbgStr += String.format("\tEquity neg and Most recent growth neg - zEquity : %.2f\n", this.zEquity);
      }
      if (this.cdr.getLtDebtQdata().getMostRecent() > 0.0) {
        this.zLtDebtEquity = 25.0;
        this.dbgStr += String.format("\tLT Debt to Zero Equity - zLtDebtEquity : %.2f\n", this.zLtDebtEquity);
      }
    }
    else {
      if (seq < 0.0) {
        this.zEquity += Math.abs(Math.max(-25.0, seq));
        this.dbgStr += String.format("\tEquity Most recent growth neg - zEquity : %.2f\t%.2f\n", this.zEquity, seq);
      }

      final double ltDtoE = this.cdr.getLtDebtQdata().getMostRecent() / this.cdr.getEquityQdata().getMostRecent();
      this.dbgStr += SipOutput.buildArray("LT Debt ", this.cdr.getLtDebtQdata().dArr, 10, 2) + Utils.NL;
      if (ltDtoE > 1.0) {
        final double tmp = ltDtoE * 5.0;
        this.zLtDebtEquity = Math.min(35.0, tmp);
        this.dbgStr += String.format("\tLT Debt to Equity - zLtDebtEquity : %.2f\t%.2f\n", this.zLtDebtEquity, tmp);
      }
    }
    this.zScore += this.zEquity + this.zLtDebtEquity;

    /**
     * EPS Estimate Q0 Growth
     */
    qtr = this.cdr.getEpsEstQ0Growth();
    this.dbgStr += String.format("EPS Growth Est : %.2f%n", qtr);
    if (qtr < 0.0) {
      this.zEps += Math.abs(Math.max(-20.0, qtr));
      this.dbgStr += String.format("\tEPS Growth neg - zEPS : %.2f\t%.2f\t%.2f\t%.2f\n", this.zEps, qtr, this.cdr.getEpsEstQ0(),
          this.cdr.getEpsDilContQdata().get(4));
    }
    this.zScore += this.zEps;

    /**
     * Interest Rate
     */
    qtr = this.cdr.getCurrInterestRate() * 100.0;
    this.dbgStr += String.format("Interest Rate : %.2f%n", qtr);
    if (qtr > 2.99) {
      final double tmp = (qtr * 3.5) - qtr;
      this.zInterestRate = Math.min(35.0, tmp);
      final double totDebt = this.cdr.getLtDebtQdata().get(2) + this.cdr.getStDebtQdata().get(2);
      this.dbgStr += String.format("\tHigh Interest Rate - zInterestRate : %.2f\t%.2f\t%.2f\t%.2f%n", this.zInterestRate, tmp, totDebt,
          this.cdr.getIntTotQdata().getTtm());
    }
    this.zScore += this.zInterestRate;

    /**
     *
     * Growth
     */
    final double y1net = this.cdr.getFd().getIncSheetData().getNetIncYr()[1];
    final double y3net = this.cdr.getFd().getIncSheetData().getNetIncYr()[3];
    final double gr = MarketTools.getChange(y1net, y3net);
    this.dbgStr += String.format("LT Net Growth : %.2f\t%.2f\t%.2f%n", gr, y1net, y3net);
    this.dbgStr += SipOutput.buildArray("\tAnnual Net ", this.cdr.getFd().getIncSheetData().getNetIncYr(), 10, 2) + Utils.NL;
    if (gr < 0.0) {
      this.zGrowth3Yr = Math.abs(Math.max(-25.0, gr));
      this.dbgStr += String.format("\tLT Net Growth - zGrowth3Yr : %.2f\t%.2f\n", this.zGrowth3Yr, gr);
    }
    this.zScore += this.zGrowth3Yr;

    /**
     * Working Capital
     */
    double ratio = 0.0;
    if (this.cdr.getCurrAssetsQdata().getMostRecent() > 0.0) {
      final double tmp = this.cdr.getCurrLiabQdata().getMostRecent() / this.cdr.getCurrAssetsQdata().getMostRecent();
      this.dbgStr += String.format("Working Capital : %.2f\t%.2f\t%.2f%n", tmp, this.cdr.getCurrLiabQdata().getMostRecent(),
          this.cdr.getCurrAssetsQdata().getMostRecent());
      if (tmp > 1.0) {
        ratio = 15.0 + (tmp * 10.0);
        this.zWorkingCapital = Math.min(35.0, ratio);
        this.dbgStr += String.format("\tWC neg - zWorkingCapital : %.2f\t%.2f\n", this.zWorkingCapital, ratio);
      }
    }
    this.zScore += this.zWorkingCapital;

    /**
     * Tangible Assets
     */
    double ta = this.cdr.getTanAssetsQdata().getQseqQ();
    this.dbgStr += String.format("Tangible Asset Growth : %.2f%n", ta);
    if (ta < 0.0) {
      this.zTangibleAssets = Math.abs(Math.max(-35.0, ta));
      this.dbgStr += String.format("\tTangible Asset growth neg - zTangibleAssets : %.2f\t%.2f\n", this.zTangibleAssets, ta);
    }
    this.zScore += this.zTangibleAssets;

    return this.dbgStr;
  }

  public double getzTangibleAssets() {
    return zTangibleAssets;
  }

}
