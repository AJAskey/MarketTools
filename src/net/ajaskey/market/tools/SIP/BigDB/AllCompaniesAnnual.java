package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

public class AllCompaniesAnnual {

  public int             year;
  public List<FieldData> q1 = new ArrayList<>();
  public List<FieldData> q2 = new ArrayList<>();
  public List<FieldData> q3 = new ArrayList<>();
  public List<FieldData> q4 = new ArrayList<>();

  public void setQuarter(List<FieldData> fdList) {
    int qtr = fdList.get(0).getQuarter();

    if (qtr == 1) {
      q1 = fdList;
    }
    else if (qtr == 2) {
      q2 = fdList;
    }
    else if (qtr == 3) {
      q3 = fdList;
    }
    else if (qtr == 4) {
      q4 = fdList;
    }
  }

}
