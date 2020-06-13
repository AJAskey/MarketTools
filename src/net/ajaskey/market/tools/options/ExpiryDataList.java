package net.ajaskey.market.tools.options;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;

public class ExpiryDataList {

  public DateTime         expiry;
  public double           ul;
  public List<ExpiryData> exList;

  public ExpiryDataList(DateTime ex, double ul) {
    this.expiry = new DateTime(ex);
    this.ul = ul;
    this.exList = new ArrayList<>();
  }

}
