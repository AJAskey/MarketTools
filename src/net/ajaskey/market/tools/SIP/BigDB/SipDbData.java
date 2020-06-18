package net.ajaskey.market.tools.SIP.BigDB;

import java.io.FileNotFoundException;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.reports.Reports;

public class SipDbData {

  public static void main(final String[] args) throws FileNotFoundException {

    // FieldData.parseSipData(2019, 4);
    // FieldData.parseSipData(2020, 1);
    // FieldData.parseSipData(2020, 2);

    // FieldData.parseDbData(2019, 4);
    // FieldData.parseDbData(2020, 1);
    FieldData.parseDbData(2020, 2);
//
//    List<IndividualCompanyData> msft = BigLists.getCompany("MSFT");
//    System.out.println(msft);

    // System.out.println(BigLists.getReport());

//    int[] yrs = { 2019, 2020 };
//    String rpt = Reports.companySummary(yrs);
//    System.out.println(rpt);

    // System.out.println(Reports.getSnpIndex(2020, 2, SnpEnum.SP600, true));
    // System.out.println(Reports.getDowIndex(2020, 2, DowEnum.TRANSPORTATION,
    // false));
    // System.out.println(Reports.getExchange(2020, 2, ExchEnum.NYSE, true));

    String s = Reports.getDowIndex(2020, 2, DowEnum.TRANSPORTATION, true);
    List<String> sList = Reports.outputToList(s);
    for (String ss : sList) {
      System.out.println(ss);
    }
  }

}
