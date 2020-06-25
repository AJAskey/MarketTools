package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.util.List;

import net.ajaskey.market.tools.SIP.QuarterlyData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum;

public class Fundamentals {

  public static final double MILLION = 1000000.0;

  static List<FieldData> fdList;

  public static void main(String[] args) throws FileNotFoundException {

    // FieldData.setQMemory(2020, 2, FiletypeEnum.TEXT);
    FieldData.setQMemory(2020, 2, FiletypeEnum.BIG_BINARY);

    Fundamentals.fdList = FieldData.getAllFromMemory(2020, 2);
    FundamentalReports.write();
  }

  public QuarterlyData shares;

}
