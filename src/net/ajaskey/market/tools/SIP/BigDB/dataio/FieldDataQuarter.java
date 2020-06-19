package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.util.List;

public class FieldDataQuarter {

  // private List<String> companySummaryList = null;
  public List<FieldData> fieldDataList = null;
  private final int quarter;

  private final int year;

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
