package net.ajaskey.market.tools.SIP.BigDB;

import net.ajaskey.common.Utils;

public class YearQuarterData {

  double[] year;
  double[] quarter;

  public YearQuarterData(double[] yearData, double[] qtrData) {
    year = yearData;
    quarter = qtrData;
  }

  @Override
  public String toString() {
    String ret = "";
    for (int i = 1; i < year.length; i++) {
      ret += String.format(" %.3f", year[i]);
    }
    ret += Utils.NL;
    for (int i = 1; i < quarter.length; i++) {
      ret += String.format(" %.3f", quarter[i]);
    }
    return ret;
  }
}
