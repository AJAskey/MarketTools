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
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        int int7 = fieldData2.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = fieldData2.getBalSheetData();
        double[] doubleArray9 = balSheetFileData8.getCurrAssetsQtr();
        double[] doubleArray10 = balSheetFileData8.getCashQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0502");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getIntExpYr();
        double[] doubleArray10 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.getIndustry();
        double[] doubleArray8 = balSheetFileData0.getLtInvestYr();
        double[] doubleArray9 = balSheetFileData0.getCashYr();
        java.lang.String[] strArray12 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        int int18 = companyFileData17.getNumEmployees();
        companyFileData17.setCountry("hi!");
        int int21 = companyFileData17.getNumEmployees();
        double[] doubleArray22 = companyFileData17.getPriceQtr();
        companyFileData17.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str25 = companyFileData17.getPhone();
        java.lang.String str26 = companyFileData17.getIndustry();
        balSheetFileData0.setNameFields(companyFileData17);
        double[] doubleArray28 = balSheetFileData0.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(doubleArray28);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0504");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList19);
        double[] doubleArray22 = incSheetFileData21.getDividendYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray4 = balSheetFileData3.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0506");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray13 = incSheetFileData5.getUnusualIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0507");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        companyFileData7.setStreet("out/BigDB/");
        companyFileData7.setSnpIndex("out/BigDB/");
        java.lang.String str24 = companyFileData7.getStreet();
        java.lang.String str25 = companyFileData7.getCountry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "out/BigDB/" + "'", str24, "out/BigDB/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0508");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0509");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ1();
        java.lang.String str4 = estimateFileData0.toString();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = estimateFileData0.getExchange();
        double double7 = estimateFileData0.getEpsQ0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str4, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashYr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        java.lang.String str8 = balSheetFileData0.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0511");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setInsiderOwnership("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0512");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0513");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray12 = incSheetFileData5.getGrossOpIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setFloatshr("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        companyFileData19.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData19.setCountry("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setNameFields(companyFileData19);
        java.lang.String str25 = companyFileData19.getExchangeStr();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NONE" + "'", str25, "NONE");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0515");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray5 = balSheetFileData0.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0516");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashYr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        double[] doubleArray8 = balSheetFileData0.getBvpsYr();
        double[] doubleArray9 = balSheetFileData0.getGoodwillYr();
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0517");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        net.ajaskey.common.DateTime dateTime46 = estimateFileData10.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum47 = estimateFileData10.getExchange();
        net.ajaskey.common.DateTime dateTime48 = estimateFileData10.getLatestQtrEps();
        java.lang.String str49 = estimateFileData10.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(dateTime46);
        org.junit.Assert.assertNull(exchEnum47);
        org.junit.Assert.assertNull(dateTime48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0518");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double5 = estimateFileData4.getEpsY2();
        java.lang.String str6 = estimateFileData4.getIndustry();
        java.lang.String str7 = estimateFileData4.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0519");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInsiderBuys("NONE");
        sharesFileData1.setFloatshr("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setPrice("");
        sharesFileData1.setInstOwnership("out/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        java.lang.String str12 = balSheetFileData0.getTicker();
        java.lang.String str13 = balSheetFileData0.toString();
        double[] doubleArray14 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray15 = balSheetFileData0.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstSellShrs("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        sharesFileData1.setMktCap("NONE");
        double double20 = sharesFileData1.getPrice52hi();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0523");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = fieldDataQuarter7.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = fieldDataQuarter7.fieldDataList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 10, 1, fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0524");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetTrades("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0525");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ1();
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        int int12 = companyFileData11.getNumEmployees();
        companyFileData11.setStreet("");
        java.lang.String str15 = companyFileData11.getCountry();
        companyFileData11.setTicker("");
        companyFileData11.setCountry("hi!");
        estimateFileData0.setNameFields(companyFileData11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0526");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0527");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        java.lang.String str7 = balSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int4 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInstOwnership("data/BigDB/");
        double double7 = sharesFileData1.getPrice52lo();
        double double8 = sharesFileData1.getInsiderOwnership();
        int int9 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(6, 32, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0530");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0531");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray2 = cashFileData1.getCashFromInvQtr();
        double[] doubleArray3 = cashFileData1.getCashFromFinQtr();
        double[] doubleArray4 = cashFileData1.getCashFromInvQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0532");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray14 = incSheetFileData13.getCogsQtr();
        java.lang.String str15 = incSheetFileData13.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0533");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        double[] doubleArray19 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray20 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0534");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray9 = balSheetFileData0.getStDebtYr();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabYr();
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0535");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0537");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getCogsQtr();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray12 = incSheetFileData5.getIntExpQtr();
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0538");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0539");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getNonrecurringItemsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0540");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashYr();
        double[] doubleArray7 = balSheetFileData0.getCashYr();
        double[] doubleArray8 = balSheetFileData0.getEquityQtr();
        double[] doubleArray9 = balSheetFileData0.getInventoryQtr();
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0541");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("Cash File Data");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0542");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getStDebtQtr();
        java.lang.String str5 = balSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0543");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = sharesFileData1.getExchange();
        double double12 = sharesFileData1.getPrice52lo();
        double double13 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0544");
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getConstructorError(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ1();
        int int5 = fieldDataYear1.getYear();
        boolean boolean6 = fieldDataYear1.isInUse();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0546");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (byte) 1, 97, filetypeEnum2);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0547");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0548");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpIncYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxYr();
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0549");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        int int7 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInstBuyShrs("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setBeta("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setInsiderNetTrades("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0550");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0551");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        double double11 = sharesFileData1.getBeta();
        sharesFileData1.setInsiderOwnership("");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0552");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((-1), 97, filetypeEnum2);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0553");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0554");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(balSheetFileData21);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(sharesFileData23);
        org.junit.Assert.assertNotNull(companyFileData24);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0555");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0556");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0557");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 10);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0558");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(52, (int) (byte) -1, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((-1), 97, fieldDataList8);
        int int12 = fieldDataQuarter11.getYear();
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0559");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        java.lang.String str6 = balSheetFileData5.toDbOutput();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0560");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0561");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0562");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum12 = incSheetFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(exchEnum12);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0563");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("Cash File Data");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0565");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0566");
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0567");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList4);
        int int6 = fieldDataQuarter5.getYear();
        int int7 = fieldDataQuarter5.getYear();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0568");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32." };
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncTaxQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsDilContYr();
        double[] doubleArray3 = incSheetFileData0.getIncTaxQtr();
        double[] doubleArray4 = incSheetFileData0.getGrossIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0570");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList19);
        double[] doubleArray22 = balSheetFileData21.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(balSheetFileData21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0571");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray9 = balSheetFileData0.getStDebtYr();
        double[] doubleArray10 = balSheetFileData0.getCurrLiabYr();
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        sharesFileData12.setInstOwnership("NONE");
        double[] doubleArray19 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData12.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData23);
        sharesFileData24.setInstOwnership("NONE");
        double[] doubleArray31 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData24.setSharesY(doubleArray31);
        sharesFileData12.setSharesY(doubleArray31);
        sharesFileData1.setSharesQ(doubleArray31);
        double double35 = sharesFileData1.getPrice();
        sharesFileData1.setFloatshr("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0573");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray13 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray14 = incSheetFileData5.getDividendYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0574");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0575");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setSnpIndex("NONE");
        java.lang.String str10 = companyFileData7.getStreet();
        java.lang.String str11 = companyFileData7.getName();
        companyFileData7.setCountry("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        sharesFileData1.setInsiderBuys("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        int int22 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0577");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0578");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0579");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = fieldData2.getCashData();
        java.lang.String str5 = fieldData2.getName();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNotNull(cashFileData4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getCurrAssetsQtr();
        double[] doubleArray8 = balSheetFileData0.getEquityYr();
        double[] doubleArray9 = balSheetFileData0.getOtherLtLiabQtr();
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ((int) (byte) 100);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter4);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0582");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(10, 6, "out/BigDB/", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE" + "'", str4, "out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0584");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0585");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getCogsQtr();
        double[] doubleArray13 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0586");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0587");
        java.lang.String[] strArray3 = new java.lang.String[] { "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE" };
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "hi!", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0588");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        int int13 = sharesFileData1.getInstBuyShrs();
        int int14 = sharesFileData1.getInstSellShrs();
        double double15 = sharesFileData1.getPrice();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0589");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        sharesFileData1.setPrice("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int62 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0590");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setPrice("NONE");
        sharesFileData1.setInsiderBuys("hi!");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0591");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderNetTrades("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        sharesFileData1.setFloatshr("out/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0592");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        double[] doubleArray5 = cashFileData1.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0593");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getSector();
        java.lang.String str2 = companyFileData0.getIndustry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0594");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getBvpsQtr();
        java.lang.String[] strArray7 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        java.lang.String str13 = companyFileData12.getDowIndexStr();
        java.lang.String str14 = companyFileData12.getTicker();
        companyFileData12.setCity("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        balSheetFileData0.setNameFields(companyFileData12);
        double[] doubleArray18 = balSheetFileData0.getOtherCurrAssetsQtr();
        double[] doubleArray19 = balSheetFileData0.getBvpsYr();
        double[] doubleArray20 = balSheetFileData0.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0595");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ1();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        sharesFileData18.setInstOwnership("NONE");
        double[] doubleArray25 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData18.setSharesY(doubleArray25);
        double double27 = sharesFileData18.getMktCap();
        double[] doubleArray28 = null;
        sharesFileData18.setSharesQ(doubleArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray38 = balSheetFileData37.getOtherLtLiabYr();
        double[] doubleArray39 = balSheetFileData37.getStInvestYr();
        double[] doubleArray40 = balSheetFileData37.getTotalAssetsQtr();
        double[] doubleArray41 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray42 = balSheetFileData37.getTotalAssetsYr();
        double[] doubleArray43 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray44 = balSheetFileData37.getGoodwillYr();
        double[] doubleArray45 = balSheetFileData37.getStDebtQtr();
        java.lang.String str46 = balSheetFileData37.getSector();
        double[] doubleArray47 = balSheetFileData37.getOtherCurrLiabQtr();
        double[] doubleArray48 = balSheetFileData37.getStInvestQtr();
        java.lang.String str49 = balSheetFileData37.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData50);
        java.lang.String str52 = cashFileData51.getTicker();
        java.lang.String str53 = cashFileData51.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData51);
        java.lang.String str55 = cashFileData54.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData18, incSheetFileData35, balSheetFileData37, cashFileData54, (int) '4', 10);
        fieldData58.setQuarter(0);
        boolean boolean61 = fieldData58.isDataValid();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0596");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setDollar3m("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0597");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData0.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0598");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getRdQtr();
        double[] doubleArray13 = incSheetFileData5.getUnusualIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0599");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData0.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        sharesFileData12.setInstOwnership("NONE");
        double[] doubleArray19 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData12.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData23);
        sharesFileData24.setInstOwnership("NONE");
        double[] doubleArray31 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData24.setSharesY(doubleArray31);
        sharesFileData12.setSharesY(doubleArray31);
        sharesFileData1.setSharesQ(doubleArray31);
        double double35 = sharesFileData1.getPrice();
        sharesFileData1.setFromReport((int) (byte) 1, 100);
        sharesFileData1.setMktCap("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0601");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray12 = incSheetFileData5.getDepreciationQtr();
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0602");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0603");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32." };
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0604");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        double double18 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        sharesFileData1.setInsiderBuyShrs("out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0606");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0607");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0608");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData0.getCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData0.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0609");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0610");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpIncYr();
        double[] doubleArray9 = incSheetFileData5.getEpsYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int4 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInstOwnership("data/BigDB/");
        double double7 = sharesFileData1.getInstOwnership();
        sharesFileData1.setPrice("out/BigDB/");
        double double10 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0612");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0613");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData0.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0614");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getState();
        java.lang.String str13 = companyFileData7.getCity();
        java.lang.String str14 = companyFileData7.getWeb();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0615");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        double[] doubleArray6 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData0.getStDebtYr();
        double[] doubleArray8 = balSheetFileData0.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0616");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        java.lang.String str11 = companyFileData7.getState();
        java.lang.String str12 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0617");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        double double13 = sharesFileData1.getDollar3m();
        long long14 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0618");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        java.lang.String str3 = balSheetFileData0.getName();
        double[] doubleArray4 = balSheetFileData0.getLtDebtYr();
        double[] doubleArray5 = balSheetFileData0.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0619");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
        java.lang.String str12 = incSheetFileData5.getIndustry();
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
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0620");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str3 = cashFileData2.getTicker();
        double[] doubleArray4 = cashFileData2.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0621");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getZip();
        companyFileData7.setPhone("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData7.setPhone("");
        int int17 = companyFileData7.getNumEmployees();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0622");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        double[] doubleArray6 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData0.getStDebtYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0623");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        java.lang.String str15 = sharesFileData1.getTicker();
        int int16 = sharesFileData1.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        int int18 = sharesFileData17.getInstBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0624");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getAdjToIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0625");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsYr();
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0626");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(0, 97);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0627");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        double[] doubleArray5 = incSheetFileData4.getOtherIncQtr();
        java.lang.String str6 = incSheetFileData4.getSector();
        double[] doubleArray7 = incSheetFileData4.getEpsDilYr();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0628");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0629");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getRdQtr();
        double[] doubleArray9 = incSheetFileData5.getRdQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0630");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        boolean boolean12 = companyFileData7.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInstOwnership("NONE");
        double[] doubleArray22 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData15.setSharesY(doubleArray22);
        java.lang.String str24 = sharesFileData15.getTicker();
        sharesFileData15.setFloatshr("NONE");
        sharesFileData15.setInsiderNetPercentOutstanding("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int29 = sharesFileData15.getInsiderBuyShrs();
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getNonrecurringItemsQtr();
        double[] doubleArray37 = incSheetFileData35.getDividendYr();
        double[] doubleArray38 = incSheetFileData35.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray40 = balSheetFileData39.getOtherLtLiabYr();
        double[] doubleArray41 = balSheetFileData39.getCurrLiabYr();
        double[] doubleArray42 = balSheetFileData39.getGoodwillQtr();
        double[] doubleArray43 = balSheetFileData39.getAcctPayableQtr();
        double[] doubleArray44 = balSheetFileData39.getCurrAssetsQtr();
        double[] doubleArray45 = balSheetFileData39.getBvpsQtr();
        double[] doubleArray46 = balSheetFileData39.getEquityYr();
        java.lang.String[] strArray49 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData52 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData53 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData54 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList50);
        int int55 = companyFileData54.getNumEmployees();
        companyFileData54.setCountry("hi!");
        int int58 = companyFileData54.getNumEmployees();
        java.lang.String[] strArray61 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData64 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData65 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList62);
        java.util.List<java.lang.String> strList66 = companyFileData54.set((java.util.List<java.lang.String>) strList62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData67 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList66);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData68 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList66);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData71 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData15, incSheetFileData35, balSheetFileData39, cashFileData68, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(incSheetFileData52);
        org.junit.Assert.assertNotNull(estimateFileData53);
        org.junit.Assert.assertNotNull(companyFileData54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(incSheetFileData64);
        org.junit.Assert.assertNotNull(estimateFileData65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(sharesFileData67);
        org.junit.Assert.assertNotNull(cashFileData68);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0631");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = fieldDataQuarter5.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = fieldDataQuarter5.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = fieldDataQuarter5.fieldDataList;
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0632");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        java.lang.String str15 = sharesFileData1.getTicker();
        int int16 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0633");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str9 = cashFileData8.toDbOutput();
        double[] doubleArray10 = cashFileData8.getCashFromOpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0634");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(sharesFileData21);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0635");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        java.lang.String str7 = incSheetFileData5.toString();
        double[] doubleArray8 = incSheetFileData5.getDepreciationYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0636");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0637");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.getTicker();
        double[] doubleArray4 = cashFileData1.getCapExQtr();
        java.lang.String str5 = cashFileData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0638");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashYr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        double[] doubleArray8 = balSheetFileData0.getBvpsYr();
        double[] doubleArray9 = balSheetFileData0.getOtherCurrLiabQtr();
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0639");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0640");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsY0();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getCurrFiscalYear();
        double double5 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = estimateFileData0.getExchange();
        net.ajaskey.common.DateTime dateTime7 = estimateFileData0.getCurrFiscalYear();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(dateTime7);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0641");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str10 = companyFileData7.getCity();
        companyFileData7.setSic("out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0642");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderBuys();
        double double5 = sharesFileData1.getInsiderNetPercentOutstanding();
        java.lang.String str6 = sharesFileData1.getTicker();
        double double7 = sharesFileData1.getPrice52lo();
        long long8 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0643");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(balSheetFileData21);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(sharesFileData23);
        org.junit.Assert.assertNotNull(sharesFileData24);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int12 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSellShrs("");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0645");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toDbOutput();
        double[] doubleArray7 = balSheetFileData0.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0646");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum13 = companyFileData7.getSnpIndex();
        companyFileData7.setDowIndex("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(snpEnum13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0647");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        java.lang.String str9 = companyFileData7.getStreet();
        companyFileData7.setState("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str13 = estimateFileData12.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInstOwnership("NONE");
        int int18 = sharesFileData15.getInsiderBuys();
        double double19 = sharesFileData15.getFloatshr();
        double double20 = sharesFileData15.getDollar3m();
        long long21 = sharesFileData15.getVolumeMonth3m();
        java.lang.String[] strArray24 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        double[] doubleArray28 = incSheetFileData27.getNonrecurringItemsQtr();
        double[] doubleArray29 = incSheetFileData27.getUnusualIncQtr();
        java.lang.String str30 = incSheetFileData27.getTicker();
        double[] doubleArray31 = incSheetFileData27.getNonrecurringItemsYr();
        double[] doubleArray32 = incSheetFileData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray34 = balSheetFileData33.getOtherLtLiabYr();
        double[] doubleArray35 = balSheetFileData33.getCurrLiabYr();
        double[] doubleArray36 = balSheetFileData33.getGoodwillQtr();
        double[] doubleArray37 = balSheetFileData33.getTotalLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData38 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData38);
        java.lang.String str40 = cashFileData39.getTicker();
        java.lang.String str41 = cashFileData39.toString();
        java.lang.String str42 = cashFileData39.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData39);
        java.lang.String str44 = cashFileData43.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData12, sharesFileData15, incSheetFileData27, balSheetFileData33, cashFileData45, (int) (short) 1, 32);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(incSheetFileData27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Cash File Data" + "'", str41, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        double[] doubleArray3 = cashFileData1.getCashFromOpsQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0649");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str6 = cashFileData5.getTicker();
        double[] doubleArray7 = cashFileData5.getCapExQtr();
        double[] doubleArray8 = cashFileData5.getCapExQtr();
        java.lang.String str9 = cashFileData5.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cash File Data" + "'", str9, "Cash File Data");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0650");
        java.lang.String[] strArray6 = new java.lang.String[] { "Cash File Data", "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "", "out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE" };
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0651");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        double[] doubleArray7 = sharesFileData1.getSharesQtr();
        sharesFileData1.setPrice("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0652");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setDollar3m("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setInsiderBuyShrs("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        double double22 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0653");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData0.getCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData0.getCashQtr();
        double[] doubleArray6 = balSheetFileData0.getCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData0.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0654");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        int int7 = fieldData2.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(companyFileData8);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0655");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray13 = incSheetFileData5.getRdQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0656");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        int int7 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInstBuyShrs("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setBeta("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        double double12 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0657");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        double[] doubleArray3 = cashFileData1.getCashFromInvQtr();
        java.lang.String str4 = cashFileData1.toDbOutput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0658");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setDollar3m("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setInsiderBuyShrs("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        long long22 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0659");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getDowIndexStr();
        java.lang.String str13 = companyFileData7.getState();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0660");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        double[] doubleArray20 = sharesFileData1.getSharesQtr();
        sharesFileData1.setFromReport(0, (int) (byte) -1);
        double double24 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0661");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = null;
        fieldDataYear1.set(97, fieldDataQuarter6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ(10);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0663");
        java.lang.String[] strArray4 = new java.lang.String[] { "Cash File Data", "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1." };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0664");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("data/BigDB/");
        java.lang.String str14 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str17 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum18 = companyFileData7.getSnpIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + snpEnum18 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE + "'", snpEnum18.equals(net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0665");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData7.getPhone();
        companyFileData7.setNumEmployees("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0666");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0667");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray12 = balSheetFileData11.getStInvestQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0668");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
        double[] doubleArray12 = incSheetFileData5.getEpsDilYr();
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0669");
        java.lang.String[] strArray4 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) ' ', fieldDataList11);
        int int13 = fieldDataQuarter12.getQuarter();
        int int14 = fieldDataQuarter12.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = fieldDataYear16.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter20 = fieldDataYear16.getQ((int) (short) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList27, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) ' ', fieldDataList33);
        fieldDataYear16.set((int) (byte) 100, fieldDataQuarter34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = fieldDataQuarter34.fieldDataList;
        fieldDataQuarter12.fieldDataList = fieldDataList36;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(fieldDataQuarter18);
        org.junit.Assert.assertNull(fieldDataQuarter20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(incSheetFileData29);
        org.junit.Assert.assertNotNull(estimateFileData30);
        org.junit.Assert.assertNotNull(fieldDataList33);
        org.junit.Assert.assertNotNull(fieldDataList36);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        double double13 = sharesFileData1.getPrice52lo();
        sharesFileData1.setInstSellShrs("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInsiderSellShrs("data/BigDB/");
        sharesFileData1.setFromReport((-1), (int) '4');
        sharesFileData1.setInstShareholders("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int23 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0672");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toDbOutput();
        double[] doubleArray7 = balSheetFileData0.getCashQtr();
        double[] doubleArray8 = balSheetFileData0.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0673");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        double[] doubleArray6 = balSheetFileData0.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0674");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        java.lang.String str9 = companyFileData7.toString();
        companyFileData7.setSic("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0675");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(1, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0676");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        int int2 = fieldDataYear1.getYear();
        int int3 = fieldDataYear1.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0677");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderNetTrades("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        sharesFileData1.setVolume3m("data/BigDB/");
        sharesFileData1.setInstBuyShrs("Cash File Data");
        java.lang.String str19 = sharesFileData1.getTicker();
        double[] doubleArray20 = sharesFileData1.getSharesQtr();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0678");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toDbOutput();
        double[] doubleArray7 = balSheetFileData0.getLtInvestQtr();
        double[] doubleArray8 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray9 = balSheetFileData0.getNetFixedAssetsYr();
        double[] doubleArray10 = balSheetFileData0.getPrefStockQtr();
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
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0679");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str11 = companyFileData7.getCity();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0680");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ1();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        sharesFileData18.setInstOwnership("NONE");
        double[] doubleArray25 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData18.setSharesY(doubleArray25);
        double double27 = sharesFileData18.getMktCap();
        double[] doubleArray28 = null;
        sharesFileData18.setSharesQ(doubleArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray38 = balSheetFileData37.getOtherLtLiabYr();
        double[] doubleArray39 = balSheetFileData37.getStInvestYr();
        double[] doubleArray40 = balSheetFileData37.getTotalAssetsQtr();
        double[] doubleArray41 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray42 = balSheetFileData37.getTotalAssetsYr();
        double[] doubleArray43 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray44 = balSheetFileData37.getGoodwillYr();
        double[] doubleArray45 = balSheetFileData37.getStDebtQtr();
        java.lang.String str46 = balSheetFileData37.getSector();
        double[] doubleArray47 = balSheetFileData37.getOtherCurrLiabQtr();
        double[] doubleArray48 = balSheetFileData37.getStInvestQtr();
        java.lang.String str49 = balSheetFileData37.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData50);
        java.lang.String str52 = cashFileData51.getTicker();
        java.lang.String str53 = cashFileData51.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData51);
        java.lang.String str55 = cashFileData54.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData18, incSheetFileData35, balSheetFileData37, cashFileData54, (int) '4', 10);
        double[] doubleArray59 = incSheetFileData35.getOtherIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(doubleArray59);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0681");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getSalesYr();
        java.lang.String str7 = incSheetFileData5.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0682");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        double[] doubleArray13 = incSheetFileData5.getNonrecurringItemsQtr();
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0683");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = fieldData2.getIncSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(incSheetFileData5);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0684");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        companyFileData20.setWeb("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData20.setAdr("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        companyFileData20.setSic("");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0685");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray13 = incSheetFileData5.getDepreciationQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0686");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getLtDebtYr();
        double[] doubleArray6 = balSheetFileData0.getCashYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0687");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getCurrAssetsQtr();
        double[] doubleArray8 = balSheetFileData0.getLtDebtYr();
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0689");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getDowIndexStr();
        companyFileData7.setSector("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        companyFileData7.setSector("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        companyFileData7.setSector("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0690");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        double double15 = sharesFileData1.getInstOwnership();
        double double16 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0691");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInsiderBuys("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        double double11 = sharesFileData1.getBeta();
        int int12 = sharesFileData1.getInsiderNetTrades();
        long long13 = sharesFileData1.getVolumeMonth3m();
        double double14 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0693");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray12 = incSheetFileData5.getRdYr();
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str6 = cashFileData5.getTicker();
        java.lang.String str7 = cashFileData5.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cash File Data" + "'", str7, "Cash File Data");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0695");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = incSheetFileData5.getExchange();
        double[] doubleArray8 = incSheetFileData5.getGrossIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0696");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0697");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = fieldData2.getCompanyInfo();
        companyFileData4.setSic("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData4.setNumEmployees("Cash File Data");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(companyFileData4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(52, (int) (byte) -1, fieldDataList12);
        fieldDataYear1.set(100, fieldDataQuarter14);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0699");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        java.lang.String str13 = companyFileData7.toString();
        java.lang.String str14 = companyFileData7.getSnpIndexStr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ1();
        int int5 = fieldDataYear1.getYear();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = fieldDataQuarter12.fieldDataList;
        int int14 = fieldDataQuarter12.getQuarter();
        fieldDataYear1.set((int) (byte) 0, fieldDataQuarter12);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0701");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getDowIndexStr();
        companyFileData7.setSector("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        companyFileData7.setSector("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum17 = companyFileData7.getDowIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(dowEnum17);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0702");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (byte) 1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = sharesFileData1.getExchange();
        double double12 = sharesFileData1.getPrice52lo();
        sharesFileData1.setBeta("hi!");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0704");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0705");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String str12 = companyFileData7.getIndustry();
        companyFileData7.setIndustry("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0706");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str4 = sharesFileData1.getIndustry();
        sharesFileData1.setFloatshr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int7 = sharesFileData1.getInstShareholders();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0707");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        double double15 = sharesFileData1.getMktCap();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0708");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilQtr();
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0709");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setDollar3m("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setInsiderBuyShrs("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        double double22 = sharesFileData1.getPrice52lo();
        sharesFileData1.setInstBuyShrs("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0710");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        int int3 = sharesFileData1.getInsiderBuys();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0711");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray12 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0712");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        int int17 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderBuys("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = fieldData2.getShareData();
        boolean boolean6 = fieldData2.isDataValid();
        int int7 = fieldData2.getQuarter();
        java.lang.String str8 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNotNull(sharesFileData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str8, "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(balSheetFileData9);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0714");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray6 = balSheetFileData0.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0715");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        fieldData2.setQuarter(100);
        java.lang.String str10 = fieldData2.getSector();
        int int11 = fieldData2.getQuarter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setInsiderOwnership("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setInsiderSellShrs("NONE");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        double[] doubleArray7 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData0.getInventoryYr();
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0718");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0719");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        double[] doubleArray7 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray8 = balSheetFileData0.getNetFixedAssetsQtr();
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((-1));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0721");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("hi!");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0722");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ((int) (short) 100);
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) ' ', fieldDataList18);
        fieldDataYear1.set((int) (byte) 100, fieldDataQuarter19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter22 = fieldDataYear1.getQ((int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter23 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNull(fieldDataQuarter22);
        org.junit.Assert.assertNull(fieldDataQuarter23);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0723");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0724");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ1();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        sharesFileData18.setInstOwnership("NONE");
        double[] doubleArray25 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData18.setSharesY(doubleArray25);
        double double27 = sharesFileData18.getMktCap();
        double[] doubleArray28 = null;
        sharesFileData18.setSharesQ(doubleArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray38 = balSheetFileData37.getOtherLtLiabYr();
        double[] doubleArray39 = balSheetFileData37.getStInvestYr();
        double[] doubleArray40 = balSheetFileData37.getTotalAssetsQtr();
        double[] doubleArray41 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray42 = balSheetFileData37.getTotalAssetsYr();
        double[] doubleArray43 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray44 = balSheetFileData37.getGoodwillYr();
        double[] doubleArray45 = balSheetFileData37.getStDebtQtr();
        java.lang.String str46 = balSheetFileData37.getSector();
        double[] doubleArray47 = balSheetFileData37.getOtherCurrLiabQtr();
        double[] doubleArray48 = balSheetFileData37.getStInvestQtr();
        java.lang.String str49 = balSheetFileData37.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData50);
        java.lang.String str52 = cashFileData51.getTicker();
        java.lang.String str53 = cashFileData51.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData51);
        java.lang.String str55 = cashFileData54.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData18, incSheetFileData35, balSheetFileData37, cashFileData54, (int) '4', 10);
        java.lang.String[] strArray61 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData64 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData65 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData66 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList62);
        int int67 = companyFileData66.getNumEmployees();
        companyFileData66.setCountry("hi!");
        int int70 = companyFileData66.getNumEmployees();
        estimateFileData13.setNameFields(companyFileData66);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(incSheetFileData64);
        org.junit.Assert.assertNotNull(estimateFileData65);
        org.junit.Assert.assertNotNull(companyFileData66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0725");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0726");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0727");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationQtr();
        java.lang.String str8 = incSheetFileData5.getIndustry();
        java.lang.String str9 = incSheetFileData5.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0728");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("NONE");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0729");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0730");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        java.lang.String str4 = estimateFileData0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str4, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0731");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getZip();
        companyFileData7.setZip("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str15 = companyFileData7.toString();
        java.lang.String str16 = companyFileData7.getZip();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "out/BigDB/100/Q32/hi!-fundamental-data-100Q32." + "'", str16, "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0732");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray11 = incSheetFileData5.getRdYr();
        double[] doubleArray12 = incSheetFileData5.getGrossOpIncQtr();
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0733");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        double[] doubleArray1 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str2 = cashFileData0.toDbOutput();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0734");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "hi!", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "Cash File Data", "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32." };
        java.lang.String[] strArray10 = new java.lang.String[] { "out/BigDB/", "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "NONE", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0735");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = fieldData2.getIncSheetData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(incSheetFileData5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0736");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        java.lang.String str8 = incSheetFileData5.toString();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0737");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setInsiderBuys("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        sharesFileData1.setInsiderNetTrades("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0739");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        java.lang.String str10 = companyFileData7.getSector();
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getZip();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = companyFileData7.getExchange();
        companyFileData7.setZip("out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(exchEnum13);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0740");
        java.lang.String[] strArray5 = new java.lang.String[] { "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1." };
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "", "out/BigDB/", "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0741");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str3 = cashFileData1.getTicker();
        double[] doubleArray4 = cashFileData1.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0742");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        boolean boolean7 = fieldData2.isDataValid();
        fieldData2.setQuarter((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0743");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0744");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData0.getStDebtYr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0745");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "hi!" };
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0746");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getIndustry();
        java.lang.String str9 = companyFileData7.toString();
        java.lang.String str10 = companyFileData7.getCountry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0747");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        double[] doubleArray46 = incSheetFileData32.getGrossIncYr();
        double[] doubleArray47 = incSheetFileData32.getUnusualIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0748");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("Cash File Data");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ1();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(fieldDataQuarter9);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0750");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        int int2 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0751");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str11 = companyFileData7.getStreet();
        boolean boolean12 = companyFileData7.isAdr();
        java.lang.String str13 = companyFileData7.getStreet();
        companyFileData7.setDowIndex("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0752");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = fieldDataQuarter11.fieldDataList;
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList16, (int) (byte) -1, 0);
        fieldDataQuarter11.fieldDataList = fieldDataList22;
        fieldDataQuarter5.fieldDataList = fieldDataList22;
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0753");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        companyFileData7.setDowIndex("hi!");
        companyFileData7.setName("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        java.lang.String str14 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0754");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0755");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        java.lang.String str11 = companyFileData7.getState();
        companyFileData7.setAdr("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setVolume3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        double double20 = sharesFileData1.getBeta();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0757");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0759");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0760");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        int int18 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderSellShrs("out/BigDB/");
        long long21 = sharesFileData1.getVolumeMonth3m();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        fieldData2.setQuarter(100);
        java.lang.String str10 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = fieldData2.getExchange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0762");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE", "NONE" };
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData0.getEquityYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        fieldData2.setQuarter(100);
        java.lang.String str10 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52 Q100\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str10, "52 Q100\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0766");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderNetTrades("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum15 = sharesFileData1.getExchange();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(exchEnum15);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter11 = fieldDataYear1.getQ(6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = fieldDataYear14.getQ(10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = fieldDataQuarter23.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = fieldDataQuarter23.fieldDataList;
        fieldDataYear14.set((int) (byte) 1, fieldDataQuarter23);
        int int27 = fieldDataQuarter23.getQuarter();
        fieldDataYear1.set(97, fieldDataQuarter23);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(fieldDataQuarter9);
        org.junit.Assert.assertNull(fieldDataQuarter11);
        org.junit.Assert.assertNull(fieldDataQuarter16);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0768");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0769");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNotNull(balSheetFileData22);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY2();
        java.lang.String[] strArray4 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str10 = companyFileData9.getSnpIndexStr();
        estimateFileData0.setNameFields(companyFileData9);
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        int int20 = companyFileData19.getNumEmployees();
        companyFileData19.setCountry("hi!");
        int int23 = companyFileData19.getNumEmployees();
        java.lang.String[] strArray26 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList31 = companyFileData19.set((java.util.List<java.lang.String>) strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList31);
        java.util.List<java.lang.String> strList34 = companyFileData9.set(strList31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(incSheetFileData29);
        org.junit.Assert.assertNotNull(estimateFileData30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(sharesFileData32);
        org.junit.Assert.assertNotNull(incSheetFileData33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(companyFileData35);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0771");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList19);
        double[] doubleArray22 = balSheetFileData21.getPrefStockYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(balSheetFileData21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0772");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        double[] doubleArray19 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray20 = incSheetFileData5.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0773");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationQtr();
        java.lang.String str8 = incSheetFileData5.getIndustry();
        double[] doubleArray9 = incSheetFileData5.getNetIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0774");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        double[] doubleArray19 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray20 = incSheetFileData5.getEpsQtr();
        double[] doubleArray21 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str22 = incSheetFileData5.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0775");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList19);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList19, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(cashFileData21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0776");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        double double5 = sharesFileData4.getPrice52lo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0777");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ1();
        java.lang.String str4 = estimateFileData0.toString();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = estimateFileData0.getExchange();
        java.lang.String str7 = estimateFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str4, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = fieldData2.getEstimateData();
        double double4 = estimateFileData3.getEpsY0();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData3.getLatestQtrEps();
        org.junit.Assert.assertNotNull(estimateFileData3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(dateTime5);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0779");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = fieldDataQuarter5.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = fieldDataQuarter5.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = null;
        fieldDataQuarter5.fieldDataList = fieldDataList8;
        int int10 = fieldDataQuarter5.getQuarter();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0780");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        boolean boolean4 = fieldDataYear1.isInUse();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(fieldDataQuarter5);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0781");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        double[] doubleArray7 = balSheetFileData0.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0782");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        int int5 = fieldData2.getQuarter();
        int int6 = fieldData2.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        java.lang.String str8 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) -1, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0784");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum12 = companyFileData7.getExchange();
        companyFileData7.setCountry("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(exchEnum12);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0785");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getRdQtr();
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0786");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray11 = incSheetFileData5.getNetIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0787");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setFloatshr("");
        sharesFileData1.setInsiderSellShrs("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0788");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "Cash File Data", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "out/BigDB/" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray5, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0789");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getZip();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum13 = companyFileData7.getDowIndex();
        companyFileData7.setCity("Cash File Data");
        java.lang.String str16 = companyFileData7.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertNull(dowEnum13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0790");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str11 = companyFileData7.getStreet();
        boolean boolean12 = companyFileData7.isAdr();
        java.lang.String str13 = companyFileData7.getStreet();
        java.lang.String str14 = companyFileData7.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0791");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray9 = cashFileData8.getCashFromInvQtr();
        double[] doubleArray10 = cashFileData8.getCashFromInvQtr();
        java.lang.String str11 = cashFileData8.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0792");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray13 = incSheetFileData5.getEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        double[] doubleArray6 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray8 = balSheetFileData0.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0794");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        double[] doubleArray13 = incSheetFileData5.getIncPrimaryEpsQtr();
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getLtDebtYr();
        java.lang.String str7 = balSheetFileData0.getTicker();
        double[] doubleArray8 = balSheetFileData0.getLtDebtQtr();
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0796");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInstSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int14 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setBeta("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        long long17 = sharesFileData1.getVolumeMonth3m();
        int int18 = sharesFileData1.getInsiderSellShrs();
        int int19 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInsiderBuyShrs("");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0797");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderSellShrs("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        double[] doubleArray3 = sharesFileData0.getSharesQtr();
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str12 = companyFileData11.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum13 = companyFileData11.getSnpIndex();
        companyFileData11.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData11);
        sharesFileData0.setNameFields(companyFileData16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(snpEnum13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0798");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0799");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsYr();
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0800");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        int int7 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInstBuyShrs("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int10 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0801");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        double double18 = sharesFileData1.getBeta();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getBvpsYr();
        double[] doubleArray5 = balSheetFileData0.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray7 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray8 = balSheetFileData0.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0803");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str3 = cashFileData1.getTicker();
        double[] doubleArray4 = cashFileData1.getCashFromOpsQtr();
        double[] doubleArray5 = cashFileData1.getCapExQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0804");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData9);
        sharesFileData10.setInstOwnership("NONE");
        double[] doubleArray17 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData10.setSharesY(doubleArray17);
        int int19 = sharesFileData10.getInsiderSells();
        sharesFileData10.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray24 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData28 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        companyFileData29.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double33 = estimateFileData32.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData34);
        sharesFileData35.setInstOwnership("NONE");
        double[] doubleArray42 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData35.setSharesY(doubleArray42);
        java.lang.String str44 = sharesFileData35.getTicker();
        sharesFileData35.setFloatshr("NONE");
        sharesFileData35.setVolume3m("hi!");
        java.lang.String[] strArray51 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData54 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList52);
        double[] doubleArray55 = incSheetFileData54.getNonrecurringItemsQtr();
        double[] doubleArray56 = incSheetFileData54.getDividendYr();
        double[] doubleArray57 = incSheetFileData54.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray59 = balSheetFileData58.getOtherLtLiabYr();
        double[] doubleArray60 = balSheetFileData58.getCurrLiabYr();
        double[] doubleArray61 = balSheetFileData58.getAcctPayableQtr();
        double[] doubleArray62 = balSheetFileData58.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData63 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData29, estimateFileData32, sharesFileData35, incSheetFileData54, balSheetFileData58, cashFileData63, 100, (int) 'a');
        sharesFileData10.setNameFields(companyFileData29);
        companyFileData29.setWeb("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        incSheetFileData5.setNameFields(companyFileData29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(incSheetFileData27);
        org.junit.Assert.assertNotNull(estimateFileData28);
        org.junit.Assert.assertNotNull(companyFileData29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(incSheetFileData54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNull(doubleArray57);
        org.junit.Assert.assertNull(doubleArray59);
        org.junit.Assert.assertNull(doubleArray60);
        org.junit.Assert.assertNull(doubleArray61);
        org.junit.Assert.assertNull(doubleArray62);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0805");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsYr();
        double[] doubleArray10 = incSheetFileData5.getRdYr();
        double[] doubleArray11 = incSheetFileData5.getDividendQtr();
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        double[] doubleArray6 = balSheetFileData5.getEquityYr();
        double[] doubleArray7 = balSheetFileData5.getOtherLtAssetsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0807");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        sharesFileData1.setFloatshr("out/BigDB/");
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0808");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        java.lang.String[] strArray12 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) ' ', fieldDataList19);
        int int21 = fieldDataQuarter20.getQuarter();
        fieldDataYear1.set((int) (short) 1, fieldDataQuarter20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter24 = fieldDataYear1.getQ((int) (byte) 10);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNull(fieldDataQuarter24);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0809");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getIncTaxYr();
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
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0810");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getSector();
        companyFileData0.setAdr("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData0.setPhone("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0811");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0812");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray6 = balSheetFileData0.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0813");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        sharesFileData1.setInsiderBuys("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        double double22 = sharesFileData1.getBeta();
        double double23 = sharesFileData1.getPrice52lo();
        double double24 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0814");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0815");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getZip();
        companyFileData7.setZip("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList20 = companyFileData7.set((java.util.List<java.lang.String>) strList17);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0816");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        boolean boolean4 = fieldDataYear1.isInUse();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ((int) (byte) 100);
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(10);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getBvpsYr();
        double[] doubleArray9 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray10 = balSheetFileData0.getCurrAssetsQtr();
        double[] doubleArray11 = balSheetFileData0.getBvpsQtr();
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
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0818");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsYr();
        java.lang.String str13 = incSheetFileData5.toString();
        double[] doubleArray14 = incSheetFileData5.getEpsDilQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0819");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderBuys("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setDollar3m("52 Q100\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0820");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        sharesFileData1.setInstBuyShrs("");
        int int14 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0821");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setFloatshr("");
        sharesFileData1.setPrice("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setVolume3m("out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0822");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        java.lang.String str12 = incSheetFileData5.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray14 = incSheetFileData13.getEpsDilContYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0823");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.common.DateTime dateTime1 = estimateFileData0.getLatestQtrEps();
        org.junit.Assert.assertNull(dateTime1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0824");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getSnpIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0825");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        sharesFileData1.setSharesY(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData23);
        sharesFileData24.setInstOwnership("NONE");
        sharesFileData24.setFloatshr("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData29 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData29);
        sharesFileData30.setInstOwnership("NONE");
        double[] doubleArray37 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData30.setSharesY(doubleArray37);
        sharesFileData30.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData41);
        sharesFileData42.setInstOwnership("NONE");
        double[] doubleArray49 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData42.setSharesY(doubleArray49);
        sharesFileData30.setSharesY(doubleArray49);
        sharesFileData24.setSharesY(doubleArray49);
        sharesFileData1.setSharesQ(doubleArray49);
        sharesFileData1.setBeta("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0826");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0827");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(0, 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(52, (int) (byte) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0828");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        double[] doubleArray6 = balSheetFileData0.getAcctRxYr();
        java.lang.String str7 = balSheetFileData0.getSector();
        double[] doubleArray8 = balSheetFileData0.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0829");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getNetFixedAssetsYr();
        double[] doubleArray9 = balSheetFileData0.getNetFixedAssetsYr();
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0830");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpIncQtr();
        java.lang.String str9 = incSheetFileData5.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        double[] doubleArray5 = incSheetFileData4.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData4.getRdQtr();
        double[] doubleArray7 = incSheetFileData4.getIncTaxYr();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0832");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        double[] doubleArray6 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData0.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0833");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        double double18 = sharesFileData1.getMktCap();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0834");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        double double13 = sharesFileData1.getInstOwnership();
        double[] doubleArray14 = sharesFileData1.getSharesYr();
        java.lang.String str15 = sharesFileData1.getSector();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0835");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        java.lang.String str6 = fieldData2.getName();
        int int7 = fieldData2.getQuarter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0836");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        java.lang.String str7 = incSheetFileData5.toString();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getOtherLtAssetsQtr();
        double[] doubleArray8 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray9 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray10 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray11 = balSheetFileData0.getOtherCurrLiabYr();
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
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0838");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        sharesFileData12.setInstOwnership("NONE");
        double[] doubleArray19 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData12.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData23);
        sharesFileData24.setInstOwnership("NONE");
        double[] doubleArray31 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData24.setSharesY(doubleArray31);
        sharesFileData12.setSharesY(doubleArray31);
        sharesFileData1.setSharesQ(doubleArray31);
        double double35 = sharesFileData1.getPrice();
        sharesFileData1.setFromReport((int) (byte) 1, 100);
        sharesFileData1.setBeta("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        double double41 = sharesFileData1.getBeta();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0839");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray6 = balSheetFileData0.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0840");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray12 = incSheetFileData5.getIntExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0841");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str11 = incSheetFileData5.toDbOutput();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        double[] doubleArray13 = incSheetFileData5.getDividendYr();
        double[] doubleArray14 = incSheetFileData5.getEpsQtr();
        double[] doubleArray15 = incSheetFileData5.getIntExpQtr();
        java.lang.String str16 = incSheetFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0842");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getRdQtr();
        double[] doubleArray13 = incSheetFileData5.getGrossOpIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0843");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.toDbOuput();
        java.lang.String str61 = companyFileData20.getSector();
        java.lang.String str62 = companyFileData20.getStreet();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0844");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0845");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, 0);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        double[] doubleArray5 = balSheetFileData4.getOtherLtLiabYr();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0846");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData46 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData46);
        sharesFileData47.setInstOwnership("NONE");
        double[] doubleArray54 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData47.setSharesY(doubleArray54);
        sharesFileData13.setSharesY(doubleArray54);
        sharesFileData13.setInstShareholders("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0847");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0848");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        boolean boolean12 = companyFileData7.isAdr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0849");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getState();
        java.lang.String str13 = companyFileData7.getCity();
        java.lang.String str14 = companyFileData7.getState();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray3 = balSheetFileData0.getOtherLtAssetsYr();
        java.lang.String str4 = balSheetFileData0.getIndustry();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0851");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String str12 = companyFileData7.getIndustry();
        companyFileData7.setCountry("data/BigDB/");
        java.lang.String str15 = companyFileData7.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0852");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        java.lang.String str9 = companyFileData7.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData7.setState("NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setInsiderOwnership("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str13 = sharesFileData1.getTicker();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0854");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        java.lang.String str9 = incSheetFileData5.getName();
        java.lang.Class<?> wildcardClass10 = incSheetFileData5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0855");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        java.lang.String str12 = balSheetFileData0.getTicker();
        double[] doubleArray13 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray14 = balSheetFileData0.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0856");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilYr();
        java.lang.String str12 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0857");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData46 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData46);
        sharesFileData47.setInstOwnership("NONE");
        double[] doubleArray54 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData47.setSharesY(doubleArray54);
        sharesFileData13.setSharesY(doubleArray54);
        sharesFileData13.setFromReport((int) ' ', 97);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0858");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getRdQtr();
        double[] doubleArray11 = incSheetFileData5.getNetIncYr();
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0859");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int4 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInstOwnership("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = sharesFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0860");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0861");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0862");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setVolume10d("hi!");
        int int4 = sharesFileData0.getInsiderBuys();
        java.lang.String str5 = sharesFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0863");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0864");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.toDbOutput();
        java.lang.String str3 = cashFileData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0865");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getName();
        java.lang.String str13 = companyFileData7.getStreet();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0866");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0867");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray13 = incSheetFileData5.getNonrecurringItemsQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0868");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        double[] doubleArray7 = incSheetFileData6.getIncPrimaryEpsYr();
        java.lang.String str8 = incSheetFileData6.getName();
        double[] doubleArray9 = incSheetFileData6.getAdjToIncYr();
        double[] doubleArray10 = incSheetFileData6.getNonrecurringItemsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0869");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        companyFileData7.setTicker("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        java.lang.String str15 = companyFileData14.getSnpIndexStr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0870");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getState();
        java.lang.String str13 = companyFileData7.getSic();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0871");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getName();
        boolean boolean7 = fieldData2.isDataValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str6 = cashFileData5.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData5);
        double[] doubleArray8 = cashFileData7.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0873");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setPrice("NONE");
        java.lang.String str4 = sharesFileData1.getIndustry();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0874");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        double double22 = estimateFileData21.getEpsY0();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(estimateFileData21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0875");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        java.lang.String str8 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        int int10 = fieldData2.getYear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0877");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        sharesFileData12.setInstOwnership("NONE");
        double[] doubleArray19 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData12.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData23);
        sharesFileData24.setInstOwnership("NONE");
        double[] doubleArray31 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData24.setSharesY(doubleArray31);
        sharesFileData12.setSharesY(doubleArray31);
        sharesFileData1.setSharesQ(doubleArray31);
        double double35 = sharesFileData1.getPrice52lo();
        double double36 = sharesFileData1.getPrice52hi();
        double double37 = sharesFileData1.getInsiderNetPercentOutstanding();
        java.lang.Class<?> wildcardClass38 = sharesFileData1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0878");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.toDbOutput();
        double[] doubleArray8 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray9 = balSheetFileData0.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        sharesFileData1.setInsiderOwnership("out/BigDB/");
        sharesFileData1.setInsiderNetTrades("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str8 = sharesFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0880");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        sharesFileData1.setInsiderOwnership("out/BigDB/");
        double double6 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0881");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum46 = companyFileData7.getExchange();
        java.lang.String str47 = companyFileData7.getZip();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(exchEnum46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0882");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0883");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0884");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        companyFileData7.setTicker("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str14 = companyFileData7.getZip();
        java.lang.String str15 = companyFileData7.getCity();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(fieldDataQuarter9);
        org.junit.Assert.assertNull(fieldDataQuarter10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.toDbOuput();
        java.lang.String str61 = companyFileData20.getSector();
        companyFileData20.setDowIndex("");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0887");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray12 = incSheetFileData5.getEpsContQtr();
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0888");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getSalesYr();
        double[] doubleArray11 = incSheetFileData5.getRdYr();
        double[] doubleArray12 = incSheetFileData5.getDepreciationQtr();
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0889");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        int int7 = fieldData2.getYear();
        java.lang.String str8 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str8, "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0890");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getAdjToIncYr();
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        java.lang.String str5 = fieldData2.genOutput();
        int int6 = fieldData2.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShareData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(sharesFileData7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0892");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        boolean boolean5 = fieldData2.isDataValid();
        java.lang.String str6 = fieldData2.getIndustry();
        boolean boolean7 = fieldData2.isDataValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData0.getCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData0.getCashQtr();
        java.lang.String str6 = balSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0894");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        double double13 = sharesFileData1.getInstOwnership();
        sharesFileData1.setInstSellShrs("data/BigDB/");
        java.lang.String[] strArray18 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        java.lang.String str24 = companyFileData23.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum25 = companyFileData23.getExchange();
        sharesFileData1.setNameFields(companyFileData23);
        // The following exception was thrown during execution in test generation
        try {
            companyFileData23.setExchange("data/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.data/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(companyFileData23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(exchEnum25);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0895");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setDowIndex("hi!");
        companyFileData7.setCity("52 Q100\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0896");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getCountry();
        java.lang.String str2 = companyFileData0.getSic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0897");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        int int24 = sharesFileData23.getInstBuyShrs();
        sharesFileData23.setInsiderNetPercentOutstanding("out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(balSheetFileData21);
        org.junit.Assert.assertNotNull(estimateFileData22);
        org.junit.Assert.assertNotNull(sharesFileData23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0898");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0899");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        java.lang.String str20 = sharesFileData1.getIndustry();
        double double21 = sharesFileData1.getMktCap();
        int int22 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0900");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getStreet();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0901");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        companyFileData20.setCity("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0902");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getPhone();
        java.lang.String str13 = companyFileData7.getCity();
        java.lang.String str14 = companyFileData7.getStreet();
        companyFileData7.setNumEmployees("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str17 = companyFileData7.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0903");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getSector();
        java.lang.String str2 = companyFileData0.getName();
        companyFileData0.setSnpIndex("NONE");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum5 = companyFileData0.getDowIndex();
        java.lang.String str6 = companyFileData0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dowEnum5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0904");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        java.lang.String str6 = fieldData2.getName();
        fieldData2.setQuarter((int) ' ');
        java.lang.String str9 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        companyFileData10.setName("Cash File Data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        int int7 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInstBuyShrs("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setBeta("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        java.lang.String str12 = sharesFileData1.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0906");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNotNull(companyFileData22);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0907");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertNotNull(sharesFileData6);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0908");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setStreet("");
        java.lang.String str11 = companyFileData7.getCountry();
        companyFileData7.setTicker("");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum14 = companyFileData7.getDowIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dowEnum14);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0909");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getBvpsYr();
        double[] doubleArray9 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray10 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray11 = balSheetFileData0.getInventoryQtr();
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
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0910");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray13 = balSheetFileData0.getOtherCurrLiabYr();
        double[] doubleArray14 = balSheetFileData0.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0911");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        java.lang.String str13 = companyFileData12.getPhone();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0912");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0913");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY2();
        java.lang.String[] strArray4 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str10 = companyFileData9.getSnpIndexStr();
        estimateFileData0.setNameFields(companyFileData9);
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        int int20 = companyFileData19.getNumEmployees();
        companyFileData19.setCountry("hi!");
        int int23 = companyFileData19.getNumEmployees();
        java.lang.String[] strArray26 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList31 = companyFileData19.set((java.util.List<java.lang.String>) strList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList31);
        java.util.List<java.lang.String> strList34 = companyFileData9.set(strList31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(incSheetFileData29);
        org.junit.Assert.assertNotNull(estimateFileData30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(sharesFileData32);
        org.junit.Assert.assertNotNull(incSheetFileData33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(cashFileData35);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0914");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String str12 = companyFileData7.getIndustry();
        companyFileData7.setCountry("data/BigDB/");
        companyFileData7.setZip("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        double[] doubleArray17 = companyFileData7.getPriceQtr();
        java.lang.String str18 = companyFileData7.getSic();
        companyFileData7.setSnpIndex("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0915");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        java.lang.String str46 = companyFileData7.getCity();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0916");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 0, 10, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0917");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0918");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0919");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (byte) 10, 32, filetypeEnum2);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0920");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str11 = incSheetFileData5.toDbOutput();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        double[] doubleArray13 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0921");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData7.setExchange("out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      ?null                                    ?NONE                ?null                                    ?null??  null  null??  Est Q0 Q1    :      0.000      0.000??  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        double double13 = sharesFileData1.getPrice52lo();
        sharesFileData1.setInstSellShrs("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInsiderSellShrs("data/BigDB/");
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0923");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        java.lang.String[] strArray12 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) ' ', fieldDataList19);
        int int21 = fieldDataQuarter20.getQuarter();
        fieldDataYear1.set((int) (short) 1, fieldDataQuarter20);
        java.lang.String[] strArray28 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData33 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        int int34 = companyFileData33.getNumEmployees();
        companyFileData33.setCountry("hi!");
        int int37 = companyFileData33.getNumEmployees();
        java.lang.String[] strArray40 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData44 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList45 = companyFileData33.set((java.util.List<java.lang.String>) strList41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList45);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList45, 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(1, (-1), fieldDataList49);
        int int51 = fieldDataQuarter50.getQuarter();
        fieldDataYear1.set(0, fieldDataQuarter50);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNotNull(estimateFileData32);
        org.junit.Assert.assertNotNull(companyFileData33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(incSheetFileData43);
        org.junit.Assert.assertNotNull(estimateFileData44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(sharesFileData46);
        org.junit.Assert.assertNotNull(fieldDataList49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0924");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setFloatshr("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInsiderBuyShrs("Cash File Data");
        sharesFileData1.setFloatshr("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        int int17 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0925");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0926");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        java.lang.String str6 = fieldData2.getName();
        fieldData2.setQuarter((int) ' ');
        fieldData2.setQuarter((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0927");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray13 = incSheetFileData5.getPreTaxIncYr();
        java.lang.String str14 = incSheetFileData5.getSector();
        double[] doubleArray15 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0928");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0929");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0930");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toDbOutput();
        double[] doubleArray7 = balSheetFileData0.getInventoryYr();
        double[] doubleArray8 = balSheetFileData0.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0931");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray12 = incSheetFileData5.getGrossIncQtr();
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
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0932");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        java.lang.String str2 = balSheetFileData0.getTicker();
        double[] doubleArray3 = balSheetFileData0.getLtDebtYr();
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str12 = companyFileData11.getDowIndexStr();
        java.lang.String str13 = companyFileData11.getCity();
        boolean boolean14 = companyFileData11.isAdr();
        java.lang.String str15 = companyFileData11.getWeb();
        companyFileData11.setTicker("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData11);
        balSheetFileData0.setNameFields(companyFileData11);
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0933");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderSells();
        sharesFileData1.setVolume3m("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0935");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0936");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0937");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        boolean boolean5 = fieldData2.isDataValid();
        java.lang.String str6 = fieldData2.getIndustry();
        int int7 = fieldData2.getQuarter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0938");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setNumEmployees("NONE");
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setWeb("52 Q100\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0939");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = incSheetFileData5.getExchange();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
        double[] doubleArray12 = incSheetFileData5.getEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        sharesFileData1.setFloatshr("out/BigDB/");
        sharesFileData1.setMktCap("");
        double double8 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setVolume3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int20 = sharesFileData1.getInsiderBuys();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0942");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getIncPrimaryEpsYr();
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0944");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsYr();
        double[] doubleArray10 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray11 = incSheetFileData5.getRdQtr();
        double[] doubleArray12 = incSheetFileData5.getGrossOpIncYr();
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        estimateFileData0.setNameFields(companyFileData13);
        companyFileData13.setIndustry("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum17 = companyFileData13.getSnpIndex();
        companyFileData13.setCountry("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        companyFileData13.setWeb("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(snpEnum17);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0946");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        java.lang.String str61 = companyFileData20.getTicker();
        companyFileData20.setWeb("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str64 = companyFileData20.getStreet();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0948");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        java.lang.String str4 = balSheetFileData0.getName();
        double[] doubleArray5 = balSheetFileData0.getLtInvestQtr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        double double13 = sharesFileData1.getInstOwnership();
        sharesFileData1.setInstSellShrs("data/BigDB/");
        int int16 = sharesFileData1.getInsiderBuys();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0950");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray12 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray13 = incSheetFileData5.getDividendYr();
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0951");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = fieldDataQuarter10.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = fieldDataQuarter10.fieldDataList;
        fieldDataYear1.set((int) (byte) 1, fieldDataQuarter10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList19);
        int int21 = fieldDataQuarter20.getYear();
        fieldDataYear1.set(100, fieldDataQuarter20);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0952");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList19);
        double[] doubleArray22 = incSheetFileData21.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0953");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0954");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        double[] doubleArray7 = incSheetFileData6.getIncPrimaryEpsYr();
        double[] doubleArray8 = incSheetFileData6.getNetIncYr();
        double[] doubleArray9 = incSheetFileData6.getTotalOpExpYr();
        java.lang.String str10 = incSheetFileData6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0955");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toDbOutput();
        double[] doubleArray7 = balSheetFileData0.getLtInvestQtr();
        double[] doubleArray8 = balSheetFileData0.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0956");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderSells();
        int int5 = sharesFileData1.getInsiderBuys();
        double double6 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0957");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE", "out/BigDB/", "out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE", "out/BigDB/" };
        java.lang.String[] strArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray4, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0958");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        java.lang.String str20 = sharesFileData1.getIndustry();
        double double21 = sharesFileData1.getMktCap();
        double double22 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0959");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getZip();
        companyFileData7.setPhone("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData7.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0960");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        double[] doubleArray21 = balSheetFileData20.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData20);
        java.lang.String str23 = balSheetFileData20.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(balSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0961");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData7.getCountry();
        java.lang.String str16 = companyFileData7.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0962");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData7.getPhone();
        companyFileData7.setSic("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0963");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setNumEmployees("NONE");
        companyFileData7.setIndustry("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum15 = companyFileData7.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum16 = companyFileData7.getDowIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + snpEnum15 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE + "'", snpEnum15.equals(net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE));
        org.junit.Assert.assertNull(dowEnum16);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0965");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = cashFileData7.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0966");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setDollar3m("");
        sharesFileData0.setInsiderBuys("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int5 = sharesFileData0.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData6);
        sharesFileData7.setInstOwnership("NONE");
        double[] doubleArray14 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData7.setSharesY(doubleArray14);
        java.lang.String str16 = sharesFileData7.getTicker();
        sharesFileData7.setFloatshr("NONE");
        double double19 = sharesFileData7.getInstOwnership();
        double[] doubleArray20 = sharesFileData7.getSharesYr();
        sharesFileData0.setSharesQ(doubleArray20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0967");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getBvpsQtr();
        java.lang.String[] strArray7 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        java.lang.String str13 = companyFileData12.getDowIndexStr();
        java.lang.String str14 = companyFileData12.getTicker();
        companyFileData12.setCity("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        balSheetFileData0.setNameFields(companyFileData12);
        java.lang.String str18 = balSheetFileData0.toString();
        double[] doubleArray19 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0968");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        companyFileData7.setTicker("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData7.setZip("Cash File Data");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0969");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        boolean boolean12 = companyFileData7.isAdr();
        java.lang.String str13 = companyFileData7.getPhone();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0970");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getInventoryQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String str5 = balSheetFileData0.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0971");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.DateTime dateTime9 = estimateFileData8.getLatestQtrEps();
        java.lang.String str10 = estimateFileData8.getName();
        double double11 = estimateFileData8.getEpsY0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNull(dateTime9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0972");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1." };
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getLtDebtYr();
        double[] doubleArray6 = balSheetFileData0.getLiabEquityQtr();
        double[] doubleArray7 = balSheetFileData0.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0974");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(balSheetFileData10);
        org.junit.Assert.assertNotNull(incSheetFileData11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0975");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        int int7 = fieldData2.getYear();
        java.lang.String str8 = fieldData2.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = fieldData2.getEstimateData();
        java.lang.String str10 = fieldData2.genOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str10, "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0976");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getLtDebtYr();
        double[] doubleArray7 = balSheetFileData0.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0977");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getAdjToIncYr();
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        java.lang.String str21 = companyFileData20.getDowIndexStr();
        companyFileData20.setZip("data/BigDB/");
        java.lang.String str24 = companyFileData20.getName();
        java.lang.String str25 = companyFileData20.getPhone();
        incSheetFileData5.setNameFields(companyFileData20);
        java.lang.String str27 = incSheetFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0978");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        int int6 = fieldData2.getQuarter();
        java.lang.String str7 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInsiderBuys("NONE");
        sharesFileData1.setFloatshr("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        int int17 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0980");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getSalesYr();
        double[] doubleArray11 = incSheetFileData5.getRdYr();
        double[] doubleArray12 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray13 = incSheetFileData5.getDividendQtr();
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0981");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", 0, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0982");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        int int13 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0983");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getSalesYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        double double10 = sharesFileData1.getMktCap();
        double[] doubleArray11 = null;
        sharesFileData1.setSharesQ(doubleArray11);
        sharesFileData1.setInsiderSells("out/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0985");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setSnpIndex("NONE");
        java.lang.String str10 = companyFileData7.getStreet();
        java.lang.String str11 = companyFileData7.getName();
        companyFileData7.setState("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0986");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        companyFileData7.setStreet("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str14 = companyFileData7.getCountry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0987");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        companyFileData20.setSnpIndex("");
        companyFileData20.setName("Cash File Data");
        companyFileData20.setPhone("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0988");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray9 = incSheetFileData5.getIncTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        boolean boolean5 = fieldDataYear1.quarterDataAvailable(1);
        boolean boolean7 = fieldDataYear1.quarterDataAvailable((int) (short) 1);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0990");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray4 = balSheetFileData0.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0991");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        java.lang.String str10 = companyFileData7.getCity();
        companyFileData7.setTicker("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setIndustry("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        java.lang.String str5 = fieldData2.getSector();
        boolean boolean6 = fieldData2.isDataValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        java.lang.String str7 = balSheetFileData0.toString();
        double[] doubleArray8 = balSheetFileData0.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0994");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
        double[] doubleArray12 = incSheetFileData5.getOtherIncQtr();
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0995");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/", "out/BigDB/" };
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0996");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getOtherLtAssetsQtr();
        double[] doubleArray8 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray9 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray10 = balSheetFileData0.getCashQtr();
        double[] doubleArray11 = balSheetFileData0.getLtInvestQtr();
        double[] doubleArray12 = balSheetFileData0.getLiabEquityYr();
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
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0997");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str12 = companyFileData7.getStreet();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0998");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        companyFileData16.setExchange("NONE");
        companyFileData16.setWeb("NONE");
        java.lang.String str23 = companyFileData16.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test0999");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        java.lang.String str10 = companyFileData7.getPhone();
        java.lang.String str11 = companyFileData7.getCity();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests1.test1000");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
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
}

