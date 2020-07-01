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
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setSic("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str12 = companyFileData7.getWeb();
        companyFileData7.setDowIndex("out/BigDB/10/Q6/out/BigDB/-fundamental-data-10Q6.out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1002");
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
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum20 = incSheetFileData5.getExchange();
        java.lang.String str21 = incSheetFileData5.getIndustry();
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
        org.junit.Assert.assertNull(exchEnum20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1003");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray5 = balSheetFileData0.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1005");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        java.lang.String str6 = fieldData2.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShareData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(sharesFileData7);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray3 = balSheetFileData0.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1008");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1009");
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
        sharesFileData1.setInstSellShrs("out/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1010");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String str12 = companyFileData7.getPhone();
        companyFileData7.setNumEmployees("out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1011");
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
        double[] doubleArray22 = balSheetFileData21.getOtherCurrLiabYr();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1012");
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
        fieldData58.setQuarter((int) (byte) 10);
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
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1014");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = companyFileData7.getExchange();
        java.lang.String str10 = companyFileData7.getStreet();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1015");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray5 = balSheetFileData0.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ2();
        int int10 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter11 = fieldDataYear1.getQ1();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(fieldDataQuarter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(fieldDataQuarter11);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        sharesFileData1.setInsiderOwnership("out/BigDB/");
        double[] doubleArray6 = sharesFileData1.getSharesYr();
        double double7 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1018");
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
        double[] doubleArray19 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData0.getOtherCurrLiabQtr();
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1019");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
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
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1020");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray9 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncQtr();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1021");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsQtr();
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherCurrLiabQtr();
        java.lang.String str5 = balSheetFileData0.getExchange();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1023");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str9 = incSheetFileData5.getTicker();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1024");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getOtherIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.getIndustry();
        java.lang.String str8 = balSheetFileData0.getExchange();
        double[] doubleArray9 = balSheetFileData0.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = fieldData2.getEstimateData();
        java.lang.String str4 = estimateFileData3.getTicker();
        java.lang.String str5 = estimateFileData3.toDbOutput();
        org.junit.Assert.assertNotNull(estimateFileData3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherCurrLiabQtr();
        java.lang.String str5 = balSheetFileData0.getExchange();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        double[] doubleArray12 = incSheetFileData11.getEpsYr();
        double[] doubleArray13 = incSheetFileData11.getDepreciationYr();
        double[] doubleArray14 = incSheetFileData11.getCogsQtr();
        java.lang.String[] strArray17 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str23 = companyFileData22.getDowIndexStr();
        incSheetFileData11.setNameFields(companyFileData22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData22);
        balSheetFileData0.setNameFields(companyFileData22);
        java.lang.String str27 = companyFileData22.getPhone();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNotNull(estimateFileData21);
        org.junit.Assert.assertNotNull(companyFileData22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        java.lang.String str6 = fieldData2.getSector();
        int int7 = fieldData2.getYear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        java.lang.String str3 = estimateFileData0.getName();
        java.lang.String str4 = estimateFileData0.toString();
        java.lang.String str5 = estimateFileData0.getSector();
        double double6 = estimateFileData0.getEpsQ0();
        java.lang.String[] strArray9 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        int int15 = companyFileData14.getNumEmployees();
        companyFileData14.setStreet("");
        java.lang.String str18 = companyFileData14.getCountry();
        companyFileData14.setTicker("");
        estimateFileData0.setNameFields(companyFileData14);
        net.ajaskey.common.DateTime dateTime22 = estimateFileData0.getCurrFiscalYear();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str4, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(incSheetFileData12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dateTime22);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1030");
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
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum35 = companyFileData9.getDowIndex();
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
        org.junit.Assert.assertNull(dowEnum35);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1031");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.getExchange();
        double[] doubleArray8 = balSheetFileData0.getStDebtYr();
        double[] doubleArray9 = balSheetFileData0.getCashQtr();
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1032");
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
        java.lang.String str15 = companyFileData13.getName();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1033");
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
        double[] doubleArray16 = companyFileData7.getPriceQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str6 = cashFileData5.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData5);
        double[] doubleArray8 = cashFileData5.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests2.test1035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setFloatshr("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInsiderBuyShrs("Cash File Data");
        sharesFileData1.setFloatshr("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        int int17 = sharesFileData1.getInsiderNetTrades();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }
}

