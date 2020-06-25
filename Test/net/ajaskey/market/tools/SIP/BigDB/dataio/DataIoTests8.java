package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04001");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        int int4 = fieldData2.getQuarter();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray6 = fieldData2.getNetIncYr();
        long long7 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04002");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        java.lang.String str4 = estimateFileData1.getIndustry();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData1.getLatestQtrEps();
        net.ajaskey.common.DateTime dateTime6 = estimateFileData1.getLatestQtrEps();
        double double7 = estimateFileData1.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = estimateFileData1.getExchange();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dateTime5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData7.getNetFixedAssetsQtr();
        double[] doubleArray10 = balSheetFileData7.getTotalAssetsYr();
        double[] doubleArray11 = balSheetFileData7.getCurrAssetsYr();
        double[] doubleArray12 = balSheetFileData7.getTotalAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray7 = fieldData2.getPreTaxIncYr();
        double[] doubleArray8 = fieldData2.getLtInvestQtr();
        double[] doubleArray9 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray10 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04005");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getIntExpQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray10 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray11 = balSheetFileData1.getBvpsYr();
        double[] doubleArray12 = balSheetFileData1.getCashQtr();
        double[] doubleArray13 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray10 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getBvpsYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getLtDebtQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        java.lang.String str11 = fieldData2.getSnpIndexStr();
        double[] doubleArray12 = fieldData2.getSalesYr();
        double[] doubleArray13 = fieldData2.getLtInvestYr();
        double[] doubleArray14 = fieldData2.getGrossIncQtr();
        double[] doubleArray15 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray16 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray17 = fieldData2.getCogsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        double double7 = fieldData2.getInsiderOwnership();
        int int8 = fieldData2.getQuarter();
        double[] doubleArray9 = fieldData2.getBvpsYr();
        double double10 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04011");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(10, (int) (byte) 100, "out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q100/out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q100.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str4, "out/BigDB/10/Q100/out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q100.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        java.lang.String str7 = fieldData2.getZip();
        long long8 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsQ1();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04015");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04016");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 1, 35, "", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q35/-fundamental-data-1Q35." + "'", str4, "out/BigDB/1/Q35/-fundamental-data-1Q35.");
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        java.lang.String str3 = estimateFileData0.getSector();
        double double4 = estimateFileData0.getEpsY2();
        double double5 = estimateFileData0.getEpsQ1();
        java.lang.String str6 = estimateFileData0.getName();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getEquityYr();
        double[] doubleArray2 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        double double3 = estimateFileData0.getEpsY1();
        java.lang.String str4 = estimateFileData0.toString();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData0.getLatestQtrEps();
        double double6 = estimateFileData0.getEpsQ0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(dateTime5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04020");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 100, (int) '4', "out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str4, "out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04021");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double double12 = fieldData2.getInsiderNetPercentOutstanding();
        double[] doubleArray13 = fieldData2.getCurrAssetsYr();
        double[] doubleArray14 = fieldData2.getInventoryQtr();
        double[] doubleArray15 = fieldData2.getEquityYr();
        double[] doubleArray16 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        fieldData2.setYear((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        double[] doubleArray10 = fieldData2.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getBvpsYr();
        double[] doubleArray11 = fieldData2.getAcctPayableYr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double double11 = fieldData2.getEpsQ1();
        double[] doubleArray12 = fieldData2.getSalesYr();
        double[] doubleArray13 = fieldData2.getCashFromInv();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum5 = fieldData2.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = fieldData2.getEstimateData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(snpEnum5);
        org.junit.Assert.assertNotNull(estimateFileData6);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04026");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        sharesFileData9.setBeta("hi!");
        int int12 = sharesFileData9.getInstSellShrs();
        double double13 = sharesFileData9.getBeta();
        int int14 = sharesFileData9.getInsiderBuys();
        sharesFileData9.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getEquityQtr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData1.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getSector();
        double[] doubleArray7 = fieldData2.getEpsContYr();
        int int8 = fieldData2.getInsiderBuys();
        double[] doubleArray9 = fieldData2.getNonrecurringItemsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = fieldData2.getEstimateData();
        double double11 = estimateFileData10.getEpsQ1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '#', (int) '#');
        double[] doubleArray3 = fieldData2.getGrossIncYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04031");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double[] doubleArray8 = new double[] {};
        sharesFileData0.setSharesY(doubleArray8);
        sharesFileData0.setInsiderNetTrades("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str12 = sharesFileData0.toDbOutput();
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/100/Q0/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-100Q0.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str12, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04032");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        java.lang.String str37 = estimateFileData3.getIndustry();
        java.lang.String str38 = estimateFileData3.toDbOutput();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        java.lang.String str40 = estimateFileData3.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData3);
        java.lang.String str43 = estimateFileData42.getName();
        java.lang.String str44 = estimateFileData42.getTicker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(exchEnum39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        java.lang.String str4 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray8 = fieldData7.getCogsYr();
        int int9 = fieldData7.getNumEmployees();
        double double10 = fieldData7.getPrice52hi();
        double[] doubleArray11 = fieldData7.getStDebtYr();
        double double12 = fieldData7.getEpsQ0();
        double[] doubleArray13 = fieldData7.getIncAfterTaxYr();
        double[] doubleArray14 = fieldData7.getSharesY();
        sharesFileData0.setSharesQ(doubleArray14);
        int int16 = sharesFileData0.getInstShareholders();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int18 = sharesFileData17.getInstSellShrs();
        sharesFileData17.setInsiderSells("hi!");
        double double21 = sharesFileData17.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int23 = sharesFileData22.getInstShareholders();
        double double24 = sharesFileData22.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData25.setFromReport((int) (byte) 0, 0);
        double[] doubleArray29 = sharesFileData25.getSharesQ();
        sharesFileData22.setSharesQ(doubleArray29);
        sharesFileData17.setSharesQ(doubleArray29);
        sharesFileData0.setSharesQ(doubleArray29);
        sharesFileData0.setFromReport((int) (short) 100, (int) '4');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0]");
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray12 = fieldData2.getStDebtQtr();
        double[] doubleArray13 = fieldData2.getTotalOpExpQtr();
        int int14 = fieldData2.getInstSellShrs();
        fieldData2.setQuarter((-1));
        int int17 = fieldData2.getInstBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        int int8 = fieldData2.getInstBuyShrs();
        int int9 = fieldData2.getInstBuyShrs();
        double[] doubleArray10 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray11 = fieldData2.getSharesY();
        double[] doubleArray12 = fieldData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04037");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getSalesQtr();
        double[] doubleArray8 = incSheetFileData5.getIncAfterTaxYr();
        java.lang.String str9 = incSheetFileData5.getIndustry();
        java.lang.String str10 = incSheetFileData5.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', (int) 'a');
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        double[] doubleArray4 = fieldData2.getGrossIncYr();
        double[] doubleArray5 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray6 = fieldData2.getSharesY();
        double[] doubleArray7 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        int int7 = fieldData2.getYear();
        java.lang.String str8 = fieldData2.getTicker();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04041");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray12 = incSheetFileData5.getEpsDilContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean14 = companyFileData13.isAdr();
        java.lang.String str15 = companyFileData13.toDbOuput();
        incSheetFileData5.setNameFields(companyFileData13);
        double[] doubleArray17 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray18 = incSheetFileData5.getDepreciationQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str15, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04042");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str13 = cashFileData12.toString();
        double[] doubleArray14 = cashFileData12.getCashFromInvQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(cashFileData12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cash File Data" + "'", str13, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        long long7 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
        double[] doubleArray8 = balSheetFileData7.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getSector();
        double[] doubleArray7 = fieldData2.getEpsContYr();
        int int8 = fieldData2.getInsiderBuys();
        double[] doubleArray9 = fieldData2.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray41 = balSheetFileData22.getAcctRxYr();
        double[] doubleArray42 = balSheetFileData22.getPrefStockYr();
        java.lang.String str43 = balSheetFileData22.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean45 = companyFileData44.isAdr();
        java.lang.String str46 = companyFileData44.getDowIndexStr();
        companyFileData44.setIndustry("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        balSheetFileData22.setNameFields(companyFileData44);
        java.lang.String str50 = balSheetFileData22.getTicker();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!");
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04048");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04049");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData8.getIncTaxQtr();
        java.lang.String str10 = incSheetFileData8.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getEquityQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray8 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray9 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", 1, (int) (byte) 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        double[] doubleArray4 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray5 = fieldData2.getEpsContQtr();
        double[] doubleArray6 = fieldData2.getSalesYr();
        double[] doubleArray7 = fieldData2.getAcctRxYr();
        double double8 = fieldData2.getMktCap();
        double[] doubleArray9 = fieldData2.getInventoryQtr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04053");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/10/Q100/out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q100.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04055");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getLtInvestYr();
        double[] doubleArray5 = fieldData2.getEquityQtr();
        double[] doubleArray6 = fieldData2.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(balSheetFileData7);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsDilContQtr();
        double[] doubleArray11 = fieldData2.getCashFromFin();
        double[] doubleArray12 = fieldData2.getGrossIncQtr();
        double[] doubleArray13 = fieldData2.getIncTaxYr();
        double[] doubleArray14 = fieldData2.getGoodwillYr();
        java.lang.String str15 = fieldData2.getSic();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray10 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str11 = balSheetFileData1.getSector();
        double[] doubleArray12 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str11, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04058");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryYr();
        double[] doubleArray4 = balSheetFileData1.getEquityQtr();
        double[] doubleArray5 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        java.lang.String str9 = cashFileData8.toDbOutput();
        double[] doubleArray10 = cashFileData8.getCapExQtr();
        double[] doubleArray11 = cashFileData8.getCashFromFinQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        double[] doubleArray5 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray7 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray8 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray9 = balSheetFileData2.getOtherCurrLiabYr();
        double[] doubleArray10 = balSheetFileData2.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        java.lang.String str14 = estimateFileData12.getIndustry();
        double double15 = estimateFileData12.getEpsY2();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("");
        companyFileData0.setDowIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str10 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum11 = companyFileData0.getDowIndex();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + dowEnum11 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum.NONE + "'", dowEnum11.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum.NONE));
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getName();
        java.lang.String str7 = fieldData2.getDowIndexStr();
        double[] doubleArray8 = fieldData2.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray8 = fieldData2.getIncTaxYr();
        double[] doubleArray9 = fieldData2.getCurrAssetsYr();
        double double10 = fieldData2.getPrice52lo();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsQtr();
        java.lang.String str12 = fieldData2.getDowIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray41 = balSheetFileData22.getCashYr();
        java.lang.String str42 = balSheetFileData22.getSector();
        double[] doubleArray43 = balSheetFileData22.getTotalLiabQtr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(doubleArray43);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/10/Q6/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q6.out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum2 = companyFileData0.getDowIndex();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setState("out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(dowEnum2);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04070");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double double13 = estimateFileData12.getEpsQ0();
        double double14 = estimateFileData12.getEpsQ1();
        java.lang.String str15 = estimateFileData12.getIndustry();
        java.lang.String str16 = estimateFileData12.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        int int7 = fieldData2.getInstSellShrs();
        java.lang.String str8 = fieldData2.getState();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        long long7 = sharesFileData0.getVolume10d();
        sharesFileData0.setDollar3m("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        double double10 = sharesFileData0.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int7 = companyFileData0.getNumEmployees();
        companyFileData0.setTicker("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str10 = companyFileData0.getPhone();
        java.lang.String str11 = companyFileData0.getState();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double3 = estimateFileData2.getEpsY0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getEquityYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getLtInvestYr();
        java.lang.String str6 = fieldData2.getCity();
        int int7 = fieldData2.getInsiderNetTrades();
        double[] doubleArray8 = fieldData2.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getGoodwillQtr();
        double[] doubleArray6 = fieldData2.getIncPrimaryEpsQtr();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        int int5 = fieldData2.getInstSellShrs();
        double[] doubleArray6 = fieldData2.getCapEx();
        java.lang.String str7 = fieldData2.getTicker();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum5 = companyFileData0.getDowIndex();
        java.lang.String str6 = companyFileData0.toString();
        java.lang.String str7 = companyFileData0.getPhone();
        org.junit.Assert.assertNull(dowEnum5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04081");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData10.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData10.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData10.setName("NONE");
        companyFileData10.setAdr("NONE");
        companyFileData10.setState("");
        incSheetFileData5.setNameFields(companyFileData10);
        double[] doubleArray22 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray23 = incSheetFileData5.getNonrecurringItemsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum24 = incSheetFileData5.getExchange();
        java.lang.String str25 = incSheetFileData5.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(exchEnum24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        net.ajaskey.common.DateTime dateTime36 = estimateFileData3.getLatestQtrEps();
        double double37 = estimateFileData3.getEpsQ1();
        net.ajaskey.common.DateTime dateTime38 = estimateFileData3.getLatestQtrEps();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(dateTime36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(dateTime38);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getSharesY();
        double[] doubleArray10 = fieldData2.getCashFromInv();
        int int11 = fieldData2.getInsiderNetTrades();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (byte) 0, 0);
        double[] doubleArray4 = sharesFileData0.getSharesQ();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray8 = fieldData7.getCogsYr();
        double[] doubleArray9 = fieldData7.getGrossIncQtr();
        double double10 = fieldData7.getEpsY1();
        double double11 = fieldData7.getEpsQ1();
        double[] doubleArray12 = fieldData7.getAcctPayableQtr();
        double[] doubleArray13 = fieldData7.getNonrecurringItemsYr();
        double[] doubleArray14 = fieldData7.getLiabEquityQtr();
        double[] doubleArray15 = fieldData7.getSharesY();
        sharesFileData0.setSharesY(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setFromReport((int) (short) 1, 0);
        double double21 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray25 = fieldData24.getCogsYr();
        int int26 = fieldData24.getNumEmployees();
        double double27 = fieldData24.getPrice52hi();
        double[] doubleArray28 = fieldData24.getPreTaxIncYr();
        double double29 = fieldData24.getFloatshr();
        double[] doubleArray30 = fieldData24.getCogsYr();
        double[] doubleArray31 = fieldData24.getPreTaxIncYr();
        double[] doubleArray32 = fieldData24.getRdQtr();
        double[] doubleArray33 = fieldData24.getOtherCurrLiabYr();
        double[] doubleArray34 = fieldData24.getStDebtQtr();
        double[] doubleArray35 = fieldData24.getTotalOpExpQtr();
        double[] doubleArray36 = fieldData24.getSharesQ();
        sharesFileData17.setSharesY(doubleArray36);
        sharesFileData0.setSharesQ(doubleArray36);
        int int39 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData1.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = estimateFileData1.getExchange();
        java.lang.String str6 = estimateFileData1.getIndustry();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getLtDebtYr();
        double[] doubleArray9 = fieldData2.getCurrLiabQtr();
        double[] doubleArray10 = fieldData2.getCashFromOps();
        java.lang.String str11 = fieldData2.getSector();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        java.lang.String str13 = fieldData2.getCity();
        double[] doubleArray14 = fieldData2.getAdjToIncYr();
        double[] doubleArray15 = fieldData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04087");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        sharesFileData0.setInstShareholders("NONE");
        double double11 = sharesFileData0.getBeta();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getUnusualIncQtr();
        double[] doubleArray37 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray38 = incSheetFileData20.getNetIncYr();
        java.lang.String str39 = incSheetFileData20.getIndustry();
        double[] doubleArray40 = incSheetFileData20.getEpsDilYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04090");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double double11 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        double[] doubleArray12 = fieldData2.getIntExpQtr();
        double[] doubleArray13 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray14 = fieldData2.getSalesQtr();
        double[] doubleArray15 = fieldData2.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getEpsDilContYr();
        double[] doubleArray8 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04095");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getSector();
        double[] doubleArray7 = fieldData2.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = fieldData2.getEstimateData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(estimateFileData8);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04096");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : NONE\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q10/out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-0Q10.out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE", "out/BigDB/10/Q100/out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-10Q100.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        double double3 = sharesFileData0.getDollar3m();
        double double4 = sharesFileData0.getInsiderOwnership();
        java.lang.String str5 = sharesFileData0.getTicker();
        double[] doubleArray6 = sharesFileData0.getSharesY();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        estimateFileData12.setNameFields(companyFileData15);
        java.lang.String str17 = companyFileData15.getWeb();
        int int18 = companyFileData15.getNumEmployees();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04099");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray12 = incSheetFileData5.getEpsContYr();
        double[] doubleArray13 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray14 = incSheetFileData5.getNetIncYr();
        double[] doubleArray15 = incSheetFileData5.getSalesYr();
        double[] doubleArray16 = incSheetFileData5.getIncAfterTaxYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04100");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData8);
        net.ajaskey.common.DateTime dateTime10 = estimateFileData8.getLatestQtrEps();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNull(dateTime10);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        int int7 = fieldData2.getYear();
        double double8 = fieldData2.getEpsQ1();
        int int9 = fieldData2.getInsiderBuys();
        double[] doubleArray10 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray11 = fieldData2.getCashFromInv();
        double double12 = fieldData2.getInsiderOwnership();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04102");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(balSheetFileData13);
        org.junit.Assert.assertNotNull(cashFileData14);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double[] doubleArray7 = fieldData2.getEpsYr();
        double double8 = fieldData2.getEpsY1();
        double[] doubleArray9 = fieldData2.getRdQtr();
        double[] doubleArray10 = fieldData2.getPrefStockQtr();
        double[] doubleArray11 = fieldData2.getEpsDilContQtr();
        net.ajaskey.common.DateTime dateTime12 = fieldData2.getCurrFiscalYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(dateTime12);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04104");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = balSheetFileData6.getOtherCurrAssetsQtr();
        double[] doubleArray8 = balSheetFileData6.getStDebtYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("");
        companyFileData0.setDowIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str10 = companyFileData0.toString();
        companyFileData0.setIndustry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getDividendQtr();
        double[] doubleArray6 = fieldData2.getOtherCurrAssetsQtr();
        int int7 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        balSheetFileData1.setNameFields(companyFileData17);
        java.lang.String str19 = companyFileData17.getSector();
        companyFileData17.setSector("out/BigDB/35/Q100/out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!-fundamental-data-35Q100.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        boolean boolean4 = fieldData2.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        double[] doubleArray6 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04109");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getDividendYr();
        double[] doubleArray9 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        java.lang.String str8 = fieldData2.getDowIndexStr();
        java.lang.String str9 = fieldData2.getCountry();
        double[] doubleArray10 = fieldData2.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04111");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray12 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        int int9 = sharesFileData0.getInstShareholders();
        double double10 = sharesFileData0.getMktCap();
        double double11 = sharesFileData0.getDollar3m();
        sharesFileData0.setInstBuyShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        double[] doubleArray7 = fieldData2.getNetIncQtr();
        java.lang.String str8 = fieldData2.getIndustry();
        double double9 = fieldData2.getBeta();
        double double10 = fieldData2.getEpsQ0();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        companyFileData0.setDrp("out/BigDB/");
        companyFileData0.setState("NONE");
        java.lang.String str6 = companyFileData0.getSector();
        companyFileData0.setSector("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getCashYr();
        double[] doubleArray7 = balSheetFileData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData8.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData8.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData2.setNameFields(companyFileData8);
        companyFileData8.setCity("");
        companyFileData8.setNumEmployees("");
        companyFileData8.setDrp("data/BigDB/");
        boolean boolean20 = companyFileData8.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum21 = companyFileData8.getDowIndex();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dowEnum21);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuys("");
        long long5 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/");
        double double8 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderNetTrades("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData0.setVolume3m("out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        sharesFileData0.setInstOwnership("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getCurrAssetsQtr();
        double double12 = fieldData2.getPrice();
        int int13 = fieldData2.getInstShareholders();
        int int14 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData0.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        sharesFileData18.setPrice("hi!");
        double[] doubleArray21 = sharesFileData18.getSharesY();
        double double22 = sharesFileData18.getPrice();
        sharesFileData18.setInsiderBuys("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(sharesFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(sharesFileData18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getIncTaxQtr();
        double[] doubleArray8 = fieldData2.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray2 = incSheetFileData0.getOtherIncQtr();
        java.lang.String str3 = incSheetFileData0.getSector();
        double[] doubleArray4 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData0.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        boolean boolean6 = companyFileData5.isDrp();
        java.lang.String str7 = companyFileData5.getStreet();
        companyFileData5.setTicker("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double11 = sharesFileData0.getMktCap();
        double double12 = sharesFileData0.getInstOwnership();
        double double13 = sharesFileData0.getInstOwnership();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toString();
        java.lang.String str4 = sharesFileData0.getIndustry();
        double double5 = sharesFileData0.getPrice();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/100/Q0/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-100Q0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        java.lang.String str12 = fieldData2.getCountry();
        double double13 = fieldData2.getEpsY1();
        int int14 = fieldData2.getInsiderSellShrs();
        double[] doubleArray15 = fieldData2.getLiabEquityYr();
        double[] doubleArray16 = fieldData2.getCashQtr();
        double double17 = fieldData2.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData18 = fieldData2.getCashData();
        double[] doubleArray19 = cashFileData18.getCashFromFinQtr();
        double[] doubleArray20 = cashFileData18.getCashFromInvQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04125");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getAdjToIncYr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        double[] doubleArray11 = incSheetFileData5.getDepreciationQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getDividendQtr();
        java.lang.String str10 = fieldData2.getDowIndexStr();
        double[] doubleArray11 = fieldData2.getTotalOpExpYr();
        double[] doubleArray12 = fieldData2.getCashYr();
        double[] doubleArray13 = fieldData2.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData14 = fieldData2.getBalSheetData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNotNull(balSheetFileData14);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getName();
        java.lang.String str8 = companyFileData0.getPhone();
        companyFileData0.setState("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str8, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04128");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        java.lang.String str6 = sharesFileData0.getSector();
        double double7 = sharesFileData0.getInstOwnership();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double11 = sharesFileData0.getMktCap();
        double double12 = sharesFileData0.getInstOwnership();
        double double13 = sharesFileData0.getBeta();
        sharesFileData0.setInsiderSellShrs("out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        int int13 = fieldData2.getInstSellShrs();
        boolean boolean14 = fieldData2.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = fieldData2.getEstimateData();
        int int16 = fieldData2.getNumEmployees();
        double[] doubleArray17 = fieldData2.getEpsDilYr();
        double[] doubleArray18 = fieldData2.getSharesY();
        double[] doubleArray19 = fieldData2.getSalesQtr();
        java.lang.String str20 = fieldData2.getStreet();
        java.lang.String str21 = fieldData2.getName();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        sharesFileData8.setInsiderOwnership("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        sharesFileData8.setPrice("data/BigDB/");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNotNull(sharesFileData8);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04132");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setSic("hi!");
        java.lang.String str12 = companyFileData4.getIndustry();
        java.lang.String str13 = companyFileData4.getState();
        java.lang.String str14 = companyFileData4.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getBvpsQtr();
        double[] doubleArray12 = fieldData2.getEpsDilContYr();
        double[] doubleArray13 = fieldData2.getRdYr();
        double[] doubleArray14 = fieldData2.getOtherLtLiabQtr();
        int int15 = fieldData2.getInstSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04134");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str10 = companyFileData9.getStreet();
        companyFileData9.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData9.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str15 = companyFileData9.getSic();
        java.lang.String str16 = companyFileData9.getIndustry();
        incSheetFileData5.setNameFields(companyFileData9);
        double[] doubleArray18 = incSheetFileData5.getEpsDilYr();
        java.lang.String str19 = incSheetFileData5.getIndustry();
        double[] doubleArray20 = incSheetFileData5.getIntExpQtr();
        double[] doubleArray21 = incSheetFileData5.getIncAfterTaxYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04135");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray9 = incSheetFileData5.getNetIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray11 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray12 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray13 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getAcctRxYr();
        double[] doubleArray10 = fieldData2.getCashFromInv();
        int int11 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum12 = fieldData2.getExchange();
        double[] doubleArray13 = fieldData2.getEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(exchEnum12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData2.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        java.lang.String str8 = fieldData2.getCountry();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        int int10 = fieldData2.getInstSellShrs();
        double[] doubleArray11 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04140");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double double13 = estimateFileData12.getEpsQ0();
        double double14 = estimateFileData12.getEpsQ1();
        java.lang.String str15 = estimateFileData12.getSector();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(1, (int) (byte) -1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 100, 35, filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        double double5 = fieldData2.getEpsY0();
        double double6 = fieldData2.getMktCap();
        double[] doubleArray7 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        java.lang.String str7 = fieldData2.getCity();
        int int8 = fieldData2.getInstBuyShrs();
        double[] doubleArray9 = fieldData2.getCashFromInv();
        double double10 = fieldData2.getEpsY2();
        double[] doubleArray11 = fieldData2.getCashQtr();
        double[] doubleArray12 = fieldData2.getIncPrimaryEpsYr();
        int int13 = fieldData2.getInsiderNetTrades();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int3 = companyFileData0.getNumEmployees();
        java.lang.String str4 = companyFileData0.getTicker();
        companyFileData0.setExchange("NONE");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = fieldData2.getCompanyInfo();
        java.lang.String[] strArray18 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        double double25 = estimateFileData24.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData26 = null;
        estimateFileData24.setNameFields(companyFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray31 = fieldData30.getCogsYr();
        double[] doubleArray32 = fieldData30.getGrossIncQtr();
        double double33 = fieldData30.getEpsY1();
        double[] doubleArray34 = fieldData30.getDividendYr();
        net.ajaskey.common.DateTime dateTime35 = fieldData30.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData36 = fieldData30.getShares();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray43 = incSheetFileData42.getEpsContYr();
        java.lang.String str44 = incSheetFileData42.getIndustry();
        double[] doubleArray45 = incSheetFileData42.getSalesQtr();
        double[] doubleArray46 = incSheetFileData42.getIntExpNonOpYr();
        double[] doubleArray47 = incSheetFileData42.getNonrecurringItemsQtr();
        double[] doubleArray48 = incSheetFileData42.getIncTaxYr();
        double[] doubleArray49 = incSheetFileData42.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData51);
        double[] doubleArray53 = balSheetFileData52.getLtDebtYr();
        java.lang.String str54 = balSheetFileData52.toDbOutput();
        java.lang.String str55 = balSheetFileData52.getName();
        double[] doubleArray56 = balSheetFileData52.getAcctRxYr();
        java.lang.String[] strArray62 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData65 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData66 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData69 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData12, estimateFileData24, sharesFileData36, incSheetFileData42, balSheetFileData52, cashFileData66, 0, 10);
        double[] doubleArray70 = fieldData69.getCapEx();
        double double71 = fieldData69.getPrice();
        double[] doubleArray72 = fieldData69.getIntExpYr();
        double[] doubleArray73 = fieldData69.getDividendYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNotNull(cashFileData22);
        org.junit.Assert.assertNotNull(incSheetFileData23);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(dateTime35);
        org.junit.Assert.assertNotNull(sharesFileData36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(incSheetFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(companyFileData65);
        org.junit.Assert.assertNotNull(cashFileData66);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray73);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        java.lang.String str9 = companyFileData8.getZip();
        companyFileData8.setWeb("NONE");
        companyFileData8.setNumEmployees("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str14 = companyFileData8.getCity();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        java.lang.String str40 = estimateFileData3.getSector();
        double double41 = estimateFileData3.getEpsQ0();
        java.lang.String str42 = estimateFileData3.toDbOutput();
        double double43 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum44 = estimateFileData3.getExchange();
        java.lang.String str45 = estimateFileData3.getTicker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(exchEnum39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNull(exchEnum44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double double6 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getSector();
        java.lang.String str37 = estimateFileData3.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum38 = estimateFileData3.getExchange();
        java.lang.String str39 = estimateFileData3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(exchEnum38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        java.lang.String str9 = fieldData2.getCountry();
        double[] doubleArray10 = fieldData2.getIntExpNonOpYr();
        double[] doubleArray11 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04153");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray11 = incSheetFileData5.getIncPrimaryEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        int int4 = fieldData2.getQuarter();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray7 = fieldData2.getIncPrimaryEpsYr();
        int int8 = fieldData2.getInsiderSells();
        net.ajaskey.common.DateTime dateTime9 = fieldData2.getCurrFiscalYear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTime9);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCountry("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.Class<?> wildcardClass9 = companyFileData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        int int5 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setMktCap("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setAdr("out/BigDB/");
        companyFileData0.setState("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDrp("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double double6 = fieldData2.getEpsY2();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double double8 = fieldData2.getEpsY2();
        double double9 = fieldData2.getBeta();
        int int10 = fieldData2.getInsiderNetTrades();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray12 = fieldData2.getInventoryQtr();
        double[] doubleArray13 = fieldData2.getCashYr();
        fieldData2.setQuarter((int) (byte) 1);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04159");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str10 = companyFileData9.getStreet();
        companyFileData9.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData9.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str15 = companyFileData9.getSic();
        java.lang.String str16 = companyFileData9.getIndustry();
        incSheetFileData5.setNameFields(companyFileData9);
        java.lang.String str18 = companyFileData9.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData19.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double23 = estimateFileData22.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int25 = sharesFileData24.getInstShareholders();
        double double26 = sharesFileData24.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData27.setFromReport((int) (byte) 0, 0);
        double[] doubleArray31 = sharesFileData27.getSharesQ();
        sharesFileData24.setSharesQ(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData24);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        double[] doubleArray40 = incSheetFileData39.getEpsContYr();
        double[] doubleArray41 = incSheetFileData39.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData43);
        double[] doubleArray45 = balSheetFileData44.getLtDebtYr();
        java.lang.String str46 = balSheetFileData44.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = fieldData49.getCashData();
        double[] doubleArray51 = cashFileData50.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData19, estimateFileData22, sharesFileData33, incSheetFileData39, balSheetFileData44, cashFileData50, (int) '#', 0);
        java.lang.String str55 = estimateFileData22.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum56 = estimateFileData22.getExchange();
        java.lang.String str57 = estimateFileData22.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum58 = estimateFileData22.getExchange();
        net.ajaskey.common.DateTime dateTime59 = estimateFileData22.getLatestQtrEps();
        java.lang.String str60 = estimateFileData22.toDbOutput();
        java.lang.String str61 = estimateFileData22.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData62.setFromReport((int) (short) 1, 0);
        sharesFileData62.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum68 = sharesFileData62.getExchange();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData74 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList72);
        double[] doubleArray75 = incSheetFileData74.getEpsContYr();
        double[] doubleArray76 = incSheetFileData74.getDividendYr();
        double[] doubleArray77 = incSheetFileData74.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData78 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData79 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData78);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData80 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData79);
        double[] doubleArray81 = balSheetFileData80.getLtDebtYr();
        double[] doubleArray82 = balSheetFileData80.getOtherCurrAssetsQtr();
        double[] doubleArray83 = balSheetFileData80.getCashYr();
        double[] doubleArray84 = balSheetFileData80.getAcctPayableYr();
        double[] doubleArray85 = balSheetFileData80.getLtDebtYr();
        double[] doubleArray86 = balSheetFileData80.getTotalAssetsQtr();
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData92 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList90);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData93 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList90);
        double[] doubleArray94 = cashFileData93.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData97 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData22, sharesFileData62, incSheetFileData74, balSheetFileData80, cashFileData93, 100, (int) (short) 0);
        double[] doubleArray98 = incSheetFileData74.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(incSheetFileData39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(cashFileData50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(exchEnum56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(exchEnum58);
        org.junit.Assert.assertNull(dateTime59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(exchEnum68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(incSheetFileData74);
        org.junit.Assert.assertNull(doubleArray75);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNull(doubleArray77);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertNull(doubleArray82);
        org.junit.Assert.assertNull(doubleArray83);
        org.junit.Assert.assertNull(doubleArray84);
        org.junit.Assert.assertNull(doubleArray85);
        org.junit.Assert.assertNull(doubleArray86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(incSheetFileData92);
        org.junit.Assert.assertNotNull(cashFileData93);
        org.junit.Assert.assertNull(doubleArray94);
        org.junit.Assert.assertNull(doubleArray98);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, (int) (byte) 1);
        double[] doubleArray3 = fieldData2.getLtInvestQtr();
        double double4 = fieldData2.getEpsQ1();
        int int5 = fieldData2.getYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        java.lang.String str40 = estimateFileData3.getSector();
        double double41 = estimateFileData3.getEpsQ0();
        java.lang.String str42 = estimateFileData3.toDbOutput();
        double double43 = estimateFileData3.getEpsQ0();
        double double44 = estimateFileData3.getEpsY2();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(exchEnum39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double double5 = fieldData2.getInsiderNetPercentOutstanding();
        java.lang.String str6 = fieldData2.getTicker();
        double[] doubleArray7 = fieldData2.getSalesYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04163");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        int int10 = companyFileData9.getNumEmployees();
        companyFileData9.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData9.setStreet("NONE");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double16 = estimateFileData15.getEpsQ0();
        double double17 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData18.setFromReport((int) (short) 1, 0);
        double double22 = sharesFileData18.getFloatshr();
        int int23 = sharesFileData18.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum24 = sharesFileData18.getExchange();
        sharesFileData18.setFloatshr("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData27.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double31 = estimateFileData30.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int33 = sharesFileData32.getInstShareholders();
        double double34 = sharesFileData32.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData35.setFromReport((int) (byte) 0, 0);
        double[] doubleArray39 = sharesFileData35.getSharesQ();
        sharesFileData32.setSharesQ(doubleArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData32);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData47 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList45);
        double[] doubleArray48 = incSheetFileData47.getEpsContYr();
        double[] doubleArray49 = incSheetFileData47.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData51);
        double[] doubleArray53 = balSheetFileData52.getLtDebtYr();
        java.lang.String str54 = balSheetFileData52.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData58 = fieldData57.getCashData();
        double[] doubleArray59 = cashFileData58.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData27, estimateFileData30, sharesFileData41, incSheetFileData47, balSheetFileData52, cashFileData58, (int) '#', 0);
        double[] doubleArray63 = incSheetFileData47.getPreTaxIncYr();
        double[] doubleArray64 = incSheetFileData47.getEpsDilContYr();
        double[] doubleArray65 = incSheetFileData47.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData66 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData66);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData67);
        double[] doubleArray69 = balSheetFileData67.getCurrLiabYr();
        double[] doubleArray70 = balSheetFileData67.getStDebtQtr();
        double[] doubleArray71 = balSheetFileData67.getOtherLtLiabYr();
        double[] doubleArray72 = balSheetFileData67.getTotalAssetsYr();
        double[] doubleArray73 = balSheetFileData67.getNetFixedAssetsYr();
        double[] doubleArray74 = balSheetFileData67.getInventoryQtr();
        double[] doubleArray75 = balSheetFileData67.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData79 = fieldData78.getCashData();
        java.lang.String str80 = cashFileData79.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData83 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData15, sharesFileData18, incSheetFileData47, balSheetFileData67, cashFileData79, (int) 'a', (int) '4');
        double[] doubleArray84 = balSheetFileData67.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(exchEnum24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(incSheetFileData47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(cashFileData58);
        org.junit.Assert.assertNull(doubleArray59);
        org.junit.Assert.assertNull(doubleArray63);
        org.junit.Assert.assertNull(doubleArray64);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(doubleArray75);
        org.junit.Assert.assertNotNull(cashFileData79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(doubleArray84);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShares();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04165");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getIntExpYr();
        double[] doubleArray37 = incSheetFileData20.getAdjToIncQtr();
        double[] doubleArray38 = incSheetFileData20.getDividendYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04166");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        companyFileData0.setName("hi!");
        java.lang.String str12 = companyFileData0.getWeb();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum13 = companyFileData0.getExchange();
        java.lang.String str14 = companyFileData0.getName();
        boolean boolean15 = companyFileData0.isDrp();
        java.lang.String str16 = companyFileData0.getTicker();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray12 = fieldData2.getStDebtQtr();
        double[] doubleArray13 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray14 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray15 = fieldData2.getGrossOpExpQtr();
        double double16 = fieldData2.getEpsQ1();
        double[] doubleArray17 = fieldData2.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double double36 = fieldData35.getPrice52hi();
        double double37 = fieldData35.getInstOwnership();
        double[] doubleArray38 = fieldData35.getTotalOpExpQtr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass39 = doubleArray38.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        double double2 = sharesFileData0.getBeta();
        sharesFileData0.setInsiderBuys("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        sharesFileData0.setInstOwnership("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setInsiderSellShrs("out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!");
        int int9 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        companyFileData0.setName("");
        companyFileData0.setPhone("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double[] doubleArray8 = fieldData2.getCashYr();
        java.lang.String str9 = fieldData2.getStreet();
        java.lang.String str10 = fieldData2.getName();
        double[] doubleArray11 = fieldData2.getLtInvestYr();
        double double12 = fieldData2.getPrice52lo();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04172");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray7 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray8 = incSheetFileData5.getDividendYr();
        double[] doubleArray9 = incSheetFileData5.getSalesQtr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getRdQtr();
        java.lang.String str12 = incSheetFileData5.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getLtDebtQtr();
        double[] doubleArray7 = balSheetFileData2.getCashQtr();
        java.lang.String str8 = balSheetFileData2.getExchange();
        double[] doubleArray9 = balSheetFileData2.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        java.lang.String str11 = fieldData2.getSnpIndexStr();
        int int12 = fieldData2.getInstBuyShrs();
        double[] doubleArray13 = fieldData2.getSharesY();
        double[] doubleArray14 = fieldData2.getSalesQtr();
        double[] doubleArray15 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray16 = fieldData2.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        java.lang.String str7 = fieldData2.getCity();
        double[] doubleArray8 = fieldData2.getIntExpNonOpQtr();
        int int9 = fieldData2.getNumEmployees();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        java.lang.String str9 = fieldData2.getName();
        int int10 = fieldData2.getInsiderSellShrs();
        double[] doubleArray11 = fieldData2.getInventoryYr();
        double[] doubleArray12 = fieldData2.getEpsYr();
        long long13 = fieldData2.getVolumeMonth3m();
        double double14 = fieldData2.getMktCap();
        double[] doubleArray15 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04177");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData6.setDowIndex("");
        companyFileData6.setStreet("NONE");
        companyFileData6.setName("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        java.lang.String str13 = companyFileData6.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32." + "'", str13, "out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        java.lang.String str12 = fieldData2.getCountry();
        double double13 = fieldData2.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum14 = fieldData2.getExchange();
        java.lang.String str15 = fieldData2.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = fieldData2.getIncSheetData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(exchEnum14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) '4');
        double[] doubleArray3 = fieldData2.getPrefStockQtr();
        java.lang.String str4 = fieldData2.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        int int4 = sharesFileData0.getInsiderNetTrades();
        int int5 = sharesFileData0.getInsiderSells();
        sharesFileData0.setMktCap("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int9 = sharesFileData8.getInstShareholders();
        java.lang.String str10 = sharesFileData8.getName();
        double[] doubleArray11 = sharesFileData8.getSharesY();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int13 = sharesFileData12.getInstShareholders();
        double double14 = sharesFileData12.getInsiderNetPercentOutstanding();
        java.lang.String str15 = sharesFileData12.getName();
        long long16 = sharesFileData12.getVolumeMonth3m();
        double[] doubleArray17 = sharesFileData12.getSharesY();
        sharesFileData8.setSharesQ(doubleArray17);
        sharesFileData0.setSharesY(doubleArray17);
        int int20 = sharesFileData0.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData21.setFromReport((int) (short) 1, 0);
        java.lang.String str25 = sharesFileData21.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray29 = fieldData28.getCogsYr();
        int int30 = fieldData28.getNumEmployees();
        double double31 = fieldData28.getPrice52hi();
        double[] doubleArray32 = fieldData28.getStDebtYr();
        double double33 = fieldData28.getEpsQ0();
        double[] doubleArray34 = fieldData28.getIncAfterTaxYr();
        double[] doubleArray35 = fieldData28.getSharesY();
        sharesFileData21.setSharesQ(doubleArray35);
        sharesFileData0.setSharesY(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0]");
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04181");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str11 = companyFileData10.getStreet();
        companyFileData10.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData10.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str16 = companyFileData10.getSic();
        java.lang.String str17 = companyFileData10.getIndustry();
        java.lang.String str18 = companyFileData10.getZip();
        boolean boolean19 = companyFileData10.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum20 = companyFileData10.getExchange();
        companyFileData10.setDrp("Cash File Data");
        boolean boolean23 = companyFileData10.isDrp();
        incSheetFileData5.setNameFields(companyFileData10);
        java.lang.String str25 = incSheetFileData5.toString();
        double[] doubleArray26 = incSheetFileData5.getIntExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(exchEnum20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(doubleArray26);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        java.lang.String str9 = incSheetFileData8.getName();
        double[] doubleArray10 = incSheetFileData8.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getLtDebtYr();
        double[] doubleArray9 = fieldData2.getCurrLiabYr();
        double[] doubleArray10 = fieldData2.getPrefStockQtr();
        double[] doubleArray11 = fieldData2.getEpsYr();
        double[] doubleArray12 = fieldData2.getAcctRxQtr();
        java.lang.String str13 = fieldData2.getDowIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        balSheetFileData1.setNameFields(companyFileData17);
        companyFileData17.setCountry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str21 = companyFileData17.getTicker();
        companyFileData17.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData17.setCountry("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04185");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) 0, 35);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        double double7 = fieldData2.getFloatshr();
        long long8 = fieldData2.getVolumeMonth3m();
        double[] doubleArray9 = fieldData2.getLiabEquityYr();
        double[] doubleArray10 = fieldData2.getCashYr();
        boolean boolean11 = fieldData2.isDrp();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04187");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) -1, 0, "out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/-1/Q0/out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data--1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!" + "'", str4, "out/BigDB/-1/Q0/out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data--1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        java.lang.String str6 = fieldData2.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = cashFileData7.getCashFromInvQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double double10 = fieldData2.getInsiderOwnership();
        net.ajaskey.common.DateTime dateTime11 = fieldData2.getLatestQtrEps();
        java.lang.String str12 = fieldData2.getPhone();
        double double13 = fieldData2.getPrice();
        double[] doubleArray14 = fieldData2.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(dateTime11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        int int5 = sharesFileData0.getInsiderSells();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str15 = companyFileData14.getCountry();
        sharesFileData0.setNameFields(companyFileData14);
        int int17 = sharesFileData0.getInsiderNetTrades();
        sharesFileData0.setInstSellShrs("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setInsiderBuyShrs("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
        sharesFileData0.setInsiderBuyShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04191");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04192");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getCashFromInv();
        int int12 = fieldData2.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = fieldData2.getCompanyInfo();
        java.lang.String str14 = companyFileData13.getCountry();
        companyFileData13.setDrp("");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/100/Q0/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-100Q0.", "out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!");
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getNetIncYr();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getEpsContYr();
        double[] doubleArray4 = fieldData2.getPrefStockQtr();
        double[] doubleArray5 = fieldData2.getRdQtr();
        double[] doubleArray6 = fieldData2.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        double[] doubleArray5 = fieldData2.getStDebtQtr();
        int int6 = fieldData2.getInstSellShrs();
        double[] doubleArray7 = fieldData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04197");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        double[] doubleArray5 = fieldData2.getLiabEquityYr();
        double double6 = fieldData2.getDollar3m();
        double[] doubleArray7 = fieldData2.getSharesQ();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getGrossOpExpYr();
        java.lang.String str9 = fieldData2.getName();
        int int10 = fieldData2.getNumEmployees();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04199");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getStDebtYr();
        double[] doubleArray11 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray12 = fieldData2.getSharesY();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04201");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxYr();
        java.lang.String str12 = incSheetFileData5.getName();
        double[] doubleArray13 = incSheetFileData5.getDividendYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        double[] doubleArray7 = incSheetFileData6.getCogsQtr();
        double[] doubleArray8 = incSheetFileData6.getGrossOpExpYr();
        java.lang.String str9 = incSheetFileData6.getIndustry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray41 = incSheetFileData20.getAdjToIncQtr();
        double[] doubleArray42 = incSheetFileData20.getCogsYr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum12 = fieldData2.getSnpIndex();
        double[] doubleArray13 = fieldData2.getAcctRxQtr();
        double[] doubleArray14 = fieldData2.getGrossOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(snpEnum12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        int int6 = sharesFileData0.getInsiderNetTrades();
        double double7 = sharesFileData0.getPrice52hi();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getSharesY();
        int int11 = fieldData2.getInsiderSells();
        double double12 = fieldData2.getInstOwnership();
        double[] doubleArray13 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray14 = fieldData2.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getRdQtr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04208");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsYr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray12 = incSheetFileData5.getEpsDilQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
        double[] doubleArray8 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray9 = balSheetFileData2.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getSharesQ();
        double[] doubleArray5 = fieldData2.getCashQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04211");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderOwnership("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        sharesFileData0.setInsiderSellShrs("out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
        sharesFileData0.setInsiderOwnership("out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getInventoryQtr();
        double[] doubleArray10 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray11 = fieldData2.getGrossOpExpQtr();
        java.lang.String str12 = fieldData2.getDowIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04213");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData7.getCashYr();
        java.lang.String str10 = balSheetFileData7.getTicker();
        double[] doubleArray11 = balSheetFileData7.getCashQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04214");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getPrefStockYr();
        double[] doubleArray4 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData0.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList17);
        double[] doubleArray19 = incSheetFileData18.getPreTaxIncQtr();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(sharesFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getEpsDilYr();
        double[] doubleArray7 = fieldData2.getAdjToIncQtr();
        double[] doubleArray8 = fieldData2.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = fieldData2.getCompanyInfo();
        double[] doubleArray10 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double double8 = fieldData2.getMktCap();
        double[] doubleArray9 = fieldData2.getLtDebtYr();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getCurrAssetsYr();
        double[] doubleArray12 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        companyFileData0.setCity("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str13 = companyFileData12.getStreet();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList24 = companyFileData12.set((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList25 = companyFileData0.set((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        double double27 = estimateFileData26.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean29 = companyFileData28.isAdr();
        java.lang.String str30 = companyFileData28.getState();
        java.lang.String str31 = companyFileData28.getSnpIndexStr();
        estimateFileData26.setNameFields(companyFileData28);
        java.lang.String str33 = estimateFileData26.toString();
        java.lang.String str34 = estimateFileData26.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(incSheetFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertNotNull(estimateFileData21);
        org.junit.Assert.assertNotNull(cashFileData22);
        org.junit.Assert.assertNotNull(balSheetFileData23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(estimateFileData26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray6 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getIncPrimaryEpsQtr();
        double[] doubleArray7 = fieldData2.getRdQtr();
        double[] doubleArray8 = fieldData2.getOtherLtAssetsYr();
        double double9 = fieldData2.getEpsY2();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        fieldData2.setQuarter(0);
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        java.lang.String str10 = fieldData2.getCountry();
        double double11 = fieldData2.getInsiderOwnership();
        double[] doubleArray12 = fieldData2.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04224");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray9 = incSheetFileData5.getNetIncYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpYr();
        java.lang.String str11 = incSheetFileData5.toDbOutput();
        double[] doubleArray12 = incSheetFileData5.getEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (byte) 0, 0);
        double[] doubleArray4 = sharesFileData0.getSharesQ();
        sharesFileData0.setMktCap("out/BigDB/");
        sharesFileData0.setFromReport((-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray13 = fieldData12.getCogsYr();
        double[] doubleArray14 = fieldData12.getGrossIncQtr();
        double double15 = fieldData12.getEpsY1();
        double[] doubleArray16 = fieldData12.getDividendYr();
        net.ajaskey.common.DateTime dateTime17 = fieldData12.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = fieldData12.getShares();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean21 = companyFileData20.isAdr();
        java.lang.String str22 = companyFileData20.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum23 = companyFileData20.getSnpIndex();
        java.lang.String str24 = companyFileData20.toString();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int35 = sharesFileData34.getInstShareholders();
        double double36 = sharesFileData34.getDollar3m();
        sharesFileData34.setVolume10d("");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData44 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList42);
        double[] doubleArray45 = incSheetFileData44.getEpsDilYr();
        double[] doubleArray46 = incSheetFileData44.getNetIncYr();
        double[] doubleArray47 = incSheetFileData44.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData48 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData49);
        double[] doubleArray51 = balSheetFileData50.getLtDebtYr();
        java.lang.String str52 = balSheetFileData50.toDbOutput();
        double[] doubleArray53 = balSheetFileData50.getLtInvestYr();
        java.lang.String[] strArray59 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData62 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList60);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData63 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList60);
        double[] doubleArray64 = cashFileData63.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData33, sharesFileData34, incSheetFileData44, balSheetFileData50, cashFileData63, (int) (byte) -1, (int) (short) 100);
        sharesFileData18.setNameFields(companyFileData20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData69 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int70 = sharesFileData69.getInstShareholders();
        double double71 = sharesFileData69.getDollar3m();
        double double72 = sharesFileData69.getDollar3m();
        sharesFileData69.setInsiderOwnership("out/BigDB/");
        int int75 = sharesFileData69.getInsiderBuys();
        double double76 = sharesFileData69.getFloatshr();
        double[] doubleArray77 = sharesFileData69.getSharesQ();
        sharesFileData18.setSharesQ(doubleArray77);
        sharesFileData0.setSharesQ(doubleArray77);
        int int80 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(dateTime17);
        org.junit.Assert.assertNotNull(sharesFileData18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(snpEnum23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(incSheetFileData30);
        org.junit.Assert.assertNotNull(companyFileData31);
        org.junit.Assert.assertNotNull(estimateFileData32);
        org.junit.Assert.assertNotNull(estimateFileData33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(incSheetFileData44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(companyFileData62);
        org.junit.Assert.assertNotNull(cashFileData63);
        org.junit.Assert.assertNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04226");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        companyFileData12.setPhone("out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray8 = fieldData2.getEpsDilYr();
        int int9 = fieldData2.getNumEmployees();
        java.lang.String str10 = fieldData2.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = fieldData2.getBalSheetData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        companyFileData0.setDrp("out/BigDB/");
        companyFileData0.setState("NONE");
        java.lang.String str6 = companyFileData0.getSector();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList18 = companyFileData0.set((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList18);
        double[] doubleArray20 = balSheetFileData19.getOtherLtAssetsYr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(incSheetFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNotNull(estimateFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(sharesFileData17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(balSheetFileData19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        java.lang.String str3 = estimateFileData1.getSector();
        double double4 = estimateFileData1.getEpsQ1();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData1.getCurrFiscalYear();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(dateTime5);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        sharesFileData0.setDollar3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int9 = sharesFileData0.getInsiderSells();
        sharesFileData0.setMktCap("NONE");
        sharesFileData0.setInsiderBuys("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double14 = sharesFileData0.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double double36 = fieldData35.getPrice52hi();
        double[] doubleArray37 = fieldData35.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData38 = fieldData35.getShares();
        int int39 = sharesFileData38.getInsiderNetTrades();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(sharesFileData38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray7 = fieldData6.getCogsYr();
        int int8 = fieldData6.getNumEmployees();
        double double9 = fieldData6.getPrice52hi();
        double[] doubleArray10 = fieldData6.getPreTaxIncYr();
        double[] doubleArray11 = fieldData6.getCogsQtr();
        double double12 = fieldData6.getBeta();
        java.lang.String str13 = fieldData6.getTicker();
        double[] doubleArray14 = fieldData6.getPrefStockYr();
        double[] doubleArray15 = fieldData6.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray15);
        sharesFileData0.setVolume10d("out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04233");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray11 = incSheetFileData10.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData10.getIncAfterTaxQtr();
        double[] doubleArray13 = incSheetFileData10.getGrossIncQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04234");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpExpQtr();
        java.lang.String str12 = incSheetFileData5.getSector();
        double[] doubleArray13 = incSheetFileData5.getSalesYr();
        double[] doubleArray14 = incSheetFileData5.getDepreciationQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        sharesFileData0.setInsiderBuyShrs("out/BigDB/");
        double[] doubleArray8 = sharesFileData0.getSharesY();
        java.lang.String str9 = sharesFileData0.getName();
        sharesFileData0.setBeta("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        double[] doubleArray7 = fieldData2.getIncTaxYr();
        double[] doubleArray8 = fieldData2.getEquityYr();
        double[] doubleArray9 = fieldData2.getStInvestYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setAdr("data/BigDB/");
        java.lang.String str7 = companyFileData0.getCity();
        companyFileData0.setZip("out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!");
        java.lang.String str10 = companyFileData0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str3 = companyFileData0.getState();
        java.lang.String str4 = companyFileData0.getStreet();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = companyFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str7 = companyFileData6.getStreet();
        companyFileData6.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData6.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str12 = companyFileData6.getSic();
        java.lang.String str13 = companyFileData6.getIndustry();
        java.lang.String str14 = companyFileData6.getZip();
        boolean boolean15 = companyFileData6.isAdr();
        companyFileData6.setName("hi!");
        java.lang.String str18 = companyFileData6.getStreet();
        java.lang.String[] strArray24 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList32 = companyFileData6.set((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList33 = companyFileData0.set(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList33);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(companyFileData27);
        org.junit.Assert.assertNotNull(cashFileData28);
        org.junit.Assert.assertNotNull(estimateFileData29);
        org.junit.Assert.assertNotNull(companyFileData30);
        org.junit.Assert.assertNotNull(companyFileData31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(sharesFileData34);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray10 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str11 = balSheetFileData1.toString();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray14 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double11 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInstOwnership("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        double[] doubleArray7 = fieldData2.getOtherCurrLiabYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04242");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", (int) (byte) 0, (int) ' ', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double double8 = fieldData2.getPrice();
        double[] doubleArray9 = fieldData2.getCurrLiabYr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", (int) ' ', (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        double[] doubleArray9 = cashFileData8.getCapExQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getEpsDilQtr();
        java.lang.String str7 = fieldData2.getWeb();
        fieldData2.setYear(1);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        int int5 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setInsiderSells("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData0.setFromReport((int) (short) 1, (int) (byte) 10);
        double double11 = sharesFileData0.getPrice();
        double double12 = sharesFileData0.getBeta();
        double double13 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        balSheetFileData1.setNameFields(companyFileData17);
        double[] doubleArray19 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray20 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray21 = balSheetFileData1.getStInvestYr();
        double[] doubleArray22 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray23 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04250");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double[] doubleArray8 = fieldData2.getAcctPayableYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = fieldData2.getCompanyInfo();
        java.lang.String str10 = fieldData2.getDowIndexStr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray12 = fieldData2.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        double double4 = fieldData2.getEpsQ1();
        double[] doubleArray5 = fieldData2.getSharesY();
        double[] doubleArray6 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        sharesFileData14.setInstShareholders("out/BigDB/");
        sharesFileData14.setFloatshr("");
        sharesFileData14.setBeta("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double42 = sharesFileData14.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04253");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray10 = sharesFileData9.getSharesQ();
        double double11 = sharesFileData9.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum12 = sharesFileData9.getExchange();
        int int13 = sharesFileData9.getInsiderNetTrades();
        int int14 = sharesFileData9.getInsiderSells();
        sharesFileData9.setBeta("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(exchEnum12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getGoodwillQtr();
        double[] doubleArray9 = fieldData2.getLiabEquityYr();
        double[] doubleArray10 = fieldData2.getPreTaxIncYr();
        double double11 = fieldData2.getFloatshr();
        double[] doubleArray12 = fieldData2.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04255");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/1/Q35/-fundamental-data-1Q35.", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04256");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData2.getEquityQtr();
        double[] doubleArray6 = balSheetFileData2.getStInvestYr();
        double[] doubleArray7 = balSheetFileData2.getCashYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean9 = companyFileData8.isAdr();
        java.lang.String str10 = companyFileData8.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum11 = companyFileData8.getSnpIndex();
        java.lang.String str12 = companyFileData8.toString();
        companyFileData8.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        balSheetFileData2.setNameFields(companyFileData8);
        java.lang.String str16 = companyFileData8.getIndustry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(snpEnum11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum9 = fieldData2.getSnpIndex();
        double[] doubleArray10 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04258");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray10 = cashFileData9.getCashFromInvQtr();
        java.lang.String str11 = cashFileData9.toDbOutput();
        double[] doubleArray12 = cashFileData9.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData13);
        double[] doubleArray16 = cashFileData13.getCashFromFinQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        java.lang.String str6 = sharesFileData0.getName();
        double double7 = sharesFileData0.getPrice52hi();
        java.lang.String str8 = sharesFileData0.getName();
        long long9 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        int int5 = fieldData2.getInstSellShrs();
        double[] doubleArray6 = fieldData2.getCapEx();
        double[] doubleArray7 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04262");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray41 = balSheetFileData22.getAcctRxYr();
        double[] doubleArray42 = balSheetFileData22.getPrefStockYr();
        java.lang.String str43 = balSheetFileData22.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean45 = companyFileData44.isAdr();
        java.lang.String str46 = companyFileData44.getDowIndexStr();
        companyFileData44.setIndustry("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        balSheetFileData22.setNameFields(companyFileData44);
        double[] doubleArray50 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray51 = balSheetFileData22.getCashYr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        sharesFileData0.setFromReport((int) (short) 0, (int) (short) 10);
        sharesFileData0.setPrice("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        int int16 = sharesFileData0.getInsiderNetTrades();
        java.lang.String str17 = sharesFileData0.getSector();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04264");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getOtherLtAssetsYr();
        double[] doubleArray7 = fieldData2.getRdQtr();
        double double8 = fieldData2.getDollar3m();
        int int9 = fieldData2.getInstSellShrs();
        java.lang.String str10 = fieldData2.getSic();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04265");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray10 = cashFileData9.getCashFromInvQtr();
        java.lang.String str11 = cashFileData9.toDbOutput();
        double[] doubleArray12 = cashFileData9.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData13);
        double[] doubleArray15 = cashFileData14.getCashFromOpsQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getLiabEquityQtr();
        double[] doubleArray8 = balSheetFileData2.getAcctRxQtr();
        double[] doubleArray9 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray10 = balSheetFileData2.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        java.lang.String str5 = fieldData2.getDowIndexStr();
        double[] doubleArray6 = fieldData2.getAdjToIncYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        java.lang.String str8 = fieldData2.getIndustry();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04269");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        java.lang.String str7 = fieldData2.getZip();
        double[] doubleArray8 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray9 = fieldData2.getEpsQtr();
        double[] doubleArray10 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum5 = companyFileData0.getDowIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double7 = estimateFileData6.getEpsQ0();
        double double8 = estimateFileData6.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData6);
        double double10 = estimateFileData9.getEpsY0();
        java.lang.String str11 = estimateFileData9.getTicker();
        double double12 = estimateFileData9.getEpsY1();
        net.ajaskey.common.DateTime dateTime13 = estimateFileData9.getCurrFiscalYear();
        java.lang.String str14 = estimateFileData9.toString();
        double double15 = estimateFileData9.getEpsY0();
        double double16 = estimateFileData9.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setFromReport((int) (short) 1, 0);
        sharesFileData17.setFloatshr("");
        java.lang.String str23 = sharesFileData17.getName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        double[] doubleArray30 = incSheetFileData29.getOtherIncYr();
        double[] doubleArray31 = incSheetFileData29.getEpsContQtr();
        double[] doubleArray32 = incSheetFileData29.getDividendYr();
        double[] doubleArray33 = incSheetFileData29.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData34 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData34);
        double[] doubleArray36 = balSheetFileData35.getCurrLiabYr();
        double[] doubleArray37 = balSheetFileData35.getGoodwillYr();
        double[] doubleArray38 = balSheetFileData35.getEquityYr();
        java.lang.String str39 = balSheetFileData35.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = fieldData42.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData43.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData9, sharesFileData17, incSheetFileData29, balSheetFileData35, cashFileData43, (int) (byte) -1, (int) (byte) -1);
        double[] doubleArray49 = incSheetFileData29.getNonrecurringItemsYr();
        double[] doubleArray50 = incSheetFileData29.getEpsContQtr();
        double[] doubleArray51 = incSheetFileData29.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(dowEnum5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(incSheetFileData29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(cashFileData43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04271");
        java.lang.String[] strArray4 = new java.lang.String[] { "data/BigDB/", "out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setFromReport((int) (byte) -1, (int) (byte) 10);
        double[] doubleArray8 = sharesFileData0.getSharesQ();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str12 = fieldData11.getDowIndexStr();
        double[] doubleArray13 = fieldData11.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum14 = fieldData11.getExchange();
        double[] doubleArray15 = fieldData11.getCogsQtr();
        fieldData11.setYear((int) (byte) 1);
        double[] doubleArray18 = fieldData11.getSharesQ();
        sharesFileData0.setSharesY(doubleArray18);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(exchEnum14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04273");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        java.lang.String str14 = estimateFileData12.getSector();
        double double15 = estimateFileData12.getEpsY2();
        java.lang.String str16 = estimateFileData12.getTicker();
        double double17 = estimateFileData12.getEpsQ0();
        net.ajaskey.common.DateTime dateTime18 = estimateFileData12.getLatestQtrEps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(dateTime18);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04274");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getCashYr();
        double[] doubleArray9 = fieldData2.getAcctRxYr();
        double[] doubleArray10 = fieldData2.getOtherCurrLiabYr();
        java.lang.String str11 = fieldData2.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04275");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", 6, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04276");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        double[] doubleArray7 = fieldData2.getEquityYr();
        double[] doubleArray8 = fieldData2.getIncPrimaryEpsYr();
        java.lang.String str9 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabQtr();
        double[] doubleArray12 = fieldData2.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04277");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/" };
        java.lang.String[] strArray8 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/10/Q100/out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-10Q100.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        int int13 = fieldData2.getInstSellShrs();
        boolean boolean14 = fieldData2.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = fieldData2.getEstimateData();
        int int16 = fieldData2.getNumEmployees();
        java.lang.String str17 = fieldData2.getTicker();
        double[] doubleArray18 = fieldData2.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        double double10 = fieldData2.getEpsQ1();
        int int11 = fieldData2.getInsiderBuys();
        double[] doubleArray12 = fieldData2.getOtherIncYr();
        double[] doubleArray13 = fieldData2.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04280");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getSharesY();
        double[] doubleArray10 = fieldData2.getCurrAssetsQtr();
        long long11 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04281");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.common.DateTime dateTime6 = fieldData2.getLatestQtrEps();
        double[] doubleArray7 = fieldData2.getEpsDilContYr();
        double[] doubleArray8 = fieldData2.getEpsDilContYr();
        double[] doubleArray9 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray10 = fieldData2.getAdjToIncYr();
        double double11 = fieldData2.getInstOwnership();
        double[] doubleArray12 = fieldData2.getGoodwillQtr();
        double[] doubleArray13 = fieldData2.getUnusualIncQtr();
        double[] doubleArray14 = fieldData2.getIntExpQtr();
        double[] doubleArray15 = fieldData2.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04282");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getCashFromInv();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData37 = fieldData35.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = fieldData35.getCompanyInfo();
        companyFileData38.setAdr("NONE");
        companyFileData38.setSic("out/BigDB/");
        companyFileData38.setIndustry("out/BigDB/");
        java.lang.String str45 = companyFileData38.getCountry();
        java.lang.String str46 = companyFileData38.getState();
        boolean boolean47 = companyFileData38.isAdr();
        companyFileData38.setZip("out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNotNull(estimateFileData37);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04283");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = incSheetFileData5.getExchange();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04284");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 10, (int) ' ');
        double double3 = fieldData2.getPrice();
        double[] doubleArray4 = fieldData2.getGrossOpExpYr();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04285");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double[] doubleArray10 = fieldData2.getGrossIncYr();
        double[] doubleArray11 = fieldData2.getOtherCurrAssetsYr();
        long long12 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData2.getEquityYr();
        double[] doubleArray9 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray10 = balSheetFileData2.getTotalLiabYr();
        double[] doubleArray11 = balSheetFileData2.getStDebtYr();
        double[] doubleArray12 = balSheetFileData2.getCashYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04287");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str10 = companyFileData9.getStreet();
        companyFileData9.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData9.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str15 = companyFileData9.getSic();
        java.lang.String str16 = companyFileData9.getIndustry();
        incSheetFileData5.setNameFields(companyFileData9);
        double[] doubleArray18 = incSheetFileData5.getEpsDilYr();
        java.lang.String str19 = incSheetFileData5.toString();
        double[] doubleArray20 = incSheetFileData5.getIntExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04288");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsDilContQtr();
        double[] doubleArray11 = fieldData2.getAdjToIncQtr();
        double[] doubleArray12 = fieldData2.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04289");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        int int6 = sharesFileData0.getInstShareholders();
        java.lang.String str7 = sharesFileData0.getSector();
        int int8 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderSells("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double[] doubleArray11 = sharesFileData0.getSharesY();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04290");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        java.lang.String str8 = incSheetFileData5.getName();
        java.lang.String str9 = incSheetFileData5.toString();
        double[] doubleArray10 = incSheetFileData5.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04291");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray12 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray13 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray14 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray15 = incSheetFileData5.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04292");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getRdQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpYr();
        boolean boolean7 = fieldData2.isAdr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04293");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str11 = sharesFileData0.getTicker();
        sharesFileData0.setInsiderNetTrades("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        java.lang.String str14 = sharesFileData0.toDbOutput();
        int int15 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str14, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04294");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isAdr();
        java.lang.String str4 = companyFileData0.getSic();
        companyFileData0.setName("");
        companyFileData0.setSector("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        java.lang.String str9 = companyFileData0.getSic();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        java.lang.String str9 = cashFileData8.toDbOutput();
        double[] doubleArray10 = cashFileData8.getCashFromOpsQtr();
        java.lang.String str11 = cashFileData8.toString();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cash File Data" + "'", str11, "Cash File Data");
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04296");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/1/Q0/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n", "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04297");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = balSheetFileData9.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04298");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getRdQtr();
        double[] doubleArray8 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray11 = incSheetFileData5.getCogsQtr();
        double[] doubleArray12 = incSheetFileData5.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setName("NONE");
        companyFileData0.setAdr("NONE");
        companyFileData0.setState("");
        companyFileData0.setCountry("out/BigDB/");
        companyFileData0.setSic("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str15 = companyFileData0.toDbOuput();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ticker      : \r\n  name      : NONE\r\n  exchange  : null\r\n  sector    : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  industry  : null\r\n  sic       : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : out/BigDB/\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str15, "ticker      : \r\n  name      : NONE\r\n  exchange  : null\r\n  sector    : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  industry  : null\r\n  sic       : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : out/BigDB/\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04300");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData11.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double15 = estimateFileData14.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int17 = sharesFileData16.getInstShareholders();
        double double18 = sharesFileData16.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setFromReport((int) (byte) 0, 0);
        double[] doubleArray23 = sharesFileData19.getSharesQ();
        sharesFileData16.setSharesQ(doubleArray23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        double[] doubleArray32 = incSheetFileData31.getEpsContYr();
        double[] doubleArray33 = incSheetFileData31.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData34 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData35);
        double[] doubleArray37 = balSheetFileData36.getLtDebtYr();
        java.lang.String str38 = balSheetFileData36.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = fieldData41.getCashData();
        double[] doubleArray43 = cashFileData42.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData11, estimateFileData14, sharesFileData25, incSheetFileData31, balSheetFileData36, cashFileData42, (int) '#', 0);
        double[] doubleArray47 = incSheetFileData31.getIntExpYr();
        double[] doubleArray48 = incSheetFileData31.getNonrecurringItemsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int50 = sharesFileData49.getInstShareholders();
        java.lang.String str51 = sharesFileData49.getName();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData57 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData58 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList55);
        sharesFileData49.setNameFields(companyFileData58);
        incSheetFileData31.setNameFields(companyFileData58);
        java.lang.String str61 = companyFileData58.getIndustry();
        java.lang.String str62 = companyFileData58.toDbOuput();
        incSheetFileData5.setNameFields(companyFileData58);
        companyFileData58.setWeb("out/BigDB/0/Q10/out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-0Q10.out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(cashFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(incSheetFileData57);
        org.junit.Assert.assertNotNull(companyFileData58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str62, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04301");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getNetIncYr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = incSheetFileData5.getExchange();
        double[] doubleArray11 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray12 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04302");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray8 = incSheetFileData7.getIncAfterTaxYr();
        double[] doubleArray9 = incSheetFileData7.getCogsYr();
        double[] doubleArray10 = incSheetFileData7.getIntExpNonOpQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        net.ajaskey.common.DateTime dateTime3 = estimateFileData2.getLatestQtrEps();
        java.lang.String str4 = estimateFileData2.getTicker();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData2.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int7 = sharesFileData6.getInstShareholders();
        double double8 = sharesFileData6.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setFromReport((int) (byte) 0, 0);
        double[] doubleArray13 = sharesFileData9.getSharesQ();
        sharesFileData6.setSharesQ(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData6);
        sharesFileData15.setInstOwnership("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList21);
        double[] doubleArray24 = incSheetFileData23.getEpsContYr();
        java.lang.String str25 = incSheetFileData23.getIndustry();
        double[] doubleArray26 = incSheetFileData23.getSalesQtr();
        double[] doubleArray27 = incSheetFileData23.getIntExpNonOpYr();
        double[] doubleArray28 = incSheetFileData23.getNonrecurringItemsQtr();
        java.lang.String str29 = incSheetFileData23.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getCurrLiabYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillYr();
        double[] doubleArray34 = balSheetFileData31.getEquityYr();
        double[] doubleArray35 = balSheetFileData31.getStInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray40 = fieldData39.getCogsYr();
        int int41 = fieldData39.getNumEmployees();
        double[] doubleArray42 = fieldData39.getAdjToIncQtr();
        double[] doubleArray43 = fieldData39.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = fieldData39.getCashData();
        java.lang.String str45 = cashFileData44.toString();
        java.lang.String str46 = cashFileData44.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData44);
        double[] doubleArray48 = cashFileData47.getCashFromFinQtr();
        double[] doubleArray49 = cashFileData47.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData2, sharesFileData15, incSheetFileData23, balSheetFileData31, cashFileData47, 100, (int) (byte) -1);
        net.ajaskey.common.DateTime dateTime53 = fieldData52.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData54 = fieldData52.getEstimateData();
        double[] doubleArray55 = fieldData52.getDepreciationQtr();
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(incSheetFileData23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNotNull(cashFileData44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(dateTime53);
        org.junit.Assert.assertNotNull(estimateFileData54);
        org.junit.Assert.assertNull(doubleArray55);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray5 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray6 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04305");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData0.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        sharesFileData18.setInsiderNetPercentOutstanding("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(sharesFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(sharesFileData18);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getSector();
        double[] doubleArray7 = fieldData2.getEpsContYr();
        double[] doubleArray8 = fieldData2.getSharesQ();
        double[] doubleArray9 = fieldData2.getOtherIncQtr();
        double[] doubleArray10 = fieldData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getLtInvestYr();
        java.lang.String str8 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04309");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getLiabEquityYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        java.lang.String str8 = balSheetFileData1.toString();
        java.lang.String str9 = balSheetFileData1.getSector();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getDowIndexStr();
        double[] doubleArray9 = fieldData2.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double double8 = sharesFileData0.getInstOwnership();
        sharesFileData0.setFromReport((int) '#', 1);
        long long12 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        sharesFileData0.setFromReport(6, (int) ' ');
        java.lang.String str18 = sharesFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getEpsDilYr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getEpsDilQtr();
        double[] doubleArray9 = fieldData2.getCapEx();
        double[] doubleArray10 = fieldData2.getIncTaxYr();
        double[] doubleArray11 = fieldData2.getNonrecurringItemsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum12 = fieldData2.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(exchEnum12);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04314");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("NONE");
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray12 = fieldData2.getRdQtr();
        double[] doubleArray13 = fieldData2.getOtherIncYr();
        double[] doubleArray14 = fieldData2.getGrossOpExpQtr();
        net.ajaskey.common.DateTime dateTime15 = fieldData2.getLatestQtrEps();
        double[] doubleArray16 = fieldData2.getUnusualIncQtr();
        fieldData2.setQuarter((-1));
        double[] doubleArray19 = fieldData2.getPrefStockQtr();
        double[] doubleArray20 = fieldData2.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(dateTime15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04316");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        double double2 = sharesFileData0.getBeta();
        double double3 = sharesFileData0.getPrice52hi();
        java.lang.String str4 = sharesFileData0.toDbOutput();
        double double5 = sharesFileData0.getPrice52hi();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = fieldData8.getCashData();
        long long10 = fieldData8.getVolume10d();
        double[] doubleArray11 = fieldData8.getSharesY();
        sharesFileData0.setSharesY(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str4, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04317");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        int int10 = fieldData2.getInstBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getStDebtYr();
        double[] doubleArray11 = fieldData2.getIntExpNonOpQtr();
        double double12 = fieldData2.getEpsY1();
        double double13 = fieldData2.getPrice();
        double double14 = fieldData2.getInsiderOwnership();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray4 = fieldData2.getLiabEquityQtr();
        double[] doubleArray5 = fieldData2.getRdYr();
        net.ajaskey.common.DateTime dateTime6 = fieldData2.getLatestQtrEps();
        java.lang.String str7 = fieldData2.getSector();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        double[] doubleArray7 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray10 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04321");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NONE" + "'", str3, "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NONE" + "'", str4, "NONE");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getCashYr();
        double[] doubleArray7 = balSheetFileData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData8.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData8.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData2.setNameFields(companyFileData8);
        companyFileData8.setCity("");
        companyFileData8.setNumEmployees("");
        java.lang.String str18 = companyFileData8.getTicker();
        companyFileData8.setSic("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str21 = companyFileData8.getCity();
        companyFileData8.setDrp("out/BigDB/-1/Q0/out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data--1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04323");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData12);
        double double15 = estimateFileData14.getEpsY0();
        java.lang.String str16 = estimateFileData14.toString();
        java.lang.String str17 = estimateFileData14.getTicker();
        java.lang.String str18 = estimateFileData14.getSector();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        int int5 = fieldData2.getInstSellShrs();
        double[] doubleArray6 = fieldData2.getCapEx();
        double[] doubleArray7 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray8 = fieldData2.getSalesYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getPreTaxIncYr();
        double[] doubleArray37 = incSheetFileData20.getNetIncYr();
        double[] doubleArray38 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray39 = incSheetFileData20.getIntExpYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        java.lang.String str3 = estimateFileData0.getSector();
        double double4 = estimateFileData0.getEpsY2();
        double double5 = estimateFileData0.getEpsQ1();
        net.ajaskey.common.DateTime dateTime6 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str7 = estimateFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/0/Q10/out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-0Q10.out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = sharesFileData0.getExchange();
        sharesFileData0.setMktCap("Cash File Data");
        sharesFileData0.setInsiderSellShrs("out/BigDB/35/Q100/out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!-fundamental-data-35Q100.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(exchEnum2);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04330");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getOtherIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData8.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData8.setCountry("");
        java.lang.String str13 = companyFileData8.getSector();
        incSheetFileData5.setNameFields(companyFileData8);
        double[] doubleArray15 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray16 = incSheetFileData5.getCogsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        java.lang.String str8 = fieldData2.getCountry();
        double[] doubleArray9 = fieldData2.getCashFromOps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04332");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        long long7 = sharesFileData0.getVolume10d();
        int int8 = sharesFileData0.getInsiderBuys();
        int int9 = sharesFileData0.getInsiderBuys();
        double double10 = sharesFileData0.getDollar3m();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04334");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        boolean boolean12 = companyFileData11.isDrp();
        boolean boolean13 = companyFileData11.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum14 = companyFileData11.getSnpIndex();
        companyFileData11.setSic("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(snpEnum14);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData7.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str10 = companyFileData7.getTicker();
        companyFileData7.setTicker("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        balSheetFileData1.setNameFields(companyFileData7);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04336");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getStDebtYr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04338");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray9 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray10 = balSheetFileData1.getCashQtr();
        java.lang.String str11 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04339");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray7 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray8 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04340");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum2 = companyFileData0.getDowIndex();
        companyFileData0.setZip("");
        companyFileData0.setNumEmployees("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setCity("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(dowEnum2);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData2.getPrefStockQtr();
        double[] doubleArray9 = balSheetFileData2.getStDebtYr();
        double[] doubleArray10 = balSheetFileData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04342");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData5.getDepreciationQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04343");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        double double39 = estimateFileData3.getEpsY0();
        java.lang.String str40 = estimateFileData3.getIndustry();
        net.ajaskey.common.DateTime dateTime41 = estimateFileData3.getCurrFiscalYear();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(dateTime41);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04344");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray6 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData2.getTotalLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
        double[] doubleArray9 = balSheetFileData8.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData0.setSic("out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
        java.lang.String str8 = companyFileData0.getCountry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04346");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        java.lang.String str8 = incSheetFileData5.getName();
        double[] doubleArray9 = incSheetFileData5.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04347");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        java.lang.String str8 = balSheetFileData1.getTicker();
        double[] doubleArray9 = balSheetFileData1.getCashQtr();
        double[] doubleArray10 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04348");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray7 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray8 = incSheetFileData5.getDividendYr();
        double[] doubleArray9 = incSheetFileData5.getNetIncYr();
        double[] doubleArray10 = incSheetFileData5.getSalesQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04349");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getEquityQtr();
        double[] doubleArray8 = balSheetFileData6.getLtDebtQtr();
        double[] doubleArray9 = balSheetFileData6.getStInvestQtr();
        java.lang.String str10 = balSheetFileData6.getSector();
        double[] doubleArray11 = balSheetFileData6.getOtherCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData6);
        java.lang.String str13 = balSheetFileData12.getExchange();
        double[] doubleArray14 = balSheetFileData12.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04350");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray11 = incSheetFileData10.getDividendQtr();
        double[] doubleArray12 = incSheetFileData10.getRdYr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        int int5 = sharesFileData0.getInsiderSells();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str15 = companyFileData14.getCountry();
        sharesFileData0.setNameFields(companyFileData14);
        java.lang.String str17 = companyFileData14.getWeb();
        java.lang.String str18 = companyFileData14.getState();
        companyFileData14.setCountry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray41 = balSheetFileData22.getBvpsYr();
        double[] doubleArray42 = balSheetFileData22.getLtInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray44 = balSheetFileData43.getOtherLtAssetsQtr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04354");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        double double9 = sharesFileData0.getDollar3m();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04355");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray14 = balSheetFileData13.getCurrAssetsYr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(balSheetFileData13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04356");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        int int11 = sharesFileData0.getInsiderSellShrs();
        double[] doubleArray12 = sharesFileData0.getSharesQ();
        java.lang.String str13 = sharesFileData0.toDbOutput();
        double[] doubleArray14 = sharesFileData0.getSharesQ();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str13, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : NONE\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04358");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE", "out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!", "hi!", "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04359");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        double[] doubleArray13 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 6);
        double[] doubleArray3 = fieldData2.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        int int13 = fieldData2.getInstSellShrs();
        boolean boolean14 = fieldData2.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = fieldData2.getEstimateData();
        int int16 = fieldData2.getNumEmployees();
        double[] doubleArray17 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04362");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double double12 = fieldData2.getPrice();
        double double13 = fieldData2.getBeta();
        double[] doubleArray14 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray15 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray16 = fieldData2.getAcctPayableYr();
        java.lang.String str17 = fieldData2.getSic();
        double[] doubleArray18 = fieldData2.getDepreciationQtr();
        java.lang.String str19 = fieldData2.getName();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04364");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = balSheetFileData25.getTicker();
        double[] doubleArray37 = balSheetFileData25.getAcctRxYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04365");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        java.lang.String str5 = balSheetFileData1.getName();
        java.lang.String str6 = balSheetFileData1.getExchange();
        double[] doubleArray7 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray8 = balSheetFileData1.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = companyFileData0.getExchange();
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setIndustry("hi!");
        companyFileData0.setSic("out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double double8 = fieldData2.getEpsQ0();
        double double9 = fieldData2.getEpsQ1();
        int int10 = fieldData2.getQuarter();
        double double11 = fieldData2.getPrice();
        int int12 = fieldData2.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum13 = fieldData2.getSnpIndex();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(snpEnum13);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getPrefStockQtr();
        java.lang.String str7 = fieldData2.getZip();
        double[] doubleArray8 = fieldData2.getEpsDilQtr();
        long long9 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray41 = balSheetFileData22.getBvpsYr();
        double[] doubleArray42 = balSheetFileData22.getStInvestQtr();
        double[] doubleArray43 = balSheetFileData22.getLtInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabYr();
        double[] doubleArray7 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray8 = balSheetFileData2.getAcctRxQtr();
        double[] doubleArray9 = balSheetFileData2.getGoodwillQtr();
        double[] doubleArray10 = balSheetFileData2.getAcctRxQtr();
        double[] doubleArray11 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray12 = balSheetFileData2.getEquityYr();
        double[] doubleArray13 = balSheetFileData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getBvpsQtr();
        java.lang.String str3 = balSheetFileData1.getName();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04372");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        double[] doubleArray8 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04373");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray10 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04374");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray10 = incSheetFileData5.getIntExpQtr();
        double[] doubleArray11 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getLiabEquityQtr();
        double[] doubleArray8 = balSheetFileData2.getAcctRxQtr();
        double[] doubleArray9 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray10 = balSheetFileData2.getCashYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData2.getEquityQtr();
        double[] doubleArray6 = balSheetFileData2.getStInvestYr();
        double[] doubleArray7 = balSheetFileData2.getCashYr();
        double[] doubleArray8 = balSheetFileData2.getLiabEquityYr();
        double[] doubleArray9 = balSheetFileData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        net.ajaskey.common.DateTime dateTime40 = estimateFileData3.getLatestQtrEps();
        java.lang.String str41 = estimateFileData3.toDbOutput();
        java.lang.String str42 = estimateFileData3.getSector();
        java.lang.String str43 = estimateFileData3.toString();
        double double44 = estimateFileData3.getEpsY1();
        double double45 = estimateFileData3.getEpsQ0();
        net.ajaskey.common.DateTime dateTime46 = estimateFileData3.getLatestQtrEps();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(exchEnum39);
        org.junit.Assert.assertNull(dateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNull(dateTime46);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int7 = sharesFileData6.getInstSellShrs();
        sharesFileData6.setInsiderSells("hi!");
        double double10 = sharesFileData6.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setFromReport((int) (byte) 0, 0);
        double[] doubleArray18 = sharesFileData14.getSharesQ();
        sharesFileData11.setSharesQ(doubleArray18);
        sharesFileData6.setSharesQ(doubleArray18);
        sharesFileData0.setSharesQ(doubleArray18);
        sharesFileData0.setBeta("");
        java.lang.String str24 = sharesFileData0.getName();
        long long25 = sharesFileData0.getVolume10d();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str27 = sharesFileData0.getName();
        double double28 = sharesFileData0.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum29 = sharesFileData0.getExchange();
        double double30 = sharesFileData0.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(exchEnum29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04379");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : \r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        int int3 = companyFileData0.getNumEmployees();
        java.lang.String str4 = companyFileData0.getName();
        int int5 = companyFileData0.getNumEmployees();
        companyFileData0.setStreet("out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double[] doubleArray9 = fieldData2.getCapEx();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = fieldData2.getCashData();
        double[] doubleArray11 = cashFileData10.getCashFromFinQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double double8 = sharesFileData0.getInstOwnership();
        sharesFileData0.setFloatshr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str11 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str11, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04383");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray10 = balSheetFileData1.getEquityQtr();
        double[] doubleArray11 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04384");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        double[] doubleArray10 = fieldData2.getSharesY();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShares();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNotNull(sharesFileData11);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04385");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray10 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str11 = balSheetFileData1.toString();
        double[] doubleArray12 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str13 = balSheetFileData1.getIndustry();
        java.lang.String str14 = balSheetFileData1.getSector();
        double[] doubleArray15 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray16 = balSheetFileData1.getBvpsYr();
        double[] doubleArray17 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str14, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        java.lang.String str8 = cashFileData7.getTicker();
        java.lang.String str9 = cashFileData7.getTicker();
        double[] doubleArray10 = cashFileData7.getCashFromOpsQtr();
        java.lang.String str11 = cashFileData7.toString();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cash File Data" + "'", str11, "Cash File Data");
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/-1/Q0/out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data--1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04388");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        companyFileData11.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str14 = companyFileData11.toString();
        companyFileData11.setStreet("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04389");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        java.lang.String str5 = balSheetFileData1.getName();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str7 = balSheetFileData1.getTicker();
        java.lang.String str8 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = sharesFileData0.getExchange();
        sharesFileData0.setFromReport((int) (byte) 10, 100);
        sharesFileData0.setInstOwnership("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int18 = sharesFileData17.getInstShareholders();
        double double19 = sharesFileData17.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData20.setFromReport((int) (byte) 0, 0);
        double[] doubleArray24 = sharesFileData20.getSharesQ();
        sharesFileData17.setSharesQ(doubleArray24);
        sharesFileData0.setSharesY(doubleArray24);
        int int27 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setVolume3m("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        int int30 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04391");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray9 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        companyFileData0.setDrp("out/BigDB/");
        companyFileData0.setState("NONE");
        java.lang.String str6 = companyFileData0.getCity();
        companyFileData0.setCountry("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        java.lang.String str9 = companyFileData0.getSector();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray5 = fieldData2.getOtherLtAssetsQtr();
        java.lang.String str6 = fieldData2.getCity();
        double[] doubleArray7 = fieldData2.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray12 = fieldData2.getCurrLiabYr();
        double double13 = fieldData2.getMktCap();
        double[] doubleArray14 = fieldData2.getCashYr();
        double[] doubleArray15 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray16 = fieldData2.getIntExpYr();
        java.lang.String str17 = fieldData2.getStreet();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04395");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getPrefStockYr();
        java.lang.String str8 = balSheetFileData1.toDbOutput();
        double[] doubleArray9 = balSheetFileData1.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04396");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getStDebtYr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtAssetsQtr();
        java.lang.String str9 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04397");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        java.lang.String str13 = fieldData2.getCountry();
        fieldData2.setQuarter((int) (byte) 1);
        int int16 = fieldData2.getNumEmployees();
        int int17 = fieldData2.getInstSellShrs();
        double[] doubleArray18 = fieldData2.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04399");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData10.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData10.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData10.setName("NONE");
        companyFileData10.setAdr("NONE");
        companyFileData10.setState("");
        incSheetFileData5.setNameFields(companyFileData10);
        java.lang.String str22 = companyFileData10.getCity();
        java.lang.String str23 = companyFileData10.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04400");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderOwnership("out/BigDB/");
        long long6 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("out/BigDB/0/Q10/out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-0Q10.out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE");
        int int9 = sharesFileData0.getInstShareholders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04401");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray6 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData2.getTotalLiabYr();
        java.lang.String str8 = balSheetFileData2.getName();
        double[] doubleArray9 = balSheetFileData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04402");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilContYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = incSheetFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04403");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getEquityQtr();
        double[] doubleArray8 = balSheetFileData6.getInventoryYr();
        double[] doubleArray9 = balSheetFileData6.getTotalLiabQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04404");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum3 = companyFileData0.getDowIndex();
        java.lang.String str4 = companyFileData0.getStreet();
        java.lang.String str5 = companyFileData0.getWeb();
        companyFileData0.setSic("out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setTicker("out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = balSheetFileData9.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str3 = companyFileData0.getTicker();
        companyFileData0.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double7 = estimateFileData6.getEpsQ0();
        double double8 = estimateFileData6.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData6);
        double double10 = estimateFileData6.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int13 = sharesFileData12.getInstShareholders();
        double double14 = sharesFileData12.getInsiderNetPercentOutstanding();
        java.lang.String str15 = sharesFileData12.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray19 = fieldData18.getCogsYr();
        int int20 = fieldData18.getNumEmployees();
        double double21 = fieldData18.getPrice52hi();
        double[] doubleArray22 = fieldData18.getPreTaxIncYr();
        double[] doubleArray23 = fieldData18.getCogsQtr();
        double double24 = fieldData18.getBeta();
        java.lang.String str25 = fieldData18.getTicker();
        double[] doubleArray26 = fieldData18.getPrefStockYr();
        double[] doubleArray27 = fieldData18.getSharesQ();
        sharesFileData12.setSharesQ(doubleArray27);
        sharesFileData12.setInsiderNetTrades("out/BigDB/");
        java.lang.String[] strArray36 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData41 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        java.lang.String str42 = incSheetFileData41.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData45 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData45);
        double[] doubleArray47 = balSheetFileData46.getOtherLtLiabQtr();
        double[] doubleArray48 = balSheetFileData46.getNetFixedAssetsQtr();
        double[] doubleArray49 = balSheetFileData46.getTotalLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray53 = fieldData52.getCogsYr();
        double[] doubleArray54 = fieldData52.getIntExpYr();
        double[] doubleArray55 = fieldData52.getLtDebtQtr();
        double[] doubleArray56 = fieldData52.getGoodwillYr();
        double double57 = fieldData52.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData58 = fieldData52.getCashData();
        java.lang.String str59 = cashFileData58.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData6, sharesFileData12, incSheetFileData44, balSheetFileData46, cashFileData58, (int) (byte) 10, 0);
        double[] doubleArray63 = cashFileData58.getCapExQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(companyFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNotNull(incSheetFileData41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(doubleArray63);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04407");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        java.lang.String str9 = incSheetFileData5.getName();
        java.lang.String str10 = incSheetFileData5.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04408");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : \r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04409");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getCashYr();
        double double9 = fieldData2.getEpsQ1();
        java.lang.String str10 = fieldData2.getState();
        double[] doubleArray11 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int15 = sharesFileData14.getInstShareholders();
        double double16 = sharesFileData14.getDollar3m();
        sharesFileData14.setVolume10d("");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        double[] doubleArray25 = incSheetFileData24.getEpsDilYr();
        double[] doubleArray26 = incSheetFileData24.getNetIncYr();
        double[] doubleArray27 = incSheetFileData24.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData29);
        double[] doubleArray31 = balSheetFileData30.getLtDebtYr();
        java.lang.String str32 = balSheetFileData30.toDbOutput();
        double[] doubleArray33 = balSheetFileData30.getLtInvestYr();
        java.lang.String[] strArray39 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray44 = cashFileData43.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData13, sharesFileData14, incSheetFileData24, balSheetFileData30, cashFileData43, (int) (byte) -1, (int) (short) 100);
        double[] doubleArray48 = fieldData47.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData49 = fieldData47.getIncSheetData();
        double double50 = fieldData47.getPrice();
        double double51 = fieldData47.getEpsQ0();
        double double52 = fieldData47.getDollar3m();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(companyFileData42);
        org.junit.Assert.assertNotNull(cashFileData43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNotNull(incSheetFileData49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04411");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getStDebtYr();
        double[] doubleArray11 = fieldData2.getIntExpNonOpQtr();
        double double12 = fieldData2.getEpsY1();
        double double13 = fieldData2.getPrice();
        fieldData2.setYear((int) (byte) 1);
        double[] doubleArray16 = fieldData2.getStInvestQtr();
        double double17 = fieldData2.getPrice52lo();
        double[] doubleArray18 = fieldData2.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/100/Q0/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-100Q0.");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04413");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        long long5 = fieldData2.getVolumeMonth3m();
        double[] doubleArray6 = fieldData2.getOtherCurrAssetsYr();
        double double7 = fieldData2.getFloatshr();
        java.lang.String str8 = fieldData2.getCountry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        java.lang.String str7 = balSheetFileData2.toDbOutput();
        double[] doubleArray8 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray9 = balSheetFileData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getPrefStockQtr();
        java.lang.String str7 = fieldData2.getZip();
        double[] doubleArray8 = fieldData2.getEpsDilQtr();
        double double9 = fieldData2.getPrice52hi();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData2.getEquityYr();
        double[] doubleArray9 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray10 = balSheetFileData2.getTotalLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
        double[] doubleArray12 = balSheetFileData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", (-1), (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04418");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        java.lang.String str10 = incSheetFileData5.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str12 = companyFileData11.getStreet();
        companyFileData11.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData11.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData11.setDowIndex("");
        java.lang.String str19 = companyFileData11.getZip();
        incSheetFileData5.setNameFields(companyFileData11);
        double[] doubleArray21 = incSheetFileData5.getDepreciationYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        double[] doubleArray1 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray2 = cashFileData0.getCashFromOpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04420");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        double[] doubleArray8 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getRdQtr();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray13 = incSheetFileData5.getEpsDilContYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04421");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double[] doubleArray8 = new double[] {};
        sharesFileData0.setSharesY(doubleArray8);
        sharesFileData0.setInstSellShrs("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        int int22 = companyFileData21.getNumEmployees();
        companyFileData21.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData21.setStreet("NONE");
        companyFileData21.setPhone("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        sharesFileData0.setNameFields(companyFileData21);
        companyFileData21.setDrp("NONE");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04423");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        int int4 = fieldData2.getInstBuyShrs();
        double[] doubleArray5 = fieldData2.getCashFromInv();
        double[] doubleArray6 = fieldData2.getOtherIncYr();
        double[] doubleArray7 = fieldData2.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04425");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getLtInvestYr();
        double[] doubleArray8 = balSheetFileData2.getInventoryQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04426");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = companyFileData0.getZip();
        companyFileData0.setNumEmployees("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str39 = companyFileData0.getTicker();
        companyFileData0.setIndustry("out/BigDB/10/Q1/out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-10Q1.");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double double12 = fieldData2.getInsiderNetPercentOutstanding();
        double[] doubleArray13 = fieldData2.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = fieldData2.getIncSheetData();
        double[] doubleArray15 = fieldData2.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        double[] doubleArray10 = fieldData2.getCogsQtr();
        double[] doubleArray11 = fieldData2.getOtherIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04429");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str13 = estimateFileData12.toDbOutput();
        java.lang.String str14 = estimateFileData12.toDbOutput();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        java.lang.String str8 = fieldData2.getCountry();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        int int10 = fieldData2.getInstSellShrs();
        double[] doubleArray11 = fieldData2.getPreTaxIncQtr();
        net.ajaskey.common.DateTime dateTime12 = fieldData2.getLatestQtrEps();
        double double13 = fieldData2.getPrice();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(dateTime12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getDividendQtr();
        java.lang.String str10 = fieldData2.getDowIndexStr();
        double[] doubleArray11 = fieldData2.getTotalOpExpYr();
        double[] doubleArray12 = fieldData2.getAcctRxQtr();
        double[] doubleArray13 = fieldData2.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        java.lang.String str9 = fieldData2.getDowIndexStr();
        int int10 = fieldData2.getInsiderBuys();
        double[] doubleArray11 = fieldData2.getNetIncQtr();
        fieldData2.setQuarter(10);
        double[] doubleArray14 = fieldData2.getEpsDilQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/10/Q100/out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-10Q100.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04434");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum6 = fieldData2.getSnpIndex();
        double[] doubleArray7 = fieldData2.getLiabEquityYr();
        double[] doubleArray8 = fieldData2.getAcctPayableQtr();
        double[] doubleArray9 = fieldData2.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(snpEnum6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04435");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04436");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getNetIncYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray9 = incSheetFileData5.getRdQtr();
        double[] doubleArray10 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04437");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray8 = incSheetFileData7.getIncAfterTaxYr();
        java.lang.String str9 = incSheetFileData7.toString();
        java.lang.String str10 = incSheetFileData7.getSector();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getCashYr();
        double[] doubleArray13 = fieldData2.getOtherCurrAssetsQtr();
        double double14 = fieldData2.getInsiderOwnership();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double10 = sharesFileData9.getMktCap();
        java.lang.String str11 = sharesFileData9.toDbOutput();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str11, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04441");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray8 = fieldData2.getIncTaxYr();
        double[] doubleArray9 = fieldData2.getCurrAssetsYr();
        double double10 = fieldData2.getPrice52lo();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray13 = fieldData2.getGrossOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04442");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray8 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData8.setFromReport((int) (short) 1, (int) '#');
        sharesFileData8.setInsiderOwnership("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        sharesFileData8.setInstSellShrs("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        double double5 = sharesFileData0.getPrice();
        java.lang.String str6 = sharesFileData0.getName();
        int int7 = sharesFileData0.getInsiderSells();
        int int8 = sharesFileData0.getInstBuyShrs();
        double double9 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        java.lang.String str9 = fieldData2.getName();
        double[] doubleArray10 = fieldData2.getCogsQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray12 = fieldData2.getOtherCurrLiabQtr();
        double[] doubleArray13 = fieldData2.getEpsQtr();
        java.lang.String str14 = fieldData2.getZip();
        double double15 = fieldData2.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum16 = fieldData2.getExchange();
        double[] doubleArray17 = fieldData2.getPrefStockYr();
        double[] doubleArray18 = fieldData2.getEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(exchEnum16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        balSheetFileData1.setNameFields(companyFileData17);
        companyFileData17.setCountry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str21 = companyFileData17.getTicker();
        companyFileData17.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData17.setStreet("NONE");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04447");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str13 = sharesFileData12.getTicker();
        double double14 = sharesFileData12.getPrice52lo();
        sharesFileData12.setDollar3m("NONE");
        double double17 = sharesFileData12.getMktCap();
        double double18 = sharesFileData12.getBeta();
        sharesFileData12.setVolume10d("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        double double21 = sharesFileData12.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04448");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getEpsDilYr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getEpsDilQtr();
        double[] doubleArray9 = fieldData2.getCapEx();
        double[] doubleArray10 = fieldData2.getIncTaxYr();
        double[] doubleArray11 = fieldData2.getNonrecurringItemsQtr();
        long long12 = fieldData2.getVolume10d();
        double[] doubleArray13 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        java.lang.String str6 = sharesFileData0.getName();
        double double7 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double14 = sharesFileData0.getPrice52hi();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04450");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getEpsContQtr();
        double[] doubleArray37 = fieldData35.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum38 = fieldData35.getDowIndex();
        double[] doubleArray39 = fieldData35.getEpsQtr();
        int int40 = fieldData35.getQuarter();
        java.lang.String str41 = fieldData35.getState();
        double[] doubleArray42 = fieldData35.getEquityYr();
        double[] doubleArray43 = fieldData35.getLiabEquityYr();
        double[] doubleArray44 = fieldData35.getIntExpNonOpQtr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(dowEnum38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04451");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/10/Q6/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q6.out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data", 35, 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04452");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsContQtr();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray12 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray13 = fieldData2.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum14 = fieldData2.getDowIndex();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(dowEnum14);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray10 = sharesFileData9.getSharesQ();
        sharesFileData9.setDollar3m("");
        sharesFileData9.setInstSellShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData9.setBeta("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData9.setInstSellShrs("out/BigDB/10/Q100/out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q100.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04454");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getCashYr();
        double[] doubleArray13 = fieldData2.getRdYr();
        double[] doubleArray14 = fieldData2.getPreTaxIncYr();
        double[] doubleArray15 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = fieldData2.getIncSheetData();
        double[] doubleArray17 = incSheetFileData16.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04455");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getAdjToIncYr();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        double[] doubleArray10 = fieldData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04456");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray12 = fieldData2.getRdQtr();
        double[] doubleArray13 = fieldData2.getOtherIncYr();
        double[] doubleArray14 = fieldData2.getGrossOpExpQtr();
        java.lang.String str15 = fieldData2.getSnpIndexStr();
        double[] doubleArray16 = fieldData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04457");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04458");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setBeta("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData0.setInstOwnership("out/BigDB/");
        long long13 = sharesFileData0.getVolume10d();
        long long14 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray6 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04460");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIntExpYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        int int7 = fieldData2.getInstShareholders();
        double double8 = fieldData2.getDollar3m();
        double[] doubleArray9 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        int int8 = fieldData2.getInstSellShrs();
        double double9 = fieldData2.getPrice52hi();
        double[] doubleArray10 = fieldData2.getPrefStockYr();
        java.lang.String str11 = fieldData2.getWeb();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04463");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        double[] doubleArray8 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray11 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray12 = incSheetFileData5.getSalesYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        sharesFileData14.setInstShareholders("out/BigDB/");
        java.lang.String str38 = sharesFileData14.toDbOutput();
        sharesFileData14.setDollar3m("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        java.lang.String str41 = sharesFileData14.getTicker();
        java.lang.String str42 = sharesFileData14.getTicker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str38, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04465");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(100, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04466");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray10 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray11 = incSheetFileData5.getNetIncYr();
        java.lang.String str12 = incSheetFileData5.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04467");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray8 = balSheetFileData6.getCurrLiabQtr();
        double[] doubleArray9 = balSheetFileData6.getEquityQtr();
        double[] doubleArray10 = balSheetFileData6.getCashYr();
        double[] doubleArray11 = balSheetFileData6.getOtherLtLiabYr();
        java.lang.String str12 = balSheetFileData6.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04468");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getSalesYr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray12 = incSheetFileData5.getCogsYr();
        double[] doubleArray13 = incSheetFileData5.getIntExpNonOpYr();
        java.lang.String str14 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04469");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        companyFileData0.setDrp("out/BigDB/");
        companyFileData0.setState("NONE");
        java.lang.String str6 = companyFileData0.getSector();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList18 = companyFileData0.set((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str21 = balSheetFileData20.toString();
        double[] doubleArray22 = balSheetFileData20.getBvpsQtr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(incSheetFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNotNull(estimateFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(sharesFileData17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(balSheetFileData19);
        org.junit.Assert.assertNotNull(balSheetFileData20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04470");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray8 = balSheetFileData2.getOtherLtAssetsYr();
        double[] doubleArray9 = balSheetFileData2.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getOtherLtAssetsYr();
        double[] doubleArray7 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray8 = balSheetFileData2.getOtherLtLiabQtr();
        double[] doubleArray9 = balSheetFileData2.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04472");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04473");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray9 = fieldData2.getStInvestQtr();
        double double10 = fieldData2.getEpsQ0();
        double[] doubleArray11 = fieldData2.getEpsDilQtr();
        double[] doubleArray12 = fieldData2.getDepreciationQtr();
        double[] doubleArray13 = fieldData2.getCashQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04474");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double double8 = fieldData2.getMktCap();
        double[] doubleArray9 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
        double[] doubleArray8 = balSheetFileData2.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getRdYr();
        double[] doubleArray8 = fieldData2.getEpsQtr();
        double double9 = fieldData2.getEpsQ1();
        double[] doubleArray10 = fieldData2.getCurrLiabQtr();
        double[] doubleArray11 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getCogsYr();
        double[] doubleArray6 = fieldData2.getGoodwillQtr();
        double[] doubleArray7 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray8 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        companyFileData0.setPhone("out/BigDB/");
        companyFileData0.setPhone("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str6 = companyFileData0.getSnpIndexStr();
        companyFileData0.setStreet("out/BigDB/10/Q100/out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-10Q100.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04479");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        double double3 = sharesFileData0.getDollar3m();
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setInsiderSellShrs("Cash File Data");
        double double7 = sharesFileData0.getInsiderOwnership();
        java.lang.String str8 = sharesFileData0.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setFromReport((int) (short) 1, 0);
        double double13 = sharesFileData9.getFloatshr();
        sharesFileData9.setInstOwnership("Cash File Data");
        sharesFileData9.setInsiderNetTrades("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        double[] doubleArray18 = sharesFileData9.getSharesQ();
        sharesFileData0.setSharesY(doubleArray18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str8, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getStDebtQtr();
        double[] doubleArray7 = fieldData2.getUnusualIncYr();
        double[] doubleArray8 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04481");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData1.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = estimateFileData1.getExchange();
        double double6 = estimateFileData1.getEpsY0();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        double[] doubleArray10 = fieldData2.getCashFromFin();
        double[] doubleArray11 = fieldData2.getStDebtYr();
        java.lang.String str12 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum13 = fieldData2.getDowIndex();
        double[] doubleArray14 = fieldData2.getDepreciationYr();
        double[] doubleArray15 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(dowEnum13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04483");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        boolean boolean9 = fieldData2.isDrp();
        double[] doubleArray10 = fieldData2.getEpsDilQtr();
        double[] doubleArray11 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04484");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        java.lang.String str12 = fieldData2.getCountry();
        double double13 = fieldData2.getEpsY1();
        int int14 = fieldData2.getInsiderSellShrs();
        double[] doubleArray15 = fieldData2.getLiabEquityYr();
        double[] doubleArray16 = fieldData2.getSharesQ();
        double[] doubleArray17 = fieldData2.getGrossOpExpYr();
        boolean boolean18 = fieldData2.isAdr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int7 = companyFileData0.getNumEmployees();
        java.lang.String str8 = companyFileData0.getDowIndexStr();
        companyFileData0.setNumEmployees("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        java.lang.String str2 = incSheetFileData0.getIndustry();
        double[] doubleArray3 = incSheetFileData0.getIncAfterTaxQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04487");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        boolean boolean12 = companyFileData11.isDrp();
        boolean boolean13 = companyFileData11.isDrp();
        java.lang.String[] strArray19 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.lang.String str26 = estimateFileData25.getTicker();
        net.ajaskey.common.DateTime dateTime27 = estimateFileData25.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData28.setFromReport((int) (short) 1, 0);
        sharesFileData28.setVolume3m("");
        double double34 = sharesFileData28.getInsiderNetPercentOutstanding();
        sharesFileData28.setDollar3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int37 = sharesFileData28.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray39 = incSheetFileData38.getAdjToIncYr();
        java.lang.String str40 = incSheetFileData38.getSector();
        java.lang.String str41 = incSheetFileData38.toString();
        double[] doubleArray42 = incSheetFileData38.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean44 = companyFileData43.isAdr();
        java.lang.String str45 = companyFileData43.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum46 = companyFileData43.getSnpIndex();
        java.lang.String str47 = companyFileData43.toString();
        companyFileData43.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double51 = estimateFileData50.getEpsQ0();
        double double52 = estimateFileData50.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int55 = sharesFileData54.getInstShareholders();
        double double56 = sharesFileData54.getDollar3m();
        double double57 = sharesFileData54.getDollar3m();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData63 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData64 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData65 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData64);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData66 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData65);
        double[] doubleArray67 = balSheetFileData65.getCurrLiabYr();
        double[] doubleArray68 = balSheetFileData65.getStDebtQtr();
        double[] doubleArray69 = balSheetFileData65.getOtherLtLiabYr();
        java.lang.String[] strArray75 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData78 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList76);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData79 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList76);
        double[] doubleArray80 = cashFileData79.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData83 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData43, estimateFileData53, sharesFileData54, incSheetFileData63, balSheetFileData65, cashFileData79, (int) (short) 10, (int) (byte) 0);
        double[] doubleArray84 = balSheetFileData65.getLtInvestQtr();
        double[] doubleArray85 = balSheetFileData65.getCurrLiabYr();
        double[] doubleArray86 = balSheetFileData65.getTotalLiabYr();
        double[] doubleArray87 = balSheetFileData65.getTotalAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData90 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData91 = fieldData90.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData92 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData91);
        java.lang.String str93 = cashFileData91.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData96 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData11, estimateFileData25, sharesFileData28, incSheetFileData38, balSheetFileData65, cashFileData91, (int) (byte) 100, (-1));
        int int97 = sharesFileData28.getInstShareholders();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(companyFileData22);
        org.junit.Assert.assertNotNull(cashFileData23);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNotNull(estimateFileData25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dateTime27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(snpEnum46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(incSheetFileData63);
        org.junit.Assert.assertNull(doubleArray67);
        org.junit.Assert.assertNull(doubleArray68);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(companyFileData78);
        org.junit.Assert.assertNotNull(cashFileData79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray84);
        org.junit.Assert.assertNull(doubleArray85);
        org.junit.Assert.assertNull(doubleArray86);
        org.junit.Assert.assertNull(doubleArray87);
        org.junit.Assert.assertNotNull(cashFileData91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Cash File Data" + "'", str93, "Cash File Data");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04488");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray13 = fieldData2.getIncTaxYr();
        double double14 = fieldData2.getInsiderNetPercentOutstanding();
        fieldData2.setYear((int) 'a');
        double[] doubleArray17 = fieldData2.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04489");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setFromReport((int) (byte) -1, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (short) 1, 0);
        sharesFileData8.setVolume3m("");
        double double14 = sharesFileData8.getInsiderNetPercentOutstanding();
        long long15 = sharesFileData8.getVolume10d();
        int int16 = sharesFileData8.getInsiderNetTrades();
        int int17 = sharesFileData8.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray21 = fieldData20.getCogsYr();
        int int22 = fieldData20.getNumEmployees();
        double double23 = fieldData20.getPrice52hi();
        double[] doubleArray24 = fieldData20.getStDebtYr();
        double[] doubleArray25 = fieldData20.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData26 = fieldData20.getCompanyInfo();
        sharesFileData8.setNameFields(companyFileData26);
        double[] doubleArray28 = sharesFileData8.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray28);
        sharesFileData0.setFloatshr("out/BigDB/-1/Q35/-fundamental-data--1Q35.");
        sharesFileData0.setInsiderOwnership("out/BigDB/1/Q0/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNotNull(companyFileData26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0]");
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        double[] doubleArray11 = fieldData2.getEpsQtr();
        double[] doubleArray12 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray13 = fieldData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData8.setFromReport((int) '4', (int) '4');
        java.lang.String str12 = sharesFileData8.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int14 = sharesFileData13.getInstSellShrs();
        sharesFileData13.setInsiderSells("hi!");
        double double17 = sharesFileData13.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int19 = sharesFileData18.getInstShareholders();
        double double20 = sharesFileData18.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData21.setFromReport((int) (byte) 0, 0);
        double[] doubleArray25 = sharesFileData21.getSharesQ();
        sharesFileData18.setSharesQ(doubleArray25);
        sharesFileData13.setSharesQ(doubleArray25);
        sharesFileData8.setSharesQ(doubleArray25);
        int int29 = sharesFileData8.getInsiderSellShrs();
        int int30 = sharesFileData8.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        double[] doubleArray4 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray5 = fieldData2.getEpsContQtr();
        double[] doubleArray6 = fieldData2.getCashQtr();
        double[] doubleArray7 = fieldData2.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04493");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str13 = sharesFileData12.getTicker();
        sharesFileData12.setVolume3m("out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str16 = sharesFileData12.getSector();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04494");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getEpsDilQtr();
        java.lang.String str7 = fieldData2.getWeb();
        double[] doubleArray8 = fieldData2.getNetIncYr();
        fieldData2.setQuarter((int) (short) -1);
        double[] doubleArray11 = fieldData2.getPrefStockYr();
        double[] doubleArray12 = fieldData2.getIntExpNonOpYr();
        double[] doubleArray13 = fieldData2.getAcctPayableQtr();
        double[] doubleArray14 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        long long7 = sharesFileData0.getVolume10d();
        int int8 = sharesFileData0.getInsiderNetTrades();
        int int9 = sharesFileData0.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray13 = fieldData12.getCogsYr();
        int int14 = fieldData12.getNumEmployees();
        double double15 = fieldData12.getPrice52hi();
        double[] doubleArray16 = fieldData12.getStDebtYr();
        double[] doubleArray17 = fieldData12.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = fieldData12.getCompanyInfo();
        sharesFileData0.setNameFields(companyFileData18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        double[] doubleArray23 = balSheetFileData22.getOtherLtLiabYr();
        double[] doubleArray24 = balSheetFileData22.getLiabEquityYr();
        double[] doubleArray25 = balSheetFileData22.getEquityQtr();
        double[] doubleArray26 = balSheetFileData22.getStInvestYr();
        double[] doubleArray27 = balSheetFileData22.getCashYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean29 = companyFileData28.isAdr();
        java.lang.String str30 = companyFileData28.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum31 = companyFileData28.getSnpIndex();
        java.lang.String str32 = companyFileData28.toString();
        companyFileData28.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        balSheetFileData22.setNameFields(companyFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum36 = companyFileData28.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str38 = companyFileData37.getStreet();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData44 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData47 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData48 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList49 = companyFileData37.set((java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList50 = companyFileData28.set((java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList51 = companyFileData18.set(strList50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData52 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData53 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList50);
        java.lang.Class<?> wildcardClass54 = strList50.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(snpEnum31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(snpEnum36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(incSheetFileData44);
        org.junit.Assert.assertNotNull(companyFileData45);
        org.junit.Assert.assertNotNull(estimateFileData46);
        org.junit.Assert.assertNotNull(cashFileData47);
        org.junit.Assert.assertNotNull(balSheetFileData48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(estimateFileData52);
        org.junit.Assert.assertNotNull(cashFileData53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04497");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str6 = companyFileData5.getTicker();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04498");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        int int13 = fieldData2.getInstSellShrs();
        boolean boolean14 = fieldData2.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = fieldData2.getEstimateData();
        int int16 = fieldData2.getNumEmployees();
        double[] doubleArray17 = fieldData2.getEpsDilYr();
        double[] doubleArray18 = fieldData2.getSharesY();
        double[] doubleArray19 = fieldData2.getSalesQtr();
        java.lang.String str20 = fieldData2.getStreet();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum21 = fieldData2.getDowIndex();
        double[] doubleArray22 = fieldData2.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dowEnum21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04499");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getDividendQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray13 = incSheetFileData5.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests8.test04500");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        companyFileData0.setTicker("hi!");
        java.lang.String str11 = companyFileData0.getDowIndexStr();
        companyFileData0.setCountry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setStreet("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}
