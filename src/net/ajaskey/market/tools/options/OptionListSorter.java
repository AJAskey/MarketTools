package net.ajaskey.market.tools.options;

import java.util.Comparator;

public class OptionListSorter implements Comparator<OptionFindCombos> {

  @Override
  public int compare(OptionFindCombos opt1, OptionFindCombos opt2) {
    int ret = 1;
    if (opt1.profit > opt2.profit) {
      ret = -1;
    }
    return ret;
  }
}
