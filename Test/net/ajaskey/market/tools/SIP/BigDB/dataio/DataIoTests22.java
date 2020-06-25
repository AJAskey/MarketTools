package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11001");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIntExpYr();
        double[] doubleArray9 = incSheetFileData5.getTotalOpExpQtr();
        double[] doubleArray10 = incSheetFileData5.getRdYr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray12 = incSheetFileData5.getGrossOpExpYr();
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
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11002");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getCogsYr();
        double[] doubleArray9 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray10 = incSheetFileData5.getIncTaxQtr();
        java.lang.String str11 = incSheetFileData5.getTicker();
        double[] doubleArray12 = incSheetFileData5.getSalesQtr();
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
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        double double5 = estimateFileData1.getEpsQ1();
        double double6 = estimateFileData1.getEpsQ1();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        double double8 = fieldData2.getPrice();
        double[] doubleArray9 = fieldData2.getDividendQtr();
        double[] doubleArray10 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11005");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuys("");
        long long5 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/");
        double double8 = sharesFileData0.getDollar3m();
        java.lang.String str9 = sharesFileData0.getIndustry();
        int int10 = sharesFileData0.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray14 = fieldData13.getCogsYr();
        double[] doubleArray15 = fieldData13.getGrossIncQtr();
        double double16 = fieldData13.getEpsY1();
        double double17 = fieldData13.getEpsQ1();
        double[] doubleArray18 = fieldData13.getGoodwillQtr();
        double[] doubleArray19 = fieldData13.getEpsDilContQtr();
        double[] doubleArray20 = fieldData13.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = fieldData13.getShares();
        java.lang.String str22 = sharesFileData21.toString();
        double[] doubleArray23 = sharesFileData21.getSharesY();
        sharesFileData0.setSharesQ(doubleArray23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(sharesFileData21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11006");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNotNull(sharesFileData13);
        org.junit.Assert.assertNotNull(cashFileData14);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11007");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getSalesQtr();
        double[] doubleArray8 = incSheetFileData5.getIncAfterTaxYr();
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
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11008");
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
        double[] doubleArray38 = incSheetFileData20.getIntExpYr();
        double[] doubleArray39 = incSheetFileData20.getIntExpNonOpQtr();
        double[] doubleArray40 = incSheetFileData20.getIncAfterTaxQtr();
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
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getOtherLtLiabYr();
        java.lang.String str10 = balSheetFileData1.getIndustry();
        double[] doubleArray11 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray12 = balSheetFileData1.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData2.getLtInvestQtr();
        double[] doubleArray8 = balSheetFileData2.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isDrp();
        java.lang.String str4 = companyFileData0.getTicker();
        java.lang.String str5 = companyFileData0.getSector();
        java.lang.String str6 = companyFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11012");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncYr();
        java.lang.String str9 = incSheetFileData5.getTicker();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11013");
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
        double double38 = sharesFileData14.getFloatshr();
        sharesFileData14.setInsiderBuyShrs("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum41 = sharesFileData14.getExchange();
        sharesFileData14.setInsiderSellShrs("out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        int int44 = sharesFileData14.getInsiderBuyShrs();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(exchEnum41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        java.lang.String str3 = companyFileData0.getCountry();
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        double double16 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = null;
        estimateFileData15.setNameFields(companyFileData17);
        java.lang.String str19 = estimateFileData15.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int21 = sharesFileData20.getInstShareholders();
        double double22 = sharesFileData20.getInsiderNetPercentOutstanding();
        java.lang.String str23 = sharesFileData20.toDbOutput();
        sharesFileData20.setInstBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int27 = sharesFileData26.getInstSellShrs();
        sharesFileData26.setInsiderSells("hi!");
        double double30 = sharesFileData26.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int32 = sharesFileData31.getInstShareholders();
        double double33 = sharesFileData31.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData34.setFromReport((int) (byte) 0, 0);
        double[] doubleArray38 = sharesFileData34.getSharesQ();
        sharesFileData31.setSharesQ(doubleArray38);
        sharesFileData26.setSharesQ(doubleArray38);
        sharesFileData20.setSharesQ(doubleArray38);
        sharesFileData20.setBeta("");
        java.lang.String str44 = sharesFileData20.getName();
        sharesFileData20.setInsiderNetTrades("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        sharesFileData20.setInsiderBuys("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData54 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList52);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData55 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList52);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData56 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList52);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData57 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList52);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData58 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList52);
        double[] doubleArray59 = incSheetFileData58.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray63 = fieldData62.getCogsYr();
        int int64 = fieldData62.getNumEmployees();
        double double65 = fieldData62.getPrice52hi();
        double[] doubleArray66 = fieldData62.getPreTaxIncYr();
        double double67 = fieldData62.getFloatshr();
        double[] doubleArray68 = fieldData62.getCogsYr();
        double[] doubleArray69 = fieldData62.getPreTaxIncYr();
        double[] doubleArray70 = fieldData62.getRdQtr();
        double[] doubleArray71 = fieldData62.getOtherCurrLiabYr();
        double[] doubleArray72 = fieldData62.getRdQtr();
        double[] doubleArray73 = fieldData62.getOtherIncYr();
        double[] doubleArray74 = fieldData62.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData75 = fieldData62.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray79 = fieldData78.getCogsYr();
        double[] doubleArray80 = fieldData78.getIntExpYr();
        double[] doubleArray81 = fieldData78.getLtDebtQtr();
        double[] doubleArray82 = fieldData78.getGoodwillYr();
        double double83 = fieldData78.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData84 = fieldData78.getCashData();
        java.lang.String str85 = cashFileData84.toDbOutput();
        double[] doubleArray86 = cashFileData84.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData15, sharesFileData20, incSheetFileData58, balSheetFileData75, cashFileData84, 6, 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData90 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean91 = companyFileData90.isAdr();
        companyFileData90.setPhone("out/BigDB/");
        companyFileData90.setPhone("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str96 = companyFileData90.getSnpIndexStr();
        estimateFileData15.setNameFields(companyFileData90);
        java.lang.String str98 = companyFileData90.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(cashFileData13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str23, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(incSheetFileData54);
        org.junit.Assert.assertNotNull(companyFileData55);
        org.junit.Assert.assertNotNull(estimateFileData56);
        org.junit.Assert.assertNotNull(cashFileData57);
        org.junit.Assert.assertNotNull(incSheetFileData58);
        org.junit.Assert.assertNull(doubleArray59);
        org.junit.Assert.assertNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNull(doubleArray68);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNotNull(balSheetFileData75);
        org.junit.Assert.assertNull(doubleArray79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertNull(doubleArray82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11015");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        double[] doubleArray7 = fieldData2.getOtherIncQtr();
        java.lang.String str8 = fieldData2.getStreet();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        double double10 = fieldData2.getBeta();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData8);
        int int10 = sharesFileData8.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean12 = companyFileData11.isAdr();
        java.lang.String str13 = companyFileData11.getDowIndexStr();
        companyFileData11.setName("");
        java.lang.String str16 = companyFileData11.getIndustry();
        java.lang.String str17 = companyFileData11.getTicker();
        sharesFileData8.setNameFields(companyFileData11);
        int int19 = companyFileData11.getNumEmployees();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum7 = fieldData2.getSnpIndex();
        double[] doubleArray8 = fieldData2.getOtherIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = fieldData2.getEstimateData();
        net.ajaskey.common.DateTime dateTime10 = estimateFileData9.getCurrFiscalYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(snpEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNull(dateTime10);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11018");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11020");
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
        double[] doubleArray13 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray14 = fieldData2.getCurrLiabYr();
        java.lang.String str15 = fieldData2.getSnpIndexStr();
        double[] doubleArray16 = fieldData2.getNetIncYr();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11021");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getInventoryYr();
        double[] doubleArray2 = balSheetFileData0.getInventoryQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData0.getCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData0.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getCashYr();
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        java.lang.String str10 = fieldData2.getWeb();
        double[] doubleArray11 = fieldData2.getPreTaxIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum12 = fieldData2.getDowIndex();
        double[] doubleArray13 = fieldData2.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(dowEnum12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11023");
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
        double[] doubleArray84 = balSheetFileData67.getCurrLiabQtr();
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
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData2.getTotalLiabQtr();
        double[] doubleArray8 = balSheetFileData2.getCurrAssetsQtr();
        double[] doubleArray9 = balSheetFileData2.getTotalAssetsYr();
        java.lang.String str10 = balSheetFileData2.getIndustry();
        double[] doubleArray11 = balSheetFileData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIntExpNonOpYr();
        java.lang.String str2 = incSheetFileData0.getName();
        double[] doubleArray3 = incSheetFileData0.getGrossOpExpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrAssetsQtr();
        java.lang.String str7 = balSheetFileData2.toString();
        double[] doubleArray8 = balSheetFileData2.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("Cash File Data");
        java.lang.String str5 = companyFileData0.getCountry();
        java.lang.String str6 = companyFileData0.getName();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getTicker();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11028");
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
        double[] doubleArray37 = fieldData35.getOtherLtLiabYr();
        double[] doubleArray38 = fieldData35.getCashFromInv();
        double[] doubleArray39 = fieldData35.getIntExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = fieldData35.getBalSheetData();
        double[] doubleArray41 = balSheetFileData40.getBvpsYr();
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
        org.junit.Assert.assertNotNull(balSheetFileData40);
        org.junit.Assert.assertNull(doubleArray41);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11029");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray12 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray13 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray14 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray15 = incSheetFileData5.getTotalOpExpQtr();
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
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = companyFileData0.getExchange();
        java.lang.String str8 = companyFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11031");
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
        boolean boolean12 = fieldData2.isAdr();
        double[] doubleArray13 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11032");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData10.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getAdjToIncYr();
        double[] doubleArray9 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray10 = fieldData2.getEpsDilContYr();
        double[] doubleArray11 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray12 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray13 = fieldData2.getPreTaxIncQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        int int9 = sharesFileData8.getInstSellShrs();
        sharesFileData8.setInstShareholders("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData12.setFromReport((int) (short) 1, 0);
        sharesFileData12.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum18 = sharesFileData12.getExchange();
        java.lang.String str19 = sharesFileData12.getName();
        int int20 = sharesFileData12.getInstShareholders();
        double double21 = sharesFileData12.getBeta();
        int int22 = sharesFileData12.getInsiderSellShrs();
        double[] doubleArray23 = sharesFileData12.getSharesY();
        sharesFileData8.setSharesQ(doubleArray23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(exchEnum18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = sharesFileData0.getExchange();
        sharesFileData0.setFromReport((int) (byte) 10, 100);
        sharesFileData0.setInstOwnership("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum18 = sharesFileData17.getExchange();
        sharesFileData17.setInstOwnership("out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertNull(exchEnum18);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11037");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getUnusualIncYr();
        double[] doubleArray9 = fieldData2.getSalesYr();
        double[] doubleArray10 = fieldData2.getLtDebtYr();
        java.lang.String str11 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum12 = fieldData2.getSnpIndex();
        double[] doubleArray13 = fieldData2.getPrefStockQtr();
        double[] doubleArray14 = fieldData2.getSalesQtr();
        double[] doubleArray15 = fieldData2.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(snpEnum12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11038");
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
        double[] doubleArray52 = fieldData47.getEpsDilContQtr();
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
        org.junit.Assert.assertNull(doubleArray52);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double double4 = fieldData2.getPrice();
        double[] doubleArray5 = fieldData2.getStDebtYr();
        double[] doubleArray6 = fieldData2.getGrossOpExpQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11040");
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
        double[] doubleArray13 = fieldData2.getBvpsQtr();
        double double14 = fieldData2.getInsiderOwnership();
        double[] doubleArray15 = fieldData2.getGrossOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = fieldData2.getIncSheetData();
        double[] doubleArray17 = fieldData2.getCapEx();
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
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setDowIndex("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData4);
        java.lang.String str13 = companyFileData12.getSector();
        java.lang.String str14 = companyFileData12.getPhone();
        companyFileData12.setWeb("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
        java.lang.String str17 = companyFileData12.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str13, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11042");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getCogsYr();
        java.lang.String str10 = fieldData2.getSic();
        double[] doubleArray11 = fieldData2.getStInvestQtr();
        double[] doubleArray12 = fieldData2.getLiabEquityYr();
        double double13 = fieldData2.getDollar3m();
        double[] doubleArray14 = fieldData2.getIncPrimaryEpsQtr();
        double[] doubleArray15 = fieldData2.getPrefStockYr();
        int int16 = fieldData2.getInstShareholders();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11044");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getSalesQtr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11045");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = fieldData2.getCashData();
        double[] doubleArray16 = cashFileData15.getCapExQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData15);
        double[] doubleArray18 = cashFileData15.getCashFromInvQtr();
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
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("");
        companyFileData0.setDowIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str10 = companyFileData0.getPhone();
        companyFileData0.setState("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setDowIndex("out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setCountry("ticker      : \r\n  name      : NONE\r\n  exchange  : null\r\n  sector    : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  industry  : null\r\n  sic       : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : out/BigDB/\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str10, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str6 = companyFileData0.getStreet();
        java.lang.String str7 = companyFileData0.getSector();
        companyFileData0.setWeb("out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str10 = companyFileData0.getState();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 0);
        double[] doubleArray3 = fieldData2.getCogsQtr();
        double[] doubleArray4 = fieldData2.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11049");
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
        double[] doubleArray13 = fieldData2.getStDebtYr();
        double[] doubleArray14 = fieldData2.getCogsYr();
        double[] doubleArray15 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray16 = fieldData2.getCogsQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11051");
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
        double double12 = fieldData2.getBeta();
        double[] doubleArray13 = fieldData2.getIncAfterTaxYr();
        java.lang.String str14 = fieldData2.getState();
        double[] doubleArray15 = fieldData2.getGoodwillYr();
        fieldData2.setYear((int) (short) 100);
        double[] doubleArray18 = fieldData2.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, (int) (byte) 1);
        double[] doubleArray3 = fieldData2.getLtInvestYr();
        double[] doubleArray4 = fieldData2.getGoodwillQtr();
        double[] doubleArray5 = fieldData2.getOtherIncQtr();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        double[] doubleArray7 = fieldData2.getCashFromInv();
        double[] doubleArray8 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray9 = fieldData2.getGrossIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11053");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/0/Q-1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11055");
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
        double[] doubleArray15 = fieldData2.getCurrLiabYr();
        double[] doubleArray16 = fieldData2.getIntExpQtr();
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
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray3 = incSheetFileData1.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getRdYr();
        double[] doubleArray8 = fieldData2.getEpsQtr();
        double double9 = fieldData2.getEpsQ1();
        double[] doubleArray10 = fieldData2.getCurrLiabQtr();
        fieldData2.setYear(6);
        double[] doubleArray13 = fieldData2.getCogsQtr();
        double[] doubleArray14 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11058");
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
        double[] doubleArray14 = fieldData2.getIncAfterTaxQtr();
        double double15 = fieldData2.getInsiderNetPercentOutstanding();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11059");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpQtr();
        java.lang.String str9 = incSheetFileData5.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11060");
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
        sharesFileData0.setVolume10d("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        int int26 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11061");
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
        double[] doubleArray13 = fieldData2.getBvpsQtr();
        double[] doubleArray14 = fieldData2.getNetIncYr();
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
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        java.lang.String str4 = fieldData2.getIndustry();
        java.lang.String str5 = fieldData2.getTicker();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = sharesFileData7.getSharesY();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = sharesFileData7.getExchange();
        double[] doubleArray10 = sharesFileData7.getSharesQ();
        double[] doubleArray11 = null;
        sharesFileData7.setSharesY(doubleArray11);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        double[] doubleArray6 = fieldData2.getOtherIncQtr();
        double[] doubleArray7 = fieldData2.getIncTaxYr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        double[] doubleArray7 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray9 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray10 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray11 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray12 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray15 = balSheetFileData1.getInventoryQtr();
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
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int3 = companyFileData0.getNumEmployees();
        int int4 = companyFileData0.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray8 = fieldData7.getCogsYr();
        int int9 = fieldData7.getNumEmployees();
        double double10 = fieldData7.getPrice52hi();
        double[] doubleArray11 = fieldData7.getPreTaxIncYr();
        double double12 = fieldData7.getFloatshr();
        double[] doubleArray13 = fieldData7.getCogsYr();
        double[] doubleArray14 = fieldData7.getPreTaxIncYr();
        double[] doubleArray15 = fieldData7.getDepreciationYr();
        double[] doubleArray16 = fieldData7.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = fieldData7.getEstimateData();
        double double18 = estimateFileData17.getEpsY2();
        java.lang.String str19 = estimateFileData17.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData20.setFromReport((int) (short) 1, 0);
        sharesFileData20.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum26 = sharesFileData20.getExchange();
        java.lang.String str27 = sharesFileData20.getName();
        long long28 = sharesFileData20.getVolumeMonth3m();
        sharesFileData20.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum31 = sharesFileData20.getExchange();
        sharesFileData20.setFromReport((int) (byte) 10, 100);
        sharesFileData20.setInstOwnership("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray43 = incSheetFileData42.getIncAfterTaxYr();
        double[] doubleArray44 = incSheetFileData42.getOtherIncYr();
        double[] doubleArray45 = incSheetFileData42.getSalesQtr();
        double[] doubleArray46 = incSheetFileData42.getUnusualIncQtr();
        double[] doubleArray47 = incSheetFileData42.getEpsDilContQtr();
        double[] doubleArray48 = incSheetFileData42.getEpsDilQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray52 = fieldData51.getCogsYr();
        double[] doubleArray53 = fieldData51.getGrossIncQtr();
        double double54 = fieldData51.getEpsY1();
        double[] doubleArray55 = fieldData51.getDividendYr();
        double[] doubleArray56 = fieldData51.getAcctPayableYr();
        double[] doubleArray57 = fieldData51.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData58 = fieldData51.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData59 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData58);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray63 = fieldData62.getCogsYr();
        int int64 = fieldData62.getNumEmployees();
        double[] doubleArray65 = fieldData62.getAdjToIncQtr();
        double[] doubleArray66 = fieldData62.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData67 = fieldData62.getCashData();
        java.lang.String str68 = cashFileData67.toString();
        java.lang.String str69 = cashFileData67.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData67);
        double[] doubleArray71 = cashFileData70.getCashFromFinQtr();
        double[] doubleArray72 = cashFileData70.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData17, sharesFileData20, incSheetFileData42, balSheetFileData58, cashFileData70, (int) (short) 100, (int) 'a');
        double[] doubleArray76 = fieldData75.getEpsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData77 = fieldData75.getIncSheetData();
        java.lang.String str78 = incSheetFileData77.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(exchEnum26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(exchEnum31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(incSheetFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNull(doubleArray57);
        org.junit.Assert.assertNotNull(balSheetFileData58);
        org.junit.Assert.assertNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertNotNull(cashFileData67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cash File Data" + "'", str68, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNotNull(incSheetFileData77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11066");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str9 = companyFileData8.getCountry();
        companyFileData8.setStreet("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        companyFileData8.setIndustry("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        companyFileData8.setTicker("out/BigDB/35/Q100/out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!-fundamental-data-35Q100.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str16 = companyFileData8.getCountry();
        java.lang.String str17 = companyFileData8.getZip();
        java.lang.String str18 = companyFileData8.getSic();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        sharesFileData0.setFromReport((int) (short) 0, (int) (short) 10);
        sharesFileData0.setPrice("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        int int16 = sharesFileData0.getInsiderSells();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11068");
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
        sharesFileData0.setInsiderNetTrades("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double27 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInsiderSells("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getEpsDilYr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        int int8 = fieldData2.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum9 = fieldData2.getDowIndex();
        double[] doubleArray10 = fieldData2.getCapEx();
        double[] doubleArray11 = fieldData2.getRdYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dowEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = balSheetFileData9.getCashQtr();
        double[] doubleArray11 = balSheetFileData9.getStInvestYr();
        double[] doubleArray12 = balSheetFileData9.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11071");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getCogsYr();
        double[] doubleArray9 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray11 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxQtr();
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
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("Cash File Data");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("out/BigDB/10/Q6/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-10Q6.out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/10/Q6/ticker      : ??  name      : null??  exchange  : null??  sector    : null??  industry  : null??  sic       : null??  employees : 0??  snp index : ??  dow index : NONE??  adr       : false??  drp       : false??  street    : null??  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!??  state     : null??  country   : null??  zip       : null??  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!??  web       : null??-fundamental-data-10Q6.out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11073");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getCurrLiabQtr();
        double[] doubleArray8 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray9 = balSheetFileData6.getInventoryQtr();
        double[] doubleArray10 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getCurrAssetsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        double[] doubleArray5 = fieldData2.getLiabEquityQtr();
        double[] doubleArray6 = fieldData2.getOtherLtLiabYr();
        double double7 = fieldData2.getBeta();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11075");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/0/Q6/out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-0Q6.out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11076");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray11 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray12 = incSheetFileData5.getIntExpQtr();
        double[] doubleArray13 = incSheetFileData5.getUnusualIncYr();
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
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        java.lang.String str5 = fieldData2.getPhone();
        boolean boolean6 = fieldData2.isAdr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpYr();
        java.lang.String str8 = fieldData2.getDowIndexStr();
        double[] doubleArray9 = fieldData2.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        double[] doubleArray6 = fieldData2.getAdjToIncYr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11079");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        java.lang.String str11 = incSheetFileData5.toString();
        double[] doubleArray12 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray13 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray14 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray15 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData1.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        java.lang.String str6 = estimateFileData5.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = estimateFileData5.getExchange();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = companyFileData0.getExchange();
        companyFileData0.setDrp("Cash File Data");
        boolean boolean13 = companyFileData0.isDrp();
        companyFileData0.setName("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        java.lang.String str16 = companyFileData0.getDowIndexStr();
        companyFileData0.setZip("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str20 = companyFileData19.getSic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11082");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpYr();
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
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11083");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getEquityQtr();
        double[] doubleArray8 = balSheetFileData6.getLtDebtQtr();
        double[] doubleArray9 = balSheetFileData6.getStInvestQtr();
        java.lang.String str10 = balSheetFileData6.getSector();
        double[] doubleArray11 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray12 = balSheetFileData6.getAcctPayableYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        double double2 = sharesFileData0.getBeta();
        double[] doubleArray8 = new double[] { 100.0d, '4', 6, 1.0d, 100.0d };
        sharesFileData0.setSharesQ(doubleArray8);
        int int10 = sharesFileData0.getInsiderSellShrs();
        long long11 = sharesFileData0.getVolume10d();
        int int12 = sharesFileData0.getInsiderNetTrades();
        sharesFileData0.setVolume10d("out/BigDB/1/Q35/-fundamental-data-1Q35.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 52.0, 6.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11086");
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
        double double44 = estimateFileData3.getEpsY0();
        double double45 = estimateFileData3.getEpsQ0();
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
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.getTicker();
        java.lang.String str8 = balSheetFileData2.toDbOutput();
        double[] doubleArray9 = balSheetFileData2.getLtInvestQtr();
        double[] doubleArray10 = balSheetFileData2.getCurrLiabYr();
        double[] doubleArray11 = balSheetFileData2.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11088");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray9 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray10 = incSheetFileData5.getEpsQtr();
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
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11089");
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
        java.lang.String str13 = fieldData2.getZip();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = fieldData2.getCompanyInfo();
        double[] doubleArray15 = fieldData2.getDepreciationYr();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData7.getNetFixedAssetsQtr();
        java.lang.String str10 = balSheetFileData7.toString();
        double[] doubleArray11 = balSheetFileData7.getStDebtQtr();
        double[] doubleArray12 = balSheetFileData7.getPrefStockQtr();
        double[] doubleArray13 = balSheetFileData7.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setInsiderNetTrades("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        int int8 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str3 = companyFileData0.getDowIndexStr();
        companyFileData0.setStreet("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setPhone("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
        boolean boolean8 = companyFileData0.isDrp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getGoodwillYr();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        java.lang.String str11 = fieldData2.getDowIndexStr();
        double[] doubleArray12 = fieldData2.getLtInvestYr();
        java.lang.String str13 = fieldData2.getStreet();
        int int14 = fieldData2.getInstSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        double double5 = fieldData2.getBeta();
        java.lang.String str6 = fieldData2.getSic();
        double[] doubleArray7 = fieldData2.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11095");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str13 = companyFileData12.getStreet();
        companyFileData12.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData12.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData12.setDowIndex("");
        companyFileData12.setDowIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum22 = companyFileData12.getExchange();
        incSheetFileData5.setNameFields(companyFileData12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(exchEnum22);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData0.getEpsY1();
        java.lang.String str5 = estimateFileData0.getSector();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11097");
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
        double[] doubleArray70 = incSheetFileData42.getGrossOpExpQtr();
        double[] doubleArray71 = incSheetFileData42.getIncTaxQtr();
        double[] doubleArray72 = incSheetFileData42.getUnusualIncQtr();
        double[] doubleArray73 = incSheetFileData42.getGrossOpExpYr();
        java.lang.String str74 = incSheetFileData42.toDbOutput();
        double[] doubleArray75 = incSheetFileData42.getAdjToIncYr();
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
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(doubleArray75);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setVolume10d("");
        sharesFileData0.setVolume3m("out/BigDB/");
        sharesFileData0.setInsiderNetTrades("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
        sharesFileData0.setVolume10d("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getTicker();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = fieldData2.getAdjToIncYr();
        int int11 = fieldData2.getQuarter();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getIndustry();
        int int4 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/0/Q6/out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!-fundamental-data-0Q6.out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE");
        double double7 = sharesFileData0.getPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11101");
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
        double[] doubleArray17 = fieldData2.getCashFromInv();
        double[] doubleArray18 = fieldData2.getIntExpQtr();
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
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGoodwillQtr();
        double[] doubleArray5 = fieldData2.getAcctPayableYr();
        double[] doubleArray6 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray7 = fieldData2.getUnusualIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        java.lang.String str3 = balSheetFileData1.toString();
        double[] doubleArray4 = balSheetFileData1.getEquityQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getLtDebtQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = estimateFileData3.getExchange();
        double double6 = estimateFileData3.getEpsY0();
        double double7 = estimateFileData3.getEpsQ0();
        double double8 = estimateFileData3.getEpsQ0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11105");
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
        companyFileData0.setCity("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int45 = sharesFileData44.getInstShareholders();
        double double46 = sharesFileData44.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData47.setFromReport((int) (byte) 0, 0);
        double[] doubleArray51 = sharesFileData47.getSharesQ();
        sharesFileData44.setSharesQ(doubleArray51);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData44);
        double[] doubleArray54 = sharesFileData53.getSharesQ();
        double double55 = sharesFileData53.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum56 = sharesFileData53.getExchange();
        int int57 = sharesFileData53.getInsiderNetTrades();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData63 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList61);
        double[] doubleArray64 = incSheetFileData63.getEpsDilYr();
        double[] doubleArray65 = incSheetFileData63.getDividendYr();
        java.lang.String str66 = incSheetFileData63.getName();
        double[] doubleArray67 = incSheetFileData63.getEpsDilYr();
        java.lang.String str68 = incSheetFileData63.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData69 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData71 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData70);
        java.lang.String str72 = balSheetFileData70.toString();
        double[] doubleArray73 = balSheetFileData70.getGoodwillYr();
        double[] doubleArray74 = balSheetFileData70.getStInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray78 = fieldData77.getCogsYr();
        double double79 = fieldData77.getEpsQ0();
        double double80 = fieldData77.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData81 = fieldData77.getCashData();
        java.lang.String str82 = cashFileData81.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData85 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData43, sharesFileData53, incSheetFileData63, balSheetFileData70, cashFileData81, (int) (byte) 1, (int) (short) 10);
        double[] doubleArray86 = balSheetFileData70.getOtherCurrAssetsQtr();
        double[] doubleArray87 = balSheetFileData70.getInventoryYr();
        double[] doubleArray88 = balSheetFileData70.getLtInvestYr();
        java.lang.String str89 = balSheetFileData70.getExchange();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNull(exchEnum56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(incSheetFileData63);
        org.junit.Assert.assertNull(doubleArray64);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(doubleArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(doubleArray78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Cash File Data" + "'", str82, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray86);
        org.junit.Assert.assertNull(doubleArray87);
        org.junit.Assert.assertNull(doubleArray88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        double[] doubleArray4 = fieldData2.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = fieldData2.getExchange();
        double[] doubleArray6 = fieldData2.getCogsQtr();
        fieldData2.setYear((int) (byte) 1);
        double double9 = fieldData2.getEpsY1();
        double double10 = fieldData2.getInstOwnership();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!");
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        sharesFileData0.setInstOwnership("Cash File Data");
        sharesFileData0.setInsiderNetTrades("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setVolume10d("out/BigDB/-1/Q0/out/BigDB/-1/Q35/-fundamental-data--1Q35.-fundamental-data--1Q0.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11109");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray7 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double double10 = fieldData2.getInsiderOwnership();
        double double11 = fieldData2.getInsiderOwnership();
        double[] doubleArray12 = fieldData2.getEpsDilContQtr();
        double double13 = fieldData2.getPrice();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11111");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEquityYr();
        double[] doubleArray11 = fieldData2.getAcctRxYr();
        double double12 = fieldData2.getPrice52hi();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData8.setFromReport((int) '4', (int) '4');
        java.lang.String str12 = sharesFileData8.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean14 = companyFileData13.isAdr();
        java.lang.String str15 = companyFileData13.toString();
        sharesFileData8.setNameFields(companyFileData13);
        java.lang.String str17 = sharesFileData8.toString();
        sharesFileData8.setBeta("Cash File Data");
        double double20 = sharesFileData8.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        java.lang.String str7 = balSheetFileData6.getIndustry();
        double[] doubleArray8 = balSheetFileData6.getOtherCurrAssetsYr();
        double[] doubleArray9 = balSheetFileData6.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        java.lang.String str10 = fieldData2.getName();
        double[] doubleArray11 = fieldData2.getGrossIncYr();
        double[] doubleArray12 = fieldData2.getSharesY();
        double[] doubleArray13 = fieldData2.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum14 = fieldData2.getDowIndex();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(dowEnum14);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray8 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getLtInvestYr();
        java.lang.String str6 = fieldData2.getCity();
        int int7 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(incSheetFileData8);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuys("");
        long long5 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/");
        double double8 = sharesFileData0.getDollar3m();
        double double9 = sharesFileData0.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderOwnership("out/BigDB/");
        int int6 = sharesFileData0.getInsiderBuys();
        double double7 = sharesFileData0.getFloatshr();
        double[] doubleArray8 = sharesFileData0.getSharesQ();
        sharesFileData0.setInsiderSells("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double11 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getEquityQtr();
        double[] doubleArray8 = balSheetFileData1.getEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray10 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray11 = balSheetFileData1.getAcctPayableYr();
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
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11120");
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
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray13 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray14 = incSheetFileData5.getPreTaxIncYr();
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
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11121");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray11 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray12 = incSheetFileData5.getRdYr();
        double[] doubleArray13 = incSheetFileData5.getUnusualIncYr();
        java.lang.String str14 = incSheetFileData5.getName();
        double[] doubleArray15 = incSheetFileData5.getEpsYr();
        double[] doubleArray16 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray17 = incSheetFileData5.getIntExpNonOpYr();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getStDebtYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray8 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11123");
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
        java.lang.String str14 = companyFileData0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str14, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray2 = incSheetFileData0.getRdQtr();
        java.lang.String str3 = incSheetFileData0.getTicker();
        java.lang.String str4 = incSheetFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str6 = incSheetFileData0.getTicker();
        double[] doubleArray7 = incSheetFileData0.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getCashYr();
        double[] doubleArray7 = balSheetFileData2.getStDebtYr();
        double[] doubleArray8 = balSheetFileData2.getCurrLiabQtr();
        java.lang.String str9 = balSheetFileData2.getExchange();
        double[] doubleArray10 = balSheetFileData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11126");
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
        double[] doubleArray13 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray14 = incSheetFileData5.getEpsQtr();
        double[] doubleArray15 = incSheetFileData5.getEpsContYr();
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
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getCashQtr();
        double[] doubleArray5 = balSheetFileData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11128");
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
        double[] doubleArray16 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray17 = fieldData2.getCurrAssetsQtr();
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
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.toDbOutput();
        java.lang.String str8 = balSheetFileData2.getTicker();
        double[] doubleArray9 = balSheetFileData2.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        long long8 = fieldData2.getVolumeMonth3m();
        double[] doubleArray9 = fieldData2.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        boolean boolean9 = fieldData2.isDrp();
        double[] doubleArray10 = fieldData2.getEpsDilQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrAssetsYr();
        int int12 = fieldData2.getInstSellShrs();
        double[] doubleArray13 = fieldData2.getCashFromOps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11132");
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
        java.lang.String str25 = sharesFileData0.getIndustry();
        sharesFileData0.setInsiderBuyShrs("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double29 = sharesFileData28.getInstOwnership();
        sharesFileData28.setDollar3m("");
        long long32 = sharesFileData28.getVolumeMonth3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = fieldData35.getCashData();
        long long37 = fieldData35.getVolume10d();
        double[] doubleArray38 = fieldData35.getSharesY();
        sharesFileData28.setSharesY(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            double double40 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        java.lang.String str5 = estimateFileData1.getTicker();
        double double6 = estimateFileData1.getEpsY0();
        double double7 = estimateFileData1.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        double double9 = estimateFileData8.getEpsY2();
        double double10 = estimateFileData8.getEpsQ0();
        net.ajaskey.common.DateTime dateTime11 = estimateFileData8.getLatestQtrEps();
        double double12 = estimateFileData8.getEpsQ1();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(dateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int3 = companyFileData0.getNumEmployees();
        java.lang.String str4 = companyFileData0.getStreet();
        companyFileData0.setTicker("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        companyFileData0.setSector("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsQ0();
        java.lang.String str5 = estimateFileData3.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = estimateFileData3.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray10 = fieldData9.getGrossOpExpQtr();
        java.lang.String str11 = fieldData9.getWeb();
        int int12 = fieldData9.getInsiderNetTrades();
        double[] doubleArray13 = fieldData9.getEpsDilYr();
        double[] doubleArray14 = fieldData9.getNetIncYr();
        double[] doubleArray15 = fieldData9.getAcctRxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = fieldData9.getCompanyInfo();
        companyFileData16.setSic("");
        estimateFileData3.setNameFields(companyFileData16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(companyFileData16);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        java.lang.String str2 = sharesFileData0.getName();
        java.lang.String str3 = sharesFileData0.getIndustry();
        sharesFileData0.setMktCap("out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        int int6 = sharesFileData0.getInsiderSells();
        java.lang.String str7 = sharesFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getLtDebtYr();
        java.lang.String str9 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("hi!", 35, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData1.getLatestQtrEps();
        double double5 = estimateFileData1.getEpsQ1();
        java.lang.String str6 = estimateFileData1.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = estimateFileData1.getExchange();
        double double8 = estimateFileData1.getEpsQ1();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11140");
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
        java.lang.String str13 = fieldData2.getWeb();
        double[] doubleArray14 = fieldData2.getIncAfterTaxYr();
        double double15 = fieldData2.getInsiderOwnership();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11141");
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
        double[] doubleArray13 = fieldData2.getNonrecurringItemsYr();
        net.ajaskey.common.DateTime dateTime14 = fieldData2.getCurrFiscalYear();
        java.lang.String str15 = fieldData2.getSnpIndexStr();
        double[] doubleArray16 = fieldData2.getInventoryQtr();
        boolean boolean17 = fieldData2.isDrp();
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
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(dateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11142");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getNetIncYr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = incSheetFileData5.getExchange();
        double[] doubleArray11 = incSheetFileData5.getIntExpQtr();
        double[] doubleArray12 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray13 = incSheetFileData5.getSalesQtr();
        double[] doubleArray14 = incSheetFileData5.getGrossOpExpQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double[] doubleArray7 = fieldData2.getEpsYr();
        double double8 = fieldData2.getEpsY1();
        double[] doubleArray9 = fieldData2.getRdQtr();
        double double10 = fieldData2.getPrice();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("hi!");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11145");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        java.lang.String str11 = incSheetFileData5.toString();
        double[] doubleArray12 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray13 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray14 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray15 = incSheetFileData5.getNetIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11146");
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
        double[] doubleArray12 = fieldData2.getEpsQtr();
        double[] doubleArray13 = fieldData2.getDividendYr();
        java.lang.String str14 = fieldData2.getSector();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11147");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNotNull(balSheetFileData13);
        org.junit.Assert.assertNotNull(companyFileData14);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        java.lang.String str9 = fieldData2.getZip();
        double[] doubleArray10 = fieldData2.getNetIncYr();
        double[] doubleArray11 = fieldData2.getTotalOpExpYr();
        int int12 = fieldData2.getQuarter();
        double[] doubleArray13 = fieldData2.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderOwnership("out/BigDB/");
        int int6 = sharesFileData0.getInsiderBuys();
        double double7 = sharesFileData0.getFloatshr();
        int int8 = sharesFileData0.getInstShareholders();
        int int9 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setPrice("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        java.lang.String str4 = balSheetFileData1.getSector();
        java.lang.String str5 = balSheetFileData1.getTicker();
        double[] doubleArray6 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.getTicker();
        double[] doubleArray8 = balSheetFileData2.getCashYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str10 = companyFileData9.getStreet();
        companyFileData9.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData9.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData9.setDowIndex("");
        companyFileData9.setState("out/BigDB/");
        balSheetFileData2.setNameFields(companyFileData9);
        java.lang.String str20 = companyFileData9.getName();
        java.lang.String str21 = companyFileData9.getDowIndexStr();
        companyFileData9.setZip("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "NONE" + "'", str21, "NONE");
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11152");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList18);
        java.lang.String str21 = sharesFileData20.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData22.setFromReport((int) (byte) 0, 0);
        double[] doubleArray26 = sharesFileData22.getSharesQ();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray30 = fieldData29.getCogsYr();
        double[] doubleArray31 = fieldData29.getGrossIncQtr();
        double double32 = fieldData29.getEpsY1();
        double double33 = fieldData29.getEpsQ1();
        double[] doubleArray34 = fieldData29.getAcctPayableQtr();
        double[] doubleArray35 = fieldData29.getNonrecurringItemsYr();
        double[] doubleArray36 = fieldData29.getLiabEquityQtr();
        double[] doubleArray37 = fieldData29.getSharesY();
        sharesFileData22.setSharesY(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData39.setFromReport((int) (short) 1, 0);
        double double43 = sharesFileData39.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray47 = fieldData46.getCogsYr();
        int int48 = fieldData46.getNumEmployees();
        double double49 = fieldData46.getPrice52hi();
        double[] doubleArray50 = fieldData46.getPreTaxIncYr();
        double double51 = fieldData46.getFloatshr();
        double[] doubleArray52 = fieldData46.getCogsYr();
        double[] doubleArray53 = fieldData46.getPreTaxIncYr();
        double[] doubleArray54 = fieldData46.getRdQtr();
        double[] doubleArray55 = fieldData46.getOtherCurrLiabYr();
        double[] doubleArray56 = fieldData46.getStDebtQtr();
        double[] doubleArray57 = fieldData46.getTotalOpExpQtr();
        double[] doubleArray58 = fieldData46.getSharesQ();
        sharesFileData39.setSharesY(doubleArray58);
        sharesFileData22.setSharesQ(doubleArray58);
        double double61 = sharesFileData22.getFloatshr();
        double[] doubleArray62 = sharesFileData22.getSharesY();
        int int63 = sharesFileData22.getInstSellShrs();
        double[] doubleArray64 = sharesFileData22.getSharesQ();
        sharesFileData20.setSharesY(doubleArray64);
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
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0]");
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNull(doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0]");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11153");
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
        double[] doubleArray25 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray26 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray27 = incSheetFileData5.getOtherIncYr();
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
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11154");
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
        double double36 = estimateFileData3.getEpsY1();
        java.lang.String str37 = estimateFileData3.getSector();
        java.lang.String str38 = estimateFileData3.getIndustry();
        java.lang.String str39 = estimateFileData3.getTicker();
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11155");
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
        double[] doubleArray13 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray15 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray16 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray17 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray18 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        java.lang.String str9 = fieldData2.getName();
        double[] doubleArray10 = fieldData2.getGrossOpExpYr();
        double[] doubleArray11 = fieldData2.getNetIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getLtInvestYr();
        double[] doubleArray5 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray8 = balSheetFileData2.getTotalAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        java.lang.String str6 = fieldData2.getTicker();
        fieldData2.setYear((int) '#');
        double double9 = fieldData2.getFloatshr();
        int int10 = fieldData2.getQuarter();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        double[] doubleArray7 = fieldData2.getEquityYr();
        double[] doubleArray8 = fieldData2.getIncPrimaryEpsYr();
        java.lang.String str9 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum10 = fieldData2.getDowIndex();
        double[] doubleArray11 = fieldData2.getCurrLiabYr();
        fieldData2.setQuarter((int) (short) 100);
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(dowEnum10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getPrefStockYr();
        double[] doubleArray4 = fieldData2.getOtherLtAssetsYr();
        java.lang.String str5 = fieldData2.getIndustry();
        double[] doubleArray6 = fieldData2.getEpsDilContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11161");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray43 = fieldData42.getCogsYr();
        int int44 = fieldData42.getNumEmployees();
        double double45 = fieldData42.getPrice52hi();
        double[] doubleArray46 = fieldData42.getPreTaxIncYr();
        double double47 = fieldData42.getFloatshr();
        double[] doubleArray48 = fieldData42.getCogsYr();
        double[] doubleArray49 = fieldData42.getNetIncQtr();
        double[] doubleArray50 = fieldData42.getSharesY();
        sharesFileData14.setSharesQ(doubleArray50);
        sharesFileData14.setFloatshr("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
        sharesFileData14.setInstBuyShrs("out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
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
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0]");
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setStreet("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        companyFileData0.setSic("out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str6 = companyFileData0.getWeb();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        double[] doubleArray13 = fieldData2.getDividendQtr();
        double double14 = fieldData2.getPrice52lo();
        int int15 = fieldData2.getQuarter();
        boolean boolean16 = fieldData2.isDrp();
        java.lang.String str17 = fieldData2.getTicker();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum9 = fieldData2.getDowIndex();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(dowEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11165");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray9 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray10 = fieldData2.getStInvestYr();
        double[] doubleArray11 = fieldData2.getLtDebtYr();
        double[] doubleArray12 = fieldData2.getCurrAssetsQtr();
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
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11166");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = fieldData2.getCompanyInfo();
        companyFileData14.setDrp("out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        java.lang.String str17 = companyFileData14.getSic();
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
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11167");
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
        double[] doubleArray12 = fieldData2.getNonrecurringItemsQtr();
        double double13 = fieldData2.getEpsQ1();
        double[] doubleArray14 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray15 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray16 = fieldData2.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData17 = fieldData2.getCashData();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNotNull(cashFileData17);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getCountry();
        double double7 = fieldData2.getMktCap();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getCurrFiscalYear();
        double double9 = fieldData2.getPrice52lo();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getCountry();
        double double7 = fieldData2.getMktCap();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getCurrFiscalYear();
        double double9 = fieldData2.getEpsY0();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11170");
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
        java.lang.String str44 = balSheetFileData22.getTicker();
        java.lang.String str45 = balSheetFileData22.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData46.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str49 = companyFileData46.getState();
        balSheetFileData22.setNameFields(companyFileData46);
        companyFileData46.setSic("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData46);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getLtInvestYr();
        double[] doubleArray5 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData2.getLtInvestQtr();
        double[] doubleArray7 = balSheetFileData2.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getName();
        double[] doubleArray7 = fieldData2.getSharesQ();
        double[] doubleArray8 = fieldData2.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setFromReport((int) (byte) 0, (int) (byte) 10);
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setBeta("Cash File Data");
        double double11 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11174");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getEpsContYr();
        double[] doubleArray13 = incSheetFileData5.getGrossOpExpQtr();
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
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11175");
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
        double[] doubleArray70 = balSheetFileData52.getTotalLiabQtr();
        java.lang.String str71 = balSheetFileData52.getTicker();
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData1.toString();
        double[] doubleArray7 = balSheetFileData1.getStInvestQtr();
        java.lang.String[] strArray9 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        boolean boolean16 = companyFileData15.isDrp();
        balSheetFileData1.setNameFields(companyFileData15);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNotNull(balSheetFileData13);
        org.junit.Assert.assertNotNull(estimateFileData14);
        org.junit.Assert.assertNotNull(companyFileData15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11177");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.common.DateTime dateTime6 = fieldData2.getLatestQtrEps();
        double[] doubleArray7 = fieldData2.getEpsDilContYr();
        double[] doubleArray8 = fieldData2.getEpsDilContYr();
        double[] doubleArray9 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray10 = fieldData2.getAdjToIncYr();
        double[] doubleArray11 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getEquityYr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        double[] doubleArray10 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        double double11 = fieldData2.getEpsQ0();
        net.ajaskey.common.DateTime dateTime12 = fieldData2.getCurrFiscalYear();
        double[] doubleArray13 = fieldData2.getOtherCurrLiabQtr();
        double[] doubleArray14 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(dateTime12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        double[] doubleArray4 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray5 = fieldData2.getEpsContQtr();
        double[] doubleArray6 = fieldData2.getSalesYr();
        double[] doubleArray7 = fieldData2.getNetIncYr();
        double[] doubleArray8 = fieldData2.getAcctRxYr();
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        java.lang.String str4 = sharesFileData0.getSector();
        int int5 = sharesFileData0.getInsiderNetTrades();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        sharesFileData0.setFloatshr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        double[] doubleArray9 = sharesFileData0.getSharesY();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        java.lang.String str6 = fieldData2.getSector();
        double[] doubleArray7 = fieldData2.getLtDebtQtr();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = fieldData2.getEstimateData();
        java.lang.String str10 = estimateFileData9.toString();
        net.ajaskey.common.DateTime dateTime11 = estimateFileData9.getLatestQtrEps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(dateTime11);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11183");
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
        double[] doubleArray12 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray13 = fieldData2.getGrossOpExpYr();
        double[] doubleArray14 = fieldData2.getIncPrimaryEpsQtr();
        double[] doubleArray15 = fieldData2.getOtherIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = fieldData2.getEstimateData();
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
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(estimateFileData16);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = sharesFileData0.getExchange();
        sharesFileData0.setFromReport((int) (byte) 10, 100);
        double double15 = sharesFileData0.getFloatshr();
        double double16 = sharesFileData0.getDollar3m();
        int int17 = sharesFileData0.getInsiderNetTrades();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str4 = estimateFileData0.toString();
        java.lang.String str5 = estimateFileData0.getIndustry();
        net.ajaskey.common.DateTime dateTime6 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str7 = estimateFileData0.toDbOutput();
        double double8 = estimateFileData0.getEpsY1();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        java.lang.String str6 = sharesFileData0.getName();
        double double7 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        int int14 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11187");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getIncPrimaryEpsQtr();
        boolean boolean11 = fieldData2.isDrp();
        double[] doubleArray12 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        java.lang.String str2 = incSheetFileData0.getIndustry();
        double[] doubleArray3 = incSheetFileData0.getIncAfterTaxQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsYr();
        double[] doubleArray5 = incSheetFileData0.getEpsQtr();
        double[] doubleArray6 = incSheetFileData0.getGrossIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11189");
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
        double[] doubleArray12 = fieldData2.getCapEx();
        double[] doubleArray13 = fieldData2.getEpsContYr();
        double[] doubleArray14 = fieldData2.getLiabEquityYr();
        int int15 = fieldData2.getYear();
        double[] doubleArray16 = fieldData2.getStInvestYr();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData6.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11191");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getEquityYr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11192");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum9 = fieldData2.getSnpIndex();
        double[] doubleArray10 = fieldData2.getLtDebtYr();
        fieldData2.setYear((int) (byte) 1);
        double[] doubleArray13 = fieldData2.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getRdYr();
        double[] doubleArray8 = fieldData2.getEpsQtr();
        double double9 = fieldData2.getEpsQ1();
        double[] doubleArray10 = fieldData2.getBvpsYr();
        double[] doubleArray11 = fieldData2.getInventoryYr();
        java.lang.String str12 = fieldData2.getWeb();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getStDebtQtr();
        double[] doubleArray7 = fieldData2.getAdjToIncYr();
        double[] doubleArray8 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray5 = fieldData2.getEpsDilContYr();
        double[] doubleArray6 = fieldData2.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray8 = balSheetFileData2.getGoodwillYr();
        double[] doubleArray9 = balSheetFileData2.getOtherLtLiabQtr();
        java.lang.String str10 = balSheetFileData2.getName();
        double[] doubleArray11 = balSheetFileData2.getEquityYr();
        double[] doubleArray12 = balSheetFileData2.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11197");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str7 = fieldData2.getWeb();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11199");
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
        double double39 = fieldData35.getEpsY2();
        double[] doubleArray40 = fieldData35.getRdYr();
        double[] doubleArray41 = fieldData35.getOtherCurrLiabQtr();
        double double42 = fieldData35.getBeta();
        double[] doubleArray43 = fieldData35.getOtherCurrLiabQtr();
        double[] doubleArray44 = fieldData35.getStInvestYr();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int3 = companyFileData0.getNumEmployees();
        int int4 = companyFileData0.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray8 = fieldData7.getCogsYr();
        int int9 = fieldData7.getNumEmployees();
        double double10 = fieldData7.getPrice52hi();
        double[] doubleArray11 = fieldData7.getPreTaxIncYr();
        double double12 = fieldData7.getFloatshr();
        double[] doubleArray13 = fieldData7.getCogsYr();
        double[] doubleArray14 = fieldData7.getPreTaxIncYr();
        double[] doubleArray15 = fieldData7.getDepreciationYr();
        double[] doubleArray16 = fieldData7.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = fieldData7.getEstimateData();
        double double18 = estimateFileData17.getEpsY2();
        java.lang.String str19 = estimateFileData17.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData20.setFromReport((int) (short) 1, 0);
        sharesFileData20.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum26 = sharesFileData20.getExchange();
        java.lang.String str27 = sharesFileData20.getName();
        long long28 = sharesFileData20.getVolumeMonth3m();
        sharesFileData20.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum31 = sharesFileData20.getExchange();
        sharesFileData20.setFromReport((int) (byte) 10, 100);
        sharesFileData20.setInstOwnership("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray43 = incSheetFileData42.getIncAfterTaxYr();
        double[] doubleArray44 = incSheetFileData42.getOtherIncYr();
        double[] doubleArray45 = incSheetFileData42.getSalesQtr();
        double[] doubleArray46 = incSheetFileData42.getUnusualIncQtr();
        double[] doubleArray47 = incSheetFileData42.getEpsDilContQtr();
        double[] doubleArray48 = incSheetFileData42.getEpsDilQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray52 = fieldData51.getCogsYr();
        double[] doubleArray53 = fieldData51.getGrossIncQtr();
        double double54 = fieldData51.getEpsY1();
        double[] doubleArray55 = fieldData51.getDividendYr();
        double[] doubleArray56 = fieldData51.getAcctPayableYr();
        double[] doubleArray57 = fieldData51.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData58 = fieldData51.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData59 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData58);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray63 = fieldData62.getCogsYr();
        int int64 = fieldData62.getNumEmployees();
        double[] doubleArray65 = fieldData62.getAdjToIncQtr();
        double[] doubleArray66 = fieldData62.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData67 = fieldData62.getCashData();
        java.lang.String str68 = cashFileData67.toString();
        java.lang.String str69 = cashFileData67.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData67);
        double[] doubleArray71 = cashFileData70.getCashFromFinQtr();
        double[] doubleArray72 = cashFileData70.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData17, sharesFileData20, incSheetFileData42, balSheetFileData58, cashFileData70, (int) (short) 100, (int) 'a');
        double[] doubleArray76 = incSheetFileData42.getPreTaxIncYr();
        double[] doubleArray77 = incSheetFileData42.getPreTaxIncYr();
        double[] doubleArray78 = incSheetFileData42.getIncTaxQtr();
        double[] doubleArray79 = incSheetFileData42.getEpsDilContYr();
        double[] doubleArray80 = incSheetFileData42.getEpsDilContQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(exchEnum26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(exchEnum31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(incSheetFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNull(doubleArray57);
        org.junit.Assert.assertNotNull(balSheetFileData58);
        org.junit.Assert.assertNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertNotNull(cashFileData67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cash File Data" + "'", str68, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNull(doubleArray77);
        org.junit.Assert.assertNull(doubleArray78);
        org.junit.Assert.assertNull(doubleArray79);
        org.junit.Assert.assertNull(doubleArray80);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        java.lang.String str2 = sharesFileData0.getName();
        double[] doubleArray3 = sharesFileData0.getSharesY();
        double double4 = sharesFileData0.getPrice();
        sharesFileData0.setFromReport(1, 1);
        double double8 = sharesFileData0.getFloatshr();
        double double9 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray8 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray9 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray10 = balSheetFileData1.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11203");
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
        sharesFileData26.setInstOwnership("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double29 = sharesFileData26.getDollar3m();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        int int4 = sharesFileData0.getInsiderNetTrades();
        int int5 = sharesFileData0.getInsiderSellShrs();
        double double6 = sharesFileData0.getBeta();
        int int7 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        java.lang.String str8 = fieldData2.getWeb();
        double[] doubleArray9 = fieldData2.getGrossOpExpYr();
        java.lang.String str10 = fieldData2.getIndustry();
        double[] doubleArray11 = fieldData2.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str7 = companyFileData0.getSector();
        companyFileData0.setCountry("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setSector("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData0.setCity("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11207");
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
        double[] doubleArray37 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray38 = incSheetFileData20.getDepreciationYr();
        double[] doubleArray39 = incSheetFileData20.getNetIncQtr();
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
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = fieldData2.getEstimateData();
        double double8 = estimateFileData7.getEpsY1();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        companyFileData25.setDrp("out/BigDB/1/Q0/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        estimateFileData7.setNameFields(companyFileData25);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(companyFileData15);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(cashFileData17);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(sharesFileData19);
        org.junit.Assert.assertNotNull(balSheetFileData20);
        org.junit.Assert.assertNotNull(sharesFileData21);
        org.junit.Assert.assertNotNull(cashFileData22);
        org.junit.Assert.assertNotNull(incSheetFileData23);
        org.junit.Assert.assertNotNull(companyFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11209");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum12 = fieldData2.getDowIndex();
        double[] doubleArray13 = fieldData2.getGoodwillQtr();
        java.lang.String str14 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = fieldData2.getShares();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(dowEnum12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(sharesFileData15);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        int int4 = sharesFileData0.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str6 = sharesFileData0.getSector();
        sharesFileData0.setInstShareholders("out/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11211");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        double[] doubleArray7 = fieldData2.getIncTaxYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getStDebtYr();
        double[] doubleArray10 = fieldData2.getIncAfterTaxQtr();
        java.lang.String str11 = fieldData2.getStreet();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setAdr("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum5 = companyFileData0.getDowIndex();
        companyFileData0.setDrp("Cash File Data");
        java.lang.String str8 = companyFileData0.getName();
        companyFileData0.setZip("out/BigDB/-1/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data--1Q100.out/BigDB/");
        companyFileData0.setNumEmployees("out/BigDB/100/Q52/out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-100Q52.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dowEnum5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11213");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getEpsContYr();
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
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11214");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        java.lang.String str5 = balSheetFileData4.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str21 = companyFileData20.toDbOuput();
        balSheetFileData4.setNameFields(companyFileData20);
        double[] doubleArray23 = balSheetFileData4.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNotNull(sharesFileData18);
        org.junit.Assert.assertNotNull(cashFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str21, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(doubleArray23);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11215");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsYr();
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
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isAdr();
        java.lang.String str4 = companyFileData0.toDbOuput();
        java.lang.String str5 = companyFileData0.getSic();
        companyFileData0.setNumEmployees("out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str8 = companyFileData0.getStreet();
        companyFileData0.setCountry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : \r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str11 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum12 = companyFileData0.getSnpIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str4, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(snpEnum12);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 100);
        java.lang.String str3 = fieldData2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getLatestQtrEps();
        double double9 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        java.lang.String str2 = sharesFileData0.getName();
        double[] doubleArray3 = sharesFileData0.getSharesY();
        double double4 = sharesFileData0.getMktCap();
        sharesFileData0.setFloatshr("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str7 = sharesFileData0.getIndustry();
        double double8 = sharesFileData0.getPrice52lo();
        sharesFileData0.setVolume10d("out/BigDB/-1/Q0/out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data--1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        double double2 = sharesFileData0.getBeta();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        java.lang.String str4 = sharesFileData0.toString();
        double double5 = sharesFileData0.getInsiderOwnership();
        double double6 = sharesFileData0.getFloatshr();
        double[] doubleArray7 = sharesFileData0.getSharesQ();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        double[] doubleArray13 = fieldData2.getPreTaxIncYr();
        java.lang.String str14 = fieldData2.getSnpIndexStr();
        double double15 = fieldData2.getEpsY2();
        double[] doubleArray16 = fieldData2.getEpsDilYr();
        net.ajaskey.common.DateTime dateTime17 = fieldData2.getCurrFiscalYear();
        double[] doubleArray18 = fieldData2.getEquityQtr();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(dateTime17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray8 = balSheetFileData1.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getRdYr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        net.ajaskey.common.DateTime dateTime9 = fieldData2.getLatestQtrEps();
        fieldData2.setQuarter((int) (short) -1);
        java.lang.String str12 = fieldData2.getIndustry();
        java.lang.String str13 = fieldData2.getTicker();
        double[] doubleArray14 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11224");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double double11 = sharesFileData10.getFloatshr();
        sharesFileData10.setInsiderOwnership("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderSellShrs("out/BigDB/");
        sharesFileData0.setVolume10d("");
        int int8 = sharesFileData0.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData9.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double13 = estimateFileData12.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int15 = sharesFileData14.getInstShareholders();
        double double16 = sharesFileData14.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setFromReport((int) (byte) 0, 0);
        double[] doubleArray21 = sharesFileData17.getSharesQ();
        sharesFileData14.setSharesQ(doubleArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList27);
        double[] doubleArray30 = incSheetFileData29.getEpsContYr();
        double[] doubleArray31 = incSheetFileData29.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData32 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData33);
        double[] doubleArray35 = balSheetFileData34.getLtDebtYr();
        java.lang.String str36 = balSheetFileData34.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = fieldData39.getCashData();
        double[] doubleArray41 = cashFileData40.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData12, sharesFileData23, incSheetFileData29, balSheetFileData34, cashFileData40, (int) '#', 0);
        double[] doubleArray45 = fieldData44.getEpsContQtr();
        double[] doubleArray46 = fieldData44.getIncTaxYr();
        double[] doubleArray47 = fieldData44.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray47);
        long long49 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(incSheetFileData29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(cashFileData40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11226");
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
        double[] doubleArray36 = fieldData35.getGrossIncQtr();
        double[] doubleArray37 = fieldData35.getLtDebtYr();
        double[] doubleArray38 = fieldData35.getIncAfterTaxQtr();
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
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11227");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilContYr();
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
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11228");
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
        double[] doubleArray37 = fieldData35.getNetIncYr();
        double double38 = fieldData35.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = fieldData35.getShares();
        double[] doubleArray40 = sharesFileData39.getSharesY();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toString();
        java.lang.String str4 = sharesFileData0.getTicker();
        int int5 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderSells("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11230");
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
        java.lang.String str14 = balSheetFileData1.toString();
        double[] doubleArray15 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray16 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        java.lang.String str4 = fieldData2.getIndustry();
        java.lang.String str5 = fieldData2.getTicker();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String str8 = sharesFileData7.getIndustry();
        sharesFileData7.setFloatshr("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        companyFileData22.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData7.setNameFields(companyFileData22);
        java.lang.String str26 = companyFileData22.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(cashFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNotNull(companyFileData22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((-1), (int) ' ', filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11233");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getDividendYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11234");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum16 = fieldData2.getSnpIndex();
        double[] doubleArray17 = fieldData2.getInventoryYr();
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
        org.junit.Assert.assertNull(snpEnum16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        double[] doubleArray4 = fieldData2.getIntExpQtr();
        double[] doubleArray5 = fieldData2.getCapEx();
        double double6 = fieldData2.getMktCap();
        double[] doubleArray7 = fieldData2.getPreTaxIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11236");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = incSheetFileData5.getExchange();
        double[] doubleArray11 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11237");
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
        java.lang.String str20 = incSheetFileData5.toDbOutput();
        double[] doubleArray21 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray22 = incSheetFileData5.getDividendQtr();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        boolean boolean9 = fieldData2.isDrp();
        double[] doubleArray10 = fieldData2.getEpsDilQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray12 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getCapEx();
        double[] doubleArray9 = fieldData2.getNetFixedAssetsYr();
        net.ajaskey.common.DateTime dateTime10 = fieldData2.getCurrFiscalYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(dateTime10);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShares();
        double double5 = sharesFileData4.getPrice52hi();
        long long6 = sharesFileData4.getVolumeMonth3m();
        int int7 = sharesFileData4.getInstBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData10.setIndustry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11242");
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
        double[] doubleArray50 = balSheetFileData22.getCashQtr();
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
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.util.List<java.lang.String> strList12 = companyFileData0.set((java.util.List<java.lang.String>) strList5);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.String> strList21 = companyFileData0.set((java.util.List<java.lang.String>) strList16);
        java.lang.String str22 = companyFileData0.getWeb();
        companyFileData0.setDowIndex("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(balSheetFileData19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getEquityYr();
        double[] doubleArray5 = balSheetFileData2.getLtDebtQtr();
        double[] doubleArray6 = balSheetFileData2.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int3 = companyFileData0.getNumEmployees();
        int int4 = companyFileData0.getNumEmployees();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray8 = fieldData7.getCogsYr();
        int int9 = fieldData7.getNumEmployees();
        double double10 = fieldData7.getPrice52hi();
        double[] doubleArray11 = fieldData7.getPreTaxIncYr();
        double double12 = fieldData7.getFloatshr();
        double[] doubleArray13 = fieldData7.getCogsYr();
        double[] doubleArray14 = fieldData7.getPreTaxIncYr();
        double[] doubleArray15 = fieldData7.getDepreciationYr();
        double[] doubleArray16 = fieldData7.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = fieldData7.getEstimateData();
        double double18 = estimateFileData17.getEpsY2();
        java.lang.String str19 = estimateFileData17.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData20.setFromReport((int) (short) 1, 0);
        sharesFileData20.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum26 = sharesFileData20.getExchange();
        java.lang.String str27 = sharesFileData20.getName();
        long long28 = sharesFileData20.getVolumeMonth3m();
        sharesFileData20.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum31 = sharesFileData20.getExchange();
        sharesFileData20.setFromReport((int) (byte) 10, 100);
        sharesFileData20.setInstOwnership("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray43 = incSheetFileData42.getIncAfterTaxYr();
        double[] doubleArray44 = incSheetFileData42.getOtherIncYr();
        double[] doubleArray45 = incSheetFileData42.getSalesQtr();
        double[] doubleArray46 = incSheetFileData42.getUnusualIncQtr();
        double[] doubleArray47 = incSheetFileData42.getEpsDilContQtr();
        double[] doubleArray48 = incSheetFileData42.getEpsDilQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray52 = fieldData51.getCogsYr();
        double[] doubleArray53 = fieldData51.getGrossIncQtr();
        double double54 = fieldData51.getEpsY1();
        double[] doubleArray55 = fieldData51.getDividendYr();
        double[] doubleArray56 = fieldData51.getAcctPayableYr();
        double[] doubleArray57 = fieldData51.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData58 = fieldData51.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData59 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData58);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray63 = fieldData62.getCogsYr();
        int int64 = fieldData62.getNumEmployees();
        double[] doubleArray65 = fieldData62.getAdjToIncQtr();
        double[] doubleArray66 = fieldData62.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData67 = fieldData62.getCashData();
        java.lang.String str68 = cashFileData67.toString();
        java.lang.String str69 = cashFileData67.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData67);
        double[] doubleArray71 = cashFileData70.getCashFromFinQtr();
        double[] doubleArray72 = cashFileData70.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData17, sharesFileData20, incSheetFileData42, balSheetFileData58, cashFileData70, (int) (short) 100, (int) 'a');
        double[] doubleArray76 = fieldData75.getEpsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData77 = fieldData75.getIncSheetData();
        double[] doubleArray78 = incSheetFileData77.getSalesQtr();
        double[] doubleArray79 = incSheetFileData77.getSalesYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(exchEnum26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(exchEnum31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(incSheetFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNull(doubleArray57);
        org.junit.Assert.assertNotNull(balSheetFileData58);
        org.junit.Assert.assertNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertNotNull(cashFileData67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cash File Data" + "'", str68, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNotNull(incSheetFileData77);
        org.junit.Assert.assertNull(doubleArray78);
        org.junit.Assert.assertNull(doubleArray79);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11246");
        java.lang.String[] strArray5 = new java.lang.String[] { "Cash File Data", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "NONE" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str11 = balSheetFileData10.getTicker();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(balSheetFileData10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        java.lang.String str5 = fieldData2.getCity();
        double[] doubleArray6 = fieldData2.getEpsDilContYr();
        double[] doubleArray7 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray10 = fieldData2.getEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        java.lang.String str4 = fieldData2.getIndustry();
        java.lang.String str5 = fieldData2.getTicker();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String str8 = sharesFileData7.getIndustry();
        int int9 = sharesFileData7.getInsiderBuyShrs();
        sharesFileData7.setBeta("NONE");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        int int9 = fieldData2.getInstBuyShrs();
        double[] doubleArray10 = fieldData2.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11250");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = sharesFileData0.getExchange();
        sharesFileData0.setMktCap("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        sharesFileData0.setFloatshr("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str17 = companyFileData16.getStreet();
        companyFileData16.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData16.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str22 = companyFileData16.getSic();
        java.lang.String str23 = companyFileData16.getIndustry();
        java.lang.String str24 = companyFileData16.getZip();
        boolean boolean25 = companyFileData16.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum26 = companyFileData16.getExchange();
        java.lang.String str27 = companyFileData16.getState();
        companyFileData16.setPhone("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        sharesFileData0.setNameFields(companyFileData16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData31 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int33 = sharesFileData32.getInstShareholders();
        double double34 = sharesFileData32.getInsiderNetPercentOutstanding();
        java.lang.String str35 = sharesFileData32.toDbOutput();
        sharesFileData32.setInstBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int39 = sharesFileData38.getInstSellShrs();
        sharesFileData38.setInsiderSells("hi!");
        double double42 = sharesFileData38.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int44 = sharesFileData43.getInstShareholders();
        double double45 = sharesFileData43.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData46.setFromReport((int) (byte) 0, 0);
        double[] doubleArray50 = sharesFileData46.getSharesQ();
        sharesFileData43.setSharesQ(doubleArray50);
        sharesFileData38.setSharesQ(doubleArray50);
        sharesFileData32.setSharesQ(doubleArray50);
        sharesFileData32.setBeta("");
        java.lang.String str56 = sharesFileData32.getName();
        java.lang.String str57 = sharesFileData32.getIndustry();
        sharesFileData32.setInsiderBuyShrs("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData32);
        double double61 = sharesFileData60.getInstOwnership();
        sharesFileData60.setDollar3m("");
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData69 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList67);
        double[] doubleArray70 = incSheetFileData69.getPreTaxIncQtr();
        double[] doubleArray71 = incSheetFileData69.getCogsQtr();
        java.lang.String str72 = incSheetFileData69.getSector();
        double[] doubleArray73 = incSheetFileData69.getGrossIncYr();
        double[] doubleArray74 = incSheetFileData69.getEpsDilContYr();
        double[] doubleArray75 = incSheetFileData69.getEpsDilContQtr();
        double[] doubleArray76 = incSheetFileData69.getIntExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData77 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData77);
        double[] doubleArray79 = balSheetFileData78.getCurrLiabYr();
        double[] doubleArray80 = balSheetFileData78.getCurrAssetsYr();
        double[] doubleArray81 = balSheetFileData78.getTotalLiabYr();
        java.lang.String str82 = balSheetFileData78.getName();
        java.lang.String[] strArray88 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData91 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList89);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData92 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList89);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData93 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData92);
        double[] doubleArray94 = cashFileData93.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData97 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData16, estimateFileData31, sharesFileData60, incSheetFileData69, balSheetFileData78, cashFileData93, (int) (short) 10, (-1));
        double[] doubleArray98 = cashFileData93.getCashFromOpsQtr();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(exchEnum26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str35, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0]");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(incSheetFileData69);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(doubleArray75);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNull(doubleArray79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(companyFileData91);
        org.junit.Assert.assertNotNull(cashFileData92);
        org.junit.Assert.assertNull(doubleArray94);
        org.junit.Assert.assertNull(doubleArray98);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11251");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsYr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getCogsYr();
        double[] doubleArray13 = incSheetFileData5.getGrossOpExpYr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData7.setFromReport((int) (short) 1, 0);
        double double11 = sharesFileData7.getFloatshr();
        java.lang.String str12 = sharesFileData7.toDbOutput();
        sharesFileData7.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData7);
        sharesFileData15.setFromReport((int) '4', (int) '4');
        java.lang.String str19 = sharesFileData15.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean21 = companyFileData20.isAdr();
        java.lang.String str22 = companyFileData20.toString();
        sharesFileData15.setNameFields(companyFileData20);
        balSheetFileData1.setNameFields(companyFileData20);
        double[] doubleArray25 = balSheetFileData1.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str12, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11253");
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
        double[] doubleArray39 = fieldData35.getPreTaxIncYr();
        double[] doubleArray40 = fieldData35.getLtDebtYr();
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
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        double[] doubleArray4 = fieldData2.getTotalOpExpYr();
        double[] doubleArray5 = fieldData2.getCashQtr();
        double[] doubleArray6 = fieldData2.getGoodwillQtr();
        double[] doubleArray7 = fieldData2.getInventoryYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11255");
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
        double[] doubleArray13 = fieldData2.getAcctPayableQtr();
        double[] doubleArray14 = fieldData2.getAcctRxQtr();
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
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11256");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("Cash File Data");
        java.lang.String str5 = companyFileData0.getPhone();
        boolean boolean6 = companyFileData0.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str8 = companyFileData7.getStreet();
        companyFileData7.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData7.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str13 = companyFileData7.getSic();
        java.lang.String str14 = companyFileData7.getIndustry();
        java.lang.String str15 = companyFileData7.getZip();
        boolean boolean16 = companyFileData7.isAdr();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList24 = companyFileData7.set((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList26 = companyFileData0.set((java.util.List<java.lang.String>) strList20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList26);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(incSheetFileData22);
        org.junit.Assert.assertNotNull(sharesFileData23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(sharesFileData25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(companyFileData27);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray8 = balSheetFileData1.getBvpsYr();
        double[] doubleArray9 = balSheetFileData1.getOtherCurrAssetsQtr();
        java.lang.String str10 = balSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11258");
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
        double double13 = fieldData2.getPrice52hi();
        net.ajaskey.common.DateTime dateTime14 = fieldData2.getCurrFiscalYear();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(dateTime14);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11259");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum63 = estimateFileData6.getExchange();
        net.ajaskey.common.DateTime dateTime64 = estimateFileData6.getLatestQtrEps();
        double double65 = estimateFileData6.getEpsY1();
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
        org.junit.Assert.assertNull(exchEnum63);
        org.junit.Assert.assertNull(dateTime64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        java.lang.String str10 = balSheetFileData1.toString();
        double[] doubleArray11 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray12 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray13 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray14 = balSheetFileData1.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        double[] doubleArray9 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray10 = fieldData2.getNonrecurringItemsQtr();
        java.lang.String str11 = fieldData2.getStreet();
        java.lang.String str12 = fieldData2.getZip();
        double[] doubleArray13 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray14 = fieldData2.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11262");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setInstOwnership("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getInsiderNetPercentOutstanding();
        java.lang.String str8 = sharesFileData5.getName();
        long long9 = sharesFileData5.getVolumeMonth3m();
        double[] doubleArray10 = sharesFileData5.getSharesY();
        sharesFileData0.setSharesQ(doubleArray10);
        sharesFileData0.setInsiderOwnership("out/BigDB/6/Q1/out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!-fundamental-data-6Q1.out/BigDB/10/Q100/out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q100.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        int int6 = sharesFileData0.getInstShareholders();
        sharesFileData0.setVolume10d("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        java.lang.String str9 = sharesFileData0.getSector();
        int int10 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11264");
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
        net.ajaskey.common.DateTime dateTime12 = fieldData2.getLatestQtrEps();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(dateTime12);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11265");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray13 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray14 = incSheetFileData5.getSalesQtr();
        double[] doubleArray15 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        int int13 = fieldData2.getInsiderBuys();
        double[] doubleArray14 = fieldData2.getBvpsYr();
        double[] doubleArray15 = fieldData2.getNonrecurringItemsYr();
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
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getCashYr();
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        java.lang.String str10 = fieldData2.getWeb();
        double[] doubleArray11 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray12 = fieldData2.getIncAfterTaxYr();
        double double13 = fieldData2.getPrice52lo();
        double double14 = fieldData2.getInsiderNetPercentOutstanding();
        double double15 = fieldData2.getPrice52hi();
        double[] doubleArray16 = fieldData2.getSalesYr();
        double[] doubleArray17 = fieldData2.getGoodwillQtr();
        double[] doubleArray18 = fieldData2.getEpsContQtr();
        double[] doubleArray19 = fieldData2.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11268");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory(100, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11269");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        balSheetFileData1.setNameFields(companyFileData5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray8 = balSheetFileData7.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("ticker      : NONE\r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getLtInvestYr();
        double[] doubleArray5 = fieldData2.getEpsDilContYr();
        double[] doubleArray6 = fieldData2.getOtherLtAssetsYr();
        long long7 = fieldData2.getVolumeMonth3m();
        double double8 = fieldData2.getInsiderOwnership();
        double[] doubleArray9 = fieldData2.getEpsYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        double[] doubleArray7 = fieldData2.getEquityYr();
        double[] doubleArray8 = fieldData2.getIncPrimaryEpsYr();
        long long9 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11273");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        java.lang.String str8 = fieldData2.getWeb();
        double[] doubleArray9 = fieldData2.getIntExpYr();
        double[] doubleArray10 = fieldData2.getCashYr();
        double[] doubleArray11 = fieldData2.getEquityYr();
        java.lang.String str12 = fieldData2.getState();
        double[] doubleArray13 = fieldData2.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11274");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = sharesFileData0.getExchange();
        sharesFileData0.setFromReport((int) (byte) 10, 100);
        sharesFileData0.setInstOwnership("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum18 = sharesFileData17.getExchange();
        sharesFileData17.setInsiderNetTrades("out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertNull(exchEnum18);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11275");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getName();
        int int4 = sharesFileData0.getInsiderNetTrades();
        double double5 = sharesFileData0.getPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11276");
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
        boolean boolean48 = companyFileData0.isDrp();
        boolean boolean49 = companyFileData0.isAdr();
        companyFileData0.setStreet("data/BigDB/");
        java.lang.String str52 = companyFileData0.getTicker();
        companyFileData0.setZip("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDrp("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
        companyFileData0.setCountry("out/BigDB/-1/Q0/out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data--1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        boolean boolean59 = companyFileData0.isAdr();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11277");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = estimateFileData8.getExchange();
        double double10 = estimateFileData8.getEpsY1();
        net.ajaskey.common.DateTime dateTime11 = estimateFileData8.getLatestQtrEps();
        java.lang.String str12 = estimateFileData8.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setDowIndex("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ0();
        double double15 = estimateFileData13.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData13);
        double double17 = estimateFileData16.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean19 = companyFileData18.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum20 = companyFileData18.getDowIndex();
        companyFileData18.setZip("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum23 = companyFileData18.getDowIndex();
        estimateFileData16.setNameFields(companyFileData18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int26 = sharesFileData25.getInstShareholders();
        double double27 = sharesFileData25.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData28.setFromReport((int) (byte) 0, 0);
        double[] doubleArray32 = sharesFileData28.getSharesQ();
        sharesFileData25.setSharesQ(doubleArray32);
        sharesFileData25.setInstShareholders("NONE");
        sharesFileData25.setInsiderOwnership("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String[] strArray39 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData44 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray46 = incSheetFileData45.getPreTaxIncYr();
        double[] doubleArray47 = incSheetFileData45.getEpsDilContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData48 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray52 = fieldData51.getCogsYr();
        double[] doubleArray53 = fieldData51.getIntExpYr();
        double double54 = fieldData51.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = fieldData51.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData4, estimateFileData16, sharesFileData25, incSheetFileData45, balSheetFileData48, cashFileData55, (int) (short) 0, (int) ' ');
        double[] doubleArray59 = incSheetFileData45.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dowEnum20);
        org.junit.Assert.assertNull(dowEnum23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(sharesFileData42);
        org.junit.Assert.assertNotNull(incSheetFileData43);
        org.junit.Assert.assertNotNull(incSheetFileData44);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData55);
        org.junit.Assert.assertNull(doubleArray59);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11279");
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
        java.lang.String str49 = balSheetFileData35.toDbOutput();
        double[] doubleArray50 = balSheetFileData35.getAcctPayableQtr();
        java.lang.String str51 = balSheetFileData35.toDbOutput();
        double[] doubleArray52 = balSheetFileData35.getTotalLiabQtr();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(doubleArray52);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11280");
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
        double[] doubleArray13 = balSheetFileData1.getBvpsQtr();
        java.lang.String str14 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11281");
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
        double[] doubleArray20 = incSheetFileData5.getRdQtr();
        double[] doubleArray21 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray22 = incSheetFileData5.getAdjToIncYr();
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
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11282");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double[] doubleArray9 = fieldData2.getCapEx();
        double double10 = fieldData2.getEpsQ1();
        int int11 = fieldData2.getInsiderNetTrades();
        double[] doubleArray12 = fieldData2.getEpsDilQtr();
        double[] doubleArray13 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double[] doubleArray6 = fieldData2.getTotalOpExpYr();
        boolean boolean7 = fieldData2.isAdr();
        double double8 = fieldData2.getInsiderOwnership();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11284");
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
        double[] doubleArray37 = incSheetFileData20.getDividendYr();
        double[] doubleArray38 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray39 = incSheetFileData20.getEpsContYr();
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
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11285");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum10 = companyFileData9.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum11 = companyFileData9.getDowIndex();
        java.lang.String str12 = companyFileData9.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum13 = companyFileData9.getDowIndex();
        java.lang.String str14 = companyFileData9.getName();
        companyFileData9.setCountry("out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double18 = estimateFileData17.getEpsQ0();
        double double19 = estimateFileData17.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData17);
        double double21 = estimateFileData20.getEpsY0();
        java.lang.String str22 = estimateFileData20.getTicker();
        net.ajaskey.common.DateTime dateTime23 = estimateFileData20.getLatestQtrEps();
        net.ajaskey.common.DateTime dateTime24 = estimateFileData20.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData25.setFromReport((int) (short) 1, 0);
        sharesFileData25.setVolume3m("");
        double double31 = sharesFileData25.getInsiderNetPercentOutstanding();
        sharesFileData25.setDollar3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int34 = sharesFileData25.getInsiderSells();
        sharesFileData25.setMktCap("NONE");
        double double37 = sharesFileData25.getPrice52lo();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData43 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList41);
        double[] doubleArray44 = incSheetFileData43.getOtherIncYr();
        double[] doubleArray45 = incSheetFileData43.getEpsContQtr();
        double[] doubleArray46 = incSheetFileData43.getDividendYr();
        java.lang.String[] strArray52 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData55 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList53);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData56 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList53);
        incSheetFileData43.setNameFields(companyFileData56);
        double[] doubleArray58 = incSheetFileData43.getOtherIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray62 = fieldData61.getCogsYr();
        double[] doubleArray63 = fieldData61.getGrossIncQtr();
        double double64 = fieldData61.getEpsY1();
        double[] doubleArray65 = fieldData61.getDividendYr();
        double[] doubleArray66 = fieldData61.getOtherIncYr();
        double double67 = fieldData61.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData68 = fieldData61.getBalSheetData();
        double[] doubleArray69 = balSheetFileData68.getLtDebtQtr();
        double[] doubleArray70 = balSheetFileData68.getGoodwillQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData73 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray74 = fieldData73.getCogsYr();
        double[] doubleArray75 = fieldData73.getIntExpYr();
        double[] doubleArray76 = fieldData73.getLtDebtQtr();
        double[] doubleArray77 = fieldData73.getGoodwillYr();
        double double78 = fieldData73.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData79 = fieldData73.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData82 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData20, sharesFileData25, incSheetFileData43, balSheetFileData68, cashFileData79, 100, (int) (short) 100);
        double[] doubleArray83 = incSheetFileData43.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(snpEnum10);
        org.junit.Assert.assertNull(dowEnum11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dowEnum13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dateTime23);
        org.junit.Assert.assertNull(dateTime24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(incSheetFileData43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(companyFileData55);
        org.junit.Assert.assertNotNull(companyFileData56);
        org.junit.Assert.assertNull(doubleArray58);
        org.junit.Assert.assertNull(doubleArray62);
        org.junit.Assert.assertNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(balSheetFileData68);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(doubleArray75);
        org.junit.Assert.assertNull(doubleArray76);
        org.junit.Assert.assertNull(doubleArray77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData79);
        org.junit.Assert.assertNull(doubleArray83);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11286");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/10/Q100/out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-10Q100.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/-1/Q0/out/BigDB/-1/Q35/-fundamental-data--1Q35.-fundamental-data--1Q0.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray10 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/-1/Q35/-fundamental-data--1Q35.", "ticker      : \r\n  name      : NONE\r\n  exchange  : null\r\n  sector    : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  industry  : null\r\n  sic       : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : \r\n  country   : out/BigDB/\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", "out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11287");
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
        long long13 = fieldData2.getVolume10d();
        double[] doubleArray14 = fieldData2.getTotalOpExpYr();
        double[] doubleArray15 = fieldData2.getLtDebtQtr();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11288");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/35/Q-1/-fundamental-data-35Q-1.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11289");
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
        long long13 = fieldData2.getVolume10d();
        double[] doubleArray14 = fieldData2.getTotalOpExpYr();
        double[] doubleArray15 = fieldData2.getOtherIncQtr();
        double[] doubleArray16 = fieldData2.getEpsYr();
        double[] doubleArray17 = fieldData2.getLiabEquityQtr();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        sharesFileData0.setInstOwnership("Cash File Data");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderSellShrs("out/BigDB/1/Q1/out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data-fundamental-data-1Q1.hi!");
        double[] doubleArray10 = sharesFileData0.getSharesQ();
        sharesFileData0.setInstOwnership("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        java.lang.String str13 = sharesFileData0.getSector();
        java.lang.String str14 = sharesFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData0.setSic("out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : ??  name      : null??  exchange  : null??  sector    : null??  industry  : null??  sic       : null??  employees : 0??  snp index : ??  dow index : ??  adr       : false??  drp       : false??  street    : null??  city      : null??  state     : null??  country   : null??  zip       : null??  phone     : null??  web       : null??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11292");
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
        java.lang.String str39 = incSheetFileData20.getSector();
        double[] doubleArray40 = incSheetFileData20.getEpsDilQtr();
        double[] doubleArray41 = incSheetFileData20.getPreTaxIncQtr();
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
        org.junit.Assert.assertNull(doubleArray41);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11293");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        double[] doubleArray10 = fieldData2.getSalesYr();
        double[] doubleArray11 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11294");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray11 = incSheetFileData10.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData10.getIntExpNonOpQtr();
        double[] doubleArray13 = incSheetFileData10.getEpsDilContQtr();
        double[] doubleArray14 = incSheetFileData10.getEpsDilContYr();
        double[] doubleArray15 = incSheetFileData10.getRdYr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData1.toString();
        double[] doubleArray7 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11296");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        int int7 = fieldData2.getYear();
        double double8 = fieldData2.getEpsQ1();
        int int9 = fieldData2.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = fieldData2.getBalSheetData();
        double[] doubleArray11 = balSheetFileData10.getStInvestYr();
        java.lang.String str12 = balSheetFileData10.getIndustry();
        double[] doubleArray13 = balSheetFileData10.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11297");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = cashFileData3.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData3);
        double[] doubleArray6 = cashFileData5.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData5);
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11298");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, (int) (byte) 1);
        double[] doubleArray3 = fieldData2.getLtInvestYr();
        double[] doubleArray4 = fieldData2.getGoodwillQtr();
        double[] doubleArray5 = fieldData2.getCogsYr();
        double[] doubleArray6 = fieldData2.getIntExpQtr();
        int int7 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11299");
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
        double[] doubleArray12 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray13 = fieldData2.getLiabEquityYr();
        double[] doubleArray14 = fieldData2.getCashFromFin();
        double[] doubleArray15 = fieldData2.getUnusualIncQtr();
        double[] doubleArray16 = fieldData2.getOtherCurrAssetsYr();
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
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEquityYr();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        java.lang.String str12 = fieldData2.getCountry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11301");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderSellShrs("out/BigDB/");
        sharesFileData0.setVolume10d("");
        sharesFileData0.setInsiderNetPercentOutstanding("NONE");
        sharesFileData0.setInsiderBuys("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        int int12 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11302");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 0);
        double[] doubleArray3 = fieldData2.getCogsQtr();
        double[] doubleArray4 = fieldData2.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11303");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getCogsYr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = incSheetFileData5.getExchange();
        double[] doubleArray11 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray12 = incSheetFileData5.getCogsYr();
        java.lang.String str13 = incSheetFileData5.getSector();
        double[] doubleArray14 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray15 = incSheetFileData5.getIncPrimaryEpsQtr();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str11 = sharesFileData0.getTicker();
        int int12 = sharesFileData0.getInstShareholders();
        sharesFileData0.setFromReport((int) (byte) 10, 35);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11305");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsContYr();
        double[] doubleArray11 = incSheetFileData5.getIntExpNonOpQtr();
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
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11306");
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
        double double38 = fieldData35.getEpsY0();
        double[] doubleArray39 = fieldData35.getOtherCurrAssetsYr();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(doubleArray39);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabYr();
        double[] doubleArray7 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray8 = balSheetFileData2.getInventoryQtr();
        double[] doubleArray9 = balSheetFileData2.getEquityYr();
        double[] doubleArray10 = balSheetFileData2.getCashYr();
        double[] doubleArray11 = balSheetFileData2.getOtherCurrAssetsYr();
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
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getDepreciationYr();
        double[] doubleArray9 = fieldData2.getSalesYr();
        double[] doubleArray10 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11309");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        java.lang.String str3 = companyFileData0.getSnpIndexStr();
        java.lang.String str4 = companyFileData0.getZip();
        java.lang.String str5 = companyFileData0.getSnpIndexStr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        int int5 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInsiderNetTrades("data/BigDB/");
        sharesFileData0.setInstSellShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = sharesFileData0.getExchange();
        int int11 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/0/Q100/out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q100.out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        double[] doubleArray4 = fieldData2.getOtherCurrAssetsYr();
        java.lang.String str5 = fieldData2.getCountry();
        double[] doubleArray6 = fieldData2.getGrossIncQtr();
        int int7 = fieldData2.getNumEmployees();
        double[] doubleArray8 = fieldData2.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.getTicker();
        double[] doubleArray8 = balSheetFileData2.getCashYr();
        double[] doubleArray9 = balSheetFileData2.getLtDebtQtr();
        double[] doubleArray10 = balSheetFileData2.getLiabEquityQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
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
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11314");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsQtr();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
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
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getStDebtYr();
        java.lang.String str10 = fieldData2.getState();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11316");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray21 = incSheetFileData20.getGrossOpExpYr();
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
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11317");
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
        double double44 = estimateFileData42.getEpsY1();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getName();
        long long4 = sharesFileData0.getVolumeMonth3m();
        double[] doubleArray5 = sharesFileData0.getSharesY();
        sharesFileData0.setInstShareholders("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
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
        sharesFileData0.setSharesQ(doubleArray17);
        long long20 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        double[] doubleArray7 = fieldData2.getIncTaxYr();
        double[] doubleArray8 = fieldData2.getEpsContQtr();
        int int9 = fieldData2.getYear();
        double double10 = fieldData2.getEpsQ1();
        double[] doubleArray11 = fieldData2.getPreTaxIncYr();
        double double12 = fieldData2.getEpsY0();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11320");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", "out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray12 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : NONE\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q0/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-100Q0.", "out/BigDB/1/Q0/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11321");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray12 = incSheetFileData5.getAdjToIncYr();
        java.lang.String str13 = incSheetFileData5.getIndustry();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double double6 = fieldData2.getPrice52lo();
        double[] doubleArray7 = fieldData2.getEquityYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        double[] doubleArray9 = fieldData2.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        double[] doubleArray11 = fieldData2.getEpsDilYr();
        double double12 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11323");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData7.getNetFixedAssetsQtr();
        java.lang.String str10 = balSheetFileData7.toString();
        double[] doubleArray11 = balSheetFileData7.getStDebtQtr();
        double[] doubleArray12 = balSheetFileData7.getTotalLiabQtr();
        double[] doubleArray13 = balSheetFileData7.getOtherLtAssetsYr();
        double[] doubleArray14 = balSheetFileData7.getOtherLtAssetsYr();
        double[] doubleArray15 = balSheetFileData7.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        double[] doubleArray4 = fieldData2.getCurrLiabQtr();
        double[] doubleArray5 = fieldData2.getAcctRxYr();
        double[] doubleArray6 = fieldData2.getGoodwillQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = fieldData2.getEstimateData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(estimateFileData7);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getLtInvestYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        java.lang.String str1 = incSheetFileData0.toString();
        java.lang.String str2 = incSheetFileData0.getIndustry();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        java.lang.String str10 = balSheetFileData1.toString();
        double[] doubleArray11 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray12 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray13 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray14 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray15 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        double double6 = sharesFileData0.getBeta();
        double double7 = sharesFileData0.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean9 = companyFileData8.isAdr();
        companyFileData8.setDrp("out/BigDB/");
        companyFileData8.setState("NONE");
        sharesFileData0.setNameFields(companyFileData8);
        double double15 = sharesFileData0.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData16.setFromReport((int) (short) 1, 0);
        sharesFileData16.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum22 = sharesFileData16.getExchange();
        java.lang.String str23 = sharesFileData16.getName();
        long long24 = sharesFileData16.getVolumeMonth3m();
        sharesFileData16.setBeta("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData16.setInstOwnership("out/BigDB/");
        double[] doubleArray35 = new double[] { 10.0d, 10L, (byte) 0, (short) 100, 0.0d, 'a' };
        sharesFileData16.setSharesQ(doubleArray35);
        double[] doubleArray37 = sharesFileData16.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(exchEnum22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 0.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 0.0, 100.0, 0.0, 97.0]");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double[] doubleArray10 = fieldData2.getIncTaxQtr();
        double[] doubleArray11 = fieldData2.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        double[] doubleArray6 = fieldData2.getGoodwillQtr();
        java.lang.String str7 = fieldData2.getName();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getEpsDilQtr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11332");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsYr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getCogsYr();
        double[] doubleArray13 = incSheetFileData5.getDividendQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("");
        companyFileData0.setDowIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str10 = companyFileData0.getState();
        companyFileData0.setStreet("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str13 = companyFileData0.getSector();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11334");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory(100, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setName("NONE");
        companyFileData0.setNumEmployees("NONE");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum6 = companyFileData0.getDowIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str8 = companyFileData0.getPhone();
        companyFileData0.setAdr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dowEnum6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11336");
        java.lang.String[] strArray3 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data" };
        java.lang.String[] strArray9 = new java.lang.String[] { "Cash File Data", "data/BigDB/", "out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", "out/BigDB/10/Q100/out/BigDB/97/Q100/Cash File Data-fundamental-data-97Q100.out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE-fundamental-data-10Q100.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
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
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData10.setFromReport((int) (short) 1, 0);
        sharesFileData10.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum16 = sharesFileData10.getExchange();
        java.lang.String str17 = sharesFileData10.getName();
        int int18 = sharesFileData10.getInstShareholders();
        sharesFileData10.setInsiderNetTrades("hi!");
        int int21 = sharesFileData10.getInsiderSellShrs();
        double[] doubleArray22 = sharesFileData10.getSharesQ();
        sharesFileData9.setSharesY(doubleArray22);
        int int24 = sharesFileData9.getInstBuyShrs();
        double[] doubleArray25 = sharesFileData9.getSharesQ();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        double[] doubleArray32 = incSheetFileData31.getEpsContYr();
        double[] doubleArray33 = incSheetFileData31.getIncTaxYr();
        double[] doubleArray34 = incSheetFileData31.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray38 = fieldData37.getCogsYr();
        int int39 = fieldData37.getNumEmployees();
        double double40 = fieldData37.getPrice52hi();
        double[] doubleArray41 = fieldData37.getStDebtYr();
        double[] doubleArray42 = fieldData37.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData43 = fieldData37.getCompanyInfo();
        java.lang.String str44 = companyFileData43.getZip();
        incSheetFileData31.setNameFields(companyFileData43);
        companyFileData43.setNumEmployees("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData43.setNumEmployees("out/BigDB/-1/Q35/-fundamental-data--1Q35.");
        sharesFileData9.setNameFields(companyFileData43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNull(exchEnum16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNotNull(companyFileData43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11338");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData17.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double21 = estimateFileData20.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int23 = sharesFileData22.getInstShareholders();
        double double24 = sharesFileData22.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData25.setFromReport((int) (byte) 0, 0);
        double[] doubleArray29 = sharesFileData25.getSharesQ();
        sharesFileData22.setSharesQ(doubleArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData22);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData37 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList35);
        double[] doubleArray38 = incSheetFileData37.getEpsContYr();
        double[] doubleArray39 = incSheetFileData37.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData40);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData41);
        double[] doubleArray43 = balSheetFileData42.getLtDebtYr();
        java.lang.String str44 = balSheetFileData42.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData48 = fieldData47.getCashData();
        double[] doubleArray49 = cashFileData48.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData17, estimateFileData20, sharesFileData31, incSheetFileData37, balSheetFileData42, cashFileData48, (int) '#', 0);
        double[] doubleArray53 = fieldData52.getEpsContQtr();
        double[] doubleArray54 = fieldData52.getIncTaxYr();
        double[] doubleArray55 = fieldData52.getInventoryYr();
        double[] doubleArray56 = fieldData52.getSharesY();
        sharesFileData0.setSharesQ(doubleArray56);
        int int58 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(incSheetFileData37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(cashFileData48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11339");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        double[] doubleArray7 = fieldData2.getEpsDilYr();
        double[] doubleArray8 = fieldData2.getCashQtr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11340");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        double[] doubleArray5 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray7 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray8 = balSheetFileData2.getEquityQtr();
        double[] doubleArray9 = balSheetFileData2.getCurrLiabQtr();
        double[] doubleArray10 = balSheetFileData2.getOtherCurrAssetsYr();
        double[] doubleArray11 = balSheetFileData2.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        int int7 = fieldData2.getInstSellShrs();
        double[] doubleArray8 = fieldData2.getDividendYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("ticker      : \r\n  name      : NONE\r\n  exchange  : null\r\n  sector    : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : NONE\r\n  state     : \r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11343");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double double10 = estimateFileData9.getEpsQ0();
        java.lang.String str11 = estimateFileData9.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11344");
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
        companyFileData11.setStreet("out/BigDB/0/Q100/out/BigDB/97/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-97Q6.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q100.out/BigDB/52/Q10/out/BigDB/-fundamental-data-52Q10.out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
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
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        java.lang.String str4 = estimateFileData1.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        java.lang.String str6 = estimateFileData1.getIndustry();
        double double7 = estimateFileData1.getEpsQ1();
        double double8 = estimateFileData1.getEpsQ1();
        double double9 = estimateFileData1.getEpsY2();
        java.lang.String str10 = estimateFileData1.getIndustry();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 1, (int) 'a');
        double[] doubleArray3 = fieldData2.getAdjToIncYr();
        double[] doubleArray4 = fieldData2.getDividendYr();
        double[] doubleArray5 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11347");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray11 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray12 = incSheetFileData5.getEpsDilQtr();
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
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11348");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getEquityYr();
        double[] doubleArray6 = balSheetFileData1.getBvpsYr();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11349");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double double10 = fieldData2.getDollar3m();
        double[] doubleArray11 = fieldData2.getLiabEquityYr();
        double[] doubleArray12 = fieldData2.getLtInvestQtr();
        double[] doubleArray13 = fieldData2.getIntExpQtr();
        double[] doubleArray14 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray15 = fieldData2.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double double5 = fieldData2.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum7 = fieldData2.getSnpIndex();
        java.lang.String str8 = fieldData2.getZip();
        double[] doubleArray9 = fieldData2.getStInvestYr();
        double[] doubleArray10 = fieldData2.getCashYr();
        boolean boolean11 = fieldData2.isDrp();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(snpEnum7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str3 = companyFileData0.getState();
        java.lang.String str4 = companyFileData0.getCity();
        java.lang.String str5 = companyFileData0.getZip();
        java.lang.String str6 = companyFileData0.getStreet();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        double[] doubleArray5 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData2.getTotalAssetsQtr();
        java.lang.String str7 = balSheetFileData2.getIndustry();
        double[] doubleArray8 = balSheetFileData2.getAcctRxQtr();
        double[] doubleArray9 = balSheetFileData2.getStDebtQtr();
        double[] doubleArray10 = balSheetFileData2.getOtherCurrLiabQtr();
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
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11353");
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
        double[] doubleArray37 = incSheetFileData20.getDividendYr();
        double[] doubleArray38 = incSheetFileData20.getIncTaxQtr();
        java.lang.String str39 = incSheetFileData20.toString();
        double[] doubleArray40 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray41 = incSheetFileData20.getIncPrimaryEpsQtr();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11354");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double[] doubleArray9 = fieldData2.getCapEx();
        java.lang.String str10 = fieldData2.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = fieldData2.getIncSheetData();
        double[] doubleArray12 = incSheetFileData11.getEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests22.test11355");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        double double9 = sharesFileData0.getMktCap();
        sharesFileData0.setInsiderNetPercentOutstanding("NONE");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData12.setInstSellShrs("out/BigDB/0/Q32/out/BigDB/35/Q-1/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-35Q-1.NONE-fundamental-data-0Q32.out/BigDB/35/Q100/out/BigDB/10/Q100/out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-10Q100.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : NONE\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-35Q100.out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }
}
