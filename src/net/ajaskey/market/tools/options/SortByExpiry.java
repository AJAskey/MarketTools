package net.ajaskey.market.tools.options;

import java.util.Comparator;

public class SortByExpiry implements Comparator<ExpiryData>

{

  @Override
  public int compare(ExpiryData ex0, ExpiryData ex1) {
    int ret = 0;
    if (ex0.getExpiry().isLessThan(ex1.getExpiry())) {
      ret = 1;
    }
    else if (ex0.getExpiry().isGreaterThan(ex1.getExpiry())) {
      ret = -1;
    }
    return ret;
  }

}
