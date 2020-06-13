
package net.ajaskey.market.optuma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

/**
 * This class...
 *
 * @author Computer
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
public class ReadStockCharts {

  /**
   * 
   * net.ajaskey.market.ta.input.getData
   *
   * @param fname
   * @return
   */
  public static List<String> getData(String fname) {

    final List<String> data = TextUtils.readTextFile(fname, true);
    final List<String> subdata = new ArrayList<>();
    boolean process = false;

    for (final String s : data) {
      if (s.contains("<pre>")) {
        process = true;
      } else if (s.contains("</pre>")) {
        process = false;
        break;
      }

      if (process) {
        if (s.contains("Day")) {
          continue;
        } else if (s.contains("===")) {
          continue;
        } else if (s.contains("<pre>")) {
          continue;
        }
        subdata.add(s);
      }
    }

    Collections.reverse(subdata);

    return subdata;

  }

  /**
   * 
   * @param data
   * @return
   */
  public static List<PriceData> getPriceData(List<String> data) {

    final List<PriceData> ret = new ArrayList<>();

    return ret;
  }

  /**
   * net.ajaskey.market.ta.input.main
   *
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    String[] ext = { "html" };

    List<File> files = Utils.getDirTree("data/scdata", ext);
    for (File f : files) {
      System.out.println(f.getAbsolutePath());
      String fname = Utils.getFileBaseName(f);
      fname = fname.replace("-SC", "");
      final List<String> daData = ReadStockCharts.getData(f.getAbsolutePath());

      try (PrintWriter pw = new PrintWriter(OptumaCommon.optumaPath + "\\DC\\" + fname + ".csv")) {
        for (final String s : daData) {
          // System.out.println(s);
          final String fld[] = s.split("\\s+");
          final PriceData ohlcv = new PriceData(fld, "MM-dd-yyyy", 1);
          if (ohlcv.isValid()) {
            pw.println(ohlcv.toShortString());
          }
        }
      }
    }
  }

}
