package net.ajaskey.market.tools;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.market.optuma.OptumaCommon;
import net.ajaskey.market.optuma.TickerPriceData;

public class TrueBreadth {

  DateTime today;
  double   advV;
  double   decV;

  static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  static List<TrueBreadth> spxList = new ArrayList<>();

  public TrueBreadth(DateTime dt, double a, double d) {
    this.today = dt;
    this.advV = a;
    this.decV = d;
  }

  public static void main(String[] args) throws FileNotFoundException {
    TickerPriceData advspx = new TickerPriceData("WI", "ADVSPX");
    TickerPriceData decspx = new TickerPriceData("WI", "DECSPX");
    TickerPriceData avvspx = new TickerPriceData("WI", "AVVSPX");
    TickerPriceData dvcspx = new TickerPriceData("WI", "DVCSPX");

    DateTime startDate = new DateTime(2016, DateTime.JANUARY, 01);
    DateTime nullDate = new DateTime(startDate);
    nullDate.add(DateTime.DATE, -1);

    for (int i = 0; i < advspx.getNumPrices(); i++) {
      DateTime dt = null;
      try {
        dt = advspx.getOffsetDate(i);
      } catch (Exception e) {
        dt = nullDate;
      }
      try {
        if ((dt != null) && (dt.isGreaterThan(startDate))) {
          double adv = advspx.getOffset(i).close * avvspx.getOffset(i).close;
          double dec = decspx.getOffset(i).close * dvcspx.getOffset(i).close;
          dt.setSdf(sdf);
          spxList.add(new TrueBreadth(dt, adv, dec));
          // System.out.printf("%s\t%f\t%f\t%f\t%f\t%f\t%f\t%f\t%f%n",
          // advspx.getOffset(i).date, advspx.getOffset(i).close,
          // avvspx.getOffset(i).close, decspx.getOffset(i).close,
          // dvcspx.getOffset(i).close, adv, dec, tot, sum);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }

    }

    int last = spxList.size() - 1;
    double sum = 0.0;
    try (PrintWriter pw = new PrintWriter(OptumaCommon.optumaPath + "\\Quandl\\spxBreadth.csv")) {
      for (int i = last; i >= 0; i--) {
        TrueBreadth td = spxList.get(i);
        String sDate = td.today.toString();
        System.out.printf("%s, %f, %f%n", sDate, td.advV, td.decV);
        sum = (td.advV - td.decV);
        pw.printf("%s, %f%n", sDate, sum);
      }
    }
  }

}
