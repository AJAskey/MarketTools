package net.ajaskey.market.tools.SIP.BigDB.reports.utils;

public class Utilities {

  public static String cleanSecInd(String secInd) {
    int idx = secInd.indexOf("-");
    String ret = secInd.trim();
    if (idx > 0) {
      ret = secInd.substring(idx + 1).trim();
    }
    return ret.replace(",", ";");
  }

}
