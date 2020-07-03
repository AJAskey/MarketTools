package net.ajaskey.market.tools.SIP.BigDB.derived;

import java.util.ArrayList;
import java.util.List;

public class CompanyDerivedData {

  public List<CompanyDerived> dList;

  public int quarter;
  public int year;

  public CompanyDerivedData(int yr, int qtr) {
    this.year = yr;
    this.quarter = qtr;
    this.dList = new ArrayList<>();
  }

}
