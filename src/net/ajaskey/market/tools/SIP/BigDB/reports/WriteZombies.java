package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum;
import net.ajaskey.market.tools.SIP.BigDB.MarketTools;
import net.ajaskey.market.tools.SIP.BigDB.SnpEnum;
import net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.SortZScore;

public class WriteZombies {

  /**
   *
   * @param dList
   * @return
   */
  public static List<CompanyDerived> findZombies(List<CompanyDerived> dRList) {

    final List<CompanyDerived> zList = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {

//      if (cdr.getFd().getTicker().equalsIgnoreCase("BHVN")) {
//        System.out.println("BVHN");
//      }

      if (!cdr.getFd().getSector().contains("Financials")) {
        if (cdr.getZdata().getzScore() > 149.99) {
          int qtrs = cdr.getSalesQdata().getQuarterDataKnt();
          if (qtrs > 4) {
            zList.add(cdr);
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

    final int year = 2020;
    final int qtr = 3;
    final FiletypeEnum ft = FiletypeEnum.BIG_BINARY;
    MarketTools.parseSipData(year, qtr, ft, false);
    CompanyDerived.loadDb(year, qtr, ft);

    final List<String> possibles = CompanySummary.get(year, qtr, SnpEnum.NONE, DowEnum.NONE, ExchEnum.MAJOR, 20.0, 250000);
    final List<FieldData> fdList = FieldData.getListFromMemory(possibles, year, qtr);

//    for (FieldData fd : fdList) {
//      System.out.printf("%10s %10s %12.2f %12d%n", fd.getTicker(), fd.getExchange(), fd.getShareData().getPrice(), fd.getShareData().getVolume10d());
//    }

    final List<CompanyDerived> dRList = CompanyDerived.processList(fdList);

    final List<CompanyDerived> dList = WriteZombies.findZombies(dRList);

    Collections.sort(dList, new SortZScore());

    try (PrintWriter pw = new PrintWriter("sipout/zombies2.txt");
        PrintWriter pwCsv = new PrintWriter("sipout/zombies2.csv");
        PrintWriter pwTxt = new PrintWriter("sipout/zombies2-sc.txt")) {
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

        // WriteCompanyData.writeQuarterly(pw, cdr);

        pw.println(Utils.NL + cdr.getZdata());

        pwCsv.printf("%s:US,%n", cdr.getFd().getTicker());
        pwTxt.printf("%s%n", cdr.getFd().getTicker());

      }
    }
    WriteZombies.findZombies(dList);

    for (final CompanyDerived cdr : dList) {
      System.out.println(cdr.getFd().getTicker());
    }
    System.out.println(dList.size());

  }

}
