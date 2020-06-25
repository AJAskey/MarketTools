package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;

/**
 * This enumerations class contains global list and access methods.
 *
 * @author Andy Askey
 *         <p>
 *         Copyright (c) 2020, Andy Askey. All rights reserved.
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
public class Globals {

  public static List<FieldDataYear> allDataList = new ArrayList<>();

  final public static int endYear   = 2020;
  final public static int startYear = 2015;

  /**
   * Returns the requested year from global memory.
   *
   * @param yr year
   * @return FieldDataYear if available.
   */
  public static FieldDataYear getYear(int yr) {

    if (yr >= startYear && yr <= endYear) {
      for (final FieldDataYear fdy : Globals.allDataList) {
        if (fdy.isInUse()) {
          if (fdy.getYear() == yr) {
            return fdy;
          }
        }
      }
    }
    return null;
  }

  /**
   * Sets internal memory (allDataList) to request year and quarter.
   *
   * @param yr     year
   * @param qtr    quarter
   * @param fdList The FieldData list for all companies in the requested year and
   *               quarter.
   */
  public static void setLists(int yr, int qtr, List<FieldData> fdList) {

    if (fdList == null) {
      System.out.printf("Warning. SetLists(): NULL fdList for %dQ%d%n", yr, qtr);
      return;
    }
    if (yr < Globals.startYear || yr > Globals.endYear) {
      System.out.printf("Warning. SetLists(): Invalid year %d%n", yr);
      return;
    }

    /**
     * Perform the first time through.
     */
    if (Globals.allDataList.size() == 0) {
      Globals.init(Globals.startYear, Globals.endYear);
    }

    final FieldDataQuarter fdq = new FieldDataQuarter(yr, qtr, fdList);
    for (final FieldDataYear fdy : Globals.allDataList) {
      if (fdy.getYear() == yr) {
        fdy.set(qtr, fdq);
        return;
      }
    }
    System.out.printf("Warning -- SetLists : Data not found. Year=%d Quarter=%d%n", yr, qtr);
  }

  /**
   * Private data structure initializer
   *
   * @param first
   * @param last
   */
  private static void init(int first, int last) {
    for (int i = first; i <= last; i++) {
      Globals.allDataList.add(new FieldDataYear(i));
    }
  }
}
