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

    final String filename = String.format("%s2021/Q1/OPTIONABLE-2021Q1.TXT", FieldData.inbasedir);
    Options.readOptionData();

    final List<CompanyDerived> zList = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {

//      if (cdr.getFd().getTicker().equalsIgnoreCase("BHVN")) {
//        System.out.println("BVHN");
//      }

      if (!cdr.getFd().getSector().contains("Financials")) {
        if (cdr.getZdata().getzMajorScore() > 124.99) {
          if (Options.isOptionable(cdr.getFd().getTicker())) {
            int qtrs = cdr.getSalesQdata().getQuarterDataKnt();
            if (qtrs > 4) {
              if (grossZombie(cdr)) {
                zList.add(cdr);
              }
            }
          }
        }
      }
    }

    return zList;
  }

  /**
   * Needs at least one negative financial Zombie characteristic.
   * 
   * @param cdr Company data
   * @return True of Zombie characteristic found, False otherwise
   */
  private static boolean grossZombie(CompanyDerived cdr) {

    boolean ret = false;
    final double lowval = 0.0001;

    if (cdr.getNetIncQdata().getTtm() < lowval) {
      ret = true;
    }
    else if (cdr.getGrossOpIncQdata().getTtm() < lowval) {
      ret = true;
    }
    else if (cdr.getWorkingCapitalQdata().getTtm() < lowval) {
      ret = true;
    }
    return ret;
  }

  /**
   * 
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    System.out.println("WriteZombies...");

    int year = 2021;
    int qtr = 1;

    List<CompanyDerived> dRList = Scans.findMajor(year, qtr, 20.0, 500000L);

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
      pw.printf("Using the most recent %d Q%d data.%n", year, qtr);
      pw.println("\nSeq : this quarter versus last quarter.");
      pw.println("QoQ : this quarter versus same quarter a year ago.");
      pw.println("YoY : last 12m versus 12m a year ago.\n\n--------------------------");

      pw.printf("%nScoring%n");
      pw.printf("\tRequires one of these negative over past 12 months: Operating Income, Net Income, Working Capital.%n");
      pw.printf("\tWorking Capital%n\t\tratio = Current Liabililtes / (Current Assets + FCF12m) -- Assume FCF level will continue going forward.%n");
      pw.printf("\t\tif (ratio > 1)%n\t\t\tzWorkingCapital = POW(ratio, 9.25) -- Max 150%n");

      pw.printf("\tDebt -- Try Debt vs TanAssets for common comparison as many companies do not have positive Equity.%n");
      pw.printf("\t\tTanAssets = All Assets - Goodwill%n");
      pw.printf("\t\tif (Equity > 0) AND (Debt to Equity > 1)%n");
      pw.printf("\t\t\tif (Debt to TanAssets > 1)%n");
      pw.printf("\t\t\t\tzDebt = POW(5.0, Debt to TanAssets) -- MAX 125%n");
      pw.printf("\t\t\telse%n\t\t\t\tzDebt = POW(2.5, Debt to Equity) -- MAX 125%n");
      pw.printf("\t\telse if (TanAssets > 0) AND (Debt To TanAssets > 1)%n");
      pw.printf("\t\t\tzDebt = 50 + POW(5.0, Debt to TanAssets) -- Start at 50 becaue negative Equity ; MAX 125%n");
      pw.printf("\t\telse if (Sales12m > 0) AND (Debt To Sales > 1)%n");
      pw.printf("\t\t\tzDebt = 75 + POW(2.0, Debt to Sales) -- Start at 75 because negative Equity and TanAssets ; MAX 125%n");
      pw.printf("\t\telse if (Debt > 0)%n\t\t\tzDebt = 125%n");

      pw.printf("\tDebt vs TanAssets -- Debt flows into TanAssets = GOOD ; Debt up and TanAssets down = BAD%n");
      pw.printf("\t\tTanAssets = All Assets - Goodwill%n");
      pw.printf("\t\ttaChg = TanAssets - TanAssets Year Ago%n");
      pw.printf("\t\tdebtChg = Total Debt - Total Debt Year Ago%n");
      pw.printf("\t\tratio = debtChg / taChg%n");
      pw.printf("\t\tif (ratio > 1) AND (debtChg > 0)%n");
      pw.printf("\t\t\tzDebtVsTa = POW(4.25, ratio) -- MAX 75%n");
      pw.printf("\t\telse if (debtChg > 0) AND (taChg < 0)%n");
      pw.printf("\t\t\tzDebtVsTa = 75%n");

      pw.printf("\tInterest rates and payments%n");
      pw.printf("\t\tIntRate = Interest Paid / Total Debt%n");
      pw.printf("\t\tif (IntRate > 0.30) -- Arbitrarily say rates less than 3.0%% are not a problem.%n");
      pw.printf("\t\t\tzInterest = POW(1.80, IntRate*100.0) -- MAX 62.5%n");
      pw.printf("\t\tIntToSales = Interest Paid / Sales12m%n");
      pw.printf("\t\tif (IntToSales > 0)%n");
      pw.printf("\t\t\tzInterest += POW(5.0, IntToSales*10.0) -- MAX 62.5%n");

      pw.printf("%n---------------------------------------------------------------------------------------------------%n%n");

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
        if (rank > 100) {
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
