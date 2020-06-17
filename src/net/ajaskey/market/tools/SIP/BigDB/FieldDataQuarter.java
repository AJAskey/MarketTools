package net.ajaskey.market.tools.SIP.BigDB;

import java.util.List;

public class FieldDataQuarter {

  private final int year;
  private final int quarter;

  // private List<String> companySummaryList = null;
  public List<FieldData> fieldDataList = null;

  public FieldDataQuarter(int yr, int qtr, List<FieldData> fdl) {
    this.year = yr;
    this.quarter = qtr;
    this.fieldDataList = fdl;
  }

  public int getQuarter() {
    return this.quarter;
  }

  public int getYear() {
    return this.year;
  }

}
