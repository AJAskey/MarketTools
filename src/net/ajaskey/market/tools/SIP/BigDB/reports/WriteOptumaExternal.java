package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.MarketTools;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.Options;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.Scans;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.Utilities;

public class WriteOptumaExternal {

  /**
   *
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    System.out.println("WriteOptumaExternal...");

    int year = 2020;
    int qtr = 4;

    final String filename = String.format("%s2020/Q3/OPTIONABLE-2020Q3.TXT", FieldData.inbasedir);
    Options.readOptionData(filename);

    List<CompanyDerived> dRList = Scans.findMajor(year, qtr, 5.0, 5000L);

    try (PrintWriter pw = new PrintWriter("data/OptumaExternalData.csv")) {

      pw.println(
          "Code, CityExt, StateExt, CountryExt, SectorExt, IndustryExt, EmpExt, FloatExt, TurnoverExt, QGrowthExt, QEstGrowthExt, YGrowthExt, OptionableExt, InsiderOwnExt,"
              + "InsiderChgExt, InstOwnExt, InstChgExt");

      for (final CompanyDerived cdr : dRList) {
        print(pw, cdr);
      }

      // Add important not found by scan
      CompanyDerived brkb = Scans.findCompany(year, qtr, "BRK.B");
      print(pw, brkb);
    }

    System.out.println("Done.");
  }

  private static void print(PrintWriter pw, CompanyDerived cdr) {
    FieldData fd = cdr.getFd();
    if (fd.getShareData().getFloatshr() > 0.05) {
      printcol(pw, fd.getTicker());
      printcol(pw, fd.getCompanyInfo().getCity());
      printcol(pw, fd.getCompanyInfo().getState());
      printcol(pw, fd.getCompanyInfo().getCountry());
      printcol(pw, Utilities.cleanSecInd(fd.getCompanyInfo().getSector()));
      printcol(pw, Utilities.cleanSecInd(fd.getCompanyInfo().getIndustry()));
      printcol(pw, Math.max(fd.getCompanyInfo().getNumEmployees(), 1));
      printcol(pw, fd.getShareData().getFloatshr());
      printcol(pw, cdr.getTurnover());
      double tmp = MarketTools.getChange(fd.getIncSheetData().getEpsDilContQtr()[1], fd.getIncSheetData().getEpsDilContQtr()[5]);
      printcol(pw, tmp);
      printcol(pw, cdr.getEpsEstQ0Growth());
      tmp = MarketTools.getChange(fd.getIncSheetData().getEpsDilContYr()[1], fd.getIncSheetData().getEpsDilContYr()[2]);
      printcol(pw, tmp);
      if (Options.isOptionable(fd.getTicker())) {
        printcol(pw, "TRUE");
      }
      else {
        printcol(pw, " ");
      }
      printcol(pw, fd.getShareData().getInsiderOwnership());
      printcol(pw, cdr.getInsiderDollarChg());
      printcol(pw, fd.getShareData().getInstOwnership());
      printcol(pw, cdr.getInstDollarChg());

      pw.println("");
    }
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
