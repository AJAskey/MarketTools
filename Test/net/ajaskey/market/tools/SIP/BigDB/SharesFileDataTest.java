package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData;

class SharesFileDataTest {

  @Test
  void testReadData() {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%d/Q%d/", TestData.year, TestData.quarter);
    final String tail = String.format("%dQ%d.txt", TestData.year, TestData.quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readSipData(ffname);

    head = String.format("Shares-");
    ffname = String.format("%s%s%s", dir, head, tail);
    SharesFileData.readSipData(ffname);

    SharesFileData sfd = SharesFileData.find(TestData.ticker);

    System.out.println(sfd);

    Assert.assertEquals("MSFT", sfd.getTicker());
    Assert.assertEquals("Microsoft Corporation", sfd.getName());
    Assert.assertEquals("M - Nasdaq", sfd.getExchange());

    Assert.assertEquals(152.11, sfd.getPrice(), 0.005);
    Assert.assertEquals(0.960, sfd.getBeta(), 0.005);
    Assert.assertEquals(1039221, sfd.getVolumeMonth3m());
    Assert.assertEquals(7903795.32, sfd.getDollar3m(), 0.005);
    Assert.assertEquals(7497.858, sfd.getFloatshr(), 0.005);
    Assert.assertEquals(1199550.0, sfd.getMktCap(), 0.5);
    Assert.assertEquals(0.1, sfd.getInsiderOwnership(), 0.05);

  }

}
