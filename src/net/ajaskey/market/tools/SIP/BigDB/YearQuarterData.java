package net.ajaskey.market.tools.SIP.BigDB;

import net.ajaskey.common.Utils;

public class YearQuarterData {

  double[] year;
  double[] quarter;

  public YearQuarterData(double[] yearData, double[] qtrData) {
    this.year = yearData;
    this.quarter = qtrData;
  }

  @Override
  public String toString() {
    String ret = "";
    for (int i = 1; i < this.year.length; i++) {
      ret += String.format(" %.3f", this.year[i]);
    }
    ret += Utils.NL;
    for (int i = 1; i < this.quarter.length; i++) {
      ret += String.format(" %.3f", this.quarter[i]);
    }
    return ret;
  }
}
