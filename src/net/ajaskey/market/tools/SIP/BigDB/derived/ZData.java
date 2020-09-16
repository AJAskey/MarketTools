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

public class ZData {

  private final CompanyDerived cdr;
  private String               dbgStr;
  private final double         zAdjInc;
  private final double         zAdjScr;
  private final double         zCash;
  private double               zCashFlow;
  private double               zCashFromOps;
  private double               zDebt;
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
    ret += Utils.TAB + "Zombie Score        : " + SipOutput.fmt(this.zScore, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  *Working Capital  : " + SipOutput.fmt(this.zWorkingCapital, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  *Debt             : " + SipOutput.fmt(this.zDebt, 13, 2) + Utils.NL;
    ret += Utils.TAB + "  *Interest Rate    : " + SipOutput.fmt(this.zInterestRate, 13, 2) + Utils.NL;
    ret += Utils.TAB + "   Cash Flow        : " + SipOutput.fmt(this.zCashFlow, 13, 2) + Utils.NL;
    ret += Utils.TAB + "   Sales            : " + SipOutput.fmt(this.zSales, 13, 2) + Utils.NL;
    ret += Utils.TAB + "   Net              : " + SipOutput.fmt(this.zNet, 13, 2) + Utils.NL;
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

    /**
     * Debug
     */
    if (this.cdr.getFd().getTicker().equalsIgnoreCase("ICPT")) {
      System.out.println();
    }

    this.dbgStr = Utils.NL + this.cdr.getFd().getTicker() + Utils.NL;

    final double MAXVAL = 9999999.99;

    double qtr;
    double ttm;
    double seq;
    double score;
    double tmp;
    double ratio;

    double salesTtm = this.cdr.getSalesQdata().getTtm();
    double salesQtr = this.cdr.getSalesQdata().getMostRecent();
    double currAssets = this.cdr.getCurrAssetsQdata().getMostRecent();
    double currLiab = this.cdr.getCurrLiabQdata().getMostRecent();
    double cashFromOpsTtm = this.cdr.getCashFromOpsQdata().getTtm();

    this.dbgStr += String.format(" Sales Q/12       :\t%.2f\t%.2f%n", salesQtr, salesTtm);
    this.dbgStr += String.format(" Curr Assets Liab :\t%.2f\t%.2f\t%.2f%n", currAssets, currLiab, (currAssets - currLiab));
    this.dbgStr += String.format(" CashFromOpsTtm   :\t%.2f%n", cashFromOpsTtm);

    /**
     * 
     * Major Zombie factors worth 100.0 points each
     * 
     */

    /**
     * Working Capital
     */
    if (currAssets > 0.0) {
      ratio = currLiab / currAssets;
      this.dbgStr += String.format("Working Capital : %.2f\t%.2f\t%.2f%n", ratio, currLiab, currAssets);
      if (ratio > 1.0) {
        if (cashFromOpsTtm > 0.0) {
          tmp = currAssets - currLiab + cashFromOpsTtm;
          if (tmp <= 0.0) {
            score = (1.0 - (cashFromOpsTtm / Math.abs(currAssets - currLiab))) * 100.0;
            this.zWorkingCapital = Math.min(100.0, score);
            this.dbgStr += String.format("\tWC neg with not enough CashFromOps - zWorkingCapital : %.2f\t%.2f\t%.2f\n", this.zWorkingCapital, tmp,
                score);
          }
          else {
            score = Math.abs(currAssets - currLiab) / cashFromOpsTtm * 50.0;
            this.zWorkingCapital = Math.min(100.0, score);
            this.dbgStr += String.format("\tWC neg with enough CashFromOps - zWorkingCapital : %.2f\t%.2f\n", this.zWorkingCapital, score);
          }
        }
        else {
          // score = ratio * 100.0;
          this.zWorkingCapital = 100.0;
          this.dbgStr += String.format("\tWC neg no CashFromOps - zWorkingCapital : %.2f\n", this.zWorkingCapital);
        }
      }
    }
    else {
      this.zWorkingCapital = 100.0;
      this.dbgStr += String.format("\tWC with CurrAssets neg - zWorkingCapital : %.2f\t%.2f\n", this.zWorkingCapital, currAssets);
    }
    this.zScore += this.zWorkingCapital;

    /**
     * Debt
     */
    double ltDebt = this.cdr.getLtDebtQdata().getMostRecent();
    double stDebt = this.cdr.getStDebtQdata().getMostRecent();
    double totDebt = ltDebt + stDebt;
    double ta = this.cdr.getTanAssetsQdata().getMostRecent();
    double equity = this.cdr.getEquityQdata().getMostRecent();
    double debtToTa = 0.0;
    double debtToSales = 0.0;
    double debtToEquity = 0.0;
    if (ta > 0.0) {
      debtToTa = totDebt / ta;
    }
    if (salesTtm > 0.0) {
      debtToSales = totDebt / salesTtm;
    }
    if (equity > 0.0) {
      debtToEquity = totDebt / equity;
    }

    this.dbgStr += String.format("Debt ST/LT/Tot    :\t%.2f\t%.2f\t%.2f%n", stDebt, ltDebt, totDebt);
    this.dbgStr += String.format(" TanAssets        :\t%.2f%n", ta);
    this.dbgStr += String.format(" D/Eq D/TA D/S    :\t%.2f\t%.2f\t%.2f%n", debtToEquity, debtToTa, debtToSales);

    if (equity > 0.0) {
      tmp = 0.0;
      if (debtToEquity > 1.0) {
        tmp = POW(2.5, debtToEquity, MAXVAL);
        score = MIN(100.0, tmp);
        this.zDebt = score;
      }
      this.dbgStr += String.format("\tDebt To Equity - zDebt : %.2f\t%.2f\n", this.zDebt, tmp);
    }
    else if (ta > 0.0) {
      tmp = 25.0;
      tmp += POW(2.0, debtToTa, MAXVAL);
      score = MIN(100.0, tmp);
      this.zDebt = score;
      this.dbgStr += String.format("\tDebt To Tangible Assets - zDebt : %.2f\t%.2f\n", this.zDebt, tmp);
    }
    else if (salesTtm > 0.0) {
      tmp = 50.0;
      tmp += POW(2.0, debtToSales, MAXVAL);
      score = MIN(100.0, tmp);
      this.zDebt = score;
      this.dbgStr += String.format("\tDebt To Sales - zDebt : %.2f\t%.2f\n", this.zDebt, tmp);
    }
    else if (totDebt > 0.0) {
      this.zDebt = 100.0;
      this.dbgStr += String.format("\tDebt without backup - zDebt : %.2f\n", this.zDebt);
    }
    this.zScore += this.zDebt;

    /**
     * Interest Rate
     */
    double totDebtPrev = this.cdr.getLtDebtQdata().get(2) + this.cdr.getStDebtQdata().get(2);
    double intRate = this.cdr.getCurrInterestRate();
    double totInterest = totDebtPrev * intRate;
    double intToSales = 0.0;
    if (salesTtm > 0.0) {
      intToSales = totInterest / salesTtm * 100.0;
    }
    this.dbgStr += String.format("Interest          :\t%.2f\t%.2f\t%.2f%n", totDebtPrev, intRate * 100.0, totInterest);
    this.dbgStr += String.format(" Int to Sales     :\t%.2f%n", intToSales);
    tmp = 0.0;
    if (intRate > 0.035) {

      tmp = POW(1.8, (intRate * 100.0), MAXVAL);
      this.zInterestRate += MIN(50.0, tmp);
      this.dbgStr += String.format("\tInterest - zInterestRate : %.2f\t%.2f\n", this.zInterestRate, tmp);
    }
    if (intToSales > 0.0) {
      tmp = POW(2.0, intToSales, MAXVAL);
      this.zInterestRate += MIN(50.0, tmp);
      this.dbgStr += String.format("\tInterest to Sales - zInterestRate : %.2f\t%.2f\n", this.zInterestRate, tmp);
    }
    this.zScore += this.zInterestRate;

    /**
     * Minor Zombie factors worth 20.0 points each
     */

    final double minorMax = -10.0;

    /**
     * Cash Flow
     */
    ttm = this.cdr.getCashflowQdata().getTtm();
    this.dbgStr += SipOutput.buildArray("Cash Flow ", this.cdr.getCashflowQdata().dArr, 10, 2) + Utils.NL;
    this.dbgStr += String.format("\tCash Flow TTM : %.2f\n", ttm);
    if (ttm <= 0.0) {
      this.zCashFlow += minorMax * (-2.0);
      this.dbgStr += String.format("\tTTM CashFlow neg - zCashFlow : %.2f\n", this.zCashFlow);
    }
    this.zScore += this.zCashFlow;

    /**
     * Sales
     */
    qtr = this.cdr.getSalesQdata().getQoQ();
    ttm = this.cdr.getSalesQdata().getYoY();
    this.dbgStr += SipOutput.buildArray("Sales         ", this.cdr.getSalesQdata().dArr, 10, 2) + Utils.NL;
    this.dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    this.dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, this.cdr.getSalesQdata().getTtm(), this.cdr.getSalesQdata().getPrevTtm());
    if (qtr < 0.0) {
      this.zSales += Math.abs(Math.max(minorMax, qtr));
      this.dbgStr += String.format("\tMost recent Sales QoQ growth neg - zSales : %.2f\t%.2f\n", this.zSales, qtr);
    }
    if (ttm < 0.0) {
      this.zSales += Math.abs(Math.max(minorMax, ttm));
      this.dbgStr += String.format("\tMost recent Sales YoY growth neg - zSales : %.2f\t%.2f\n", this.zSales, ttm);
    }
    this.zScore += this.zSales;

