package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0501");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        sharesFileData7.setInsiderNetPercentOutstanding("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0502");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        java.lang.String str18 = sharesFileData1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNull(fieldDataQuarter7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0504");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInstOwnership("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str17 = sharesFileData1.getName();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray3 = sharesFileData1.getSharesQtr();
        int int4 = sharesFileData1.getInsiderSells();
        double double5 = sharesFileData1.getBeta();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0506");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShareData();
        java.lang.String str10 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = fieldData2.getIncSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(incSheetFileData11);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0507");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (byte) 100);
        boolean boolean3 = fieldDataYear1.quarterDataAvailable((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0508");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        java.lang.String str9 = companyFileData1.getStreet();
        java.lang.String str10 = companyFileData1.getCountry();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0509");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        int int9 = sharesFileData1.getInstSellShrs();
        double double10 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str12 = balSheetFileData1.getSector();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0511");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getBeta();
        double double5 = sharesFileData1.getBeta();
        sharesFileData1.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double8 = sharesFileData1.getMktCap();
        sharesFileData1.setInsiderNetTrades("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0512");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setCountry("out/BigDB/");
        java.lang.String str3 = companyFileData0.getSic();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0513");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = estimateFileData7.getExchange();
        java.lang.String str9 = estimateFileData7.getName();
        double double10 = estimateFileData7.getEpsY2();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum11 = companyFileData9.getDowIndex();
        companyFileData9.setSector("out/BigDB/");
        companyFileData9.setNumEmployees("Cash File Data");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(dowEnum11);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0515");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double10 = sharesFileData1.getMktCap();
        double double11 = sharesFileData1.getPrice52hi();
        sharesFileData1.setInstOwnership("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0516");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        java.lang.String str4 = fieldData2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0517");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0519");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) (short) 10, (int) (byte) -1);
        double double22 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData4);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList11);
        balSheetFileData5.setNameFields(companyFileData13);
        java.lang.String str15 = companyFileData13.getSic();
        incSheetFileData1.setNameFields(companyFileData13);
        java.lang.String str17 = companyFileData13.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str2 = estimateFileData0.getName();
        java.lang.String str3 = estimateFileData0.getIndustry();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        java.lang.String str16 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSellShrs("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0523");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.toDbOutput();
        java.lang.String str2 = estimateFileData0.toDbOutput();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0524");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double2 = estimateFileData1.getEpsQ1();
        java.lang.String str3 = estimateFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = estimateFileData1.getExchange();
        double double5 = estimateFileData1.getEpsQ1();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0525");
        java.lang.String[] strArray3 = new java.lang.String[] { "NONE", "hi!", "Cash File Data" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0526");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getTicker();
        double[] doubleArray6 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0527");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray22 = incSheetFileData21.getDepreciationYr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCountry("");
        companyFileData1.setSnpIndex("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum11 = companyFileData1.getDowIndex();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dowEnum11);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("");
        double double11 = sharesFileData1.getPrice52lo();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0530");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        double double11 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0531");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.common.DateTime dateTime41 = estimateFileData7.getCurrFiscalYear();
        double double42 = estimateFileData7.getEpsY0();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(dateTime41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0532");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(0, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0533");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double double8 = sharesFileData7.getFloatshr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0534");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double[] doubleArray49 = incSheetFileData34.getSalesYr();
        double[] doubleArray50 = incSheetFileData34.getGrossIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData34);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0535");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        double[] doubleArray44 = balSheetFileData27.getStInvestYr();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str12 = balSheetFileData1.toDbOutput();
        double[] doubleArray13 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0537");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray7 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0538");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum8 = companyFileData2.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData9);
        companyFileData10.setTicker("");
        companyFileData10.setSector("data/BigDB/");
        java.lang.String[] strArray20 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList21, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList26 = companyFileData10.set((java.util.List<java.lang.String>) strList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData29 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData29);
        companyFileData30.setTicker("");
        estimateFileData28.setNameFields(companyFileData30);
        java.lang.String str34 = estimateFileData28.toDbOutput();
        double double35 = estimateFileData28.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData36);
        double double38 = sharesFileData37.getFloatshr();
        sharesFileData37.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int41 = sharesFileData37.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData42);
        double[] doubleArray44 = incSheetFileData43.getIncTaxYr();
        java.lang.String str45 = incSheetFileData43.toDbOutput();
        double[] doubleArray46 = incSheetFileData43.getGrossIncQtr();
        java.lang.String str47 = incSheetFileData43.getSector();
        double[] doubleArray48 = incSheetFileData43.getGrossOpIncYr();
        double[] doubleArray49 = incSheetFileData43.getAdjToIncYr();
        double[] doubleArray50 = incSheetFileData43.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData51 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData51);
        double[] doubleArray53 = balSheetFileData52.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData27, estimateFileData28, sharesFileData37, incSheetFileData43, balSheetFileData52, cashFileData54, 1, (int) (short) 10);
        java.lang.String str58 = estimateFileData28.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData59 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData59);
        double double61 = sharesFileData60.getInsiderNetPercentOutstanding();
        sharesFileData60.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData65 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData66 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData66);
        companyFileData67.setTicker("");
        estimateFileData65.setNameFields(companyFileData67);
        sharesFileData60.setNameFields(companyFileData67);
        sharesFileData60.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int74 = sharesFileData60.getInsiderBuyShrs();
        java.lang.String str75 = sharesFileData60.getSector();
        double double76 = sharesFileData60.getPrice52lo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData77 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData77);
        double[] doubleArray79 = incSheetFileData78.getCogsYr();
        double[] doubleArray80 = incSheetFileData78.getGrossIncYr();
        double[] doubleArray81 = incSheetFileData78.getIncPrimaryEpsYr();
        double[] doubleArray82 = incSheetFileData78.getDividendQtr();
        double[] doubleArray83 = incSheetFileData78.getAdjToIncYr();
        double[] doubleArray84 = incSheetFileData78.getEpsDilYr();
        java.lang.String str85 = incSheetFileData78.toDbOutput();
        double[] doubleArray86 = incSheetFileData78.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData87 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str89 = cashFileData88.toDbOutput();
        double[] doubleArray90 = cashFileData88.getCashFromFinQtr();
        double[] doubleArray91 = cashFileData88.getCashFromOpsQtr();
        java.lang.String str92 = cashFileData88.toDbOutput();
        double[] doubleArray93 = cashFileData88.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData94 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData88);
        java.lang.String str95 = cashFileData94.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData98 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData28, sharesFileData60, incSheetFileData78, balSheetFileData87, cashFileData94, (int) 'a', 0);
        java.lang.String str99 = fieldData98.getIndustry();
        org.junit.Assert.assertNull(snpEnum8);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(companyFileData27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNull(doubleArray79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertNull(doubleArray82);
        org.junit.Assert.assertNull(doubleArray83);
        org.junit.Assert.assertNull(doubleArray84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(doubleArray86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNull(doubleArray90);
        org.junit.Assert.assertNull(doubleArray91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNull(doubleArray93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Cash File Data" + "'", str95, "Cash File Data");
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0539");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData5);
        org.junit.Assert.assertNotNull(companyFileData3);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0540");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 100, 35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 1, (int) (short) -1, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) ' ', 0, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0541");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0542");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getStInvestYr();
        double[] doubleArray9 = balSheetFileData1.getInventoryYr();
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0543");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        java.lang.String str9 = fieldData2.getTicker();
        fieldData2.setQuarter((int) (byte) 100);
        java.lang.String str12 = fieldData2.genOutput();
        fieldData2.setYear((int) (byte) 1);
        fieldData2.setYear((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0544");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        java.lang.String str7 = estimateFileData0.getIndustry();
        net.ajaskey.common.DateTime dateTime8 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str9 = estimateFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0546");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getAcctRxYr();
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0547");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData1.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0548");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0549");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray5 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str6 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0550");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        java.lang.String str10 = sharesFileData1.toString();
        sharesFileData1.setInsiderNetTrades("");
        double double13 = sharesFileData1.getBeta();
        java.lang.String str14 = sharesFileData1.getIndustry();
        double[] doubleArray15 = sharesFileData1.getSharesQtr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0551");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double15 = sharesFileData1.getDollar3m();
        double double16 = sharesFileData1.getInsiderNetPercentOutstanding();
        int int17 = sharesFileData1.getInsiderSells();
        double double18 = sharesFileData1.getPrice52hi();
        sharesFileData1.setBeta("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0552");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        java.lang.String[] strArray10 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList11, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList15);
        int int17 = fieldDataQuarter16.getYear();
        fieldDataYear1.set((int) (byte) -1, fieldDataQuarter16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = fieldDataQuarter16.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = fieldDataQuarter16.fieldDataList;
        int int21 = fieldDataQuarter16.getYear();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0553");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = fieldData2.getBalSheetData();
        org.junit.Assert.assertNotNull(balSheetFileData3);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0554");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray5 = incSheetFileData1.getUnusualIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0555");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        fieldData2.setYear((int) ' ');
        java.lang.String str8 = fieldData2.getName();
        java.lang.String str9 = fieldData2.genOutput();
        java.lang.String str10 = fieldData2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0556");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0557");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray6 = balSheetFileData1.getCashQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0558");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0559");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum44 = companyFileData2.getDowIndex();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNull(dowEnum44);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0560");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        double double11 = sharesFileData1.getInstOwnership();
        double double12 = sharesFileData1.getInsiderNetPercentOutstanding();
        double double13 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0561");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        sharesFileData15.setInsiderOwnership("");
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0562");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        companyFileData9.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData9);
        companyFileData9.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData9.setWeb("");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList34 = companyFileData9.set((java.util.List<java.lang.String>) strList29);
        double[] doubleArray35 = companyFileData9.getPriceQtr();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(sharesFileData31);
        org.junit.Assert.assertNotNull(cashFileData32);
        org.junit.Assert.assertNotNull(incSheetFileData33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0563");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = fieldDataQuarter17.fieldDataList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (byte) 1, (int) (short) 100, fieldDataList18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = fieldDataQuarter19.fieldDataList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((-1), (int) (short) 0, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getIndustry();
        fieldData2.setYear((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0565");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtYr();
        java.lang.String str5 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0566");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = companyFileData2.getZip();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0567");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(cashFileData5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0568");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("Cash File Data");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        java.lang.String str6 = sharesFileData1.getTicker();
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str9 = sharesFileData1.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0570");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0571");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double5 = sharesFileData1.getInstOwnership();
        int int6 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpYr();
        double[] doubleArray6 = incSheetFileData1.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0573");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0574");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getEpsContQtr();
        java.lang.String str6 = incSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0575");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        double double3 = sharesFileData1.getPrice();
        java.lang.String str4 = sharesFileData1.getIndustry();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(0, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0577");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData6.setTicker("");
        java.lang.String str9 = companyFileData6.getStreet();
        companyFileData6.setPhone("");
        companyFileData6.setState("out/BigDB/");
        java.lang.String str14 = companyFileData6.getWeb();
        boolean boolean15 = companyFileData6.isAdr();
        sharesFileData1.setNameFields(companyFileData6);
        sharesFileData1.setInsiderOwnership("hi!");
        sharesFileData1.setInstBuyShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double21 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0578");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        int int6 = fieldData2.getYear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0579");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setName("hi!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray9 = incSheetFileData1.getSalesQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray6 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray7 = incSheetFileData1.getSalesYr();
        double[] doubleArray8 = incSheetFileData1.getGrossIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0582");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        fieldData2.setQuarter((int) (short) -1);
        fieldData2.setQuarter((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        java.lang.String str9 = companyFileData1.getStreet();
        companyFileData1.setName("");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum12 = companyFileData1.getExchange();
        java.lang.String str13 = companyFileData1.getIndustry();
        companyFileData1.setSnpIndex("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(exchEnum12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0584");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getNetIncYr();
        double[] doubleArray8 = incSheetFileData1.getGrossOpIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0585");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double[] doubleArray49 = incSheetFileData34.getSalesQtr();
        double[] doubleArray50 = incSheetFileData34.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0586");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0587");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) ' ');
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0588");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList13);
        java.lang.String str18 = companyFileData1.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sharesFileData15);
        org.junit.Assert.assertNotNull(cashFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0589");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxQtr();
        double[] doubleArray8 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray9 = incSheetFileData1.getOtherIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0590");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        companyFileData9.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData9);
        java.lang.String str20 = companyFileData9.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = companyFileData9.toDbOuput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "out/BigDB/" + "'", str20, "out/BigDB/");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0591");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0592");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        java.lang.String str5 = fieldData2.genOutput();
        fieldData2.setYear((-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(companyFileData8);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0593");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0594");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray12 = balSheetFileData1.getAcctRxQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0595");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData1.getCogsYr();
        java.lang.String str7 = incSheetFileData1.getIndustry();
        double[] doubleArray8 = incSheetFileData1.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0596");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray9 = incSheetFileData1.getCogsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0597");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInstOwnership("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double17 = sharesFileData1.getInsiderOwnership();
        sharesFileData1.setInsiderBuys("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        java.lang.String str20 = sharesFileData1.getName();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setPrice("Cash File Data");
        sharesFileData1.setInstOwnership("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int13 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0599");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 0, (int) (short) 1);
        int int3 = fieldData2.getQuarter();
        int int4 = fieldData2.getYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray7 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray8 = incSheetFileData1.getRdYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0601");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0602");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("hi!");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0603");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        java.lang.String str5 = balSheetFileData1.getExchange();
        double[] doubleArray6 = balSheetFileData1.getOtherLtAssetsQtr();
        java.lang.String str7 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0604");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.getTicker();
        double[] doubleArray2 = cashFileData0.getCapExQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        int int9 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0606");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/" };
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0607");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        java.lang.String str8 = fieldData2.toString();
        java.lang.String str9 = fieldData2.getIndustry();
        java.lang.String str10 = fieldData2.getTicker();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0608");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        companyFileData1.setCity("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0609");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setZip("");
        java.lang.String str9 = companyFileData1.getWeb();
        companyFileData1.setPhone("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0610");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        sharesFileData17.setInsiderBuyShrs("NONE");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        double[] doubleArray5 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0612");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        fieldData2.setQuarter((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0613");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        java.lang.String str8 = incSheetFileData1.toDbOutput();
        double[] doubleArray9 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray10 = incSheetFileData1.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0614");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        int int44 = sharesFileData17.getInstShareholders();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0615");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0616");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        java.lang.String str6 = sharesFileData1.getName();
        sharesFileData1.setInsiderOwnership("hi!");
        double double9 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0617");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        double double13 = sharesFileData12.getInsiderNetPercentOutstanding();
        double[] doubleArray19 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData1.setSharesY(doubleArray19);
        int int22 = sharesFileData1.getInsiderSellShrs();
        long long23 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0618");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData1.getEpsQtr();
        double[] doubleArray9 = incSheetFileData1.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        companyFileData11.setTicker("");
        java.lang.String str14 = companyFileData11.getStreet();
        companyFileData11.setPhone("");
        companyFileData11.setAdr("out/BigDB/");
        java.lang.String str19 = companyFileData11.getSic();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray21 = incSheetFileData1.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0619");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        int int9 = sharesFileData1.getInstShareholders();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0620");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.toString();
        companyFileData1.setSic("Cash File Data");
        java.lang.String str10 = companyFileData1.getSic();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cash File Data" + "'", str10, "Cash File Data");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0621");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray7 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray8 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0622");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum8 = companyFileData2.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData9);
        companyFileData10.setTicker("");
        companyFileData10.setSector("data/BigDB/");
        java.lang.String[] strArray20 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList21, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList26 = companyFileData10.set((java.util.List<java.lang.String>) strList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData29 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData29);
        companyFileData30.setTicker("");
        estimateFileData28.setNameFields(companyFileData30);
        java.lang.String str34 = estimateFileData28.toDbOutput();
        double double35 = estimateFileData28.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData36);
        double double38 = sharesFileData37.getFloatshr();
        sharesFileData37.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int41 = sharesFileData37.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData42);
        double[] doubleArray44 = incSheetFileData43.getIncTaxYr();
        java.lang.String str45 = incSheetFileData43.toDbOutput();
        double[] doubleArray46 = incSheetFileData43.getGrossIncQtr();
        java.lang.String str47 = incSheetFileData43.getSector();
        double[] doubleArray48 = incSheetFileData43.getGrossOpIncYr();
        double[] doubleArray49 = incSheetFileData43.getAdjToIncYr();
        double[] doubleArray50 = incSheetFileData43.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData51 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData51);
        double[] doubleArray53 = balSheetFileData52.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData27, estimateFileData28, sharesFileData37, incSheetFileData43, balSheetFileData52, cashFileData54, 1, (int) (short) 10);
        java.lang.String str58 = estimateFileData28.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData59 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData59);
        double double61 = sharesFileData60.getInsiderNetPercentOutstanding();
        sharesFileData60.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData65 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData66 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData66);
        companyFileData67.setTicker("");
        estimateFileData65.setNameFields(companyFileData67);
        sharesFileData60.setNameFields(companyFileData67);
        sharesFileData60.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int74 = sharesFileData60.getInsiderBuyShrs();
        java.lang.String str75 = sharesFileData60.getSector();
        double double76 = sharesFileData60.getPrice52lo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData77 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData77);
        double[] doubleArray79 = incSheetFileData78.getCogsYr();
        double[] doubleArray80 = incSheetFileData78.getGrossIncYr();
        double[] doubleArray81 = incSheetFileData78.getIncPrimaryEpsYr();
        double[] doubleArray82 = incSheetFileData78.getDividendQtr();
        double[] doubleArray83 = incSheetFileData78.getAdjToIncYr();
        double[] doubleArray84 = incSheetFileData78.getEpsDilYr();
        java.lang.String str85 = incSheetFileData78.toDbOutput();
        double[] doubleArray86 = incSheetFileData78.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData87 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str89 = cashFileData88.toDbOutput();
        double[] doubleArray90 = cashFileData88.getCashFromFinQtr();
        double[] doubleArray91 = cashFileData88.getCashFromOpsQtr();
        java.lang.String str92 = cashFileData88.toDbOutput();
        double[] doubleArray93 = cashFileData88.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData94 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData88);
        java.lang.String str95 = cashFileData94.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData98 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData28, sharesFileData60, incSheetFileData78, balSheetFileData87, cashFileData94, (int) 'a', 0);
        double double99 = estimateFileData28.getEpsY2();
        org.junit.Assert.assertNull(snpEnum8);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(companyFileData27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNull(doubleArray79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertNull(doubleArray82);
        org.junit.Assert.assertNull(doubleArray83);
        org.junit.Assert.assertNull(doubleArray84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(doubleArray86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNull(doubleArray90);
        org.junit.Assert.assertNull(doubleArray91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNull(doubleArray93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Cash File Data" + "'", str95, "Cash File Data");
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 0.0d + "'", double99 == 0.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0623");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        fieldData2.setYear((int) '#');
        java.lang.String str6 = fieldData2.genOutput();
        int int7 = fieldData2.getYear();
        java.lang.String str8 = fieldData2.getTicker();
        java.lang.String str9 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0624");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double[] doubleArray49 = incSheetFileData34.getSalesQtr();
        double[] doubleArray50 = incSheetFileData34.getAdjToIncQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0625");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) 'a', 1, filetypeEnum2);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0626");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray9 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0627");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(6);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0628");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        long long15 = sharesFileData1.getVolume10d();
        sharesFileData1.setFromReport(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0629");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        int int12 = companyFileData8.getNumEmployees();
        incSheetFileData1.setNameFields(companyFileData8);
        java.lang.String str14 = companyFileData8.getWeb();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0630");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray7 = incSheetFileData6.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData6.getGrossOpIncQtr();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        incSheetFileData6.setNameFields(companyFileData16);
        balSheetFileData1.setNameFields(companyFileData16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray23 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray24 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray25 = balSheetFileData1.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0631");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        double double13 = sharesFileData1.getPrice();
        double double14 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0632");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray12 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData1.setSharesY(doubleArray12);
        sharesFileData1.setInstShareholders("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0633");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str7 = balSheetFileData1.getTicker();
        double[] doubleArray8 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray9 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray10 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray11 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0634");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        java.lang.String str12 = balSheetFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray14 = balSheetFileData1.getCashYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0635");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getSalesYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0636");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        java.lang.String[] strArray12 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList17);
        int int19 = fieldDataQuarter18.getYear();
        fieldDataYear3.set((int) (byte) -1, fieldDataQuarter18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = fieldDataQuarter18.fieldDataList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (short) 100, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0637");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("hi!", (int) (short) 10, (int) '#', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0638");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/", "", "NONE", "data/BigDB/", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0639");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int5 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderSells("out/BigDB/");
        int int8 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setVolume3m("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0640");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        java.lang.String str11 = companyFileData1.getWeb();
        companyFileData1.setNumEmployees("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0641");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        java.lang.String str7 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0642");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        int int14 = fieldDataQuarter13.getYear();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (byte) 1, (int) (byte) 10);
        fieldDataQuarter13.fieldDataList = fieldDataList17;
        int int19 = fieldDataQuarter13.getYear();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0643");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setInstShareholders("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray7 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray8 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray9 = balSheetFileData1.getOtherLtLiabQtr();
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0645");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        double[] doubleArray8 = companyFileData1.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        int int10 = companyFileData1.getNumEmployees();
        companyFileData1.setNumEmployees("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0646");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getBvpsYr();
        double[] doubleArray8 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0647");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        long long15 = sharesFileData1.getVolume10d();
        sharesFileData1.setFromReport((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double[] doubleArray49 = incSheetFileData34.getSalesQtr();
        double[] doubleArray50 = incSheetFileData34.getIntExpQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0649");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        java.lang.String[] strArray12 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList17);
        fieldDataYear1.set(0, fieldDataQuarter18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(10, (int) ' ');
        fieldDataQuarter18.fieldDataList = fieldDataList22;
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0650");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = companyFileData1.getExchange();
        java.lang.String str10 = companyFileData1.getCity();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0651");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        java.lang.String str16 = sharesFileData1.getSector();
        sharesFileData1.setMktCap("NONE");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0652");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str2 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        companyFileData4.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData4);
        double double13 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0653");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(sharesFileData20);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0654");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0655");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        sharesFileData1.setInsiderSells("data/BigDB/");
        sharesFileData1.setInstSellShrs("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0656");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getRdQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxQtr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0657");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        java.lang.String str7 = incSheetFileData1.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = incSheetFileData1.getExchange();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray10 = incSheetFileData1.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData1.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0658");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        companyFileData2.setStreet("hi!");
        companyFileData2.setSector("data/BigDB/");
        companyFileData2.setNumEmployees("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData2.setName("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0659");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0660");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.getTicker();
        java.lang.String str2 = cashFileData0.toDbOutput();
        double[] doubleArray3 = cashFileData0.getCapExQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0661");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        java.lang.String str49 = cashFileData45.toDbOutput();
        double[] doubleArray50 = cashFileData45.getCashFromFinQtr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = doubleArray50.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0663");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/", 0, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0664");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        companyFileData9.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData9);
        companyFileData9.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData9.setAdr("data/BigDB/");
        boolean boolean24 = companyFileData9.isAdr();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0665");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray7 = incSheetFileData6.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData6.getGrossOpIncQtr();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        incSheetFileData6.setNameFields(companyFileData16);
        balSheetFileData1.setNameFields(companyFileData16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray23 = balSheetFileData22.getGoodwillYr();
        double[] doubleArray24 = balSheetFileData22.getCashQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0666");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        double[] doubleArray6 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray7 = balSheetFileData1.getInventoryQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0667");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList0, (int) 'a', 35);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0668");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0669");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        double double8 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray9 = incSheetFileData1.getGrossIncQtr();
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getZip();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum9 = companyFileData1.getDowIndex();
        companyFileData1.setNumEmployees("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dowEnum9);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0672");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        double double7 = sharesFileData6.getInsiderNetPercentOutstanding();
        sharesFileData6.setFromReport((int) (short) -1, (-1));
        sharesFileData6.setVolume10d("out/BigDB/");
        double[] doubleArray17 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData6.setSharesY(doubleArray17);
        sharesFileData4.setSharesQ(doubleArray17);
        sharesFileData4.setFromReport((int) (short) 100, (int) 'a');
        sharesFileData4.setInstBuyShrs("Cash File Data");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0673");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        companyFileData8.setExchange("NONE");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0674");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str10 = incSheetFileData9.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0675");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0676");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0677");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray14 = balSheetFileData1.getCashYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0678");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        sharesFileData1.setVolume3m("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0679");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0680");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String str6 = companyFileData1.getPhone();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0681");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        int int10 = sharesFileData1.getInstBuyShrs();
        java.lang.String str11 = sharesFileData1.getSector();
        double double12 = sharesFileData1.getMktCap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0682");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY2();
        java.lang.String str8 = estimateFileData0.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0683");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0684");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        int int11 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInstShareholders("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0685");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("data/BigDB/", 0, 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0686");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        double double7 = sharesFileData6.getInsiderNetPercentOutstanding();
        sharesFileData6.setFromReport((int) (short) -1, (-1));
        sharesFileData6.setVolume10d("out/BigDB/");
        double[] doubleArray17 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData6.setSharesY(doubleArray17);
        sharesFileData4.setSharesQ(doubleArray17);
        sharesFileData4.setFromReport((int) (short) 100, (int) 'a');
        sharesFileData4.setVolume10d("NONE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0687");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        java.lang.String str10 = sharesFileData1.toString();
        sharesFileData1.setInsiderNetTrades("");
        double double13 = sharesFileData1.getBeta();
        sharesFileData1.setInsiderNetPercentOutstanding("data/BigDB/");
        int int16 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.toString();
        java.lang.String str8 = companyFileData1.getSnpIndexStr();
        companyFileData1.setCity("data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0689");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) 100, (int) (short) 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0690");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShareData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0691");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        java.lang.String str8 = companyFileData2.getCity();
        companyFileData2.setCountry("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double15 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0693");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        fieldData2.setQuarter((int) (short) 1);
        java.lang.String str9 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray13 = balSheetFileData1.getLtInvestYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0695");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray16 = incSheetFileData1.getGrossIncYr();
        java.lang.String str17 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0696");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        double double9 = sharesFileData1.getPrice();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0697");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        java.lang.String str18 = companyFileData1.getCountry();
        companyFileData1.setIndustry("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum21 = companyFileData1.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum22 = companyFileData1.getDowIndex();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(exchEnum21);
        org.junit.Assert.assertNull(dowEnum22);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.toDbOutput();
        java.lang.String str8 = incSheetFileData1.getTicker();
        java.lang.String str9 = incSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0699");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        companyFileData1.setSic("Cash File Data");
        java.lang.String str12 = companyFileData1.getSnpIndexStr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        java.lang.String str40 = companyFileData1.getWeb();
        companyFileData1.setZip("data/BigDB/");
        companyFileData1.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0701");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData1.getRdYr();
        double[] doubleArray9 = incSheetFileData1.getIntExpNonOpYr();
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0702");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setInstBuyShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = sharesFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray16 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray17 = incSheetFileData1.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0704");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray15 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray16 = balSheetFileData1.getTotalLiabQtr();
        java.lang.String str17 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0705");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        java.lang.String str3 = companyFileData2.getSnpIndexStr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = companyFileData2.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0706");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray10 = balSheetFileData1.getInventoryYr();
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0707");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = sharesFileData8.getSector();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0708");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray5 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0709");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray16 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray17 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray18 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0710");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInsiderSells();
        java.lang.String str5 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0711");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = fieldData2.getShareData();
        java.lang.String str7 = fieldData2.genOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(sharesFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0712");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getTotalOpExpYr();
        java.lang.Class<?> wildcardClass7 = incSheetFileData1.getClass();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = fieldData2.getShareData();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData15);
        double double17 = sharesFileData16.getInsiderNetPercentOutstanding();
        double[] doubleArray23 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData16.setSharesY(doubleArray23);
        double double25 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray23);
        sharesFileData14.setSharesY(doubleArray23);
        sharesFileData6.setSharesQ(doubleArray23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(sharesFileData6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(sharesFileData14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 103.0d + "'", double25 == 103.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0714");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray7 = incSheetFileData1.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0715");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("hi!");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryYr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray8 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray9 = balSheetFileData1.getLiabEquityQtr();
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0718");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getBvpsYr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0719");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCountry("");
        companyFileData1.setTicker("data/BigDB/");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        int int49 = fieldData48.getYear();
        java.lang.String str50 = fieldData48.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData51 = fieldData48.getCompanyInfo();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(companyFileData51);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0721");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double double10 = estimateFileData9.getEpsQ0();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0722");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0723");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData1.getEpsContYr();
        double[] doubleArray10 = incSheetFileData1.getGrossIncQtr();
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData1.setSharesY(doubleArray8);
        double double10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray8);
        double double11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 103.0d + "'", double10 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 103.0d + "'", double11 == 103.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0725");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum8 = companyFileData2.getSnpIndex();
        java.lang.String str9 = companyFileData2.getZip();
        companyFileData2.setSector("out/BigDB/");
        companyFileData2.setSector("Cash File Data");
        org.junit.Assert.assertNull(snpEnum8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0726");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0727");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0728");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        long long15 = sharesFileData1.getVolume10d();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0729");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpYr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0730");
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList14);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = fieldDataQuarter15.fieldDataList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (byte) 1, (int) (short) 100, fieldDataList16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = fieldDataQuarter17.fieldDataList;
        int int19 = fieldDataQuarter17.getQuarter();
        java.lang.String[] strArray27 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList28, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList32);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = fieldDataQuarter33.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = fieldDataQuarter33.fieldDataList;
        fieldDataQuarter17.fieldDataList = fieldDataList35;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(fieldDataList32);
        org.junit.Assert.assertNotNull(fieldDataList34);
        org.junit.Assert.assertNotNull(fieldDataList35);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0731");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray6 = incSheetFileData1.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0732");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("data/BigDB/", (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0733");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0734");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray6 = incSheetFileData1.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = incSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0735");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.toDbOutput();
        java.lang.String str8 = incSheetFileData1.getTicker();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str10 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0736");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getStreet();
        companyFileData1.setStreet("out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0737");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getIndustry();
        java.lang.String str9 = fieldData2.genOutput();
        int int10 = fieldData2.getQuarter();
        java.lang.String str11 = fieldData2.getSector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        int int9 = sharesFileData1.getInstSellShrs();
        double double10 = sharesFileData1.getPrice52lo();
        sharesFileData1.setFromReport((int) ' ', (int) (short) 1);
        double double14 = sharesFileData1.getMktCap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0739");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        fieldData2.setYear((int) ' ');
        java.lang.String str8 = fieldData2.getName();
        java.lang.String str9 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = fieldData2.getExchange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0741");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        java.lang.String str10 = companyFileData1.getZip();
        java.lang.String str11 = companyFileData1.getCity();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0742");
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList14);
        int int17 = fieldDataQuarter16.getQuarter();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) -1, (int) (short) 0);
        fieldDataQuarter16.fieldDataList = fieldDataList20;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = fieldDataQuarter16.fieldDataList;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0743");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.toDbOutput();
        double[] doubleArray8 = incSheetFileData1.getTotalOpExpQtr();
        double[] doubleArray9 = incSheetFileData1.getGrossOpIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0744");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        java.lang.String str6 = sharesFileData1.getTicker();
        int int7 = sharesFileData1.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData8);
        double double10 = sharesFileData9.getInsiderNetPercentOutstanding();
        sharesFileData9.setFromReport((int) (short) -1, (-1));
        sharesFileData9.setVolume10d("out/BigDB/");
        double[] doubleArray19 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData9.setSharesQ(doubleArray19);
        sharesFileData1.setSharesQ(doubleArray19);
        long long22 = sharesFileData1.getVolume10d();
        double double23 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0745");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0746");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double[] doubleArray10 = incSheetFileData9.getEpsContYr();
        double[] doubleArray11 = incSheetFileData9.getEpsContYr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0747");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        int int11 = sharesFileData1.getInsiderBuyShrs();
        double double12 = sharesFileData1.getPrice52lo();
        double double13 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFloatshr("out/BigDB/");
        int int16 = sharesFileData1.getInstShareholders();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0748");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        fieldData2.setYear((int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        double[] doubleArray9 = incSheetFileData8.getCogsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray6 = cashFileData0.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str8 = cashFileData0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cash File Data" + "'", str8, "Cash File Data");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0750");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        fieldData2.setYear((int) '#');
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.genOutput();
        java.lang.String str8 = fieldData2.getSector();
        java.lang.String str9 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0751");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0752");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double9 = sharesFileData1.getPrice52hi();
        double double10 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0753");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getBvpsQtr();
        java.lang.String str5 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0754");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double15 = sharesFileData1.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0755");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData0.getLatestQtrEps();
        java.lang.String str3 = estimateFileData0.getIndustry();
        double double4 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        double double9 = sharesFileData1.getDollar3m();
        double[] doubleArray10 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0757");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double[] doubleArray49 = incSheetFileData34.getIntExpNonOpQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray49);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0759");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = companyFileData11.getName();
        int int17 = companyFileData11.getNumEmployees();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0760");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str2 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        companyFileData4.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData4);
        long long13 = sharesFileData1.getVolume10d();
        int int14 = sharesFileData1.getInstSellShrs();
        java.lang.Class<?> wildcardClass15 = sharesFileData1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0762");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = companyFileData1.getExchange();
        java.lang.String str10 = companyFileData1.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray6 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData5.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray15 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray16 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0766");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        int int9 = sharesFileData1.getInstSellShrs();
        java.lang.String str10 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0768");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0769");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray5 = incSheetFileData1.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str4 = incSheetFileData1.getTicker();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData1.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0771");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        java.lang.String str9 = companyFileData1.getStreet();
        companyFileData1.setTicker("");
        java.lang.String str12 = companyFileData1.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0772");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY2();
        double double8 = estimateFileData0.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0773");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray8 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray9 = incSheetFileData1.getNetIncYr();
        double[] doubleArray10 = incSheetFileData1.getEpsDilContQtr();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0774");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 10, 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = fieldData2.getBalSheetData();
        java.lang.String str4 = fieldData2.getIndustry();
        org.junit.Assert.assertNotNull(balSheetFileData3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0775");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 1);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0776");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum8 = companyFileData2.getSnpIndex();
        java.lang.String str9 = companyFileData2.getZip();
        companyFileData2.setSector("out/BigDB/");
        java.lang.String str12 = companyFileData2.getCity();
        org.junit.Assert.assertNull(snpEnum8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0777");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setIndustry("data/BigDB/");
        companyFileData7.setNumEmployees("data/BigDB/");
        java.lang.String str14 = companyFileData7.getState();
        java.lang.String str15 = companyFileData7.getWeb();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0779");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        companyFileData2.setStreet("hi!");
        companyFileData2.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0780");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData8.getSnpIndex();
        companyFileData8.setWeb("NONE");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(snpEnum9);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0781");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData6.setTicker("");
        java.lang.String str9 = companyFileData6.getStreet();
        companyFileData6.setPhone("");
        companyFileData6.setState("out/BigDB/");
        java.lang.String str14 = companyFileData6.getWeb();
        boolean boolean15 = companyFileData6.isAdr();
        sharesFileData1.setNameFields(companyFileData6);
        sharesFileData1.setInsiderOwnership("hi!");
        double[] doubleArray19 = sharesFileData1.getSharesYr();
        sharesFileData1.setInsiderSells("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        double[] doubleArray22 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0782");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str7 = balSheetFileData1.getTicker();
        double[] doubleArray8 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray9 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray10 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str3 = balSheetFileData1.getIndustry();
        double[] doubleArray4 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData1.getAcctRxYr();
        java.lang.String str6 = balSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0784");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData1.getRdYr();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData1.getOtherIncQtr();
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0785");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsQtr();
        double[] doubleArray7 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray8 = incSheetFileData1.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0786");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = incSheetFileData1.toDbOutput();
        double[] doubleArray17 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray18 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0787");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0788");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        int int9 = sharesFileData1.getInstSellShrs();
        double double10 = sharesFileData1.getPrice52lo();
        sharesFileData1.setFromReport((int) ' ', (int) (short) 1);
        sharesFileData1.setInsiderSells("NONE");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0789");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        double double7 = sharesFileData6.getInsiderNetPercentOutstanding();
        sharesFileData6.setFromReport((int) (short) -1, (-1));
        java.lang.String str11 = sharesFileData6.getSector();
        sharesFileData6.setFloatshr("");
        sharesFileData6.setVolume10d("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getInsiderNetPercentOutstanding();
        double[] doubleArray24 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData17.setSharesY(doubleArray24);
        sharesFileData6.setSharesY(doubleArray24);
        sharesFileData1.setSharesQ(doubleArray24);
        int int28 = sharesFileData1.getInstSellShrs();
        java.lang.Class<?> wildcardClass29 = sharesFileData1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0790");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        java.lang.String str6 = incSheetFileData1.getTicker();
        double[] doubleArray7 = incSheetFileData1.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0791");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray7 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData1.getSalesYr();
        double[] doubleArray9 = incSheetFileData1.getOtherIncQtr();
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0792");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        int int14 = fieldDataQuarter13.getYear();
        int int15 = fieldDataQuarter13.getYear();
        int int16 = fieldDataQuarter13.getQuarter();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = fieldDataQuarter13.fieldDataList;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NONE" + "'", str3, "NONE");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0794");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = estimateFileData7.getExchange();
        java.lang.String str9 = estimateFileData7.getIndustry();
        double double10 = estimateFileData7.getEpsY0();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double13 = sharesFileData1.getPrice52hi();
        java.lang.String str14 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0796");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "data/BigDB/");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0797");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 10, 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = fieldData2.getBalSheetData();
        java.lang.String str4 = fieldData2.getName();
        org.junit.Assert.assertNotNull(balSheetFileData3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0798");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 100, (int) (byte) -1);
        fieldData2.setQuarter((int) (short) 10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0799");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        double[] doubleArray44 = incSheetFileData24.getAdjToIncYr();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0800");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setIndustry("data/BigDB/");
        companyFileData7.setNumEmployees("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum14 = companyFileData7.getSnpIndex();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(snpEnum14);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0801");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        fieldData2.setQuarter(100);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0803");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setVolume10d("out/BigDB/");
        sharesFileData1.setVolume10d("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0804");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0805");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray7 = incSheetFileData6.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData6.getGrossOpIncQtr();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        incSheetFileData6.setNameFields(companyFileData16);
        balSheetFileData1.setNameFields(companyFileData16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray23 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str24 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sharesFileData15);
        org.junit.Assert.assertNotNull(cashFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(cashFileData18);
        org.junit.Assert.assertNotNull(sharesFileData19);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0807");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getDowIndexStr();
        companyFileData1.setCountry("out/BigDB/");
        java.lang.String str11 = companyFileData1.getPhone();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0808");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.getName();
        java.lang.String str7 = estimateFileData0.toString();
        net.ajaskey.common.DateTime dateTime8 = estimateFileData0.getCurrFiscalYear();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dateTime8);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0809");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        java.lang.String str7 = estimateFileData0.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0810");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray6 = cashFileData0.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray8 = cashFileData7.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0811");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        sharesFileData1.setInstOwnership("data/BigDB/");
        double double11 = sharesFileData1.getMktCap();
        sharesFileData1.setInstOwnership("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0812");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray12 = balSheetFileData11.getPrefStockYr();
        java.lang.String str13 = balSheetFileData11.getIndustry();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0813");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestYr();
        double[] doubleArray5 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray7 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0814");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray6 = incSheetFileData1.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0815");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        double double9 = sharesFileData1.getDollar3m();
        int int10 = sharesFileData1.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0816");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        double double11 = sharesFileData10.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setPrice("hi!");
        java.lang.String str5 = sharesFileData1.toString();
        double[] doubleArray6 = sharesFileData1.getSharesQtr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0818");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        java.lang.String str7 = incSheetFileData1.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = incSheetFileData1.getExchange();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray10 = incSheetFileData1.getIntExpNonOpQtr();
        java.lang.String str11 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0819");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData1.getIntExpNonOpYr();
        java.lang.String str9 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0820");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray12 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0821");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData1.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0822");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        int int44 = fieldData43.getQuarter();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0823");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        boolean boolean5 = fieldDataYear1.quarterDataAvailable((int) (byte) 100);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0824");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 100, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        org.junit.Assert.assertNotNull(cashFileData3);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0825");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum8 = companyFileData2.getSnpIndex();
        java.lang.String str9 = companyFileData2.getZip();
        companyFileData2.setCountry("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(snpEnum8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0826");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(0, 1, "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/" + "'", str4, "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0827");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        long long5 = sharesFileData1.getVolume10d();
        int int6 = sharesFileData1.getInsiderNetTrades();
        int int7 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0828");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray8 = incSheetFileData1.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0829");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        java.lang.String str11 = companyFileData8.getStreet();
        companyFileData8.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str14 = companyFileData8.getSic();
        balSheetFileData1.setNameFields(companyFileData8);
        java.lang.String str16 = companyFileData8.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" + "'", str14, "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0830");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        double double11 = sharesFileData1.getInsiderNetPercentOutstanding();
        int int12 = sharesFileData1.getInstShareholders();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        companyFileData9.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData9);
        double[] doubleArray20 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0832");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(cashFileData20);
        org.junit.Assert.assertNotNull(estimateFileData21);
        org.junit.Assert.assertNotNull(balSheetFileData22);
        org.junit.Assert.assertNotNull(estimateFileData23);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0833");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0834");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        java.lang.String str11 = companyFileData1.getWeb();
        java.lang.String str12 = companyFileData1.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0835");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        double double11 = sharesFileData1.getInsiderNetPercentOutstanding();
        double double12 = sharesFileData1.getPrice52lo();
        java.lang.String str13 = sharesFileData1.getIndustry();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0836");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setZip("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str5 = companyFileData2.getState();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("hi!");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0838");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double double21 = estimateFileData20.getEpsY2();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0839");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str12 = balSheetFileData11.toDbOutput();
        double[] doubleArray13 = balSheetFileData11.getOtherLtLiabQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0840");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0841");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        companyFileData2.setWeb("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        java.lang.String str12 = companyFileData2.getSector();
        java.lang.String str13 = companyFileData2.getState();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0842");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray5 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0843");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray7 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData1.getNonrecurringItemsYr();
        double[] doubleArray9 = incSheetFileData1.getGrossIncQtr();
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0844");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        int int13 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInsiderNetTrades("out/BigDB/");
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int18 = sharesFileData1.getInsiderSells();
        int int19 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0845");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0846");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray10 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray11 = incSheetFileData1.getIncAfterTaxQtr();
        double[] doubleArray12 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray13 = incSheetFileData1.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray2);
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0847");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getTotalLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        companyFileData4.setSector("data/BigDB/");
        java.lang.String[] strArray14 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList15, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList20 = companyFileData4.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData23);
        companyFileData24.setTicker("");
        estimateFileData22.setNameFields(companyFileData24);
        java.lang.String str28 = estimateFileData22.toDbOutput();
        double double29 = estimateFileData22.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData30);
        double double32 = sharesFileData31.getFloatshr();
        sharesFileData31.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int35 = sharesFileData31.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData36);
        double[] doubleArray38 = incSheetFileData37.getIncTaxYr();
        java.lang.String str39 = incSheetFileData37.toDbOutput();
        double[] doubleArray40 = incSheetFileData37.getGrossIncQtr();
        java.lang.String str41 = incSheetFileData37.getSector();
        double[] doubleArray42 = incSheetFileData37.getGrossOpIncYr();
        double[] doubleArray43 = incSheetFileData37.getAdjToIncYr();
        double[] doubleArray44 = incSheetFileData37.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData45 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData45);
        double[] doubleArray47 = balSheetFileData46.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData21, estimateFileData22, sharesFileData31, incSheetFileData37, balSheetFileData46, cashFileData48, 1, (int) (short) 10);
        balSheetFileData1.setNameFields(companyFileData21);
        companyFileData21.setZip("NONE");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray47);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = fieldDataQuarter17.fieldDataList;
        int int19 = fieldDataQuarter17.getYear();
        fieldDataYear1.set((int) (byte) 0, fieldDataQuarter17);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0849");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        companyFileData9.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData9);
        companyFileData9.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData9.setAdr("data/BigDB/");
        double[] doubleArray24 = companyFileData9.getPriceQtr();
        java.lang.String str25 = companyFileData9.getIndustry();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray7 = balSheetFileData1.getStDebtQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0851");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(sharesFileData19);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0852");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray7 = incSheetFileData1.getNonrecurringItemsYr();
        java.lang.String str8 = incSheetFileData1.getSector();
        java.lang.String str9 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        java.lang.String str8 = companyFileData2.getSnpIndexStr();
        companyFileData2.setSic("Cash File Data");
        java.lang.String str11 = companyFileData2.getName();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0854");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int6 = sharesFileData1.getInstSellShrs();
        java.lang.String str7 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0855");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        java.lang.String str49 = companyFileData18.getIndustry();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0856");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0857");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray3 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0858");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0859");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray15 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray16 = balSheetFileData1.getStInvestYr();
        java.lang.String str17 = balSheetFileData1.getName();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0860");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        double[] doubleArray7 = balSheetFileData1.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0861");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        double double6 = sharesFileData1.getBeta();
        sharesFileData1.setInsiderBuys("Cash File Data");
        int int9 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0862");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        double[] doubleArray9 = incSheetFileData8.getDepreciationYr();
        double[] doubleArray10 = incSheetFileData8.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData8.getIntExpYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0863");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        double[] doubleArray11 = sharesFileData1.getSharesQtr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0864");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str7 = companyFileData1.getCity();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0865");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        java.lang.String str4 = balSheetFileData1.getIndustry();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0866");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0867");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("NONE", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0868");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray14 = balSheetFileData1.getStInvestYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0869");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getEpsQtr();
        double[] doubleArray6 = incSheetFileData1.getSalesYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0870");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0871");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getDepreciationQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        companyFileData4.setState("out/BigDB/");
        java.lang.String str12 = companyFileData4.getZip();
        incSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray14 = incSheetFileData1.getDividendYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        double[] doubleArray5 = balSheetFileData1.getStDebtYr();
        double[] doubleArray6 = balSheetFileData1.getStInvestYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0873");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray14 = balSheetFileData1.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0874");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = fieldData2.getCompanyInfo();
        java.lang.String str4 = companyFileData3.getCountry();
        org.junit.Assert.assertNotNull(companyFileData3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0875");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str7 = balSheetFileData1.getTicker();
        double[] doubleArray8 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray9 = balSheetFileData1.getTotalLiabYr();
        java.lang.String str10 = balSheetFileData1.getSector();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInstOwnership("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double17 = sharesFileData1.getFloatshr();
        double double18 = sharesFileData1.getMktCap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0877");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxQtr();
        double[] doubleArray8 = incSheetFileData1.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0878");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.getTicker();
        java.lang.String str2 = cashFileData0.toDbOutput();
        double[] doubleArray3 = cashFileData0.getCapExQtr();
        double[] doubleArray4 = cashFileData0.getCashFromOpsQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setPrice("hi!");
        sharesFileData1.setVolume10d("Cash File Data");
        long long7 = sharesFileData1.getVolume10d();
        sharesFileData1.setInsiderSellShrs("NONE");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0880");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        int int11 = sharesFileData1.getInsiderBuyShrs();
        double double12 = sharesFileData1.getPrice52lo();
        double double13 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFloatshr("out/BigDB/");
        long long16 = sharesFileData1.getVolumeMonth3m();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0881");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        double[] doubleArray44 = balSheetFileData29.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0882");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sharesFileData15);
        org.junit.Assert.assertNotNull(cashFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(sharesFileData18);
        org.junit.Assert.assertNotNull(sharesFileData19);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0883");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double[] doubleArray49 = incSheetFileData34.getSalesYr();
        double[] doubleArray50 = incSheetFileData34.getGrossIncQtr();
        double[] doubleArray51 = incSheetFileData34.getPreTaxIncYr();
        double[] doubleArray52 = incSheetFileData34.getIntExpNonOpQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0884");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray5 = incSheetFileData1.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        java.lang.String str6 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0887");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setPrice("hi!");
        sharesFileData1.setVolume10d("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData7);
        double double9 = sharesFileData8.getInsiderNetPercentOutstanding();
        sharesFileData8.setFromReport((int) (short) -1, (-1));
        sharesFileData8.setVolume10d("out/BigDB/");
        double[] doubleArray19 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData8.setSharesY(doubleArray19);
        sharesFileData1.setSharesQ(doubleArray19);
        sharesFileData1.setBeta("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0888");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str12 = estimateFileData11.getName();
        double double13 = estimateFileData11.getEpsQ1();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0889");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList17, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0890");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData0.getLatestQtrEps();
        java.lang.String str3 = estimateFileData0.getIndustry();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getLatestQtrEps();
        double double5 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("NONE", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0892");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData6.setTicker("");
        java.lang.String str9 = companyFileData6.getStreet();
        companyFileData6.setPhone("");
        companyFileData6.setState("out/BigDB/");
        java.lang.String str14 = companyFileData6.getWeb();
        boolean boolean15 = companyFileData6.isAdr();
        sharesFileData1.setNameFields(companyFileData6);
        companyFileData6.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        java.lang.String str40 = companyFileData1.getWeb();
        companyFileData1.setZip("data/BigDB/");
        companyFileData1.setCity("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0894");
        java.lang.String[] strArray6 = new java.lang.String[] { "data/BigDB/", "hi!", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/" };
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0895");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData0.getLatestQtrEps();
        java.lang.String str3 = estimateFileData0.getIndustry();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getLatestQtrEps();
        double double5 = estimateFileData0.getEpsQ0();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0896");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = companyFileData11.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = companyFileData11.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0897");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        int int6 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int9 = sharesFileData1.getInstShareholders();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        companyFileData17.setSector("out/BigDB/");
        java.lang.String str20 = companyFileData17.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum21 = companyFileData17.getSnpIndex();
        sharesFileData1.setNameFields(companyFileData17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(snpEnum21);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0898");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        java.lang.String str44 = cashFileData35.getTicker();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0899");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        companyFileData18.setStreet("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0900");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        double double44 = estimateFileData12.getEpsQ0();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0901");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        double[] doubleArray44 = cashFileData40.getCashFromInvQtr();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0902");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        double[] doubleArray44 = balSheetFileData29.getLiabEquityYr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0903");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        boolean boolean5 = fieldDataYear1.isInUse();
        boolean boolean6 = fieldDataYear1.isInUse();
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertNull(fieldDataQuarter9);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0904");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray5 = balSheetFileData4.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0906");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (byte) 1);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0907");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setFromReport((int) '4', (int) (short) 0);
        int int7 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setInsiderSellShrs("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = estimateFileData4.getExchange();
        double double6 = estimateFileData4.getEpsQ0();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0909");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = incSheetFileData1.toDbOutput();
        double[] doubleArray17 = incSheetFileData1.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0910");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/", "data/BigDB/" };
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0911");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        java.lang.String[] strArray10 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList11, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList15);
        int int17 = fieldDataQuarter16.getYear();
        fieldDataYear1.set((int) (byte) -1, fieldDataQuarter16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        java.lang.String[] strArray30 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList31, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList35);
        int int37 = fieldDataQuarter36.getYear();
        fieldDataYear21.set((int) (byte) -1, fieldDataQuarter36);
        fieldDataYear1.set((int) (short) -1, fieldDataQuarter36);
        java.lang.String[] strArray49 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList50, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter56 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList54);
        int int57 = fieldDataQuarter56.getQuarter();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList58 = fieldDataQuarter56.fieldDataList;
        fieldDataQuarter36.fieldDataList = fieldDataList58;
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataList54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(fieldDataList58);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0912");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray14 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0913");
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList14);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = fieldDataQuarter16.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = fieldDataQuarter16.fieldDataList;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0914");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray16 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray17 = incSheetFileData1.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0915");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(incSheetFileData12);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0916");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData1.getCogsYr();
        double[] doubleArray7 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray8 = incSheetFileData1.getSalesQtr();
        double[] doubleArray9 = incSheetFileData1.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0917");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray6 = incSheetFileData1.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0918");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getIndustry();
        java.lang.String str9 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = fieldData2.getBalSheetData();
        double[] doubleArray12 = balSheetFileData11.getOtherLtAssetsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0919");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = estimateFileData7.getExchange();
        double double9 = estimateFileData7.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        java.lang.String str11 = estimateFileData7.toDbOutput();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0920");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        java.lang.String str6 = sharesFileData1.getTicker();
        int int7 = sharesFileData1.getInsiderNetTrades();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0921");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getIndustry();
        java.lang.String str9 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = fieldData2.getExchange();
        java.lang.String str11 = fieldData2.getIndustry();
        java.lang.String str12 = fieldData2.genOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0923");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("data/BigDB/", (int) '#', (int) '#', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0924");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 1, (int) 'a', "data/BigDB/", "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data" + "'", str4, "out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0925");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        double[] doubleArray8 = companyFileData1.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        int int10 = companyFileData1.getNumEmployees();
        java.lang.String str11 = companyFileData1.getDowIndexStr();
        companyFileData1.setIndustry("");
        companyFileData1.setZip("out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0926");
        java.lang.String[] strArray5 = new java.lang.String[] { "NONE", "NONE", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "NONE" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0927");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str20 = companyFileData19.getStreet();
        companyFileData19.setSector("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int6 = sharesFileData1.getInstSellShrs();
        int int7 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0929");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0930");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass49 = companyFileData18.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0931");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray10 = incSheetFileData1.getRdQtr();
        double[] doubleArray11 = incSheetFileData1.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0932");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        double double3 = sharesFileData1.getPrice();
        int int4 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInstOwnership("");
        int int7 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0933");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray3 = incSheetFileData1.getEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray16 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray17 = incSheetFileData1.getIncPrimaryEpsYr();
        java.lang.String str18 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0935");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((-1), 100, filetypeEnum2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0936");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        java.lang.String str7 = incSheetFileData1.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = incSheetFileData1.getExchange();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str10 = incSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0937");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str13 = sharesFileData1.getIndustry();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0938");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double2 = estimateFileData1.getEpsQ1();
        java.lang.String str3 = estimateFileData1.getTicker();
        double double4 = estimateFileData1.getEpsY2();
        java.lang.String str5 = estimateFileData1.getName();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0939");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray8 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray9 = incSheetFileData1.getNetIncYr();
        double[] doubleArray10 = incSheetFileData1.getIncAfterTaxQtr();
        java.lang.String str11 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = estimateFileData7.getExchange();
        java.lang.String str9 = estimateFileData7.getName();
        java.lang.String str10 = estimateFileData7.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = estimateFileData7.getExchange();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0942");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setNumEmployees("Cash File Data");
        java.lang.String str12 = companyFileData7.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData13);
        companyFileData14.setTicker("");
        companyFileData14.setSector("data/BigDB/");
        java.lang.String[] strArray24 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList25, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList30 = companyFileData14.set((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList32 = companyFileData7.set((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData34 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList32);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(estimateFileData31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(estimateFileData33);
        org.junit.Assert.assertNotNull(companyFileData34);
        org.junit.Assert.assertNotNull(estimateFileData35);
        org.junit.Assert.assertNotNull(estimateFileData36);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        java.lang.String str6 = balSheetFileData1.getExchange();
        double[] doubleArray7 = balSheetFileData1.getInventoryYr();
        java.lang.String str8 = balSheetFileData1.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0944");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData1.getEpsQtr();
        double[] doubleArray9 = incSheetFileData1.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        companyFileData11.setTicker("");
        java.lang.String str14 = companyFileData11.getStreet();
        companyFileData11.setPhone("");
        companyFileData11.setAdr("out/BigDB/");
        java.lang.String str19 = companyFileData11.getSic();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray21 = incSheetFileData1.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray7 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData1.getSalesYr();
        double[] doubleArray9 = incSheetFileData1.getEpsYr();
        double[] doubleArray10 = incSheetFileData1.getEpsDilQtr();
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0946");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.toString();
        companyFileData1.setSic("Cash File Data");
        java.lang.String str10 = companyFileData1.getStreet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray4 = incSheetFileData1.getEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0948");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderOwnership("NONE");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray15 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0950");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        java.lang.String str6 = fieldData2.toString();
        java.lang.String str7 = fieldData2.toString();
        java.lang.String str8 = fieldData2.getSector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0951");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", (int) (byte) 0, 6);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0952");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        double double19 = sharesFileData18.getInsiderNetPercentOutstanding();
        sharesFileData18.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData24);
        companyFileData25.setTicker("");
        estimateFileData23.setNameFields(companyFileData25);
        sharesFileData18.setNameFields(companyFileData25);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum30 = companyFileData25.getExchange();
        companyFileData25.setSector("data/BigDB/");
        sharesFileData1.setNameFields(companyFileData25);
        java.lang.String str34 = companyFileData25.getTicker();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(exchEnum30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0953");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        java.lang.String str11 = companyFileData1.getWeb();
        companyFileData1.setName("hi!");
        companyFileData1.setIndustry("out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0954");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0955");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        long long17 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0956");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setInstBuyShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int11 = sharesFileData1.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0957");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContQtr();
        java.lang.String str7 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0958");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray3 = incSheetFileData2.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0959");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        boolean boolean6 = companyFileData2.isAdr();
        java.lang.String str7 = companyFileData2.getSector();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0960");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0961");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        java.lang.String str3 = companyFileData1.getIndustry();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0962");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        companyFileData9.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData9);
        companyFileData9.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData9.setAdr("data/BigDB/");
        double[] doubleArray24 = companyFileData9.getPriceQtr();
        java.lang.String str25 = companyFileData9.getSic();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0963");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double[] doubleArray13 = balSheetFileData12.getOtherLtAssetsYr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(balSheetFileData12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInsiderSells();
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0965");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0966");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(35, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0967");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = fieldData2.getCompanyInfo();
        java.lang.String str4 = fieldData2.toString();
        org.junit.Assert.assertNotNull(companyFileData3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0968");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData2);
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0969");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0970");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/" };
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "data/BigDB/", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray6, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0971");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("", (int) (byte) 1, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0972");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = fieldData2.getCompanyInfo();
        int int4 = fieldData2.getYear();
        org.junit.Assert.assertNotNull(companyFileData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0974");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData1.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0975");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        int int13 = sharesFileData1.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        int int18 = sharesFileData15.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData19);
        double double21 = sharesFileData20.getInsiderNetPercentOutstanding();
        sharesFileData20.setFromReport((int) (short) -1, (-1));
        java.lang.String str25 = sharesFileData20.getSector();
        sharesFileData20.setFloatshr("");
        sharesFileData20.setVolume10d("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData30);
        double double32 = sharesFileData31.getInsiderNetPercentOutstanding();
        double[] doubleArray38 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData31.setSharesY(doubleArray38);
        sharesFileData20.setSharesY(doubleArray38);
        sharesFileData15.setSharesQ(doubleArray38);
        sharesFileData1.setSharesQ(doubleArray38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0976");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0977");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData1.getInventoryQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0978");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray7 = cashFileData0.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str9 = cashFileData0.toDbOutput();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0980");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setPrice("out/BigDB/");
        double double7 = sharesFileData1.getFloatshr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0981");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setNumEmployees("Cash File Data");
        java.lang.String str12 = companyFileData7.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData13);
        companyFileData14.setTicker("");
        companyFileData14.setSector("data/BigDB/");
        java.lang.String[] strArray24 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList25, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList30 = companyFileData14.set((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList32 = companyFileData7.set((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData34 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList32);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(estimateFileData31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(estimateFileData33);
        org.junit.Assert.assertNotNull(companyFileData34);
        org.junit.Assert.assertNotNull(estimateFileData35);
        org.junit.Assert.assertNotNull(sharesFileData36);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0982");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        java.lang.String str7 = incSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0983");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        long long5 = sharesFileData1.getVolume10d();
        int int6 = sharesFileData1.getInsiderSells();
        double double7 = sharesFileData1.getPrice();
        int int8 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        java.lang.String str9 = fieldData2.getTicker();
        fieldData2.setQuarter((int) (byte) 100);
        java.lang.String str12 = fieldData2.genOutput();
        fieldData2.setYear((int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = fieldData2.getIncSheetData();
        fieldData2.setYear(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(incSheetFileData15);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0985");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double[] doubleArray8 = sharesFileData7.getSharesYr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0986");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestYr();
        double[] doubleArray5 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0987");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        java.lang.String str4 = companyFileData2.getStreet();
        double[] doubleArray5 = companyFileData2.getPriceQtr();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0988");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        double double49 = estimateFileData19.getEpsY1();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray9 = incSheetFileData8.getGrossOpIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0990");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setPhone("out/BigDB/");
        java.lang.String str6 = companyFileData2.getPhone();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "out/BigDB/" + "'", str6, "out/BigDB/");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0991");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        java.lang.String str40 = fieldData39.getIndustry();
        java.lang.String str41 = fieldData39.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray5 = incSheetFileData1.getRdYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        double[] doubleArray6 = balSheetFileData1.getBvpsQtr();
        java.lang.String str7 = balSheetFileData1.getSector();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0994");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray10 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray11 = incSheetFileData1.getIncAfterTaxQtr();
        double[] doubleArray12 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray13 = incSheetFileData1.getDepreciationYr();
        double[] doubleArray14 = incSheetFileData1.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
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
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0995");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0996");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        double[] doubleArray5 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0997");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray7 = incSheetFileData1.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0998");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str10 = cashFileData9.getTicker();
        java.lang.String str11 = cashFileData9.getTicker();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0999");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestYr();
        double[] doubleArray5 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test1000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        fieldData2.setQuarter((int) (byte) -1);
        java.lang.String str10 = fieldData2.toString();
        java.lang.String str11 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}

