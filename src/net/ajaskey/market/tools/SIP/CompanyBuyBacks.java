package net.ajaskey.market.tools.SIP;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.market.optuma.PriceData;
import net.ajaskey.market.optuma.TickerPriceData;

public class CompanyBuyBacks {

  int years[] = { 2015, 2016, 2017, 2018, 2019 };

  public static void main(String[] args) throws FileNotFoundException {

    final List<String> data = TextUtils.readTextFile("data/SP500 SHARES VS PRICE.TXT", true);

    try (PrintWriter pw = new PrintWriter("out/buybacks.txt")) {

      pw.println(
          "Code\tName\tExchange\tShares 5to4\tShares 4to3\tShares 3to2\tShares2to1\tTotal Cost\tCurrent Value\tDelta");

      for (String s : data) {

        String fld[] = s.split("\t");
        String code = fld[0].replace("\"", "").trim();
        String name = fld[1].replace("\"", "").trim();
        String exch = fld[2].replace("\"", "").trim();

        if (code.equalsIgnoreCase("DXC")) {
          System.out.println(code);
        }

        if (exch.length() > 0) {
          TickerPriceData priceData = new TickerPriceData(exch, code);

          if (priceData.getNumPrices() > 0) {

            // double avg2015 = getYearlyAverage(priceData, 2015);
            double avg2016 = getYearlyAverage(priceData, 2016); // 4
            double avg2017 = getYearlyAverage(priceData, 2017); // 3
            double avg2018 = getYearlyAverage(priceData, 2018); // 2
            double avg2019 = getYearlyAverage(priceData, 2019); // 1
            double lastPrice = priceData.getLatest();

            if ((avg2016 > 0.0) && (avg2017 > 0.0) && (avg2018 > 0.0) && (avg2019 > 0.0) && (lastPrice > 0.0)) {
              double shr2to1 = Double.parseDouble(fld[4].trim()); // 1
              double shr3to2 = Double.parseDouble(fld[5].trim()); // 2
              double shr4to3 = Double.parseDouble(fld[6].trim()); // 3
              double shr5to4 = Double.parseDouble(fld[7].trim()); // 4

              double buyCost5to4 = shr5to4 * avg2016;
              double buyCost4to3 = shr4to3 * avg2017;
              double buyCost3to2 = shr3to2 * avg2018;
              double buyCost2to1 = shr2to1 * avg2019;

              double totShares = shr5to4 + shr4to3 + shr3to2 + shr2to1;
              double totCost = buyCost5to4 + buyCost4to3 + buyCost3to2 + buyCost2to1;

              double currentValue = totShares * lastPrice;
              double delta = currentValue - totCost;

              pw.printf("%s\t%s\t%s\t%f\t%f\t%f\t%f\t%f\t%f\t%f%n", code, name, exch, buyCost5to4, buyCost4to3,
                  buyCost3to2, buyCost2to1, totCost, currentValue, delta);
            }
          } else {
            System.out.println("ERROR : No price data for : " + code);
          }
        }
      }
    }
  }

  private static double getYearlyAverage(TickerPriceData pd, int yr) {

    double ret = 0.0;
    int knt = 0;
    double sum = 0.0;
    for (PriceData td : pd.getPriceData()) {
      int year = td.date.getYear();
      if (year == yr) {
        // System.out.println(td);
        sum += td.close;
        knt++;
      } else if (year > yr) {
        break;
      }
    }
    if (knt > 0) {
      ret = sum / (double) knt;
    }
    return ret;
  }

}
