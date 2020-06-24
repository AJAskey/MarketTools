package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.io.Serializable;
import java.util.List;

public class FieldDataBinaryFile implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -876446556689084155L;

  public int                   year;
  public int                   quarter;
  public List<FieldDataBinary> bigList;

  public FieldDataBinaryFile(int yr, int qtr, List<FieldDataBinary> list) {
    year = yr;
    quarter = qtr;
    bigList = list;
  }
}
