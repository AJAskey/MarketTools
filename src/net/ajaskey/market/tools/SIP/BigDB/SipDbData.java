package net.ajaskey.market.tools.SIP.BigDB;

import java.io.FileNotFoundException;

public class SipDbData {

  public static void main(final String[] args) throws FileNotFoundException {

    // FieldData.parseSipData(2019, 4);
    // FieldData.parseSipData(2020, 1);
    // FieldData.parseSipData(2020, 2);

    // parseDbData(2019, 4);
//    parseDbData(2020, 1);
    FieldData.parseDbData(2020, 2);
//
//    List<IndividualCompanyData> msft = BigLists.getCompany("MSFT");
//    System.out.println(msft);

    // System.out.println(BigLists.getReport());

//    int[] yrs = { 2019, 2020 };
//    String rpt = Reports.companySummary(yrs);
//    System.out.println(rpt);

    // System.out.println(Reports.getSnpIndex(2020, 2, SnpEnum.SP600));
    // System.out.println(Reports.getDowIndex(2020, 2, DowEnum.UTILITY));

  }

}
