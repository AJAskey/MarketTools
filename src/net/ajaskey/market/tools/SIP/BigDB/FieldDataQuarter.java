package net.ajaskey.market.tools.SIP.BigDB;

import java.util.List;

public class FieldDataQuarter {

  private int year;
  private int quarter;

  public FieldDataQuarter(int yr, int qtr, List<FieldData> fdl) {
    this.year = yr;
    this.quarter = qtr;
    this.fieldDataList = fdl;
  }

  private List<String>   companySummaryList = null;
  public List<FieldData> fieldDataList      = null;

}
