package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
  public static List<CompanyDerived> findZombies(List<CompanyDerived> dList) {
    final List<CompanyDerived> zList = new ArrayList<>();

    for (final CompanyDerived cdr : dList) {

      if (!cdr.getFd().getSector().equalsIgnoreCase("Financials")) {

        if (cdr.getRs() < 5.0) {
          if (cdr.getZdata().getzScore() > 90.0) {
            zList.add(cdr);
          }
        }
      }
    }

    return zList;
  }

  public static void main(String[] args) throws FileNotFoundException {

    final int year = 2020;
    final int qtr = 3;
    final FiletypeEnum ft = FiletypeEnum.BIG_BINARY;
    MarketTools.parseSipData(year, qtr, ft, false);
    CompanyDerived.loadDb(year, qtr, ft);

    final List<String> possibles = CompanySummary.get(year, qtr, SnpEnum.NONE, DowEnum.NONE, ExchEnum.NONE, 20.0, 100000);
    final List<FieldData> fdList = FieldData.getListFromMemory(possibles, year, qtr);

    final List<CompanyDerived> dRList = CompanyDerived.processList(fdList);
    final List<CompanyDerived> dList = new ArrayList<>();

    for (CompanyDerived cdr : dRList) {

      if (cdr.getFd().getTicker().equalsIgnoreCase("BHVN")) {
        System.out.println("BVHN");
      }

      int qtrs = 0;

      for (int i = 1; i < cdr.getSalesQdata().dArr.length; i++) {
        double d = cdr.getSalesQdata().get(i);
        if (d == 0) {
          break;
        }
        qtrs++;
      }
      if (qtrs > 4) {
        if (!cdr.getFd().getSector().contains("Financials")) {
          if (cdr.getZdata().getzScore() > 114.99) {
            dList.add(cdr);
          }
        }
      }
    }

    Collections.sort(dList, new SortZScore());

    try (PrintWriter pw = new PrintWriter("sipout/zTest.txt")) {

      int rank = 1;
      for (CompanyDerived cdr : dList) {
        pw.printf(" Rank:%s Zscore:%3d%n", rank++, (int) cdr.getZdata().getzScore());
        WriteCompanyData.writeCompanyInfo(pw, cdr);
        WriteCompanyData.write(pw, cdr);

        // WriteCompanyData.writeQuarterly(pw, cdr);

        pw.println(Utils.NL + cdr.getZdata());

      }
    }
    WriteZombies.findZombies(dList);

    for (final CompanyDerived cdr : dList) {
      System.out.println(cdr.getFd().getTicker());
    }
    System.out.println(dList.size());

  }

}
