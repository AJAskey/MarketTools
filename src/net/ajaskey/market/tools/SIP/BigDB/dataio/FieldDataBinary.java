package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FieldDataBinary implements Serializable {

  private static final long serialVersionUID = 2600255321596652398L;

  public List<FieldData> fdList = null;
  public int             quarter;
  public int             year;

  /**
   * Constructor
   *
   * @param yr
   * @param qtr
   */
  public FieldDataBinary(int yr, int qtr) {
    this.year = yr;
    this.quarter = qtr;
    this.fdList = new ArrayList<>();
  }

  /**
   *
   */
  public void clearList() {
    this.fdList.clear();
  }

}
