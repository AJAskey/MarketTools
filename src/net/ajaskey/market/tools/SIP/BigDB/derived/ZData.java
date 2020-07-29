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

  private CompanyDerived cd;
  private double         zAdjInc;
  private double         zAdjScr;
  private double         zCash;
  private double         zCashFlow;
  private double         zDebt;
  private double         zDividend;
  private double         zEquity;
  private double         zIncome;
  private boolean        zIsZombie;
  private double         zKeepItRunning;
  private double         zNet;
  private double         zSales;
  private double         zScore;

  /**
   * This method serves as a constructor for the class.
   *
   */
  public ZData(CompanyDerived cd) {

    this.cd = cd;
    this.zCashFlow = 0.0;
    this.zSales = 0.0;
    this.zNet = 0.0;
    this.zEquity = 0.0;

    this.zIncome = 0.0;
    this.zAdjInc = 0.0;
    this.zDividend = 0.0;
    this.zCash = 0.0;
    this.zDebt = 0.0;
    this.zScore = 0.0;
    this.zAdjScr = 0.0;
    this.zKeepItRunning = 0.0;
    this.zIsZombie = false;

    this.calc();
  }

  /**
   * Calculates the Zombie Score
   */
  private void calc() {

    /**
     * Cash Flow
     */
    if (this.cd.getCashFromOpsQdata().getMostRecent() < 0.0) {
      this.zCashFlow += 17.5;
    }
    if (this.cd.getWcFcfQdata().get(1) < 0.0) {
      this.zCashFlow += 17.5;
    }
    this.zScore += this.zCashFlow;

    /**
     * Sales
     */
    if (this.cd.getSalesQdata().getTtm() < 0.0) {
      this.zSales += 35.0;
    }
    else {
      if (this.cd.getSalesQdata().getQoQ() < 0.0) {
        this.zSales += Math.abs(Math.max(-17.5, this.cd.getSalesQdata().getQoQ()));
      }
      if (this.cd.getSalesQdata().getYoY() < 0.0) {
        this.zSales += Math.abs(Math.max(-17.5, this.cd.getSalesQdata().getYoY()));
      }
    }
    this.zScore += this.zSales;

    /**
     * Net income
     */
    if (this.cd.getNetIncQdata().getTtm() < 0.0) {
      this.zNet += 35.0;
    }
    else {
      if (this.cd.getNetIncQdata().getQoQ() < 0.0) {
        this.zNet += Math.abs(Math.max(-17.5, this.cd.getNetIncQdata().getQoQ()));
      }
      if (this.cd.getNetIncQdata().getYoY() < 0.0) {
        this.zNet += Math.abs(Math.max(-17.5, this.cd.getNetIncQdata().getYoY()));
      }
    }
    this.zScore += this.zNet;

    /**
     * Equity
     */
    if (this.cd.getEquityQdata().getMostRecent() < 0.0) {
      this.zEquity += 35.0;
    }
    else {
      if (this.cd.getEquityQdata().getQoQ() < 0.0) {
        this.zEquity += Math.abs(Math.max(-17.5, this.cd.getEquityQdata().getQoQ()));
      }
      if (this.cd.getEquityQdata().getYoY() < 0.0) {
        this.zEquity += Math.abs(Math.max(-17.5, this.cd.getEquityQdata().getYoY()));
      }
    }
    this.zScore += this.zEquity;

  }

  public CompanyDerived getCd() {
    return this.cd;
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
    return this.zCashFlow;
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
    ret += ZData.TAB + "Zombie Score      : " + SipOutput.fmt(this.zScore, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Cash Flow       : " + SipOutput.fmt(this.zCashFlow, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Sales           : " + SipOutput.fmt(this.zSales, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Net             : " + SipOutput.fmt(this.zNet, 13, 2) + ZData.NL;
    ret += ZData.TAB + "  Equity          : " + SipOutput.fmt(this.zEquity, 13, 2) + ZData.NL;

    if (this.zIsZombie) {
      ret += ZData.TAB + "Is ZOMBIE!" + ZData.NL;
    }
    return ret;
  }

}
