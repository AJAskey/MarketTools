package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData;

class EstimateFileDataTest {

  @Test
  void testReadData() {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%d/Q%d/", TestData.year, TestData.quarter);
    final String tail = String.format("%dQ%d.txt", TestData.year, TestData.quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readSipData(ffname);

    head = String.format("Estimates-");
    ffname = String.format("%s%s%s", dir, head, tail);
    EstimateFileData.readSipData(ffname);

    EstimateFileData efd = EstimateFileData.find(TestData.ticker);

    System.out.println(efd);

    Assert.assertEquals("MSFT", efd.getTicker());
    Assert.assertEquals("Microsoft Corporation", efd.getName());
    Assert.assertEquals("M - Nasdaq", efd.getExchange());

    Assert.assertEquals("06/30/2020", efd.getCurrFiscalYear().toString());
    Assert.assertEquals("12/31/2019", efd.getLatestQtrEps().toString());

    Assert.assertEquals(1.297, efd.getEpsQ0(), 0.005);
    Assert.assertEquals(1.430, efd.getEpsQ1(), 0.005);
    Assert.assertEquals(1.170, efd.getEpsY0(), 0.005);
    Assert.assertEquals(1.320, efd.getEpsY1(), 0.005);
    Assert.assertEquals(1.245, efd.getEpsY2(), 0.005);

  }

}
