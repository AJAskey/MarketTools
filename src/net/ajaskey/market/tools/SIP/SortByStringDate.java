package net.ajaskey.market.tools.SIP;

import java.util.Comparator;

import net.ajaskey.common.DateTime;

public class SortByStringDate implements Comparator<String> {

  @Override
  public int compare(String sDate1, String sDate2) {
    String fld1[] = sDate1.split("_");
    String fld2[] = sDate2.split("_");
    DateTime d1 = new DateTime(fld1[0].trim(), "MMM-yyyy");
    DateTime d2 = new DateTime(fld2[0].trim(), "MMM-yyyy");

    int ret = 0;
    if (d1.isLessThan(d2)) {
      ret = 1;
    } else if (d1.isGreaterThan(d2)) {
      ret = -1;
    }

    return ret;
  }

}
