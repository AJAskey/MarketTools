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
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory(10, (int) ' ', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0502");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray9 = fieldData2.getAcctPayableYr();
        double[] doubleArray10 = fieldData2.getLiabEquityYr();
        double double11 = fieldData2.getFloatshr();
        double[] doubleArray12 = fieldData2.getUnusualIncQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0504");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getPrefStockQtr();
        double[] doubleArray9 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getCurrAssetsYr();
        double double11 = fieldData2.getMktCap();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0506");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double[] doubleArray9 = fieldData2.getUnusualIncYr();
        double[] doubleArray10 = fieldData2.getLtInvestYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0507");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData0.getUnusualIncYr();
        java.lang.String str7 = incSheetFileData0.getName();
        double[] doubleArray8 = incSheetFileData0.getPreTaxIncYr();
        java.lang.String str9 = incSheetFileData0.toString();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0508");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsQ1();
        java.lang.String str20 = estimateFileData4.getName();
        double double21 = estimateFileData4.getEpsY2();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0509");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str2 = estimateFileData1.getSector();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        double double6 = fieldData2.getEpsQ0();
        java.lang.String str7 = fieldData2.getName();
        double[] doubleArray8 = fieldData2.getCurrLiabQtr();
        double[] doubleArray9 = fieldData2.getUnusualIncYr();
        double double10 = fieldData2.getPrice52lo();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0511");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setName("Cash File Data");
        companyFileData10.setNumEmployees("");
        companyFileData10.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData10.setTicker("");
        companyFileData10.setStreet("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double[] doubleArray26 = companyFileData10.getPriceQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(doubleArray26);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0512");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getBvpsYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0513");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("hi!");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getPrefStockYr();
        double[] doubleArray9 = fieldData2.getLtDebtQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0515");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double5 = estimateFileData4.getEpsQ0();
        java.lang.String str6 = estimateFileData4.toString();
        java.lang.String str7 = estimateFileData4.getSector();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0516");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        java.lang.String str9 = fieldData2.getState();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0517");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        double[] doubleArray3 = fieldData2.getCurrLiabQtr();
        double[] doubleArray4 = fieldData2.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ(1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ((int) (short) -1);
        int int9 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0519");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = companyFileData5.getExchange();
        companyFileData5.setCountry("NONE");
        companyFileData5.setSnpIndex("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0520");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        double double15 = estimateFileData12.getEpsY2();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = companyFileData21.getCity();
        java.lang.String str23 = companyFileData21.getPhone();
        java.lang.String str24 = companyFileData21.getWeb();
        java.lang.String str25 = companyFileData21.getSic();
        estimateFileData12.setNameFields(companyFileData21);
        net.ajaskey.common.DateTime dateTime27 = estimateFileData12.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int29 = sharesFileData28.getInsiderSells();
        sharesFileData28.setInstSellShrs("out/BigDB/");
        sharesFileData28.setInsiderOwnership("");
        double double34 = sharesFileData28.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray37 = incSheetFileData36.getEpsContQtr();
        double[] doubleArray38 = incSheetFileData36.getIncTaxYr();
        double[] doubleArray39 = incSheetFileData36.getGrossOpIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData40);
        double[] doubleArray42 = balSheetFileData41.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData28, incSheetFileData36, balSheetFileData41, cashFileData44, (int) (short) 10, (int) (short) 0);
        double[] doubleArray50 = incSheetFileData36.getPreTaxIncQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        fieldData2.setYear((int) (byte) 100);
        double double10 = fieldData2.getInsiderOwnership();
        double[] doubleArray11 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getLtInvestYr();
        java.lang.String str9 = fieldData2.getCountry();
        java.lang.String str10 = fieldData2.getZip();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0523");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray3 = incSheetFileData2.getIncAfterTaxYr();
        double[] doubleArray4 = incSheetFileData2.getEpsDilContYr();
        double[] doubleArray5 = incSheetFileData2.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData2.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0524");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double[] doubleArray8 = fieldData2.getAcctPayableYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = fieldData2.getCashData();
        double[] doubleArray10 = fieldData2.getCurrLiabYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0525");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        double[] doubleArray3 = fieldData2.getCurrLiabQtr();
        double[] doubleArray4 = fieldData2.getEpsDilYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        java.lang.String str6 = estimateFileData5.getSector();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0526");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        java.lang.String str9 = balSheetFileData6.toString();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData6);
        double[] doubleArray12 = balSheetFileData6.getAcctPayableYr();
        java.lang.String str13 = balSheetFileData6.getName();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0527");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getStInvestQtr();
        double[] doubleArray11 = balSheetFileData6.getEquityQtr();
        double[] doubleArray12 = balSheetFileData6.getAcctPayableYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setInstOwnership("hi!");
        sharesFileData0.setDollar3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0530");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("hi!", (int) '4', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0531");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray6 = fieldData2.getIncTaxQtr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray8 = fieldData2.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0532");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getNetIncYr();
        double[] doubleArray4 = incSheetFileData0.getRdYr();
        double[] doubleArray5 = incSheetFileData0.getCogsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0533");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContQtr();
        java.lang.String str5 = incSheetFileData0.getTicker();
        java.lang.String str6 = incSheetFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray8 = incSheetFileData7.getIncAfterTaxYr();
        double[] doubleArray9 = incSheetFileData7.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0534");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getInsiderOwnership();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getSnpIndexStr();
        sharesFileData0.setNameFields(companyFileData13);
        sharesFileData0.setInsiderSellShrs("hi!");
        sharesFileData0.setPrice("out/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0535");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        companyFileData8.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum19 = companyFileData8.getDowIndex();
        java.lang.String str20 = companyFileData8.getSic();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dowEnum19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0537");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestYr();
        double[] doubleArray9 = balSheetFileData6.getLtInvestYr();
        double[] doubleArray10 = balSheetFileData6.getOtherLtAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray12 = balSheetFileData6.getOtherLtLiabYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0538");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getTicker();
        java.lang.String str8 = estimateFileData4.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getAcctRxYr();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str18 = companyFileData17.getCity();
        java.lang.String str19 = companyFileData17.getPhone();
        java.lang.String str20 = companyFileData17.getWeb();
        companyFileData17.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData10.setNameFields(companyFileData17);
        companyFileData17.setState("");
        companyFileData17.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        estimateFileData4.setNameFields(companyFileData17);
        double double29 = estimateFileData4.getEpsQ0();
        double double30 = estimateFileData4.getEpsY1();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0539");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsQtr();
        java.lang.String str6 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0540");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double[] doubleArray10 = fieldData2.getNonrecurringItemsQtr();
        int int11 = fieldData2.getInstBuyShrs();
        double double12 = fieldData2.getEpsY2();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0541");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", 0, (int) (byte) 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0542");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setName("Cash File Data");
        java.lang.String str18 = companyFileData10.getSic();
        java.lang.String str19 = companyFileData10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0543");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList13);
        java.lang.String str16 = cashFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData15);
        double[] doubleArray18 = cashFileData17.getCashFromFinQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cash File Data" + "'", str16, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0544");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray9 = fieldData2.getAcctPayableYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0546");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = fieldData2.getEquityYr();
        double[] doubleArray11 = fieldData2.getLtInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum12 = fieldData2.getDowIndex();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(dowEnum12);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0547");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double double9 = fieldData2.getPrice52hi();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0548");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        long long7 = sharesFileData0.getVolume10d();
        java.lang.String str8 = sharesFileData0.getTicker();
        double double9 = sharesFileData0.getFloatshr();
        sharesFileData0.setInsiderOwnership("hi!");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0549");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = fieldData2.getCashData();
        long long5 = fieldData2.getVolumeMonth3m();
        double double6 = fieldData2.getBeta();
        int int7 = fieldData2.getInsiderSells();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cashFileData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0550");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData5.setStreet("");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = companyFileData5.getExchange();
        companyFileData5.setStreet("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0551");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0552");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getInventoryQtr();
        java.lang.String str5 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0553");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getTicker();
        java.lang.String str8 = estimateFileData4.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getAcctRxYr();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str18 = companyFileData17.getCity();
        java.lang.String str19 = companyFileData17.getPhone();
        java.lang.String str20 = companyFileData17.getWeb();
        companyFileData17.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData10.setNameFields(companyFileData17);
        companyFileData17.setState("");
        companyFileData17.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        estimateFileData4.setNameFields(companyFileData17);
        java.lang.String str29 = estimateFileData4.getSector();
        net.ajaskey.common.DateTime dateTime30 = estimateFileData4.getCurrFiscalYear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1." + "'", str29, "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertNull(dateTime30);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0554");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getEpsDilQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0555");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        java.lang.String str16 = companyFileData10.getIndustry();
        boolean boolean17 = companyFileData10.isAdr();
        companyFileData10.setAdr("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0556");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getTicker();
        java.lang.String str8 = estimateFileData4.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getAcctRxYr();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str18 = companyFileData17.getCity();
        java.lang.String str19 = companyFileData17.getPhone();
        java.lang.String str20 = companyFileData17.getWeb();
        companyFileData17.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData10.setNameFields(companyFileData17);
        companyFileData17.setState("");
        companyFileData17.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        estimateFileData4.setNameFields(companyFileData17);
        java.lang.String str29 = estimateFileData4.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum30 = estimateFileData4.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(exchEnum30);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0557");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ2();
        boolean boolean5 = fieldDataYear1.isInUse();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ2();
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertNull(fieldDataQuarter9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0558");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        sharesFileData7.setDollar3m("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0559");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0560");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getNetFixedAssetsYr();
        double double9 = fieldData2.getEpsQ1();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0561");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0562");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(0, (int) (short) 100);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0563");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = fieldData2.getEstimateData();
        java.lang.String str9 = estimateFileData8.getName();
        java.lang.String str10 = estimateFileData8.getSector();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInstOwnership();
        double[] doubleArray6 = fieldData2.getGrossOpIncQtr();
        double double7 = fieldData2.getInsiderOwnership();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0565");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray10 = balSheetFileData6.getAcctPayableYr();
        double[] doubleArray11 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray12 = balSheetFileData6.getLtInvestYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0566");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        double double11 = fieldData2.getBeta();
        double[] doubleArray12 = fieldData2.getCurrAssetsYr();
        double[] doubleArray13 = fieldData2.getLiabEquityYr();
        double double14 = fieldData2.getDollar3m();
        double[] doubleArray15 = fieldData2.getAcctPayableQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0567");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getCurrLiabQtr();
        double[] doubleArray8 = fieldData2.getTotalOpExpYr();
        double[] doubleArray9 = fieldData2.getCurrAssetsQtr();
        int int10 = fieldData2.getInsiderBuyShrs();
        java.lang.String str11 = fieldData2.getCountry();
        double[] doubleArray12 = fieldData2.getDividendYr();
        double[] doubleArray13 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0568");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0570");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = incSheetFileData0.getExchange();
        double[] doubleArray2 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray3 = incSheetFileData0.getDepreciationQtr();
        double[] doubleArray4 = incSheetFileData0.getSalesQtr();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0571");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        double double7 = estimateFileData4.getEpsY1();
        double double8 = estimateFileData4.getEpsY0();
        double double9 = estimateFileData4.getEpsY0();
        double double10 = estimateFileData4.getEpsY2();
        double double11 = estimateFileData4.getEpsY2();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray9 = fieldData2.getAcctPayableYr();
        double[] doubleArray10 = fieldData2.getLiabEquityYr();
        double double11 = fieldData2.getFloatshr();
        java.lang.String str12 = fieldData2.getTicker();
        int int13 = fieldData2.getNumEmployees();
        double[] doubleArray14 = fieldData2.getIncTaxYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0573");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getCogsQtr();
        double[] doubleArray6 = incSheetFileData0.getDividendQtr();
        double[] doubleArray7 = incSheetFileData0.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0574");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray9 = fieldData2.getStDebtQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0575");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray7 = fieldData2.getAcctRxYr();
        int int8 = fieldData2.getYear();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        double[] doubleArray10 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShares();
        double[] doubleArray12 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum13 = fieldData2.getSnpIndex();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(snpEnum13);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((-1));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0577");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGoodwillYr();
        int int10 = fieldData2.getInstShareholders();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0578");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        sharesFileData0.setDollar3m("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0579");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getBeta();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", 100, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray2 = cashFileData1.getCapExQtr();
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0582");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double5 = sharesFileData0.getPrice52lo();
        double double6 = sharesFileData0.getInsiderOwnership();
        double[] doubleArray7 = null;
        sharesFileData0.setSharesQ(doubleArray7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (-1));
        double[] doubleArray3 = fieldData2.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0584");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getStInvestYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0585");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList13);
        double[] doubleArray16 = cashFileData15.getCashFromOpsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0586");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        java.lang.String str10 = fieldData2.getState();
        double[] doubleArray11 = fieldData2.getLtDebtQtr();
        double[] doubleArray12 = fieldData2.getLiabEquityYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = fieldData2.getBalSheetData();
        double[] doubleArray14 = balSheetFileData13.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNotNull(balSheetFileData13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0587");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("NONE");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0588");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderNetTrades("out/BigDB/");
        java.lang.String str10 = sharesFileData0.getName();
        sharesFileData0.setFromReport((int) '4', 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setInstBuyShrs("");
        double[] doubleArray17 = sharesFileData14.getSharesYr();
        long long18 = sharesFileData14.getVolume10d();
        sharesFileData14.setBeta("");
        double double21 = sharesFileData14.getDollar3m();
        sharesFileData14.setInsiderNetTrades("out/BigDB/");
        double[] doubleArray24 = new double[] {};
        sharesFileData14.setSharesQ(doubleArray24);
        sharesFileData0.setSharesY(doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0589");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getEpsQtr();
        double double6 = fieldData2.getMktCap();
        int int7 = fieldData2.getInsiderNetTrades();
        double double8 = fieldData2.getEpsQ1();
        double[] doubleArray9 = fieldData2.getEquityYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0590");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        double double11 = fieldData2.getBeta();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0591");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0592");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.toString();
        double[] doubleArray3 = cashFileData1.getCapExQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0593");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        double[] doubleArray8 = fieldData2.getDividendQtr();
        double double9 = fieldData2.getInsiderNetPercentOutstanding();
        double double10 = fieldData2.getEpsY1();
        double[] doubleArray11 = fieldData2.getAcctPayableQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0594");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0595");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getRdQtr();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncQtr();
        double[] doubleArray5 = incSheetFileData0.getDividendYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0596");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getCurrLiabQtr();
        double[] doubleArray8 = fieldData2.getTotalOpExpYr();
        double[] doubleArray9 = fieldData2.getCurrAssetsQtr();
        int int10 = fieldData2.getInsiderBuyShrs();
        java.lang.String str11 = fieldData2.getCountry();
        double[] doubleArray12 = fieldData2.getStDebtYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0597");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getTotalAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0599");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        double[] doubleArray11 = fieldData2.getEpsDilContQtr();
        double double12 = fieldData2.getEpsY2();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray4 = incSheetFileData0.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData0.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0601");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toDbOutput();
        double double7 = estimateFileData4.getEpsY1();
        java.lang.String str8 = estimateFileData4.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0602");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray7 = fieldData2.getAdjToIncYr();
        double[] doubleArray8 = fieldData2.getCurrLiabYr();
        double[] doubleArray9 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0603");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double[] doubleArray10 = fieldData2.getNonrecurringItemsQtr();
        int int11 = fieldData2.getInstBuyShrs();
        double[] doubleArray12 = fieldData2.getUnusualIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0604");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "", "out/BigDB/" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = strList7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpYr();
        java.lang.String str6 = incSheetFileData0.toString();
        double[] doubleArray7 = incSheetFileData0.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray9 = incSheetFileData0.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray1);
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0606");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        java.lang.String str7 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        double[] doubleArray9 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0607");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (byte) 10, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(32, 100, fieldDataList4);
        int int6 = fieldDataQuarter5.getYear();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0608");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryQtr();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = companyFileData9.getCity();
        java.lang.String str11 = companyFileData9.getPhone();
        java.lang.String str12 = companyFileData9.getWeb();
        java.lang.String str13 = companyFileData9.getSic();
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setWeb("hi!");
        double[] doubleArray17 = companyFileData9.getPriceQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0609");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray6 = balSheetFileData5.getGoodwillQtr();
        java.lang.String str7 = balSheetFileData5.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0610");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setName("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        companyFileData10.setCountry("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        long long7 = sharesFileData0.getVolume10d();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setInsiderSells("Cash File Data");
        double double11 = sharesFileData0.getBeta();
        sharesFileData0.setInsiderSells("out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0612");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "out/BigDB/" };
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0613");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getState();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList21 = companyFileData13.set((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList22 = companyFileData5.set(strList21);
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum23 = companyFileData5.getSnpIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(snpEnum23);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0614");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data", (int) (short) 0, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0615");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum15 = sharesFileData14.getExchange();
        int int16 = sharesFileData14.getInsiderSells();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(sharesFileData14);
        org.junit.Assert.assertNull(exchEnum15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0616");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        fieldData2.setYear((-1));
        double[] doubleArray6 = fieldData2.getIntExpYr();
        double[] doubleArray7 = fieldData2.getRdYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0617");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getTicker();
        java.lang.String str8 = estimateFileData4.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getAcctRxYr();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str18 = companyFileData17.getCity();
        java.lang.String str19 = companyFileData17.getPhone();
        java.lang.String str20 = companyFileData17.getWeb();
        companyFileData17.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData10.setNameFields(companyFileData17);
        companyFileData17.setState("");
        companyFileData17.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        estimateFileData4.setNameFields(companyFileData17);
        java.lang.String str29 = companyFileData17.getSnpIndexStr();
        java.lang.String str30 = companyFileData17.getDowIndexStr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0618");
        java.lang.String[] strArray4 = new java.lang.String[] { "Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "NONE" };
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0619");
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "out/BigDB/", "Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/", "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0620");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtInvestYr();
        double[] doubleArray7 = fieldData2.getPreTaxIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0621");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getPrefStockQtr();
        java.lang.String str9 = fieldData2.toString();
        int int10 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0622");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = incSheetFileData0.getExchange();
        double[] doubleArray2 = incSheetFileData0.getNetIncYr();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0623");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        fieldData2.setYear((-1));
        double[] doubleArray6 = fieldData2.getIntExpYr();
        int int7 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0624");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getLtInvestYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0625");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray4 = balSheetFileData1.getCashYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0626");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        companyFileData8.setNumEmployees("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        java.lang.String str19 = companyFileData8.getTicker();
        companyFileData8.setAdr("out/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0627");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "NONE");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0628");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getTicker();
        java.lang.String str8 = fieldData2.getSic();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShares();
        double double10 = sharesFileData9.getPrice52lo();
        int int11 = sharesFileData9.getInsiderBuys();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0629");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray3 = incSheetFileData0.getCogsQtr();
        double[] doubleArray4 = incSheetFileData0.getSalesYr();
        double[] doubleArray5 = incSheetFileData0.getRdQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0630");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray4 = fieldData2.getTotalOpExpQtr();
        int int5 = fieldData2.getYear();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0631");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data", "out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0632");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        java.lang.String str8 = companyFileData7.toString();
        companyFileData7.setTicker("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        companyFileData7.setIndustry("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0633");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 10, (int) (byte) -1, "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q-1/out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE-fundamental-data-10Q-1.Cash File Data" + "'", str4, "out/BigDB/10/Q-1/out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE-fundamental-data-10Q-1.Cash File Data");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0634");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        long long9 = fieldData2.getVolumeMonth3m();
        int int10 = fieldData2.getInsiderNetTrades();
        fieldData2.setQuarter((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0635");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        double double5 = sharesFileData0.getBeta();
        sharesFileData0.setMktCap("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0636");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        java.lang.String str7 = estimateFileData4.getSector();
        java.lang.String str8 = estimateFileData4.toDbOutput();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0637");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        double[] doubleArray10 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray11 = fieldData2.getEpsDilContQtr();
        long long12 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0638");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getNetIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0639");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getLtInvestYr();
        int int9 = fieldData2.getQuarter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0640");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray8 = balSheetFileData1.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0641");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        java.lang.String str10 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShares();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(sharesFileData11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0642");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        java.lang.String str9 = balSheetFileData6.toString();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getLiabEquityYr();
        double[] doubleArray12 = balSheetFileData6.getEquityYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0643");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double double13 = fieldData2.getInstOwnership();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0645");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        companyFileData5.setState("hi!");
        companyFileData5.setNumEmployees("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str11 = companyFileData5.getPhone();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = companyFileData5.set((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList18);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0646");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        java.lang.String str18 = companyFileData8.getState();
        java.lang.String str19 = companyFileData8.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0647");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray7 = fieldData2.getAdjToIncYr();
        double[] doubleArray8 = fieldData2.getCurrLiabYr();
        double[] doubleArray9 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray10 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str5 = balSheetFileData1.getExchange();
        double[] doubleArray6 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray7 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0649");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray10 = balSheetFileData6.getLtInvestQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0650");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setPhone("out/BigDB/");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0651");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(sharesFileData8);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0652");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getCurrLiabYr();
        java.lang.String str8 = balSheetFileData6.getTicker();
        double[] doubleArray9 = balSheetFileData6.getStInvestYr();
        double[] doubleArray10 = balSheetFileData6.getTotalLiabQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0653");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getUnusualIncYr();
        double[] doubleArray8 = fieldData2.getBvpsYr();
        double[] doubleArray9 = fieldData2.getPrefStockQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0654");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getDividendYr();
        double[] doubleArray12 = fieldData2.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = fieldData2.getEstimateData();
        java.lang.String str14 = estimateFileData13.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0655");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        java.lang.String str9 = balSheetFileData6.toString();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData6);
        double[] doubleArray12 = balSheetFileData11.getCurrLiabYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0656");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        double double6 = fieldData2.getEpsQ0();
        double[] doubleArray7 = fieldData2.getAdjToIncYr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        boolean boolean9 = fieldData2.isAdr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0657");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getOtherCurrLiabQtr();
        double[] doubleArray8 = fieldData2.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0658");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) -1, (int) 'a');
        double[] doubleArray3 = fieldData2.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0659");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray4 = incSheetFileData0.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray6 = incSheetFileData0.getSalesYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0660");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.toString();
        java.lang.String str10 = companyFileData5.getIndustry();
        companyFileData5.setCountry("hi!");
        companyFileData5.setTicker("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0661");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        double[] doubleArray8 = fieldData2.getDividendQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = fieldData2.getCashData();
        java.lang.String str10 = fieldData2.getState();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsQtr();
        double[] doubleArray7 = incSheetFileData0.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0663");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getRdQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsDilQtr();
        double[] doubleArray3 = incSheetFileData0.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0664");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getNetIncYr();
        double[] doubleArray14 = fieldData2.getCogsQtr();
        double double15 = fieldData2.getEpsQ1();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0665");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        java.lang.String str5 = fieldData2.getZip();
        java.lang.String str6 = fieldData2.getPhone();
        double[] doubleArray7 = fieldData2.getDepreciationYr();
        int int8 = fieldData2.getYear();
        double[] doubleArray9 = fieldData2.getBvpsYr();
        double[] doubleArray10 = fieldData2.getSalesYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0666");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getUnusualIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0667");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0668");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData5.setExchange("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0669");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getCapExQtr();
        int int11 = fieldData2.getInsiderNetTrades();
        double[] doubleArray12 = fieldData2.getCogsYr();
        double[] doubleArray13 = fieldData2.getIncTaxYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpYr();
        java.lang.String str6 = incSheetFileData0.toDbOutput();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0672");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getCurrLiabQtr();
        double[] doubleArray8 = fieldData2.getCurrLiabYr();
        double[] doubleArray9 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray10 = fieldData2.getOtherIncYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0673");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double5 = sharesFileData0.getPrice52lo();
        int int6 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInstShareholders("NONE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0674");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getTicker();
        java.lang.String str8 = estimateFileData4.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getAcctRxYr();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str18 = companyFileData17.getCity();
        java.lang.String str19 = companyFileData17.getPhone();
        java.lang.String str20 = companyFileData17.getWeb();
        companyFileData17.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData10.setNameFields(companyFileData17);
        companyFileData17.setState("");
        companyFileData17.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        estimateFileData4.setNameFields(companyFileData17);
        companyFileData17.setPhone("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        int int31 = companyFileData17.getNumEmployees();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0675");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray3 = incSheetFileData0.getIntExpYr();
        double[] doubleArray4 = incSheetFileData0.getEpsContYr();
        double[] doubleArray5 = incSheetFileData0.getDividendYr();
        double[] doubleArray6 = incSheetFileData0.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData0.getEpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0676");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray10 = balSheetFileData6.getAcctRxQtr();
        java.lang.String str11 = balSheetFileData6.getExchange();
        java.lang.String str12 = balSheetFileData6.getIndustry();
        double[] doubleArray13 = balSheetFileData6.getCurrLiabQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0677");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getRdQtr();
        double[] doubleArray5 = incSheetFileData0.getNonrecurringItemsQtr();
        double[] doubleArray6 = incSheetFileData0.getDepreciationQtr();
        double[] doubleArray7 = incSheetFileData0.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0678");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double[] doubleArray8 = fieldData2.getAcctPayableYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = fieldData2.getCashData();
        double[] doubleArray10 = cashFileData9.getCashFromOpsQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0679");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        int int6 = sharesFileData0.getInsiderNetTrades();
        java.lang.String str7 = sharesFileData0.toString();
        java.lang.String str8 = sharesFileData0.getIndustry();
        sharesFileData0.setInsiderSellShrs("hi!");
        int int11 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0680");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getStDebtYr();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        double[] doubleArray7 = fieldData2.getSharesYr();
        double double8 = fieldData2.getEpsY1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0681");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        java.lang.String str5 = fieldData2.getSnpIndexStr();
        double[] doubleArray6 = fieldData2.getNetFixedAssetsQtr();
        double double7 = fieldData2.getPrice52hi();
        double[] doubleArray8 = fieldData2.getLiabEquityYr();
        double double9 = fieldData2.getEpsY1();
        int int10 = fieldData2.getYear();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0682");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(100, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0683");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        fieldData2.setYear((-1));
        double[] doubleArray6 = fieldData2.getGrossOpIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0684");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpYr();
        java.lang.String str6 = incSheetFileData0.toString();
        double[] doubleArray7 = incSheetFileData0.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray9 = incSheetFileData0.getCogsQtr();
        double[] doubleArray10 = incSheetFileData0.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData0.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0685");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        int int9 = sharesFileData0.getInstBuyShrs();
        sharesFileData0.setPrice("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0686");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncQtr();
        double[] doubleArray5 = incSheetFileData0.getSalesQtr();
        double[] doubleArray6 = incSheetFileData0.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0687");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getDividendYr();
        double[] doubleArray12 = fieldData2.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = fieldData2.getEstimateData();
        double double14 = estimateFileData13.getEpsY2();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getCapExQtr();
        int int9 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0689");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        boolean boolean6 = fieldData2.isAdr();
        double[] doubleArray7 = fieldData2.getIntExpYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0690");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getYear();
        double double4 = fieldData2.getBeta();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0691");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        double[] doubleArray10 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray11 = fieldData2.getEpsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getIncPrimaryEpsYr();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        java.lang.String str7 = fieldData2.getCity();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0693");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        boolean boolean6 = fieldData2.isAdr();
        double[] doubleArray7 = fieldData2.getCapExQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0695");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getSnpIndexStr();
        sharesFileData7.setNameFields(companyFileData13);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList25 = companyFileData13.set((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(companyFileData23);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(companyFileData26);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0696");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getCogsQtr();
        double[] doubleArray6 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData0.getCogsQtr();
        double[] doubleArray8 = incSheetFileData0.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0697");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getSalesQtr();
        double[] doubleArray6 = incSheetFileData0.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0699");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        double[] doubleArray9 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(35, (int) 'a');
        double[] doubleArray3 = fieldData2.getPrefStockQtr();
        double[] doubleArray4 = fieldData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0701");
        java.lang.String[] strArray1 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0702");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double double7 = fieldData2.getEpsQ0();
        int int8 = fieldData2.getInsiderBuys();
        double[] doubleArray9 = fieldData2.getOtherLtLiabYr();
        java.lang.String str10 = fieldData2.getCountry();
        double double11 = fieldData2.getEpsY0();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getNetIncYr();
        double[] doubleArray4 = incSheetFileData0.getNetIncYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpYr();
        double[] doubleArray6 = incSheetFileData0.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0704");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getDividendYr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0705");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        double[] doubleArray4 = sharesFileData0.getSharesQtr();
        double[] doubleArray11 = new double[] { (byte) 1, (byte) 1, 100, 0.0d, 0.0d, 10 };
        sharesFileData0.setSharesY(doubleArray11);
        int int13 = sharesFileData0.getInsiderSellShrs();
        int int14 = sharesFileData0.getInsiderBuyShrs();
        double double15 = sharesFileData0.getBeta();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0706");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray7 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0707");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0708");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str4 = incSheetFileData0.getIndustry();
        double[] doubleArray5 = incSheetFileData0.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData0.getIntExpYr();
        java.lang.String str7 = incSheetFileData0.getSector();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0709");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double5 = sharesFileData0.getPrice52lo();
        int int6 = sharesFileData0.getInstSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int8 = sharesFileData7.getInsiderSells();
        sharesFileData7.setInstSellShrs("out/BigDB/");
        sharesFileData7.setInsiderSells("hi!");
        double[] doubleArray13 = sharesFileData7.getSharesQtr();
        sharesFileData0.setSharesQ(doubleArray13);
        int int15 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0710");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double[] doubleArray4 = fieldData2.getAcctRxQtr();
        double[] doubleArray5 = fieldData2.getPricesQtr();
        int int6 = fieldData2.getNumEmployees();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0711");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getCogsQtr();
        double[] doubleArray6 = incSheetFileData0.getNetIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0712");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        java.lang.String str6 = sharesFileData0.toDbOutput();
        sharesFileData0.setBeta("Cash File Data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str6, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0714");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getRdQtr();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        java.lang.String str14 = companyFileData10.getSector();
        java.lang.String str15 = companyFileData10.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        incSheetFileData0.setNameFields(companyFileData10);
        java.lang.String str18 = companyFileData10.getPhone();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0715");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getCapExQtr();
        int int11 = fieldData2.getInsiderNetTrades();
        double[] doubleArray12 = fieldData2.getCogsYr();
        net.ajaskey.common.DateTime dateTime13 = fieldData2.getLatestQtrEps();
        double[] doubleArray14 = fieldData2.getBvpsYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(dateTime13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        double double9 = sharesFileData0.getBeta();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(35, (int) 'a');
        double[] doubleArray3 = fieldData2.getPrefStockQtr();
        double[] doubleArray4 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0718");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("data/BigDB/", 10, (int) (byte) 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0719");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData8.setStreet("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        incSheetFileData0.setNameFields(companyFileData8);
        java.lang.String str13 = companyFileData8.getSic();
        companyFileData8.setSic("data/BigDB/");
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getPricesQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0721");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getCashQtr();
        double[] doubleArray5 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0722");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData6.getLiabEquityYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0723");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getPrefStockYr();
        double[] doubleArray12 = balSheetFileData6.getCurrAssetsYr();
        double[] doubleArray13 = balSheetFileData6.getStDebtQtr();
        java.lang.String str14 = balSheetFileData6.getSector();
        double[] doubleArray15 = balSheetFileData6.getOtherCurrAssetsYr();
        java.lang.String str16 = balSheetFileData6.getTicker();
        double[] doubleArray17 = balSheetFileData6.getTotalLiabQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        java.lang.String str3 = sharesFileData0.getIndustry();
        sharesFileData0.setInsiderSells("");
        sharesFileData0.setInstShareholders("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int8 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0725");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray9 = fieldData2.getIncAfterTaxYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0726");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getCogsQtr();
        double[] doubleArray6 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray7 = incSheetFileData0.getSalesQtr();
        org.junit.Assert.assertNull(doubleArray1);
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
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        companyFileData5.setState("hi!");
        companyFileData5.setNumEmployees("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str11 = companyFileData5.getPhone();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = companyFileData5.set((java.util.List<java.lang.String>) strList14);
        java.lang.String str19 = companyFileData5.getSector();
        companyFileData5.setZip("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0728");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        int int9 = fieldData2.getQuarter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0729");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getAcctPayableQtr();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getSnpIndexStr();
        companyFileData10.setDowIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData10.setDowIndex("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData10);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0730");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        double[] doubleArray9 = fieldData2.getAcctRxQtr();
        double[] doubleArray10 = fieldData2.getCashYr();
        long long11 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0731");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        double[] doubleArray8 = incSheetFileData7.getEpsContYr();
        double[] doubleArray9 = incSheetFileData7.getGrossOpIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0732");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        java.lang.String str15 = estimateFileData12.getTicker();
        java.lang.String str16 = estimateFileData12.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setInstBuyShrs("");
        double[] doubleArray20 = sharesFileData17.getSharesYr();
        long long21 = sharesFileData17.getVolume10d();
        sharesFileData17.setBeta("");
        double double24 = sharesFileData17.getDollar3m();
        sharesFileData17.setInsiderNetTrades("out/BigDB/");
        int int27 = sharesFileData17.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum28 = sharesFileData17.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray30 = incSheetFileData29.getEpsContQtr();
        double[] doubleArray31 = incSheetFileData29.getIncTaxYr();
        double[] doubleArray32 = incSheetFileData29.getGrossOpIncYr();
        double[] doubleArray33 = incSheetFileData29.getTotalOpExpYr();
        double[] doubleArray34 = incSheetFileData29.getIntExpNonOpYr();
        java.lang.String str35 = incSheetFileData29.toString();
        double[] doubleArray36 = incSheetFileData29.getEpsDilQtr();
        double[] doubleArray37 = incSheetFileData29.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData38 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData38);
        double[] doubleArray40 = balSheetFileData39.getAcctRxYr();
        double[] doubleArray41 = balSheetFileData39.getBvpsYr();
        double[] doubleArray42 = balSheetFileData39.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCapExQtr();
        double[] doubleArray47 = cashFileData44.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData17, incSheetFileData29, balSheetFileData39, cashFileData44, 1, (int) (byte) 1);
        int int51 = fieldData50.getInstBuyShrs();
        double[] doubleArray52 = fieldData50.getUnusualIncYr();
        double[] doubleArray53 = fieldData50.getCurrAssetsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(exchEnum28);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0733");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        java.lang.String str7 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0734");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setInstOwnership("hi!");
        int int7 = sharesFileData0.getInsiderSells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0735");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb(0, 6, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0736");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double[] doubleArray8 = fieldData2.getAcctPayableYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double double10 = fieldData2.getBeta();
        double[] doubleArray11 = fieldData2.getPrefStockQtr();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0737");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getCapExQtr();
        int int11 = fieldData2.getInsiderNetTrades();
        double[] doubleArray12 = fieldData2.getCogsYr();
        double[] doubleArray13 = fieldData2.getCashFromInvQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        java.lang.String str7 = fieldData2.toString();
        int int8 = fieldData2.getInstSellShrs();
        double[] doubleArray9 = fieldData2.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0739");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        double double6 = fieldData2.getInstOwnership();
        double[] doubleArray7 = fieldData2.getStInvestQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double double7 = fieldData2.getEpsQ0();
        double double8 = fieldData2.getMktCap();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0741");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double double8 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0742");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        int int4 = fieldData2.getInstShareholders();
        double[] doubleArray5 = fieldData2.getRdQtr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0743");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = fieldData2.getEquityYr();
        net.ajaskey.common.DateTime dateTime11 = fieldData2.getCurrFiscalYear();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(dateTime11);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0744");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = incSheetFileData6.getIncTaxQtr();
        java.lang.String str8 = incSheetFileData6.getTicker();
        double[] doubleArray9 = incSheetFileData6.getIncTaxQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0745");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData0.getRdQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0746");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0747");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        double[] doubleArray3 = fieldData2.getCurrLiabQtr();
        double[] doubleArray4 = fieldData2.getEpsDilYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        companyFileData5.setPhone("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData5.setSnpIndex("hi!");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(companyFileData5);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0748");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = incSheetFileData6.getIncTaxQtr();
        java.lang.String str8 = incSheetFileData6.toString();
        double[] doubleArray9 = incSheetFileData6.getPreTaxIncYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        double[] doubleArray7 = fieldData2.getCashYr();
        double[] doubleArray8 = fieldData2.getOtherCurrLiabQtr();
        int int9 = fieldData2.getYear();
        double[] doubleArray10 = fieldData2.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData11 = fieldData2.getCashData();
        fieldData2.setYear((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(cashFileData11);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0750");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        int int6 = sharesFileData0.getInsiderNetTrades();
        java.lang.String str7 = sharesFileData0.toString();
        java.lang.String str8 = sharesFileData0.getIndustry();
        sharesFileData0.setInsiderSellShrs("hi!");
        sharesFileData0.setInsiderBuyShrs("Cash File Data");
        java.lang.String str13 = sharesFileData0.getSector();
        sharesFileData0.setInstSellShrs("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0751");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '4', 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((-1), (int) '4', fieldDataList4);
        int int6 = fieldDataQuarter5.getYear();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0752");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray8 = balSheetFileData6.getPrefStockQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0753");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getDividendYr();
        double[] doubleArray4 = incSheetFileData0.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0754");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0755");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        double double9 = estimateFileData8.getEpsY0();
        java.lang.String str10 = estimateFileData8.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        double[] doubleArray9 = fieldData2.getCashQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getIncTaxYr();
        fieldData2.setYear((int) '4');
        double[] doubleArray14 = fieldData2.getGoodwillYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0757");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray3 = incSheetFileData2.getIncAfterTaxYr();
        java.lang.String str4 = incSheetFileData2.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        sharesFileData0.setInsiderSellShrs("data/BigDB/");
        java.lang.String str6 = sharesFileData0.toString();
        sharesFileData0.setInstBuyShrs("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        double[] doubleArray11 = new double[] { 1L, 35 };
        sharesFileData0.setSharesQ(doubleArray11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 35.0]");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0759");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        java.lang.String str9 = balSheetFileData6.toString();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getLiabEquityYr();
        double[] doubleArray12 = balSheetFileData6.getLiabEquityQtr();
        double[] doubleArray13 = balSheetFileData6.getLtInvestQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0760");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getRdQtr();
        java.lang.String str9 = fieldData2.getDowIndexStr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        double[] doubleArray9 = fieldData2.getCashQtr();
        boolean boolean10 = fieldData2.isAdr();
        net.ajaskey.common.DateTime dateTime11 = fieldData2.getLatestQtrEps();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateTime11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0762");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        java.lang.String str5 = fieldData2.getSnpIndexStr();
        double[] doubleArray6 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray7 = fieldData2.getCashFromFinQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getEquityQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getCashFromInvQtr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        double double11 = fieldData2.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = fieldData2.getBalSheetData();
        double[] doubleArray13 = fieldData2.getCurrLiabQtr();
        double[] doubleArray14 = fieldData2.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(balSheetFileData12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        double double6 = fieldData2.getInstOwnership();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0766");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = fieldData2.getBalSheetData();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getTicker();
        java.lang.String str8 = fieldData2.getSic();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShares();
        double double10 = sharesFileData9.getPrice52lo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInsiderSells();
        sharesFileData11.setInstSellShrs("out/BigDB/");
        sharesFileData11.setInsiderNetPercentOutstanding("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setInstBuyShrs("");
        sharesFileData17.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double22 = sharesFileData17.getPrice52lo();
        int int23 = sharesFileData17.getInstSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int25 = sharesFileData24.getInsiderSells();
        sharesFileData24.setInstSellShrs("out/BigDB/");
        sharesFileData24.setInsiderSells("hi!");
        double[] doubleArray30 = sharesFileData24.getSharesQtr();
        sharesFileData17.setSharesQ(doubleArray30);
        sharesFileData11.setSharesQ(doubleArray30);
        sharesFileData9.setSharesQ(doubleArray30);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0768");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        java.lang.String str15 = balSheetFileData1.toString();
        double[] doubleArray16 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0769");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilYr();
        java.lang.String str7 = incSheetFileData0.getName();
        double[] doubleArray8 = incSheetFileData0.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        double[] doubleArray9 = fieldData2.getOtherIncQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0771");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray8 = balSheetFileData6.getNetFixedAssetsQtr();
        double[] doubleArray9 = balSheetFileData6.getTotalLiabYr();
        double[] doubleArray10 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray11 = balSheetFileData6.getOtherLtAssetsYr();
        double[] doubleArray12 = balSheetFileData6.getBvpsQtr();
        double[] doubleArray13 = balSheetFileData6.getTotalAssetsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0772");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        boolean boolean10 = fieldData2.isAdr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0773");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getGrossOpIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0774");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setName("hi!");
        companyFileData8.setState("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        java.lang.String str19 = companyFileData8.getDowIndexStr();
        companyFileData8.setPhone("Cash File Data");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0775");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        double[] doubleArray3 = fieldData2.getCurrLiabQtr();
        java.lang.String str4 = fieldData2.getCity();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0776");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0777");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double[] doubleArray4 = fieldData2.getAcctRxQtr();
        double double5 = fieldData2.getEpsQ0();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getOtherIncQtr();
        double double8 = fieldData2.getInsiderOwnership();
        double[] doubleArray9 = fieldData2.getAdjToIncQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpYr();
        java.lang.String str6 = incSheetFileData0.toString();
        double[] doubleArray7 = incSheetFileData0.getEpsDilQtr();
        java.lang.String str8 = incSheetFileData0.getTicker();
        double[] doubleArray9 = incSheetFileData0.getSalesYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0779");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray10 = balSheetFileData6.getTotalLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getPrefStockYr();
        java.lang.String str12 = balSheetFileData6.toString();
        java.lang.String str13 = balSheetFileData6.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = null;
        balSheetFileData6.setNameFields(companyFileData14);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0780");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        double double4 = sharesFileData0.getInstOwnership();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstOwnership("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int8 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0781");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        double double9 = estimateFileData8.getEpsY0();
        java.lang.String str10 = estimateFileData8.getSector();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0782");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        java.lang.String str16 = companyFileData10.getSic();
        java.lang.String str17 = companyFileData10.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        companyFileData8.setNumEmployees("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        java.lang.String str19 = companyFileData8.getWeb();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = companyFileData8.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0784");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray6 = incSheetFileData0.getRdYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0785");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getCurrLiabQtr();
        double[] doubleArray8 = fieldData2.getCurrLiabYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0786");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data", "hi!", "out/BigDB/", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0787");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsQ1();
        java.lang.String str20 = estimateFileData4.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        net.ajaskey.common.DateTime dateTime22 = estimateFileData21.getLatestQtrEps();
        net.ajaskey.common.DateTime dateTime23 = estimateFileData21.getCurrFiscalYear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dateTime22);
        org.junit.Assert.assertNull(dateTime23);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0788");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        java.lang.String str8 = fieldData2.getDowIndexStr();
        double[] doubleArray9 = fieldData2.getCogsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0789");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        long long5 = sharesFileData0.getVolumeMonth3m();
        java.lang.String str6 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0790");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray7 = fieldData2.getAcctRxYr();
        int int8 = fieldData2.getYear();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        double[] doubleArray10 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShares();
        double[] doubleArray12 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray13 = fieldData2.getPrefStockQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0791");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (byte) 10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0792");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray9 = incSheetFileData0.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray1);
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        java.lang.String str7 = fieldData2.toString();
        int int8 = fieldData2.getInstSellShrs();
        java.lang.String str9 = fieldData2.genOutput();
        double double10 = fieldData2.getMktCap();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0794");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData5.setStreet("");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = companyFileData5.getExchange();
        java.lang.String str11 = companyFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getDividendQtr();
        double[] doubleArray12 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0796");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrLiabYr();
        java.lang.String str6 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0797");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0798");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncAfterTaxYr();
        double[] doubleArray3 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData0.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0799");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getPrefStockYr();
        double[] doubleArray12 = balSheetFileData6.getCurrAssetsYr();
        double[] doubleArray13 = balSheetFileData6.getStDebtQtr();
        java.lang.String str14 = balSheetFileData6.getSector();
        double[] doubleArray15 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray16 = balSheetFileData6.getGoodwillYr();
        double[] doubleArray17 = balSheetFileData6.getAcctPayableYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0800");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getNetFixedAssetsYr();
        double[] doubleArray10 = balSheetFileData6.getOtherLtAssetsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0801");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0803");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 1, 6, "out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q6/out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-1Q6.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/" + "'", str4, "out/BigDB/1/Q6/out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-1Q6.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0804");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        java.lang.String str7 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        double[] doubleArray9 = fieldData2.getTotalOpExpYr();
        double[] doubleArray10 = fieldData2.getIncTaxQtr();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0805");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray5 = incSheetFileData0.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData0.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        int int9 = fieldData2.getYear();
        double[] doubleArray10 = fieldData2.getStInvestYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0807");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        double[] doubleArray3 = fieldData2.getGrossOpIncQtr();
        double[] doubleArray4 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0808");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0809");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str4 = incSheetFileData0.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0810");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        boolean boolean6 = companyFileData5.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum7 = companyFileData5.getSnpIndex();
        companyFileData5.setWeb("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str10 = companyFileData5.getState();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(snpEnum7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0811");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        java.lang.String str6 = fieldData2.genOutput();
        double[] doubleArray7 = fieldData2.getGoodwillYr();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0812");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray8 = balSheetFileData1.getLtInvestYr();
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0813");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncQtr();
        double[] doubleArray5 = incSheetFileData0.getSalesQtr();
        double[] doubleArray6 = incSheetFileData0.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0814");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0815");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderNetTrades("out/BigDB/");
        double[] doubleArray10 = new double[] {};
        sharesFileData0.setSharesQ(doubleArray10);
        java.lang.String str12 = sharesFileData0.toDbOutput();
        int int13 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str12, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0816");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getLtInvestYr();
        double[] doubleArray9 = fieldData2.getEquityYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        java.lang.String str8 = fieldData2.getSector();
        double[] doubleArray9 = fieldData2.getIncPrimaryEpsYr();
        int int10 = fieldData2.getInstShareholders();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0818");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        double[] doubleArray7 = fieldData2.getEquityYr();
        int int8 = fieldData2.getYear();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getIntExpNonOpYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0819");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        sharesFileData0.setMktCap("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setInsiderOwnership("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setInstBuyShrs("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0820");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '#', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0821");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double[] doubleArray10 = fieldData2.getIncPrimaryEpsYr();
        java.lang.String str11 = fieldData2.getSector();
        int int12 = fieldData2.getInstShareholders();
        double double13 = fieldData2.getPrice();
        fieldData2.setQuarter(10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0822");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str4 = incSheetFileData0.getIndustry();
        double[] doubleArray5 = incSheetFileData0.getDepreciationYr();
        double[] doubleArray6 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray7 = incSheetFileData0.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0823");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        java.lang.String str9 = balSheetFileData6.toString();
        double[] doubleArray10 = balSheetFileData6.getGoodwillYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0824");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setName("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData17);
        double[] doubleArray19 = balSheetFileData18.getAcctRxYr();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.lang.String str26 = companyFileData25.getCity();
        java.lang.String str27 = companyFileData25.getPhone();
        java.lang.String str28 = companyFileData25.getWeb();
        companyFileData25.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData18.setNameFields(companyFileData25);
        companyFileData25.setState("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData25);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData41 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.String> strList44 = companyFileData25.set((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.String> strList45 = companyFileData8.set(strList44);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList45);
        double double47 = estimateFileData46.getEpsY2();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(estimateFileData39);
        org.junit.Assert.assertNotNull(companyFileData40);
        org.junit.Assert.assertNotNull(incSheetFileData41);
        org.junit.Assert.assertNotNull(companyFileData42);
        org.junit.Assert.assertNotNull(cashFileData43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(estimateFileData46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0825");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 100, 0);
        double[] doubleArray3 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0826");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        int int9 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstOwnership("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        int int12 = sharesFileData0.getInsiderBuys();
        java.lang.String str13 = sharesFileData0.getSector();
        int int14 = sharesFileData0.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData15.setInstBuyShrs("");
        double[] doubleArray18 = sharesFileData15.getSharesYr();
        long long19 = sharesFileData15.getVolume10d();
        sharesFileData15.setBeta("");
        double double22 = sharesFileData15.getDollar3m();
        sharesFileData15.setInsiderNetTrades("out/BigDB/");
        java.lang.String str25 = sharesFileData15.getName();
        sharesFileData15.setFromReport((int) '4', 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData29.setInstBuyShrs("");
        double[] doubleArray32 = sharesFileData29.getSharesYr();
        long long33 = sharesFileData29.getVolume10d();
        sharesFileData29.setBeta("");
        double double36 = sharesFileData29.getDollar3m();
        sharesFileData29.setInsiderNetTrades("out/BigDB/");
        double[] doubleArray39 = new double[] {};
        sharesFileData29.setSharesQ(doubleArray39);
        sharesFileData15.setSharesY(doubleArray39);
        sharesFileData0.setSharesQ(doubleArray39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0827");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        java.lang.String str7 = fieldData2.getWeb();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0828");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getNetIncYr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContYr();
        java.lang.String str5 = incSheetFileData0.getSector();
        double[] doubleArray6 = incSheetFileData0.getRdQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0829");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray10 = balSheetFileData6.getAcctPayableYr();
        java.lang.String str11 = balSheetFileData6.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0830");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        fieldData2.setYear((-1));
        double[] doubleArray6 = fieldData2.getIntExpYr();
        double double7 = fieldData2.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = fieldData2.getCogsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double[] doubleArray9 = fieldData2.getUnusualIncYr();
        double[] doubleArray10 = fieldData2.getOtherLtLiabQtr();
        double double11 = fieldData2.getEpsY2();
        double[] doubleArray12 = fieldData2.getSharesQtr();
        double[] doubleArray13 = fieldData2.getOtherIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0832");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0833");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getRdQtr();
        double[] doubleArray2 = incSheetFileData0.getGrossOpIncYr();
        java.lang.String str3 = incSheetFileData0.toString();
        double[] doubleArray4 = incSheetFileData0.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0834");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getMktCap();
        int int7 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setPrice("");
        long long10 = sharesFileData0.getVolume10d();
        double double11 = sharesFileData0.getBeta();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0835");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0836");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray4 = incSheetFileData0.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData0.getRdYr();
        double[] doubleArray6 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData0.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double[] doubleArray4 = fieldData2.getCurrLiabQtr();
        double[] doubleArray5 = fieldData2.getPrefStockQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0838");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        sharesFileData0.setInsiderSellShrs("data/BigDB/");
        sharesFileData0.setInstOwnership("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str8 = sharesFileData0.getName();
        double double9 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0839");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getAdjToIncQtr();
        double[] doubleArray14 = fieldData2.getNetIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0840");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        sharesFileData0.setInstOwnership("Cash File Data");
        double[] doubleArray9 = sharesFileData0.getSharesQtr();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0841");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data", "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data", "NONE", "out/BigDB/1/Q6/out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-1Q6.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/" };
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "data/BigDB/", "out/BigDB/10/Q-1/out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE-fundamental-data-10Q-1.Cash File Data" };
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0842");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double double7 = fieldData2.getDollar3m();
        double[] doubleArray8 = fieldData2.getPrefStockYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0843");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(exchEnum2);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0844");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0845");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray10 = balSheetFileData6.getAcctRxQtr();
        double[] doubleArray11 = balSheetFileData6.getAcctRxYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0846");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = fieldData2.getBalSheetData();
        double[] doubleArray12 = balSheetFileData11.getBvpsYr();
        double[] doubleArray13 = balSheetFileData11.getLtInvestYr();
        java.lang.String str14 = balSheetFileData11.getSector();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0847");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        java.lang.String str10 = fieldData2.getState();
        double[] doubleArray11 = fieldData2.getLtDebtQtr();
        double[] doubleArray12 = fieldData2.getLiabEquityYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = fieldData2.getBalSheetData();
        java.lang.String str14 = fieldData2.getPhone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNotNull(balSheetFileData13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        java.lang.String str8 = fieldData2.getPhone();
        double[] doubleArray9 = fieldData2.getEquityQtr();
        double double10 = fieldData2.getInstOwnership();
        double[] doubleArray11 = fieldData2.getEpsDilYr();
        int int12 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0849");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        companyFileData5.setDowIndex("out/BigDB/");
        double[] doubleArray12 = companyFileData5.getPriceQtr();
        companyFileData5.setSector("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0851");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        companyFileData5.setState("hi!");
        companyFileData5.setNumEmployees("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str11 = companyFileData5.getPhone();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = companyFileData5.set((java.util.List<java.lang.String>) strList14);
        java.lang.String str19 = companyFileData5.getZip();
        companyFileData5.setZip("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str22 = companyFileData5.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0852");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getPrice52hi();
        java.lang.String str7 = sharesFileData0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0854");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getSnpIndexStr();
        sharesFileData7.setNameFields(companyFileData13);
        int int18 = companyFileData13.getNumEmployees();
        companyFileData13.setName("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0855");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsQ1();
        java.lang.String str20 = estimateFileData4.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0856");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContQtr();
        java.lang.String str5 = incSheetFileData0.getTicker();
        java.lang.String str6 = incSheetFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray8 = incSheetFileData7.getIncAfterTaxYr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0857");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        companyFileData12.setStreet("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        java.lang.String str15 = companyFileData12.getZip();
        incSheetFileData0.setNameFields(companyFileData12);
        java.lang.String str17 = incSheetFileData0.getSector();
        double[] doubleArray18 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray19 = incSheetFileData0.getOtherIncYr();
        double[] doubleArray20 = incSheetFileData0.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0858");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsQ1();
        java.lang.String str20 = estimateFileData4.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        double double22 = estimateFileData4.getEpsY0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0859");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        double[] doubleArray15 = balSheetFileData1.getInventoryQtr();
        java.lang.String str16 = balSheetFileData1.toString();
        double[] doubleArray17 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray18 = balSheetFileData1.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0860");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getState();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList21 = companyFileData13.set((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList22 = companyFileData5.set(strList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList21);
        double[] doubleArray24 = cashFileData23.getCapExQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(cashFileData23);
        org.junit.Assert.assertNull(doubleArray24);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0861");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.toString();
        java.lang.String str3 = cashFileData1.toDbOutput();
        java.lang.String str4 = cashFileData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cash File Data" + "'", str4, "Cash File Data");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0862");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        fieldData2.setYear((-1));
        double[] doubleArray6 = fieldData2.getIntExpYr();
        double[] doubleArray7 = fieldData2.getSalesYr();
        double[] doubleArray8 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0863");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getSnpIndexStr();
        sharesFileData7.setNameFields(companyFileData13);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList25 = companyFileData13.set((java.util.List<java.lang.String>) strList20);
        companyFileData13.setCountry("data/BigDB/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(companyFileData23);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0864");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getAcctRxYr();
        java.lang.String str8 = balSheetFileData6.getTicker();
        java.lang.String str9 = balSheetFileData6.getExchange();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0865");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, 32, filetypeEnum2);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0866");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double9 = estimateFileData8.getEpsY0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0867");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0868");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        double double6 = estimateFileData4.getEpsY0();
        double double7 = estimateFileData4.getEpsQ0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0869");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double double7 = fieldData2.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = fieldData2.getCapExQtr();
        java.lang.String str9 = fieldData2.getName();
        double[] doubleArray10 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0870");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getStInvestQtr();
        double[] doubleArray11 = balSheetFileData6.getLtDebtQtr();
        double[] doubleArray12 = balSheetFileData6.getOtherCurrLiabQtr();
        double[] doubleArray13 = balSheetFileData6.getOtherLtAssetsYr();
        double[] doubleArray14 = balSheetFileData6.getInventoryYr();
        double[] doubleArray15 = balSheetFileData6.getGoodwillYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0871");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList13);
        java.lang.String str16 = cashFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData15);
        java.lang.String str18 = cashFileData15.toDbOutput();
        double[] doubleArray19 = cashFileData15.getCashFromInvQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cash File Data" + "'", str16, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0872");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(sharesFileData10);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0873");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str4 = balSheetFileData1.getTicker();
        double[] doubleArray5 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str6 = balSheetFileData1.getName();
        java.lang.String str7 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0874");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getMktCap();
        int int7 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInsiderSells("data/BigDB/");
        sharesFileData0.setInsiderSellShrs("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0875");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getCogsQtr();
        double[] doubleArray6 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData0.getCogsQtr();
        double[] doubleArray8 = incSheetFileData0.getRdQtr();
        double[] doubleArray9 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray10 = incSheetFileData0.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray1);
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray5 = incSheetFileData4.getUnusualIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0877");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/", (-1), (int) (byte) -1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0878");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        java.lang.String str3 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncAfterTaxQtr();
        double[] doubleArray5 = incSheetFileData0.getIncTaxQtr();
        double[] doubleArray6 = incSheetFileData0.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0880");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        java.lang.String str10 = companyFileData5.getSector();
        int int11 = companyFileData5.getNumEmployees();
        companyFileData5.setStreet("Cash File Data");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0881");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getAcctRxYr();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str18 = companyFileData17.getCity();
        java.lang.String str19 = companyFileData17.getPhone();
        java.lang.String str20 = companyFileData17.getWeb();
        companyFileData17.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData10.setNameFields(companyFileData17);
        companyFileData17.setState("");
        companyFileData17.setNumEmployees("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        java.lang.String str28 = companyFileData17.getWeb();
        balSheetFileData6.setNameFields(companyFileData17);
        int int30 = companyFileData17.getNumEmployees();
        java.lang.String str31 = companyFileData17.getSector();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1." + "'", str31, "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0882");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = incSheetFileData6.getIncTaxQtr();
        double[] doubleArray8 = incSheetFileData6.getDepreciationQtr();
        double[] doubleArray9 = incSheetFileData6.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0883");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getPreTaxIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilContQtr();
        double[] doubleArray7 = incSheetFileData0.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0884");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        java.lang.String str8 = fieldData2.getZip();
        double[] doubleArray9 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray10 = fieldData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0886");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setWeb("");
        java.lang.String str11 = companyFileData5.getZip();
        companyFileData5.setSic("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData14);
        double[] doubleArray16 = balSheetFileData15.getAcctRxYr();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        java.lang.String str23 = companyFileData22.getCity();
        java.lang.String str24 = companyFileData22.getPhone();
        java.lang.String str25 = companyFileData22.getWeb();
        companyFileData22.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData15.setNameFields(companyFileData22);
        companyFileData22.setState("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData22);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData37 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList34);
        java.util.List<java.lang.String> strList41 = companyFileData22.set((java.util.List<java.lang.String>) strList34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList44 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList41, (int) 'a', 6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList41);
        java.util.List<java.lang.String> strList46 = companyFileData5.set(strList41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData47 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList41);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(estimateFileData21);
        org.junit.Assert.assertNotNull(companyFileData22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(estimateFileData36);
        org.junit.Assert.assertNotNull(companyFileData37);
        org.junit.Assert.assertNotNull(incSheetFileData38);
        org.junit.Assert.assertNotNull(companyFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(fieldDataList44);
        org.junit.Assert.assertNotNull(cashFileData45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(balSheetFileData47);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0887");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        double double11 = fieldData2.getBeta();
        double[] doubleArray12 = fieldData2.getCurrAssetsYr();
        double[] doubleArray13 = fieldData2.getUnusualIncQtr();
        double[] doubleArray14 = fieldData2.getLiabEquityQtr();
        double[] doubleArray15 = fieldData2.getGrossOpIncQtr();
        double double16 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0888");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGrossIncQtr();
        java.lang.String str10 = fieldData2.getIndustry();
        double double11 = fieldData2.getMktCap();
        java.lang.String str12 = fieldData2.getSic();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0889");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        long long7 = sharesFileData0.getVolume10d();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setInsiderSells("Cash File Data");
        java.lang.String str11 = sharesFileData0.getName();
        long long12 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0890");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setName("Cash File Data");
        companyFileData10.setNumEmployees("");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum20 = companyFileData10.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(exchEnum20);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        double[] doubleArray10 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray11 = fieldData2.getInventoryYr();
        double[] doubleArray12 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0892");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        long long7 = sharesFileData0.getVolume10d();
        sharesFileData0.setInstSellShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double10 = sharesFileData0.getBeta();
        double[] doubleArray11 = sharesFileData0.getSharesQtr();
        sharesFileData0.setFloatshr("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0894");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getDepreciationYr();
        double[] doubleArray8 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray9 = fieldData2.getUnusualIncQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0895");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0896");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getBeta();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0897");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getRdQtr();
        double[] doubleArray2 = incSheetFileData0.getGrossOpIncYr();
        java.lang.String str3 = incSheetFileData0.getTicker();
        double[] doubleArray4 = incSheetFileData0.getOtherIncQtr();
        double[] doubleArray5 = incSheetFileData0.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0898");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setCountry("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData10.setPhone("data/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0899");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        double double7 = sharesFileData0.getPrice();
        int int8 = sharesFileData0.getInsiderSells();
        sharesFileData0.setFloatshr("out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0900");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData5.setAdr("data/BigDB/");
        companyFileData5.setDowIndex("NONE");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum12 = companyFileData5.getSnpIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(snpEnum12);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0901");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 100, 0);
        double[] doubleArray3 = fieldData2.getCapExQtr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0902");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray3 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getEpsDilContYr();
        double[] doubleArray6 = incSheetFileData0.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0903");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        int int10 = fieldData2.getYear();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0904");
        java.lang.String[] strArray5 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/", "hi!", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1." };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray5, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        double double7 = sharesFileData0.getPrice52lo();
        int int8 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0906");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = fieldData2.getEquityYr();
        double[] doubleArray11 = fieldData2.getLtInvestYr();
        double[] doubleArray12 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray13 = fieldData2.getStDebtQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0907");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getDividendQtr();
        double[] doubleArray12 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0909");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getLtInvestQtr();
        double[] doubleArray5 = fieldData2.getAcctRxQtr();
        fieldData2.setYear((int) (byte) 100);
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        double[] doubleArray9 = fieldData2.getLtInvestQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0910");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        double double8 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0911");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        java.lang.String str5 = fieldData2.getZip();
        double[] doubleArray6 = fieldData2.getEpsContYr();
        double[] doubleArray7 = fieldData2.getLtDebtYr();
        double[] doubleArray8 = fieldData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0912");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        double[] doubleArray17 = incSheetFileData16.getNetIncYr();
        double[] doubleArray18 = incSheetFileData16.getIntExpQtr();
        double[] doubleArray19 = incSheetFileData16.getEpsDilContYr();
        java.lang.String str20 = incSheetFileData16.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0913");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList27 = companyFileData8.set((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList27);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(companyFileData23);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(sharesFileData28);
        org.junit.Assert.assertNotNull(companyFileData29);
        org.junit.Assert.assertNotNull(incSheetFileData30);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0914");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        java.lang.String str17 = companyFileData8.getState();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList27 = companyFileData8.set((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList27);
        java.lang.String str29 = cashFileData28.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(companyFileData23);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(cashFileData28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0915");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        double double6 = fieldData2.getEpsQ0();
        java.lang.String str7 = fieldData2.getName();
        double double8 = fieldData2.getPrice();
        double[] doubleArray9 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0916");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.common.DateTime dateTime9 = estimateFileData7.getCurrFiscalYear();
        double double10 = estimateFileData7.getEpsY2();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNull(dateTime9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0917");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getEpsQtr();
        java.lang.String str6 = fieldData2.getPhone();
        java.lang.String str7 = fieldData2.getTicker();
        double double8 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0918");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toString();
        double[] doubleArray2 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray3 = cashFileData0.getCapExQtr();
        double[] doubleArray4 = cashFileData0.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cash File Data" + "'", str1, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0919");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getNetIncYr();
        double[] doubleArray14 = fieldData2.getCogsQtr();
        double[] doubleArray15 = fieldData2.getAcctRxQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0920");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        fieldData2.setYear((-1));
        double[] doubleArray6 = fieldData2.getIntExpYr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0921");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (byte) 10, (int) ' ', filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        double[] doubleArray9 = fieldData2.getUnusualIncQtr();
        double[] doubleArray10 = fieldData2.getGoodwillYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0923");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double double7 = fieldData2.getDollar3m();
        java.lang.String str8 = fieldData2.genOutput();
        java.lang.String str9 = fieldData2.getPhone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0924");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double[] doubleArray10 = fieldData2.getNonrecurringItemsQtr();
        double double11 = fieldData2.getPrice52lo();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0925");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getDowIndexStr();
        double[] doubleArray5 = fieldData2.getDividendQtr();
        double[] doubleArray6 = fieldData2.getAcctPayableQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0926");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsY0();
        java.lang.String str20 = estimateFileData4.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum21 = estimateFileData4.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum22 = estimateFileData4.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(exchEnum21);
        org.junit.Assert.assertNull(exchEnum22);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0927");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = fieldData2.getEstimateData();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNotNull(estimateFileData9);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        double[] doubleArray8 = fieldData2.getSharesQtr();
        double double9 = fieldData2.getEpsY0();
        double[] doubleArray10 = fieldData2.getAdjToIncQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0929");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getSnpIndexStr();
        sharesFileData7.setNameFields(companyFileData13);
        int int18 = companyFileData13.getNumEmployees();
        companyFileData13.setZip("out/BigDB/1/Q6/out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-1Q6.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0930");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        double[] doubleArray4 = sharesFileData0.getSharesYr();
        double double5 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0931");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGrossIncQtr();
        java.lang.String str10 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum11 = fieldData2.getSnpIndex();
        double[] doubleArray12 = fieldData2.getDividendQtr();
        java.lang.String str13 = fieldData2.getName();
        double double14 = fieldData2.getPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(snpEnum11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0932");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        double[] doubleArray15 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray16 = balSheetFileData1.getEquityQtr();
        double[] doubleArray17 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0933");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double9 = estimateFileData8.getEpsQ0();
        net.ajaskey.common.DateTime dateTime10 = estimateFileData8.getLatestQtrEps();
        java.lang.String str11 = estimateFileData8.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(dateTime10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getCurrLiabYr();
        java.lang.String str8 = balSheetFileData6.getTicker();
        double[] doubleArray9 = balSheetFileData6.getStInvestYr();
        double[] doubleArray10 = balSheetFileData6.getOtherCurrAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getBvpsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0935");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData6.getAcctRxQtr();
        double[] doubleArray10 = balSheetFileData6.getEquityQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0936");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        double[] doubleArray8 = fieldData2.getSharesQtr();
        double double9 = fieldData2.getEpsY0();
        double double10 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0937");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        int int11 = fieldData2.getYear();
        java.lang.String str12 = fieldData2.getWeb();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0938");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        double[] doubleArray8 = fieldData2.getPreTaxIncYr();
        double[] doubleArray9 = fieldData2.getIntExpNonOpYr();
        double[] doubleArray10 = fieldData2.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0939");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray4 = incSheetFileData0.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getCapExQtr();
        int int11 = fieldData2.getInsiderNetTrades();
        double[] doubleArray12 = fieldData2.getCogsYr();
        net.ajaskey.common.DateTime dateTime13 = fieldData2.getLatestQtrEps();
        double[] doubleArray14 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(dateTime13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0941");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        companyFileData5.setState("hi!");
        companyFileData5.setNumEmployees("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        companyFileData5.setState("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        java.lang.String str13 = companyFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0942");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(35, 0, filetypeEnum2);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        sharesFileData0.setFloatshr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double9 = sharesFileData0.getPrice52hi();
        sharesFileData0.setVolume3m("out/BigDB/");
        sharesFileData0.setVolume10d("data/BigDB/");
        int int14 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0944");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGrossIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = fieldData2.getExchange();
        double[] doubleArray11 = fieldData2.getSalesQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray7 = balSheetFileData1.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0946");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        java.lang.String str6 = fieldData2.genOutput();
        double[] doubleArray7 = fieldData2.getGoodwillYr();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        java.lang.String str9 = fieldData2.getIndustry();
        java.lang.String str10 = fieldData2.getSnpIndexStr();
        double[] doubleArray11 = fieldData2.getCashFromInvQtr();
        double double12 = fieldData2.getMktCap();
        int int13 = fieldData2.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum14 = fieldData2.getDowIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(dowEnum14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/1/Q6/out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-1Q6.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0948");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 100, (int) ' ', fieldDataList11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = companyFileData18.getState();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList26 = companyFileData18.set((java.util.List<java.lang.String>) strList22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList26, (int) (short) -1, (int) (byte) 0);
        fieldDataQuarter12.fieldDataList = fieldDataList29;
        int int31 = fieldDataQuarter12.getQuarter();
        int int32 = fieldDataQuarter12.getQuarter();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(10, (int) (byte) 10);
        fieldDataQuarter12.fieldDataList = fieldDataList35;
        int int37 = fieldDataQuarter12.getYear();
        int int38 = fieldDataQuarter12.getQuarter();
        int int39 = fieldDataQuarter12.getYear();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = fieldDataQuarter12.fieldDataList;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(fieldDataList40);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        double[] doubleArray8 = fieldData2.getDividendQtr();
        double[] doubleArray9 = fieldData2.getEpsContYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0950");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getCurrLiabQtr();
        double[] doubleArray8 = fieldData2.getCurrLiabYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        double[] doubleArray10 = fieldData2.getIncAfterTaxYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0951");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        java.lang.String str5 = fieldData2.getZip();
        java.lang.String str6 = fieldData2.getIndustry();
        double[] doubleArray7 = fieldData2.getAcctRxQtr();
        double double8 = fieldData2.getPrice52lo();
        double[] doubleArray9 = fieldData2.getAdjToIncQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0952");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray8 = balSheetFileData6.getNetFixedAssetsQtr();
        double[] doubleArray9 = balSheetFileData6.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0953");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getStInvestYr();
        java.lang.String str8 = fieldData2.toString();
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        double[] doubleArray10 = fieldData2.getIncTaxYr();
        double[] doubleArray11 = fieldData2.getLtDebtQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0954");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        long long2 = sharesFileData0.getVolume10d();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0955");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData0.getOtherIncYr();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str17 = companyFileData16.getCity();
        java.lang.String str18 = companyFileData16.getPhone();
        java.lang.String str19 = companyFileData16.getWeb();
        estimateFileData10.setNameFields(companyFileData16);
        java.lang.String str21 = companyFileData16.getName();
        companyFileData16.setName("Cash File Data");
        companyFileData16.setNumEmployees("");
        companyFileData16.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        incSheetFileData0.setNameFields(companyFileData16);
        double[] doubleArray29 = incSheetFileData0.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(doubleArray29);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0956");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getTicker();
        java.lang.String str8 = fieldData2.getSic();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShares();
        double double10 = sharesFileData9.getPrice52lo();
        double double11 = sharesFileData9.getDollar3m();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0957");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        java.lang.String str7 = balSheetFileData1.getName();
        double[] doubleArray8 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray9 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray10 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0958");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str4 = incSheetFileData0.getIndustry();
        double[] doubleArray5 = incSheetFileData0.getRdYr();
        double[] doubleArray6 = incSheetFileData0.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0959");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        double[] doubleArray4 = sharesFileData0.getSharesQtr();
        double[] doubleArray11 = new double[] { (byte) 1, (byte) 1, 100, 0.0d, 0.0d, 10 };
        sharesFileData0.setSharesY(doubleArray11);
        double double13 = sharesFileData0.getPrice52lo();
        int int14 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0960");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        companyFileData5.setState("hi!");
        companyFileData5.setNumEmployees("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str11 = companyFileData5.getPhone();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = companyFileData5.set((java.util.List<java.lang.String>) strList14);
        java.lang.String str19 = companyFileData5.getZip();
        java.lang.String str20 = companyFileData5.getWeb();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0961");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray5 = incSheetFileData0.getEpsContYr();
        double[] doubleArray6 = incSheetFileData0.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0962");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray8 = balSheetFileData6.getNetFixedAssetsQtr();
        java.lang.String str9 = balSheetFileData6.getSector();
        double[] doubleArray10 = balSheetFileData6.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getTotalAssetsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0963");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray3 = incSheetFileData0.getIntExpYr();
        double[] doubleArray4 = incSheetFileData0.getEpsContYr();
        double[] doubleArray5 = incSheetFileData0.getDividendYr();
        double[] doubleArray6 = incSheetFileData0.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData0.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0965");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        org.junit.Assert.assertNotNull(estimateFileData3);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0966");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray3 = incSheetFileData0.getIntExpYr();
        double[] doubleArray4 = incSheetFileData0.getEpsContYr();
        java.lang.String str5 = incSheetFileData0.getTicker();
        double[] doubleArray6 = incSheetFileData0.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0967");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = incSheetFileData6.getIncTaxQtr();
        double[] doubleArray8 = incSheetFileData6.getDepreciationQtr();
        java.lang.String str9 = incSheetFileData6.getName();
        double[] doubleArray10 = incSheetFileData6.getDividendYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0968");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setName("hi!");
        companyFileData8.setState("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        companyFileData8.setCountry("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0969");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        java.lang.String str15 = estimateFileData12.getTicker();
        java.lang.String str16 = estimateFileData12.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setInstBuyShrs("");
        double[] doubleArray20 = sharesFileData17.getSharesYr();
        long long21 = sharesFileData17.getVolume10d();
        sharesFileData17.setBeta("");
        double double24 = sharesFileData17.getDollar3m();
        sharesFileData17.setInsiderNetTrades("out/BigDB/");
        int int27 = sharesFileData17.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum28 = sharesFileData17.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray30 = incSheetFileData29.getEpsContQtr();
        double[] doubleArray31 = incSheetFileData29.getIncTaxYr();
        double[] doubleArray32 = incSheetFileData29.getGrossOpIncYr();
        double[] doubleArray33 = incSheetFileData29.getTotalOpExpYr();
        double[] doubleArray34 = incSheetFileData29.getIntExpNonOpYr();
        java.lang.String str35 = incSheetFileData29.toString();
        double[] doubleArray36 = incSheetFileData29.getEpsDilQtr();
        double[] doubleArray37 = incSheetFileData29.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData38 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData38);
        double[] doubleArray40 = balSheetFileData39.getAcctRxYr();
        double[] doubleArray41 = balSheetFileData39.getBvpsYr();
        double[] doubleArray42 = balSheetFileData39.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCapExQtr();
        double[] doubleArray47 = cashFileData44.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData17, incSheetFileData29, balSheetFileData39, cashFileData44, 1, (int) (byte) 1);
        double[] doubleArray51 = fieldData50.getNetIncQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(exchEnum28);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0970");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        double[] doubleArray11 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray12 = fieldData2.getAdjToIncQtr();
        double[] doubleArray13 = fieldData2.getStDebtYr();
        double[] doubleArray14 = fieldData2.getLtDebtQtr();
        double[] doubleArray15 = fieldData2.getPricesQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0971");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setFloatshr("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0972");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getLtInvestQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getLtInvestYr();
        java.lang.String str9 = fieldData2.getCountry();
        double[] doubleArray10 = fieldData2.getLiabEquityYr();
        double[] doubleArray11 = fieldData2.getStDebtQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0974");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 100, (int) ' ', fieldDataList11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = companyFileData18.getState();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList26 = companyFileData18.set((java.util.List<java.lang.String>) strList22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList26, (int) (short) -1, (int) (byte) 0);
        fieldDataQuarter12.fieldDataList = fieldDataList29;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        java.lang.String str37 = companyFileData36.getState();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList44 = companyFileData36.set((java.util.List<java.lang.String>) strList40);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList47 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList44, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList50 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList44, 0, (int) '#');
        fieldDataQuarter12.fieldDataList = fieldDataList50;
        int int52 = fieldDataQuarter12.getYear();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList53 = fieldDataQuarter12.fieldDataList;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(estimateFileData35);
        org.junit.Assert.assertNotNull(companyFileData36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(estimateFileData42);
        org.junit.Assert.assertNotNull(companyFileData43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(fieldDataList47);
        org.junit.Assert.assertNotNull(fieldDataList50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(fieldDataList53);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0975");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray7 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray8 = fieldData2.getIncTaxQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray10 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray11 = fieldData2.getCashFromFinQtr();
        org.junit.Assert.assertNull(str3);
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0976");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 100, (int) ' ', fieldDataList11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = companyFileData18.getState();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList26 = companyFileData18.set((java.util.List<java.lang.String>) strList22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList26, (int) (short) -1, (int) (byte) 0);
        fieldDataQuarter12.fieldDataList = fieldDataList29;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        java.lang.String str37 = companyFileData36.getState();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList44 = companyFileData36.set((java.util.List<java.lang.String>) strList40);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList47 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList44, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList50 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList44, 0, (int) '#');
        fieldDataQuarter12.fieldDataList = fieldDataList50;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData56 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData57 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList54);
        java.lang.String str58 = companyFileData57.getState();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData63 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData64 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList65 = companyFileData57.set((java.util.List<java.lang.String>) strList61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList65, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList71 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList65, 0, (int) '#');
        fieldDataQuarter12.fieldDataList = fieldDataList71;
        int int73 = fieldDataQuarter12.getYear();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(estimateFileData35);
        org.junit.Assert.assertNotNull(companyFileData36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(estimateFileData42);
        org.junit.Assert.assertNotNull(companyFileData43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(fieldDataList47);
        org.junit.Assert.assertNotNull(fieldDataList50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(estimateFileData56);
        org.junit.Assert.assertNotNull(companyFileData57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(estimateFileData63);
        org.junit.Assert.assertNotNull(companyFileData64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(fieldDataList68);
        org.junit.Assert.assertNotNull(fieldDataList71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0977");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum16 = companyFileData10.getSnpIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(snpEnum16);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0978");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 0, (int) '4', "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q52/out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data-fundamental-data-0Q52.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data" + "'", str4, "out/BigDB/0/Q52/out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data-fundamental-data-0Q52.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getSalesQtr();
        double double9 = fieldData2.getBeta();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0980");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        java.lang.String str5 = incSheetFileData0.getSector();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0981");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = fieldData2.getShares();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = sharesFileData12.getExchange();
        int int14 = sharesFileData12.getInsiderSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0982");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        long long9 = fieldData2.getVolumeMonth3m();
        int int10 = fieldData2.getInsiderNetTrades();
        double[] doubleArray11 = fieldData2.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0983");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        int int6 = sharesFileData0.getInsiderNetTrades();
        sharesFileData0.setInstBuyShrs("");
        int int9 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0985");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = estimateFileData15.getSector();
        java.lang.String str17 = estimateFileData15.toDbOutput();
        double double18 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setInstBuyShrs("");
        double[] doubleArray22 = sharesFileData19.getSharesYr();
        long long23 = sharesFileData19.getVolume10d();
        sharesFileData19.setBeta("");
        double double26 = sharesFileData19.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray28 = incSheetFileData27.getIncPrimaryEpsQtr();
        double[] doubleArray29 = incSheetFileData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getEquityYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillQtr();
        double[] doubleArray34 = balSheetFileData31.getOtherCurrAssetsYr();
        double[] doubleArray35 = balSheetFileData31.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData36);
        java.lang.String str38 = cashFileData37.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData15, sharesFileData19, incSheetFileData27, balSheetFileData31, cashFileData37, 0, 32);
        double double42 = estimateFileData15.getEpsQ0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cash File Data" + "'", str38, "Cash File Data");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0986");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double double6 = fieldData2.getEpsQ1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0987");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getBvpsYr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        java.lang.String str9 = fieldData2.getWeb();
        double double10 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0988");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getPreTaxIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilContQtr();
        double[] doubleArray7 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray8 = incSheetFileData0.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxQtr();
        fieldData2.setQuarter((int) (short) -1);
        boolean boolean6 = fieldData2.isAdr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0990");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0991");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str9 = sharesFileData0.getSector();
        double double10 = sharesFileData0.getPrice52lo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData11.setInstBuyShrs("");
        double[] doubleArray14 = sharesFileData11.getSharesYr();
        sharesFileData0.setSharesY(doubleArray14);
        double double16 = sharesFileData0.getPrice52lo();
        int int17 = sharesFileData0.getInstShareholders();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ2();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(100);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        java.lang.String str5 = fieldData2.getSnpIndexStr();
        double[] doubleArray6 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray7 = fieldData2.getRdYr();
        double double8 = fieldData2.getPrice52hi();
        double[] doubleArray9 = fieldData2.getCogsQtr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum11 = fieldData2.getDowIndex();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(dowEnum11);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0994");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        java.lang.String str5 = fieldData2.getState();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0995");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray7 = fieldData2.getEpsContYr();
        double[] doubleArray8 = fieldData2.getEquityQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0996");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        companyFileData5.setDowIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setDowIndex("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str17 = estimateFileData16.getSector();
        java.lang.String str18 = estimateFileData16.getIndustry();
        double double19 = estimateFileData16.getEpsY2();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.lang.String str26 = companyFileData25.getCity();
        java.lang.String str27 = companyFileData25.getPhone();
        java.lang.String str28 = companyFileData25.getWeb();
        java.lang.String str29 = companyFileData25.getSic();
        estimateFileData16.setNameFields(companyFileData25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData31.setInstBuyShrs("");
        double[] doubleArray34 = sharesFileData31.getSharesYr();
        sharesFileData31.setInsiderNetTrades("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData37.setInstBuyShrs("");
        double[] doubleArray40 = sharesFileData37.getSharesYr();
        double double41 = sharesFileData37.getDollar3m();
        double[] doubleArray42 = sharesFileData37.getSharesYr();
        sharesFileData31.setSharesY(doubleArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray45 = incSheetFileData44.getIncPrimaryEpsQtr();
        double[] doubleArray46 = incSheetFileData44.getEpsYr();
        double[] doubleArray47 = incSheetFileData44.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData48 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData48);
        double[] doubleArray50 = balSheetFileData49.getEquityYr();
        double[] doubleArray51 = balSheetFileData49.getGoodwillQtr();
        double[] doubleArray52 = balSheetFileData49.getOtherCurrAssetsYr();
        double[] doubleArray53 = balSheetFileData49.getLtDebtYr();
        double[] doubleArray54 = balSheetFileData49.getTotalAssetsQtr();
        double[] doubleArray55 = balSheetFileData49.getInventoryQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData56 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData56);
        java.lang.String str58 = cashFileData57.toString();
        double[] doubleArray59 = cashFileData57.getCapExQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData16, sharesFileData31, incSheetFileData44, balSheetFileData49, cashFileData57, (int) '4', (int) ' ');
        java.lang.String str63 = cashFileData57.toString();
        double[] doubleArray64 = cashFileData57.getCashFromInvQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0]");
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cash File Data" + "'", str58, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cash File Data" + "'", str63, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray64);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0997");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0998");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str9 = sharesFileData0.getSector();
        sharesFileData0.setInsiderBuys("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        double double12 = sharesFileData0.getInstOwnership();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0999");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        double double15 = estimateFileData12.getEpsY2();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = companyFileData21.getCity();
        java.lang.String str23 = companyFileData21.getPhone();
        java.lang.String str24 = companyFileData21.getWeb();
        java.lang.String str25 = companyFileData21.getSic();
        estimateFileData12.setNameFields(companyFileData21);
        net.ajaskey.common.DateTime dateTime27 = estimateFileData12.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int29 = sharesFileData28.getInsiderSells();
        sharesFileData28.setInstSellShrs("out/BigDB/");
        sharesFileData28.setInsiderOwnership("");
        double double34 = sharesFileData28.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray37 = incSheetFileData36.getEpsContQtr();
        double[] doubleArray38 = incSheetFileData36.getIncTaxYr();
        double[] doubleArray39 = incSheetFileData36.getGrossOpIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData40);
        double[] doubleArray42 = balSheetFileData41.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData28, incSheetFileData36, balSheetFileData41, cashFileData44, (int) (short) 10, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData50);
        double[] doubleArray52 = balSheetFileData51.getAcctRxYr();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData57 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData58 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList55);
        java.lang.String str59 = companyFileData58.getCity();
        java.lang.String str60 = companyFileData58.getPhone();
        java.lang.String str61 = companyFileData58.getWeb();
        companyFileData58.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData51.setNameFields(companyFileData58);
        companyFileData58.setName("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData67 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData67);
        double[] doubleArray69 = balSheetFileData68.getAcctRxYr();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData74 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList72);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData75 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList72);
        java.lang.String str76 = companyFileData75.getCity();
        java.lang.String str77 = companyFileData75.getPhone();
        java.lang.String str78 = companyFileData75.getWeb();
        companyFileData75.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData68.setNameFields(companyFileData75);
        companyFileData75.setState("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData84 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData75);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData89 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList87);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData90 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList87);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData91 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList87);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData92 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList87);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData93 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList87);
        java.util.List<java.lang.String> strList94 = companyFileData75.set((java.util.List<java.lang.String>) strList87);
        java.util.List<java.lang.String> strList95 = companyFileData58.set(strList94);
        java.util.List<java.lang.String> strList96 = companyFileData5.set(strList94);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList99 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList94, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(estimateFileData57);
        org.junit.Assert.assertNotNull(companyFileData58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(estimateFileData74);
        org.junit.Assert.assertNotNull(companyFileData75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(estimateFileData89);
        org.junit.Assert.assertNotNull(companyFileData90);
        org.junit.Assert.assertNotNull(incSheetFileData91);
        org.junit.Assert.assertNotNull(companyFileData92);
        org.junit.Assert.assertNotNull(cashFileData93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(fieldDataList99);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test1000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        int int9 = sharesFileData0.getInstBuyShrs();
        sharesFileData0.setInsiderSells("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}

