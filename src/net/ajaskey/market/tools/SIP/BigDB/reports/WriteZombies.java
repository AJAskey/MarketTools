package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.Options;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.Scans;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.SortZScore;

public class WriteZombies {

  /**
   *
   * @param dList
   * @return
   */
  public static List<CompanyDerived> findZombies(List<CompanyDerived> dRList) {

    final String filename = String.format("%s2020/Q3/OPTIONABLE-2020Q3.TXT", FieldData.inbasedir);
    Options.readOptionData(filename);

    final List<CompanyDerived> zList = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {

//      if (cdr.getFd().getTicker().equalsIgnoreCase("BHVN")) {
//        System.out.println("BVHN");
//      }

      if (!cdr.getFd().getSector().contains("Financials")) {
        if (cdr.getZdata().getzScore() > 149.99) {
          if (Options.isOptionable(cdr.getFd().getTicker())) {
            int qtrs = cdr.getSalesQdata().getQuarterDataKnt();
            if (qtrs > 4) {
              zList.add(cdr);
            }
          }
        }
      }
    }

    return zList;
  }

  /**
   * 
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    System.out.println("WriteZombies...");

    List<CompanyDerived> dRList = Scans.findMajor(2020, 3, 20.0, 500000L);

    final List<CompanyDerived> dList = WriteZombies.findZombies(dRList);

    Collections.sort(dList, new SortZScore());

    try (PrintWriter pw = new PrintWriter("sipout/Zombies2.txt");
        PrintWriter pwSnap = new PrintWriter("sipout/Zombies2-snap.txt");
        PrintWriter pwCsv = new PrintWriter("sipout/Zombies2.csv");
        PrintWriter pwTxt = new PrintWriter("sipout/Zombies2-sc.txt")) {
      pwCsv.println("Ticker,");

      final DateTime now = new DateTime();
      now.setSdf(Utils.sdfFull);

      pw.printf("Created : %s\t%s%n", now, "This file is subject to change without notice.");
      pw.println("Pre-filtered for AMEX, NASDAQ, NYSE companies over $20 and average trading volume of at least 500K.");
      // pw.println("---------------------------------------------------------------------------------------------------");
      pw.println("\nSeq : this quarter versus last quarter.");
      pw.println("QoQ : this quarter versus same quarter a year ago.");
      pw.println("YoY : last 12m versus 12m a year ago.\n\n--------------------------");
      pw.println("");

      int rank = 1;
      for (final CompanyDerived cdr : dList) {
        pw.printf(" Rank:%s Zscore:%3d%n", rank++, (int) cdr.getZdata().getzScore());
        WriteCompanyData.writeCompanyInfo(pw, cdr);
        WriteCompanyData.write(pw, cdr);
        WriteCompanyData.writeQuarterly(pw, cdr);

        WriteCompanyData.writeCompanyInfo(pwSnap, cdr);
        pwSnap.printf("\tZScore            : %13.2f%n", cdr.getZdata().getzScore());
        WriteCompanyData.writeQuarterly(pwSnap, cdr);
        pwSnap.println("");

        pw.println(Utils.NL + cdr.getZdata());

        pwCsv.printf("%s:US,%n", cdr.getFd().getTicker());
        pwTxt.printf("%s%n", cdr.getFd().getTicker());
        if (rank > 50) {
          break;
        }

      }
    }
    WriteZombies.findZombies(dList);

    for (final CompanyDerived cdr : dList) {
      System.out.println(cdr.getFd().getTicker());
    }
    System.out.println(dList.size());
    System.out.println("Done.");
  }

}