    /**
     * Net income
     */
    this.dbgStr += SipOutput.buildArray("Net Income ", this.cdr.getNetIncQdata().dArr, 10, 2) + Utils.NL;
    qtr = this.cdr.getNetIncQdata().getQoQ();
    ttm = this.cdr.getNetIncQdata().getYoY();
    this.dbgStr += String.format("\tQoQ : %.2f%%%n", qtr);
    this.dbgStr += String.format("\tYoY : %.2f%%\t%.2f\t%.2f%n", ttm, this.cdr.getNetIncQdata().getTtm(), this.cdr.getNetIncQdata().getPrevTtm());
    if (qtr < 0.0) {
      this.zNet += Math.abs(Math.max(minorMax, qtr));
      this.dbgStr += String.format("\tMost recent QoQ Net Income growth neg - zNet : %.2f\t%.2f\n", this.zNet, qtr);
    }
    if (ttm < 0.0) {
      this.zNet += Math.abs(Math.max(minorMax, ttm));
      this.dbgStr += String.format("\tMost recent YoY Net Income growth neg - zNet : %.2f\t%.2f\n", this.zNet, ttm);
    }
    this.zScore += this.zNet;

    return this.dbgStr;
  }

  /**
   * 
   * @param d
   * @param e
   * @param Maxval
   * @return
   */
  private double POW(double d, double e, double Maxval) {
    double tmp = MIN(Math.pow(d, e), Maxval);
    return tmp;
  }

  /**
   * 
   * @param bound
   * @param val
   * @return
   */
  private double MIN(double bound, double val) {
    return Math.min(bound, val);
  }

  public double getzTangibleAssets() {
    return zTangibleAssets;
  }

}
