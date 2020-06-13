package net.ajaskey.market.tools.options;

import java.util.Comparator;

public class SortByStrike implements Comparator<ExpiryData>

{

  @Override
  public int compare(ExpiryData ex0, ExpiryData ex1) {
    int ret = 0;
    if (ex0.getStrike() < ex1.getStrike()) {
      ret = -1;
    }
    else if (ex0.getStrike() > ex1.getStrike()) {
      ret = 1;
    }
    return ret;
  }

}
