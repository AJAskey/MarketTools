package net.ajaskey.market.tools.SIP;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SipOutput {

  public static String SipHeader(String ticker, String name, String exch, String sec, String ind) {
    return String.format("%-10s\t%-40s\t%-20s\t%-40s\t%-1s%n", ticker, name, exch, sec, ind);
  }

  public static String buildArray(String desc, double[] values, int len, int digits) {
    String ret = desc;
    for (int i = 0; i < values.length; i++) {
      String sfmt = SipOutput.fmt(values[i], len, digits);
      ret += String.format(" %s", sfmt);
    }
    return ret;
  }

  public static String buildArray(String desc, double[] values, int len, int digits, int slide) {
    String ret = desc;
    for (int i = slide; i < values.length; i++) {
      String sfmt = SipOutput.fmt(values[i], len, digits);
      ret += String.format(" %s", sfmt);
    }
    return ret;
  }

  private final static String               digitfmt             = String.format("#,###,##0.");
  private final static DecimalFormat        dfmt                 = new DecimalFormat("#,###");
  private final static DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();

  /**
   * 
   * @param i
   * @param len
   * @return
   */
  public static String ifmt(final int i, final int len) {

    return ifmt((long) i, len);
  }

  /**
   * 
   * @param i
   * @param len
   * @return
   */
  public static String ifmt(final long i, final int len) {

    final String s = dfmt.format(i);
    final String sfmt = String.format("%%%ds", len);

    return String.format(sfmt, s);
  }

  /**
   * 
   * @param d
   * @param len
   * @param decimal
   * @return
   */
  public static String fmt(final double d, final int len, int decimal) {

    String digfmt = digitfmt;
    if (decimal > 0) {
      for (int i = 0; i < decimal; i++) {
        digfmt += "0";
      }
    }
    else {
      String tmp = digitfmt.substring(0, digitfmt.length() - 1);
      digfmt = tmp;
    }

    DecimalFormat df = new DecimalFormat(digfmt, decimalFormatSymbols);

    final String sfmt = String.format("%%%ds", len);
    return String.format(sfmt, df.format(d));
  }

}
