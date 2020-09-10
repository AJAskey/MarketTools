package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.MarketTools;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.Scans;

public class WriteOptumaExternal {

  /**
   *
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    List<CompanyDerived> dRList = Scans.findMajor(2020, 3, 5.0, 25000L);

    try (PrintWriter pw = new PrintWriter("data/OptumaExternalData.csv")) {

      pw.println("Code, CityExt, StateExt, CountryExt, EmpExt, FloatExt, TurnoverExt, QGrowthExt, QEstGrowthExt, YGrowthExt");

      for (final CompanyDerived cdr : dRList) {
        FieldData fd = cdr.getFd();
        if (fd.getShareData().getFloatshr() > 0.05) {
          printcol(pw, fd.getTicker());
          printcol(pw, fd.getCompanyInfo().getCity());
          printcol(pw, fd.getCompanyInfo().getState());
          printcol(pw, fd.getCompanyInfo().getCountry());
          printcol(pw, Math.max(fd.getCompanyInfo().getNumEmployees(), 1));
          printcol(pw, fd.getShareData().getFloatshr());
          printcol(pw, cdr.getTurnover());
          double tmp = MarketTools.getChange(fd.getIncSheetData().getEpsDilContQtr()[1], fd.getIncSheetData().getEpsDilContQtr()[5]);
          printcol(pw, tmp);
          printcol(pw, cdr.getEpsEstQ0Growth());
          tmp = MarketTools.getChange(fd.getIncSheetData().getEpsDilContYr()[1], fd.getIncSheetData().getEpsDilContYr()[2]);
          printcol(pw, tmp);

          pw.println("");
        }
      }
    }

    System.out.println("Done.");
  }

  private static void printcol(PrintWriter pw, double d) {
    pw.printf("%f,", d);
  }

  private static void printcol(PrintWriter pw, int i) {
    pw.printf("%d,", i);
  }

  private static void printcol(PrintWriter pw, String str) {
    pw.printf("%s,", str.replace(",", ";").trim());
  }

}
