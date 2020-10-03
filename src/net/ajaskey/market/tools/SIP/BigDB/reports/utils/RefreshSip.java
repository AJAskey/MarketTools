package net.ajaskey.market.tools.SIP.BigDB.reports.utils;

import net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum;
import net.ajaskey.market.tools.SIP.BigDB.MarketTools;

public class RefreshSip {

  public static void main(String[] args) {

    int year = 2020;
    int qtr = 4;
    final FiletypeEnum ft = FiletypeEnum.BIG_BINARY;
    MarketTools.parseSipData(year, qtr, ft, true);
    System.out.println("Done.");
  }

}
