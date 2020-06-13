package net.ajaskey.market.tools;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.TextUtils;
import net.ajaskey.market.optuma.PriceData;
import net.ajaskey.market.optuma.TickerPriceData;

/**
 * This class parses VIX Model Signal data and various index data. The open and
 * close from the signal model are found in the index data. Change and
 * Cumulative change are calculated.
 *
 * Output is written in CSV format for manual import into Excel.
 *
 * <p>
 * PTV-Parser Copyright (c) 2020, Andy Askey. All rights reserved.
 * </p>
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * </p>
 *
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </p>
 *
 */
public class VixModelSignals {

  static List<String> tickers = new ArrayList<>();

  public static void main(String[] args) throws FileNotFoundException {

    VixModelSignals.tickers.add("AMEX,SPY");
    VixModelSignals.tickers.add("NASDAQ,QQQ");
    VixModelSignals.tickers.add("AMEX,SPXL");
    VixModelSignals.tickers.add("AMEX,SPXU");
    VixModelSignals.tickers.add("NASDAQ,TQQQ");
    VixModelSignals.tickers.add("NASDAQ,SQQQ");
    VixModelSignals.tickers.add("NASDAQ,TLT");
    VixModelSignals.tickers.add("NASDAQ,IEF");

    final SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

    // Reads data file as a list of strings.
    final List<String> data = TextUtils.readTextFile("data/VIX Model Signals.csv", true);

    final String header = "Trade Date,Signal,Position,Open,Close,Chg,TotChg";

    for (final String t : VixModelSignals.tickers) {

      final String tnames[] = t.split(",");

      // Reads Optuma formatted price data to a list
      final TickerPriceData tixData = new TickerPriceData(tnames[0], tnames[1]);
      final DateTime tixFirstDate = tixData.getFirstDate();

      // For each VixModelSignals string, find correspond day of price data.
      // Do some calculations and write out data in CSV for import back into Excel.
      String fld[] = data.get(0).split(",");
      String sDt = fld[0].trim();
      final DateTime firstDate = new DateTime(sDt, sdf);

      PriceData pd = null;
      if (tixFirstDate.isGreaterThan(firstDate)) {
        pd = tixData.getData(tixFirstDate);
      }
      else {
        pd = tixData.getData(firstDate);
      }

      final double firstClose = pd.close;
      double prevClose = firstClose;

      final String fname = String.format("out/%s-vms.csv", tnames[1].trim());
      try (PrintWriter pw = new PrintWriter(fname)) {
        pw.println(header);

        for (final String s : data) {
          fld = s.split(",");
          sDt = fld[0].trim();
          final DateTime dt = new DateTime(sDt, sdf);
          if (dt.isGreaterThanOrEqual(tixFirstDate)) {
            pd = tixData.getData(dt);
            if (pd != null) {
              final double chg = (pd.close - prevClose) / prevClose * 100.0;
              final double cummChg = (pd.close - firstClose) / firstClose * 100.0;
              pw.printf("%s, %.2f, %.2f, %.1f%%, %.1f%%%n", s, pd.open, pd.close, chg, cummChg);
              prevClose = pd.close;
            }
          }
        }
      }
    }
  }

}
