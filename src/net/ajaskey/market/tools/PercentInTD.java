
package net.ajaskey.market.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.market.optuma.PriceData;
import net.ajaskey.market.optuma.TickerPriceData;

public class PercentInTD {

  static SimpleDateFormat sdftime  = new SimpleDateFormat("dd-MMM-yyyy:HHmmss");
  static DateTime         startDay = null;
  static DateTime         endDay   = null;
  static final long       vol      = 105600000;

  public static void main(String[] args) throws IOException {
    //
    DateTime now = new DateTime();
    //
    final String header = "\tMT\t\t\tDay Gone\t\tVol\t\tVolGuess\tVolChg\t10dmaVol";
    //
    File f = new File("out/volume-check.txt");
    if (!f.exists()) {
      try (PrintWriter pw = new PrintWriter(f)) {
        pw.println(header);
      }
    }
    //
    try (FileWriter fw = new FileWriter("out/volume-check.txt", true); PrintWriter pw = new PrintWriter(fw)) {
      //
      NumberFormat nf = NumberFormat.getInstance();
      nf.setGroupingUsed(true);
      //
      TickerPriceData spy = new TickerPriceData("AMEX", "SPY");
      final long dayVol = 10;
      List<PriceData> pdList = spy.getLatestList((int) dayVol);
      //
      long svol = 0L;
      for (PriceData pd : pdList) {
        svol += pd.volume;
      }
      long avol = svol / dayVol;
      //
      now.setSdf(sdftime);
      String sNow = now.toString();
      int idx = sNow.indexOf(':');
      //
      String sStartDay = String.format("%s:073000", sNow.substring(0, idx));
      // System.out.println(sStartDay);
      startDay = new DateTime(sStartDay, sdftime);
      System.out.println(startDay);
      System.out.println(sNow);
      //
      String sEndDay = String.format("%s:140000", sNow.substring(0, idx));
      // System.out.println(sEndDay);
      endDay = new DateTime(sEndDay, sdftime);
      System.out.println(endDay);
      //
      long dsecDay = startDay.getDeltaMilliSeconds(endDay);
      //
      long dsec = startDay.getDeltaMilliSeconds(now);
      double eodRush = 1.05;
      if (dsec > dsecDay) {
        dsec = dsecDay;
        eodRush = 1.0;
      }
      System.out.printf("%nMS in Day : %d%n", dsecDay / 1000);
      System.out.printf("MS in Now : %d%n", dsec / 1000);
      //
      double perDay = (double) dsec / (double) dsecDay;
      System.out.printf("%n%.2f%% expired.%n", perDay * 100.0);
      //
      double guessVol = (double) vol / perDay;
      //
      System.out.printf("%n%s%n", nf.format((long) avol));
      System.out.printf("%n%s%n", nf.format((long) vol));
      System.out.printf("%n%s%n", nf.format((long) guessVol));
      double endDayVolGuess = (double) guessVol * eodRush;
      System.out.printf("%s%n", nf.format((long) endDayVolGuess));
      //
      double volChg = (double) (endDayVolGuess / (double) avol * 100.0);
      System.out.printf("%n%s%%%n", nf.format((long) volChg));
      //
      pw.printf("%s\t%s%%\t\t%s\t%s\t%s%%\t\t%s%n", now, nf.format((long) (perDay * 100.0)), nf.format(vol), nf.format((long) endDayVolGuess),
          nf.format((long) volChg), nf.format(avol));
      // pw.println(header);
    }
  }
}
