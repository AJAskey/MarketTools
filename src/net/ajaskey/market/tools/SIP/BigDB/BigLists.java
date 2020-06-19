package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;

/**
 * This enumerations class contains lists and access methods.
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
public class BigLists {

//  private static List<String>   companySummaryList = new ArrayList<>();
//  public static List<FieldData> quarterlyList      = new ArrayList<>();

  public static List<FieldDataYear> allDataList = new ArrayList<>();

//  public static List<OneCompanyData> getCompany(String ticker) {
//    final List<OneCompanyData> ret = new ArrayList<>();
//    for (final FieldDataYear fdy : BigLists.allDataList) {
//      if (fdy.isInUse()) {
//        final OneCompanyData icd = new OneCompanyData(ticker, fdy);
//        ret.add(icd);
//      }
//    }
//    return ret;
//  }

  public static void setLists(int yr, int qtr, List<FieldData> fdList) {

    if (BigLists.allDataList.size() == 0) {
      BigLists.init(2019, 2020);
    }
    final FieldDataQuarter fdq = new FieldDataQuarter(yr, qtr, fdList);
    for (final FieldDataYear fdy : BigLists.allDataList) {
      if (fdy.getYear() == yr) {
        fdy.set(qtr, fdq);
        return;
      }
    }
    System.out.printf("Warning -- SetLists : Data not found. Year=%d Quarter=%d%n", yr, qtr);
  }

//  public static void setCompanySummaries() {
//    for (final FieldData fd : BigLists.quarterlyList) {
//      final String s = String.format("%s\t%s\t%s", fd.getTicker(), fd.getCompanyInfo().getName(), fd.getCompanyInfo().getExchange());
//      BigLists.companySummaryList.add(s);
//    }
//
//    Collections.sort(BigLists.companySummaryList);
//
//  }

  private static void init(int first, int last) {
    for (int i = first; i <= last; i++) {
      BigLists.allDataList.add(new FieldDataYear(i));
    }
  }
}
