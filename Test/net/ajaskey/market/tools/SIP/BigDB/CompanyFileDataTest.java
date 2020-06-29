package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;

class CompanyFileDataTest {

  @Test
  void testReadData() {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%d/Q%d/", TestData.year, TestData.quarter);
    final String tail = String.format("%dQ%d.txt", TestData.year, TestData.quarter);
    final String head = String.format("CompanyInfo-");

    final String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readSipData(ffname);

    CompanyFileData cfd = CompanyFileData.find(TestData.ticker);

    System.out.println(cfd);

    Assert.assertEquals("MSFT", cfd.getTicker());
    Assert.assertEquals("Microsoft Corporation", cfd.getName());
    Assert.assertEquals("M - Nasdaq", cfd.getExchange());
    Assert.assertEquals("7372", cfd.getSic());
    Assert.assertEquals(false, cfd.isAdr());
    Assert.assertEquals("SP500", cfd.getSnpIndex());
    Assert.assertEquals("Industrial", cfd.getDowIndex());
    Assert.assertEquals(144000, cfd.getNumEmployees());
    Assert.assertEquals("1 Microsoft Way", cfd.getStreet());
    Assert.assertEquals("REDMOND", cfd.getCity());
    Assert.assertEquals("WA", cfd.getState());
    Assert.assertEquals("98052-6399", cfd.getZip());
    Assert.assertEquals("1-425-882-8080", cfd.getPhone());
    Assert.assertEquals("https://www.microsoft.com/en-us/", cfd.getWeb());
  }

}
