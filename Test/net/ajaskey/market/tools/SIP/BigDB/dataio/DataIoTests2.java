package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1001");
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
        java.lang.String str10 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1002");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) '#', (int) (byte) 10, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ((int) (short) 1);
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getName();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1005");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        int int10 = sharesFileData1.getInstBuyShrs();
        sharesFileData1.setInstBuyShrs("");
        double[] doubleArray13 = sharesFileData1.getSharesQtr();
        sharesFileData1.setInstShareholders("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1006");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(cashFileData20);
        org.junit.Assert.assertNotNull(estimateFileData21);
        org.junit.Assert.assertNotNull(companyFileData22);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1007");
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
        sharesFileData28.setVolume3m("Cash File Data");
        sharesFileData28.setInsiderBuyShrs("NONE");
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
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        sharesFileData1.setDollar3m("hi!");
        sharesFileData1.setPrice("hi!");
        java.lang.String str9 = sharesFileData1.getTicker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        double double11 = sharesFileData1.getPrice52hi();
        sharesFileData1.setInstShareholders("");
        sharesFileData1.setDollar3m("out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1010");
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
        sharesFileData18.setFloatshr("out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sharesFileData15);
        org.junit.Assert.assertNotNull(cashFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(sharesFileData18);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1011");
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
        java.lang.String str19 = companyFileData1.getZip();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        double[] doubleArray6 = balSheetFileData1.getBvpsQtr();
        java.lang.String str7 = balSheetFileData1.toDbOutput();
        java.lang.String str8 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        java.lang.String[] strArray12 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList17);
        int int19 = fieldDataQuarter18.getYear();
        fieldDataYear3.set((int) (byte) -1, fieldDataQuarter18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = fieldDataQuarter18.fieldDataList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 100, 1, fieldDataList21);
        int int23 = fieldDataQuarter22.getYear();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray4 = balSheetFileData3.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData3.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1015");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double8 = estimateFileData0.getEpsY0();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        boolean boolean5 = fieldDataYear1.isInUse();
        boolean boolean6 = fieldDataYear1.isInUse();
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter8);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1017");
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
        java.lang.String str99 = companyFileData2.getPhone();
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1019");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray12 = balSheetFileData11.getLiabEquityQtr();
        java.lang.String str13 = balSheetFileData11.getName();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1021");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str7 = companyFileData1.getSic();
        companyFileData1.setSector("hi!");
        companyFileData1.setCity("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" + "'", str7, "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1022");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(35, (int) '#', filetypeEnum2);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getCogsQtr();
        java.lang.String str5 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 10, (int) (short) -1);
        fieldData2.setQuarter((int) 'a');
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1026");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "hi!", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray13 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray14 = balSheetFileData1.getCurrAssetsYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestYr();
        double[] doubleArray5 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray6 = balSheetFileData1.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1029");
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
        companyFileData8.setSector("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" + "'", str14, "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        java.lang.String str4 = incSheetFileData1.getSector();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1031");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "NONE" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1032");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = cashFileData6.getCashFromOpsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        java.lang.String str13 = sharesFileData1.getTicker();
        double double14 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        java.lang.String str7 = cashFileData6.getTicker();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1037");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        java.lang.String str5 = fieldData2.genOutput();
        fieldData2.setYear((-1));
        fieldData2.setQuarter((int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = fieldData2.getBalSheetData();
        java.lang.String str11 = fieldData2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(balSheetFileData10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        companyFileData1.setCity("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        java.lang.String str5 = incSheetFileData1.getTicker();
        double[] doubleArray6 = incSheetFileData1.getSalesQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData1.getGrossOpIncYr();
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1042");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = companyFileData1.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum10 = companyFileData1.getDowIndex();
        companyFileData1.setAdr("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(dowEnum10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        boolean boolean4 = fieldDataYear1.quarterDataAvailable(100);
        boolean boolean5 = fieldDataYear1.isInUse();
        boolean boolean6 = fieldDataYear1.isInUse();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1044");
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
        int int40 = fieldDataQuarter36.getYear();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getIndustry();
        java.lang.String str9 = fieldData2.genOutput();
        int int10 = fieldData2.getQuarter();
        java.lang.String str11 = fieldData2.toString();
        java.lang.String str12 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getName();
        double double2 = estimateFileData0.getEpsY2();
        double double3 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) (short) 0);
        org.junit.Assert.assertNull(fieldDataQuarter3);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        java.lang.String str10 = companyFileData1.getCity();
        companyFileData1.setPhone("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryYr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray8 = balSheetFileData1.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray7 = incSheetFileData1.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str2 = estimateFileData0.getName();
        java.lang.String str3 = estimateFileData0.getTicker();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1052");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/", "NONE", "Cash File Data", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "Cash File Data", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" };
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1053");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY2();
        java.lang.String str8 = estimateFileData0.getIndustry();
        double double9 = estimateFileData0.getEpsQ1();
        net.ajaskey.common.DateTime dateTime10 = estimateFileData0.getLatestQtrEps();
        double double11 = estimateFileData0.getEpsY0();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(dateTime10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        java.lang.String str5 = balSheetFileData1.getTicker();
        double[] doubleArray6 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1055");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray7 = incSheetFileData1.getNonrecurringItemsYr();
        java.lang.String str8 = incSheetFileData1.getSector();
        double[] doubleArray9 = incSheetFileData1.getCogsQtr();
        double[] doubleArray10 = incSheetFileData1.getGrossIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 1, 35);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getStDebtQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        int int6 = fieldData2.getYear();
        int int7 = fieldData2.getQuarter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        java.lang.String str6 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = fieldData2.getCompanyInfo();
        companyFileData7.setZip("out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(companyFileData7);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1060");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(sharesFileData31);
        org.junit.Assert.assertNotNull(cashFileData32);
        org.junit.Assert.assertNotNull(incSheetFileData33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(estimateFileData35);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        companyFileData1.setTicker("out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setCountry("out/BigDB/");
        companyFileData0.setZip("data/BigDB/");
        java.lang.String str5 = companyFileData0.getCity();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray12 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData1.setSharesY(doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1064");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("hi!", (int) (byte) 100, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData1.getGrossIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        fieldData2.setYear((int) ' ');
        java.lang.String str8 = fieldData2.getName();
        java.lang.String str9 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShareData();
        sharesFileData11.setInsiderSells("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNotNull(sharesFileData11);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setPhone("out/BigDB/");
        companyFileData2.setWeb("data/BigDB/");
        companyFileData2.setName("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(exchEnum3);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        double[] doubleArray9 = companyFileData1.getPriceQtr();
        companyFileData1.setZip("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNull(fieldDataQuarter7);
        org.junit.Assert.assertNull(fieldDataQuarter8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getRdQtr();
        double[] doubleArray5 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        java.lang.String str6 = sharesFileData1.getName();
        sharesFileData1.setInsiderOwnership("hi!");
        int int9 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderNetTrades("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        double double12 = sharesFileData1.getPrice52lo();
        java.lang.String str13 = sharesFileData1.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1073");
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
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum21 = companyFileData19.getDowIndex();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dowEnum21);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1074");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data", "data/BigDB/" };
        java.lang.String[] strArray8 = new java.lang.String[] { "data/BigDB/", "Cash File Data", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        double[] doubleArray5 = balSheetFileData1.getStDebtYr();
        double[] doubleArray6 = balSheetFileData1.getStInvestYr();
        double[] doubleArray7 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getCurrLiabYr();
        java.lang.String str9 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String str4 = incSheetFileData1.getSector();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getRdQtr();
        double[] doubleArray5 = incSheetFileData1.getSalesQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        boolean boolean5 = fieldDataYear1.quarterDataAvailable((int) (short) 0);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1079");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShareData();
        sharesFileData9.setInstSellShrs("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        sharesFileData9.setInsiderSells("NONE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(sharesFileData9);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1082");
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
        sharesFileData1.setFromReport(1, (int) ' ');
        sharesFileData1.setPrice("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        companyFileData2.setWeb("data/BigDB/");
        companyFileData2.setIndustry("hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray6 = cashFileData0.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray8 = cashFileData0.getCashFromInvQtr();
        double[] doubleArray9 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1086");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setIndustry("data/BigDB/");
        companyFileData7.setNumEmployees("data/BigDB/");
        companyFileData7.setCountry("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        companyFileData1.setAdr("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData12);
        companyFileData13.setTicker("");
        java.lang.String str16 = companyFileData13.getStreet();
        companyFileData13.setPhone("");
        java.lang.String str19 = companyFileData13.getSector();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList29 = companyFileData13.set((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList29);
        java.util.List<java.lang.String> strList31 = companyFileData1.set(strList29);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(sharesFileData27);
        org.junit.Assert.assertNotNull(cashFileData28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(sharesFileData30);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1088");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData9);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum22 = companyFileData21.getDowIndex();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "out/BigDB/" + "'", str20, "out/BigDB/");
        org.junit.Assert.assertNull(dowEnum22);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray7 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData1.getGrossOpIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1090");
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList14);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (byte) 1, (int) (byte) 10);
        fieldDataQuarter16.fieldDataList = fieldDataList19;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getSalesYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilContQtr();
        java.lang.String str8 = incSheetFileData1.getIndustry();
        double[] doubleArray9 = incSheetFileData1.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1092");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "Cash File Data", "NONE", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray10 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray11 = balSheetFileData1.getBvpsYr();
        double[] doubleArray12 = balSheetFileData1.getOtherCurrAssetsYr();
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
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        fieldData2.setYear((int) ' ');
        java.lang.String str8 = fieldData2.getName();
        java.lang.String str9 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShareData();
        java.lang.String str12 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1095");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str6 = cashFileData0.getTicker();
        double[] doubleArray7 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray7 = incSheetFileData1.getEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsQtr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        java.lang.String str7 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1099");
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
        java.lang.String str35 = companyFileData34.getIndustry();
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
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getRdYr();
        java.lang.String str5 = incSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1101");
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
        double[] doubleArray18 = incSheetFileData1.getNonrecurringItemsQtr();
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData1.getIntExpNonOpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData9);
        companyFileData10.setTicker("");
        java.lang.String str13 = companyFileData10.getStreet();
        companyFileData10.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData10.setCity("Cash File Data");
        java.lang.String str18 = companyFileData10.getStreet();
        companyFileData10.setTicker("");
        incSheetFileData1.setNameFields(companyFileData10);
        companyFileData10.setName("");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getCogsYr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1104");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setNumEmployees("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData12);
        companyFileData13.setTicker("");
        java.lang.String str16 = companyFileData13.getStreet();
        companyFileData13.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData27);
        double[] doubleArray29 = incSheetFileData28.getCogsYr();
        double[] doubleArray30 = incSheetFileData28.getGrossIncYr();
        double[] doubleArray31 = incSheetFileData28.getIncPrimaryEpsYr();
        double[] doubleArray32 = incSheetFileData28.getIntExpNonOpYr();
        double[] doubleArray33 = incSheetFileData28.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData34 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData34);
        double[] doubleArray36 = balSheetFileData35.getLiabEquityQtr();
        double[] doubleArray37 = balSheetFileData35.getLtInvestYr();
        double[] doubleArray38 = balSheetFileData35.getStInvestYr();
        double[] doubleArray39 = balSheetFileData35.getNetFixedAssetsQtr();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData47 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList45);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData48 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList45);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData13, estimateFileData19, sharesFileData26, incSheetFileData28, balSheetFileData35, cashFileData48, (int) (short) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData19);
        net.ajaskey.common.DateTime dateTime53 = estimateFileData19.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData54);
        sharesFileData55.setInsiderSellShrs("Cash File Data");
        sharesFileData55.setInsiderBuys("hi!");
        sharesFileData55.setFloatshr("Cash File Data");
        sharesFileData55.setFromReport((int) ' ', (int) (byte) 100);
        double double65 = sharesFileData55.getInstOwnership();
        double double66 = sharesFileData55.getMktCap();
        sharesFileData55.setInsiderBuys("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData69 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData69);
        double[] doubleArray71 = incSheetFileData70.getCogsYr();
        double[] doubleArray72 = incSheetFileData70.getGrossIncYr();
        double[] doubleArray73 = incSheetFileData70.getIncPrimaryEpsYr();
        double[] doubleArray74 = incSheetFileData70.getDividendQtr();
        double[] doubleArray75 = incSheetFileData70.getNonrecurringItemsQtr();
        double[] doubleArray76 = incSheetFileData70.getNetIncYr();
        double[] doubleArray77 = incSheetFileData70.getGrossIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData78 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData79 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData78);
        double[] doubleArray80 = balSheetFileData79.getEquityQtr();
        double[] doubleArray81 = balSheetFileData79.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData82 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str83 = cashFileData82.toDbOutput();
        double[] doubleArray84 = cashFileData82.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData85 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData82);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData19, sharesFileData55, incSheetFileData70, balSheetFileData79, cashFileData85, 1, (int) '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(sharesFileData47);
        org.junit.Assert.assertNotNull(cashFileData48);
        org.junit.Assert.assertNull(dateTime53);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(doubleArray75);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNull(doubleArray77);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNull(doubleArray84);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = estimateFileData4.getExchange();
        double double6 = estimateFileData4.getEpsY2();
        java.lang.String str7 = estimateFileData4.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str2 = estimateFileData0.getSector();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        int int13 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInstOwnership("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        java.lang.String str8 = incSheetFileData1.toDbOutput();
        double[] doubleArray9 = incSheetFileData1.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = sharesFileData1.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = sharesFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getCogsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1111");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray6 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray7 = cashFileData0.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        java.lang.String str5 = balSheetFileData1.getExchange();
        double[] doubleArray6 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray7 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1114");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double[] doubleArray9 = balSheetFileData8.getOtherCurrLiabYr();
        double[] doubleArray10 = balSheetFileData8.getAcctPayableQtr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        double double11 = sharesFileData1.getPrice52hi();
        double double12 = sharesFileData1.getFloatshr();
        sharesFileData1.setVolume3m("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1116");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        sharesFileData15.setInsiderBuys("hi!");
        sharesFileData15.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData22);
        companyFileData23.setTicker("");
        java.lang.String str26 = companyFileData23.getStreet();
        companyFileData23.setPhone("");
        companyFileData23.setState("out/BigDB/");
        companyFileData23.setState("out/BigDB/");
        sharesFileData15.setNameFields(companyFileData23);
        companyFileData23.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData23.setWeb("");
        java.lang.String[] strArray42 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData47 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList48 = companyFileData23.set((java.util.List<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList49 = companyFileData1.set(strList48);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(sharesFileData45);
        org.junit.Assert.assertNotNull(cashFileData46);
        org.junit.Assert.assertNotNull(incSheetFileData47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setCountry("out/BigDB/");
        incSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setAdr("out/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double9 = sharesFileData1.getPrice52lo();
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1119");
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
        double double22 = sharesFileData1.getFloatshr();
        java.lang.String str23 = sharesFileData1.toString();
        java.lang.String str24 = sharesFileData1.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        java.lang.String str26 = sharesFileData25.getIndustry();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        java.lang.String str6 = balSheetFileData1.getExchange();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray9 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData1.getCogsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str7 = cashFileData6.toDbOutput();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum11 = companyFileData1.getDowIndex();
        companyFileData1.setSector("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setTicker("");
        java.lang.String str16 = companyFileData1.getDowIndexStr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dowEnum11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.getTicker();
        java.lang.String str2 = cashFileData0.toDbOutput();
        double[] doubleArray3 = cashFileData0.getCapExQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        java.lang.String str5 = cashFileData0.getTicker();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        java.lang.String str6 = balSheetFileData1.getExchange();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ1();
        double double7 = estimateFileData0.getEpsQ1();
        double double8 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1127");
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
        java.lang.String[] strArray46 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData49 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList47);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData50 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList47);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList53 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList47, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) -1, (int) (short) 1, fieldDataList53);
        fieldDataQuarter36.fieldDataList = fieldDataList53;
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(companyFileData49);
        org.junit.Assert.assertNotNull(sharesFileData50);
        org.junit.Assert.assertNotNull(fieldDataList53);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1128");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY1();
        java.lang.String str2 = estimateFileData0.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        java.lang.String str10 = companyFileData4.getSector();
        double[] doubleArray11 = companyFileData4.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData4);
        estimateFileData0.setNameFields(companyFileData12);
        java.lang.String str14 = estimateFileData0.getSector();
        double double15 = estimateFileData0.getEpsY1();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        java.lang.String str12 = balSheetFileData1.getTicker();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        double[] doubleArray9 = incSheetFileData8.getDepreciationYr();
        double[] doubleArray10 = incSheetFileData8.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData8.getPreTaxIncQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1132");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        java.lang.String str6 = sharesFileData1.getName();
        sharesFileData1.setInsiderOwnership("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum20 = companyFileData16.getSnpIndex();
        sharesFileData1.setNameFields(companyFileData16);
        companyFileData16.setZip("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(snpEnum20);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1133");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 1, 100, "Cash File Data", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q100/Cash File Data-fundamental-data-1Q100.out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" + "'", str4, "out/BigDB/1/Q100/Cash File Data-fundamental-data-1Q100.out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setCity("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double[] doubleArray11 = companyFileData1.getPriceQtr();
        companyFileData1.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        sharesFileData1.setInstOwnership("data/BigDB/");
        double double11 = sharesFileData1.getMktCap();
        int int12 = sharesFileData1.getInsiderSells();
        double double13 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1136");
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
        companyFileData9.setStreet("");
        companyFileData9.setStreet("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getFloatshr();
        double double5 = sharesFileData1.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData6.setTicker("");
        java.lang.String str9 = companyFileData6.getStreet();
        companyFileData6.setPhone("");
        companyFileData6.setState("out/BigDB/");
        java.lang.String str14 = companyFileData6.getWeb();
        boolean boolean15 = companyFileData6.isAdr();
        java.lang.String str16 = companyFileData6.getWeb();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum17 = companyFileData6.getSnpIndex();
        balSheetFileData1.setNameFields(companyFileData6);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(snpEnum17);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getTotalAssetsQtr();
        java.lang.String str13 = balSheetFileData1.getSector();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        companyFileData2.setWeb("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = companyFileData2.getExchange();
        companyFileData2.setZip("");
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str6 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1142");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList16);
        int int19 = fieldDataQuarter18.getQuarter();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) -1, (int) (short) 0);
        fieldDataQuarter18.fieldDataList = fieldDataList22;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) '4', 6, fieldDataList22);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        java.lang.String str7 = incSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str4 = incSheetFileData1.toDbOutput();
        double[] doubleArray5 = incSheetFileData1.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("NONE");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (byte) 10);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double2 = estimateFileData1.getEpsQ1();
        double double3 = estimateFileData1.getEpsY2();
        java.lang.String str4 = estimateFileData1.getIndustry();
        double double5 = estimateFileData1.getEpsY2();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray11 = incSheetFileData1.getDepreciationYr();
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = fieldData2.getEstimateData();
        java.lang.String str7 = estimateFileData6.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setPhone("");
        companyFileData9.setState("out/BigDB/");
        java.lang.String str17 = companyFileData9.getWeb();
        boolean boolean18 = companyFileData9.isAdr();
        java.lang.String str19 = companyFileData9.getWeb();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum20 = companyFileData9.getSnpIndex();
        estimateFileData6.setNameFields(companyFileData9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(snpEnum20);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray19 = incSheetFileData18.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1151");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double double12 = estimateFileData11.getEpsY0();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getBeta();
        double double5 = sharesFileData1.getBeta();
        sharesFileData1.setInsiderSells("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderNetTrades("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1153");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/1/Q100/Cash File Data-fundamental-data-1Q100.out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1155");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        double[] doubleArray13 = balSheetFileData12.getAcctRxQtr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(balSheetFileData12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1156");
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
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = companyFileData8.getExchange();
        java.lang.String str14 = companyFileData8.getDowIndexStr();
        companyFileData8.setName("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        companyFileData8.setTicker("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        java.lang.String str6 = sharesFileData1.getName();
        sharesFileData1.setInsiderOwnership("hi!");
        double double9 = sharesFileData1.getBeta();
        java.lang.String str10 = sharesFileData1.getTicker();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1158");
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
        sharesFileData17.setInstBuyShrs("hi!");
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
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        int int11 = sharesFileData1.getInsiderNetTrades();
        long long12 = sharesFileData1.getVolume10d();
        int int13 = sharesFileData1.getInsiderNetTrades();
        double double14 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1160");
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
        java.lang.String str19 = sharesFileData1.toString();
        java.lang.String str20 = sharesFileData1.getName();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1161");
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
        double double14 = sharesFileData1.getMktCap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1162");
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
        double[] doubleArray16 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray17 = incSheetFileData1.getDepreciationYr();
        java.lang.String str18 = incSheetFileData1.getSector();
        double[] doubleArray19 = incSheetFileData1.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "out/BigDB/" + "'", str18, "out/BigDB/");
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        double double11 = sharesFileData1.getInstOwnership();
        double double12 = sharesFileData1.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1164");
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
        double[] doubleArray11 = incSheetFileData1.getCogsYr();
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1165");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1166");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ1();
        int int8 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNull(fieldDataQuarter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        java.lang.String str8 = fieldData2.toString();
        java.lang.String str9 = fieldData2.getIndustry();
        java.lang.String str10 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = fieldData2.getCompanyInfo();
        boolean boolean12 = companyFileData11.isAdr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        java.lang.Class<?> wildcardClass7 = incSheetFileData1.getClass();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        double[] doubleArray9 = incSheetFileData8.getDepreciationYr();
        double[] doubleArray10 = incSheetFileData8.getEpsDilQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1170");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter40 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNull(fieldDataQuarter40);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray5 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getEpsDilContYr();
        double[] doubleArray4 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray5 = incSheetFileData1.getNetIncYr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        double[] doubleArray8 = companyFileData1.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        int int10 = companyFileData1.getNumEmployees();
        companyFileData1.setSector("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setIndustry("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        double[] doubleArray7 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        java.lang.String str6 = sharesFileData1.getName();
        sharesFileData1.setInsiderOwnership("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum20 = companyFileData16.getSnpIndex();
        sharesFileData1.setNameFields(companyFileData16);
        java.lang.String str22 = companyFileData16.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(snpEnum20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1177");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setPhone("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str6 = companyFileData1.getCity();
        boolean boolean7 = companyFileData1.isAdr();
        companyFileData1.setNumEmployees("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        java.lang.String str8 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = fieldData2.getExchange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        sharesFileData1.setInstShareholders("out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str4 = incSheetFileData1.getTicker();
        java.lang.String str5 = incSheetFileData1.toString();
        double[] doubleArray6 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray7 = incSheetFileData1.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime8 = estimateFileData0.getLatestQtrEps();
        java.lang.String str9 = estimateFileData0.getSector();
        java.lang.String str10 = estimateFileData0.getSector();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1183");
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
        java.lang.String str18 = sharesFileData1.getTicker();
        sharesFileData1.setInsiderBuyShrs("out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray7 = incSheetFileData1.getSalesQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1186");
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
        sharesFileData1.setInstBuyShrs("NONE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1187");
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
        java.lang.String str16 = companyFileData11.getDowIndexStr();
        boolean boolean17 = companyFileData11.isAdr();
        java.lang.String str18 = companyFileData11.getCity();
        companyFileData11.setState("out/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1188");
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
        double[] doubleArray21 = incSheetFileData1.getNonrecurringItemsYr();
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray3 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray4 = incSheetFileData1.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1191");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        boolean boolean5 = fieldDataYear1.isInUse();
        boolean boolean6 = fieldDataYear1.isInUse();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(100);
        int int9 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = fieldDataYear1.getQ4();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1192");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str7 = companyFileData1.getPhone();
        companyFileData1.setSic("Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInstOwnership("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double11 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getNetIncYr();
        double[] doubleArray8 = incSheetFileData1.getIntExpYr();
        double[] doubleArray9 = incSheetFileData1.getIntExpNonOpQtr();
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        companyFileData1.setPhone("");
        companyFileData1.setWeb("data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1197");
        java.lang.String[] strArray1 = new java.lang.String[] { "data/BigDB/" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/1/Q97/data/BigDB/-fundamental-data-1Q97.Cash File Data", "out/BigDB/", "Cash File Data", "out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray7 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray8 = incSheetFileData1.getDividendQtr();
        double[] doubleArray9 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1199");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getAcctPayableQtr();
        java.lang.String str5 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1200");
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
        double[] doubleArray14 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        java.lang.String str6 = balSheetFileData1.getExchange();
        double[] doubleArray7 = balSheetFileData1.getInventoryYr();
        double[] doubleArray8 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray9 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray3 = sharesFileData1.getSharesQtr();
        double double4 = sharesFileData1.getDollar3m();
        double double5 = sharesFileData1.getPrice();
        double double6 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getTotalLiabQtr();
        java.lang.String str4 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderSells("Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ(0);
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ4();
        boolean boolean10 = fieldDataYear1.isInUse();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertNull(fieldDataQuarter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInstSellShrs("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1207");
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
        double[] doubleArray17 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ1();
        double double7 = estimateFileData0.getEpsY2();
        java.lang.String str8 = estimateFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray10 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray11 = balSheetFileData1.getInventoryYr();
        double[] doubleArray12 = balSheetFileData1.getLtDebtQtr();
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        companyFileData12.setSector("out/BigDB/");
        companyFileData12.setPhone("out/BigDB/");
        incSheetFileData1.setNameFields(companyFileData12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData12);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(companyFileData12);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1211");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "Cash File Data", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "NONE", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = fieldData2.getExchange();
        java.lang.String str7 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1213");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(1);
        org.junit.Assert.assertNull(fieldDataQuarter3);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1214");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double5 = sharesFileData1.getInstOwnership();
        sharesFileData1.setInstShareholders("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setPhone("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum13 = companyFileData9.getDowIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData15);
        companyFileData16.setTicker("");
        estimateFileData14.setNameFields(companyFileData16);
        double double20 = estimateFileData14.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData14);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum22 = estimateFileData21.getExchange();
        java.lang.String str23 = estimateFileData21.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData25);
        double[] doubleArray27 = incSheetFileData26.getAdjToIncQtr();
        double[] doubleArray28 = incSheetFileData26.getGrossOpIncQtr();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList34);
        companyFileData36.setSector("out/BigDB/");
        java.lang.String str39 = companyFileData36.getPhone();
        incSheetFileData26.setNameFields(companyFileData36);
        java.lang.String str41 = incSheetFileData26.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData51 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList49);
        balSheetFileData43.setNameFields(companyFileData51);
        double[] doubleArray53 = balSheetFileData43.getTotalLiabYr();
        double[] doubleArray54 = balSheetFileData43.getLtInvestYr();
        double[] doubleArray55 = balSheetFileData43.getAcctRxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData56 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData56);
        companyFileData57.setTicker("");
        java.lang.String str60 = companyFileData57.getStreet();
        companyFileData57.setPhone("");
        companyFileData57.setAdr("out/BigDB/");
        java.lang.String str65 = companyFileData57.getSic();
        companyFileData57.setState("data/BigDB/");
        java.lang.String str68 = companyFileData57.getSic();
        balSheetFileData43.setNameFields(companyFileData57);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str71 = cashFileData70.toDbOutput();
        java.lang.String str72 = cashFileData70.toString();
        double[] doubleArray73 = cashFileData70.getCashFromInvQtr();
        java.lang.String str74 = cashFileData70.getTicker();
        double[] doubleArray75 = cashFileData70.getCashFromOpsQtr();
        double[] doubleArray76 = cashFileData70.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData70);
        double[] doubleArray78 = cashFileData70.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData81 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData21, sharesFileData24, incSheetFileData26, balSheetFileData43, cashFileData70, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(dowEnum13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(exchEnum22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(companyFileData36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(companyFileData51);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Cash File Data" + "'", str72, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(doubleArray75);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNull(doubleArray78);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        int int6 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int9 = sharesFileData1.getInstShareholders();
        sharesFileData1.setInstShareholders("data/BigDB/");
        double[] doubleArray12 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        int int6 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int9 = sharesFileData1.getInstShareholders();
        double double10 = sharesFileData1.getFloatshr();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        java.lang.String str12 = companyFileData9.getStreet();
        companyFileData9.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData9.setCity("Cash File Data");
        double[] doubleArray17 = companyFileData9.getPriceQtr();
        companyFileData9.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        incSheetFileData1.setNameFields(companyFileData9);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1219");
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
        double[] doubleArray10 = incSheetFileData1.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1220");
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
        sharesFileData1.setInstShareholders("Cash File Data");
        int int18 = sharesFileData1.getInstShareholders();
        double double19 = sharesFileData1.getPrice();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray19 = incSheetFileData18.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1222");
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
        sharesFileData1.setVolume10d("Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1223");
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
        java.lang.String str21 = companyFileData9.getZip();
        java.lang.String str22 = companyFileData9.getStreet();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "out/BigDB/" + "'", str20, "out/BigDB/");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getBeta();
        sharesFileData1.setInstOwnership("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = sharesFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/0/Q1/out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/-fundamental-data-0Q1.out/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        fieldData2.setYear((int) '#');
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.genOutput();
        java.lang.String str8 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = fieldData2.getIncSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        fieldData2.setYear((int) '#');
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        double[] doubleArray9 = incSheetFileData8.getAdjToIncQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        fieldData2.setYear((int) '#');
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.genOutput();
        java.lang.String str8 = fieldData2.getSector();
        java.lang.String str9 = fieldData2.getTicker();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getEpsDilContYr();
        double[] doubleArray4 = incSheetFileData1.getSalesYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getLtInvestYr();
        java.lang.String str13 = balSheetFileData1.toDbOutput();
        double[] doubleArray14 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setStreet("hi!");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setVolume3m("NONE");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1233");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str7 = balSheetFileData1.getTicker();
        double[] doubleArray8 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray9 = balSheetFileData1.getNetFixedAssetsYr();
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1234");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(cashFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        java.lang.String str7 = balSheetFileData1.getSector();
        double[] doubleArray8 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1238");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNotNull(cashFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(sharesFileData13);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) 'a');
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray5 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String str7 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        double[] doubleArray5 = balSheetFileData1.getStDebtYr();
        double[] doubleArray6 = balSheetFileData1.getStInvestYr();
        double[] doubleArray7 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray8 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1242");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setPrice("out/BigDB/");
        sharesFileData1.setInsiderBuys("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        sharesFileData1.setDollar3m("hi!");
        sharesFileData1.setPrice("hi!");
        int int9 = sharesFileData1.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getBvpsYr();
        double[] doubleArray8 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getCurrAssetsYr();
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1245");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(0, (int) 'a', "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q97/hi!-fundamental-data-0Q97.hi!" + "'", str4, "out/BigDB/0/Q97/hi!-fundamental-data-0Q97.hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1246");
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
        java.lang.String str14 = balSheetFileData1.getTicker();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("", "out/BigDB/1/Q100/Cash File Data-fundamental-data-1Q100.out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum11 = companyFileData1.getDowIndex();
        companyFileData1.setSector("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str14 = companyFileData1.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum15 = companyFileData1.getExchange();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dowEnum11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(exchEnum15);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1250");
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
        java.lang.String str20 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("out/BigDB/");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        java.lang.String str8 = incSheetFileData1.toDbOutput();
        java.lang.String str9 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
}

