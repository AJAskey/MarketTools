package net.ajaskey.market.tools.SIP.BigDB;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate;

class HappyPathTest {

  // @Test
  void testSipParser() {
    for (int year = 2018; year <= 2020; year++) {
      for (int quarter = 1; quarter <= 4; quarter++) {
        try {

          if (year == 2020 && quarter > 2) {
            return;
          }

          MarketTools.parseSipData(year, quarter, FiletypeEnum.BIG_BINARY);

          MarketTools.setQMemory(year, quarter, FiletypeEnum.BIG_BINARY);
          final FieldData fd = MarketTools.getFromMemory("MSFT", year, quarter);
          org.junit.Assert.assertTrue(fd.getTicker().equals("MSFT"));
        }
        catch (FileNotFoundException e) {
          e.printStackTrace();
          org.junit.Assert.fail("MarketTools.parseSipData() Exception thrown");
        }
      }
    }
  }

  @Test
  void testHappyPath() {

    int year = 2020;
    int quarter = 2;

    final FiletypeEnum ft = FiletypeEnum.BIG_BINARY;

    CompanyAggregate.loadDb(year, quarter, FiletypeEnum.BIG_BINARY);

    final List<String> tickers = new ArrayList<>();
    tickers.add("MSFT");
    tickers.add("W");
    tickers.add("JPM");
    tickers.add("XOM");
    tickers.add("UAL");
    tickers.add("RCL");

    final List<FieldData> fdList = FieldData.getQFromDb(year, quarter, ft);

    CompanyAggregate.processList(tickers, year, quarter, fdList);
    try {
      CompanyAggregate.write(year, quarter);
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
      org.junit.Assert.fail("CompanyAggregate.write() Exception thrown");
    }
  }

  @Test
  void testData() {

    int year = 2020;
    int quarter = 2;

    final FiletypeEnum ft = FiletypeEnum.BIG_BINARY;

    CompanyAggregate.loadDb(year, quarter, FiletypeEnum.BIG_BINARY);

    final FieldData fd = MarketTools.getFromMemory("MSFT", year, quarter);

    double[] sales = { 0.0, 35021.0, 36906.0, 33055.0, 33717.0, 30571.0, 32471.0, 29084.0, 30085.0 };
    org.junit.Assert.assertArrayEquals(sales, MarketTools.getSalesQtr(fd), 0.1);

    double[] eps = { 0.0, 1.414, 1.529, 1.399, 1.723, 1.148, 1.095, 1.150, 1.155 };
    org.junit.Assert.assertArrayEquals(eps, MarketTools.getEpsQtr(fd), 0.01);

    double[] cashOps = { 0.0, 17504.0, 10680.0, 13818.0, 16108.0, 13520.0, 8900.0, 13657.0, 11418.0 };
    org.junit.Assert.assertArrayEquals(cashOps, MarketTools.getCashFromOpsQtr(fd), 0.01);

    double[] cashInv = { 0.0, 51.0, -6036.0, -1776.0, -7257.0, -1363.0, -4200.0, -2953.0, -2670.0 };
    org.junit.Assert.assertArrayEquals(cashInv, MarketTools.getCashFromInvQtr(fd), 0.01);

    double[] cashFin = { 0.0, -14645.0, -8915.0, -10209.0, -8686.0, -7601.0, -13216.0, -7384.0, -6039.0 };
    org.junit.Assert.assertArrayEquals(cashFin, MarketTools.getCashFromFinQtr(fd), 0.01);

    CompanyAggregate ca = new CompanyAggregate(year, quarter, fd);
    // System.out.println(ca.getNetcashflowQdata());

    double[] netCash = { 0.0, 2859.0, 1765.0, 3609.0, 7422.0, 5919.0, -4316.0, 6273.0, 5379.0 };
    org.junit.Assert.assertArrayEquals(netCash, ca.getNetcashflowQdata().dArr, 0.01);

    double expNetCashTtm = netCash[1] + netCash[2] + netCash[3] + netCash[4];
    org.junit.Assert.assertEquals(expNetCashTtm, ca.getNetcashflowQdata().getTtm(), 0.1);

    double expNetCashPrevTtm = netCash[5] + netCash[6] + netCash[7] + netCash[8];
    org.junit.Assert.assertEquals(expNetCashPrevTtm, ca.getNetcashflowQdata().getPrevTtm(), 0.1);

    double expNetCash2QTtm = netCash[2] + netCash[3] + netCash[4] + netCash[5];
    org.junit.Assert.assertEquals(expNetCash2QTtm, ca.getNetcashflowQdata().get2QTtm(), 0.1);

    double[] tArr = { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
    QuarterlyDouble qd = new QuarterlyDouble(tArr);
    org.junit.Assert.assertEquals(-80.0, qd.getQoQ(), 0.01);
    org.junit.Assert.assertEquals(-50.0, qd.getQseqQ(), 0.01);
    org.junit.Assert.assertEquals(10.0, qd.getTtm(), 0.01);
    org.junit.Assert.assertEquals(26.0, qd.getPrevTtm(), 0.01);
    org.junit.Assert.assertEquals(14.0, qd.get2QTtm(), 0.01);
    org.junit.Assert.assertEquals(1.0, qd.getMostRecent(), 0.01);
    org.junit.Assert.assertEquals(2.5, qd.getTtmAvg(), 0.01);

  }

}
