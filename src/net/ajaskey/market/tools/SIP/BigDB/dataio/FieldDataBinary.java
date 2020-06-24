package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FieldDataBinary implements Serializable {

  private static final long serialVersionUID = 2600255321596652398L;

  public int             year;
  public int             quarter;
  public List<FieldData> fdList = null;

  /**
   * Constructor
   * 
   * @param yr
   * @param qtr
   */
  public FieldDataBinary(int yr, int qtr) {
    this.year = yr;
    this.quarter = qtr;
    fdList = new ArrayList<>();
  }

  /**
   * 
   */
  public void clearList() {
    fdList.clear();
  }

}
