
package net.ajaskey.market.tools.options;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;

import net.ajaskey.common.DateTime;

/**
 * This class...
 *
 * @author Andy
 *         <p>
 *         PTV-Parser Copyright (c) 2015, Andy Askey. All rights reserved.
 *         </p>
 *         <p>
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 *
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 *         </p>
 *
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 *         </p>
 *
 */
public class ProcessOptions {

  static double minLast    = 0.0499;
  static double minIv      = 0.0;
  static int    minOi      = 0;
  static double maxPremium = 10000.0;

  /**
   * net.ajaskey.market.tools.options.main
   *
   * @param args
   * @throws IOException
   */
  public static void main(final String[] args) throws ParseException, IOException {

//    DataItem.dbgPw = new PrintWriter("out/dataItem.dbg");
//
    if (args.length < 2) {
      System.out.println("Command line format : Type Filename-Prefix [Position Size]  --->   PUT spy [1000.0]");
      return;
    }

    final String code = args[1].trim();
    final String fname = String.format("data/options/%s-options.dat", code);

    final String type = args[0].toUpperCase().trim();
    int typeInt = OptionsProcessor.ACALL;
    if (type.contains("P")) {
      typeInt = OptionsProcessor.APUT;
      System.out.println("Processing PUTs on : " + fname);
      // DataItem.dbgPw.println("Processing PUTs on : " + fname);
    }
    else {
      System.out.println("Processing CALLs on : " + fname);
      // DataItem.dbgPw.println("Processing CALLs on : " + fname);
    }

    double positionSize = 1000.0;

    if (args.length > 2) {
      positionSize = Double.parseDouble(args[2]);
    }
//
//    DataItem.dbgPw.println("Reading : " + fname);
//
//    DataItemList dil = DataItemList.readOptionData(fname, 0.10, 0, 249);
    final List<CboeOptionData> dil = CallPutList.readCboeData(fname, new DateTime(), new DateTime(), 0);

//
//    DataItem.dbgPw.println("Finished Reading : " + fname);
//
    final String commas = ",,,,,,,,,,,New Price/Contract,,,,";
//
    if (dil == null) {
      return;
    }
//
    final double cPrice = CallPutList.getcPrice();
//
    final double priceChg = 0.10;
    final int daysToSell = 45;
//
    final String outfile = String.format("out/%s-options-analysis.csv", args[1].trim());
    try (PrintWriter pw = new PrintWriter(outfile)) {
//
      final String note = String.format("Assume %d%% price change in %d days", (int) (priceChg * 100.0), daysToSell);

      pw.printf("%s %.2f,Created:,%s,%sGain/Loss on $%d Position,,,,,,%s%n", code, cPrice, new DateTime(), commas, (int) positionSize, note);
//
      pw.println(
          "Type,Expiry,Id,Vol,OI,IV,Delta,Theta,Gamma,Strike,Current,Calculated,Premium,,IV*1.0,IV*1.5,IV*2.0,,IV*1.0,IV*1.5,IV*2.0,,Contracts,Price,Date Of Sale");
//
      final DateTime closeDate = new DateTime();
      closeDate.add(DateTime.DATE, daysToSell);
      System.out.println("Closing position on : " + closeDate);
      if (typeInt == OptionsProcessor.ACALL) {
      }
      else {
      }

      for (final CboeOptionData od : dil) {
        CboeCallPutData cpd = null;
        if (typeInt == OptionsProcessor.ACALL) {
          cpd = od.call;
        }
        else {
          cpd = od.put;
        }
        if (cpd.mark > ProcessOptions.minLast && cpd.iv > ProcessOptions.minIv && cpd.oi > ProcessOptions.minOi) {

        }
      }

//
//      for (DataItem di : theList) {
//
//        if ((di.last > minLast) && (di.iv > minIv) && (di.oi > minOi)) {
//
//          // if ((di.strike <= cPrice) && (di.premium < maxPremium)) {
//          if (di.premium < maxPremium) {
//            double low = cPrice * 0.70;
//            double high = cPrice * 1.30;
//            if ((di.strike >= low) && (di.strike <= high)) {
//
//              String str1 = di.toCsv();
//
//              String str2 = estimateProfit(di, cPrice * priceMove, positionSize, closeDate);
//
//              String str = str1 + str2;
//
//              pw.println(str);
//            }
//          }
//        }
//      }
    }
//
//    DataItem.dbgPw.close();
  }

  /**
   *
   * @param di
   * @param cp
   * @param posSize
   * @param closeDate
   * @return
   */
//  }

}
