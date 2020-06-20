package net.ajaskey.market.tools.SIP.BigDB;

import java.io.FileNotFoundException;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.reports.Reports;

/**
 * This class contains test drivers for various BigDB methods.
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
public class SipDbData {

  public static void main(final String[] args) throws FileNotFoundException {

//    List<String> alist = TextUtils.readGzipFile("D:\\dev\\eclipse-markettools\\MarketTools\\out\\BigDB\\2020\\Q2\\AA-fundamental-data-2020Q2.txt.gz");
//    for (String s : alist) {
//      System.out.println(s);
//    }

    int year = 2019;
    int qtr = 3;

//    for (int i = 2018; i < 2021; i++) {
//      for (int j = 1; j < 5; j++) {
//        FieldData.parseSipData(i, j);
//      }
//    }

    for (int i = 2018; i < 2021; i++) {
      for (int j = 1; j < 5; j++) {
        FieldData.readDbData(i, j);
      }
    }

    List<String> net = Reports.getCompanyNetIncome("MSFT");
    for (String s : net) {
      System.out.println(s);
    }

    // System.out.println(Reports.getSnpIndex(2018, 2, SnpEnum.SP600, true));
    // System.out.println(Reports.getDowIndex(2019, 1, DowEnum.TRANSPORTATION,
    // false));
    // System.out.println(Reports.getExchange(2020, 2, ExchEnum.NYSE, true));

//    FieldData.parseSipData(year, qtr++);
//    FieldData.parseSipData(year, qtr++);
//    FieldData.parseSipData(year, qtr++);
//    FieldData.parseSipData(year, qtr++);
//    FieldData.parseSipData(2019, 1);
    // FieldData.parseSipData(2019, 2);
    // FieldData.parseSipData(2019, 3);
//  FieldData.parseSipData(2019, 4);
//    FieldData.parseSipData(2020, 1);
//    FieldData.parseSipData(2020, 2);

    // FieldData.readDbData(year, qtr);
    // FieldData.readDbData(2019, 3);
//    FieldData.readDbData(2019, 4);
//    FieldData.readDbData(2020, 1);
//    FieldData.readDbData(2020, 2);
    // FieldData fd = FieldData.readDbData(2020, 1, "MSFT");
    // if (fd != null) System.out.println(fd);

    // List<String> sList = Reports.outputToList(s);
    // System.out.println(Reports.getDowIndex(year, qtr, DowEnum.TRANSPORTATION,
    // false));

//    List<String> tickers = new ArrayList<>();
//    tickers.add("MSFT");
//    tickers.add("AA");

//    List<ManyCompanyData> mcdList = ManyCompanyData.createList(sList);
//    for (ManyCompanyData mcd : mcdList) {
//      System.out.println(mcd);
//
//    }
//    List<OneCompanyData> msft = OneCompanyData.getCompany("MSFT");
//    for (OneCompanyData ocd : msft) {
//      System.out.println(ocd);
//      // FieldData fd = ocd.getQ(1);
//      // System.out.println(fd);
//    }
    // System.out.println(BigLists.getReport());

//    int[] yrs = { 2019, 2020 };
//    String rpt = Reports.companySummary(yrs);
//    System.out.println(rpt);

//    for (String ss : sList) {
//      System.out.println(ss);
//    }
  }

}
