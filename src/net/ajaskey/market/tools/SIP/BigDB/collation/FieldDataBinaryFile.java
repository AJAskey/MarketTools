package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.io.Serializable;
import java.util.List;

public class FieldDataBinaryFile implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -876446556689084155L;

  public List<FieldDataBinary> bigList;
  public int                   quarter;
  public int                   year;

  public FieldDataBinaryFile(int yr, int qtr, List<FieldDataBinary> list) {
    this.year = yr;
    this.quarter = qtr;
    this.bigList = list;
  }
}
