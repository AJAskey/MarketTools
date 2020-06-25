package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01501");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getEpsDilQtr();
        java.lang.String str7 = fieldData2.getWeb();
        double[] doubleArray8 = fieldData2.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01502");
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
        sharesFileData0.setInstBuyShrs("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
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
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        int int8 = fieldData2.getInstSellShrs();
        double[] doubleArray9 = fieldData2.getSalesYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01504");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        java.lang.String str9 = incSheetFileData5.getIndustry();
        double[] doubleArray10 = incSheetFileData5.getIncTaxQtr();
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
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", (int) 'a', (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01506");
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
        sharesFileData9.setInstShareholders("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData9.setInsiderBuys("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str16 = sharesFileData9.getTicker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01507");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        long long4 = fieldData2.getVolumeMonth3m();
        boolean boolean5 = fieldData2.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getStDebtQtr();
        double[] doubleArray8 = fieldData2.getGrossIncYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01508");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        sharesFileData0.setFromReport((int) (short) 0, (int) (short) 10);
        double double14 = sharesFileData0.getMktCap();
        double[] doubleArray15 = sharesFileData0.getSharesQ();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01509");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        java.lang.String str3 = companyFileData0.getCountry();
        java.lang.String str4 = companyFileData0.toDbOuput();
        java.lang.String str5 = companyFileData0.getCity();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str4, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        java.lang.String str2 = sharesFileData0.getName();
        double[] doubleArray3 = sharesFileData0.getSharesY();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int5 = sharesFileData4.getInstShareholders();
        double double6 = sharesFileData4.getInsiderNetPercentOutstanding();
        java.lang.String str7 = sharesFileData4.getName();
        long long8 = sharesFileData4.getVolumeMonth3m();
        double[] doubleArray9 = sharesFileData4.getSharesY();
        sharesFileData0.setSharesQ(doubleArray9);
        java.lang.String str11 = sharesFileData0.getIndustry();
        double double12 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01511");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray11 = incSheetFileData10.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData10.getIntExpNonOpQtr();
        double[] doubleArray13 = incSheetFileData10.getGrossIncYr();
        double[] doubleArray14 = incSheetFileData10.getIncTaxYr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01512");
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
        double[] doubleArray14 = fieldData2.getAcctPayableQtr();
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
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01513");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "out/BigDB/-1/Q35/-fundamental-data--1Q35.", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 1, (int) (short) -1, filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01515");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        java.lang.String str7 = balSheetFileData1.getIndustry();
        double[] doubleArray8 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray9 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray10 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01516");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum7 = fieldData2.getDowIndex();
        java.lang.String str8 = fieldData2.getDowIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(dowEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01517");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = companyFileData0.getExchange();
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setDowIndex("out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str13 = companyFileData0.getIndustry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        double double6 = sharesFileData0.getBeta();
        sharesFileData0.setVolume3m("Cash File Data");
        java.lang.String str9 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str9, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01519");
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
        double[] doubleArray12 = incSheetFileData5.getTotalOpExpQtr();
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
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData8.setFromReport((int) (short) 1, (int) '#');
        sharesFileData8.setPrice("out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01521");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum41 = companyFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum42 = companyFileData0.getDowIndex();
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
        org.junit.Assert.assertNull(exchEnum41);
        org.junit.Assert.assertTrue("'" + dowEnum42 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum.NONE + "'", dowEnum42.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum.NONE));
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01522");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", (int) (byte) 1, (int) (byte) 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01523");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getRdQtr();
        double[] doubleArray8 = fieldData2.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01524");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getNonrecurringItemsYr();
        java.lang.String str7 = fieldData2.getState();
        long long8 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01525");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        int int4 = fieldData2.getQuarter();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray6 = fieldData2.getIncTaxYr();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        java.lang.String str8 = fieldData2.getZip();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01526");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(10, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01527");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        sharesFileData0.setInsiderBuyShrs("out/BigDB/");
        double[] doubleArray8 = sharesFileData0.getSharesY();
        java.lang.String str9 = sharesFileData0.getName();
        double double10 = sharesFileData0.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        java.lang.String str4 = sharesFileData0.getSector();
        int int5 = sharesFileData0.getInstShareholders();
        java.lang.String str6 = sharesFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01529");
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
        companyFileData38.setStreet("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        companyFileData38.setNumEmployees("out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
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
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01530");
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
        double[] doubleArray36 = fieldData35.getTotalOpExpYr();
        double[] doubleArray37 = fieldData35.getGoodwillQtr();
        boolean boolean38 = fieldData35.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum39 = fieldData35.getDowIndex();
        double[] doubleArray40 = fieldData35.getGrossOpExpQtr();
        boolean boolean41 = fieldData35.isAdr();
        double[] doubleArray42 = fieldData35.getNetFixedAssetsQtr();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(dowEnum39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(doubleArray42);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01531");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double[] doubleArray10 = fieldData2.getGrossIncYr();
        double[] doubleArray11 = fieldData2.getPreTaxIncYr();
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
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01532");
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
        double[] doubleArray36 = balSheetFileData25.getGoodwillYr();
        double[] doubleArray37 = balSheetFileData25.getCurrAssetsQtr();
        double[] doubleArray38 = balSheetFileData25.getPrefStockQtr();
        java.lang.String str39 = balSheetFileData25.toDbOutput();
        double[] doubleArray40 = balSheetFileData25.getEquityYr();
        java.lang.String str41 = balSheetFileData25.getTicker();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01533");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        boolean boolean4 = fieldData2.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        double[] doubleArray6 = cashFileData5.getCashFromOpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01534");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData0.setNumEmployees("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        java.lang.String str8 = companyFileData0.getWeb();
        java.lang.String str9 = companyFileData0.getSnpIndexStr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01535");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double[] doubleArray8 = new double[] {};
        sharesFileData0.setSharesY(doubleArray8);
        sharesFileData0.setInsiderNetTrades("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        double double12 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str13 = sharesFileData0.getSector();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01537");
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
        double[] doubleArray54 = fieldData52.getIncTaxQtr();
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
        org.junit.Assert.assertNull(doubleArray54);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01538");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.toString();
        java.lang.String str3 = companyFileData0.getSic();
        java.lang.String str4 = companyFileData0.toString();
        boolean boolean5 = companyFileData0.isDrp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01539");
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
        double[] doubleArray18 = fieldData2.getCashFromInv();
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
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01540");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
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
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01541");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getCashQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01542");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        long long5 = fieldData2.getVolumeMonth3m();
        double[] doubleArray6 = fieldData2.getIncTaxYr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        double[] doubleArray8 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01543");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", (int) '#', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01544");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isDrp();
        companyFileData0.setState("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum6 = companyFileData0.getDowIndex();
        java.lang.String str7 = companyFileData0.getTicker();
        companyFileData0.setCity("out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dowEnum6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01545");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        java.lang.String str23 = cashFileData22.getTicker();
        double[] doubleArray24 = cashFileData22.getCapExQtr();
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
        org.junit.Assert.assertNotNull(cashFileData22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(doubleArray24);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01546");
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
        double[] doubleArray40 = incSheetFileData20.getCogsQtr();
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
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01547");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        int int6 = sharesFileData0.getInstShareholders();
        java.lang.String str7 = sharesFileData0.getSector();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setFromReport((int) (byte) 10, (int) (byte) 1);
        sharesFileData0.setInsiderOwnership("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        long long14 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01548");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01549");
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
        double double16 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setDollar3m("out/BigDB/");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01550");
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
        double[] doubleArray12 = fieldData2.getStDebtQtr();
        double[] doubleArray13 = fieldData2.getOtherLtAssetsYr();
        double[] doubleArray14 = fieldData2.getPreTaxIncQtr();
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
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01551");
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
        java.lang.String str76 = cashFileData70.getTicker();
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
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01552");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str9 = companyFileData8.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01553");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        double double5 = sharesFileData0.getPrice52lo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01554");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.getTicker();
        java.lang.String str8 = balSheetFileData2.toDbOutput();
        double[] doubleArray9 = balSheetFileData2.getLiabEquityQtr();
        double[] doubleArray10 = balSheetFileData2.getStInvestQtr();
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
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01555");
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
        int int38 = fieldData35.getInsiderBuyShrs();
        double[] doubleArray39 = fieldData35.getEpsContQtr();
        double[] doubleArray40 = fieldData35.getPrefStockQtr();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01556");
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
        companyFileData0.setDrp("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        boolean boolean38 = companyFileData0.isDrp();
        companyFileData0.setWeb("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        java.lang.String str41 = companyFileData0.getState();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01557");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = fieldData35.getIncSheetData();
        double[] doubleArray37 = incSheetFileData36.getDepreciationQtr();
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
        org.junit.Assert.assertNotNull(incSheetFileData36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01558");
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
        double[] doubleArray14 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray15 = fieldData2.getOtherLtAssetsQtr();
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
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01559");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getEpsDilYr();
        double[] doubleArray7 = fieldData2.getNetIncYr();
        double[] doubleArray8 = fieldData2.getAcctRxYr();
        double[] doubleArray9 = fieldData2.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01560");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) 10, (int) '#', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01561");
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
        double[] doubleArray48 = fieldData47.getEquityQtr();
        double[] doubleArray49 = fieldData47.getInventoryYr();
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
        org.junit.Assert.assertNull(doubleArray49);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01562");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        long long5 = fieldData2.getVolumeMonth3m();
        double[] doubleArray6 = fieldData2.getAcctPayableQtr();
        double double7 = fieldData2.getPrice52lo();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01563");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData5.getRdQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray12 = incSheetFileData5.getUnusualIncYr();
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
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShares();
        double double5 = fieldData2.getEpsQ1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01565");
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
        sharesFileData9.setInstShareholders("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData9.setInsiderBuys("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData9.setDollar3m("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01566");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "out/BigDB/-1/Q35/-fundamental-data--1Q35.", "ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01567");
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
        double[] doubleArray36 = balSheetFileData25.getGoodwillYr();
        java.lang.String[] strArray42 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        java.lang.String str46 = companyFileData45.getCountry();
        companyFileData45.setAdr("out/BigDB/");
        balSheetFileData25.setNameFields(companyFileData45);
        double[] doubleArray50 = balSheetFileData25.getEquityQtr();
        double[] doubleArray51 = balSheetFileData25.getOtherCurrLiabYr();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(companyFileData45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01568");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean12 = companyFileData11.isAdr();
        java.lang.String str13 = companyFileData11.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum14 = companyFileData11.getSnpIndex();
        java.lang.String str15 = companyFileData11.toString();
        companyFileData11.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double19 = estimateFileData18.getEpsQ0();
        double double20 = estimateFileData18.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int23 = sharesFileData22.getInstShareholders();
        double double24 = sharesFileData22.getDollar3m();
        double double25 = sharesFileData22.getDollar3m();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData32 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData33);
        double[] doubleArray35 = balSheetFileData33.getCurrLiabYr();
        double[] doubleArray36 = balSheetFileData33.getStDebtQtr();
        double[] doubleArray37 = balSheetFileData33.getOtherLtLiabYr();
        java.lang.String[] strArray43 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList44);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData47 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList44);
        double[] doubleArray48 = cashFileData47.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData11, estimateFileData21, sharesFileData22, incSheetFileData31, balSheetFileData33, cashFileData47, (int) (short) 10, (int) (byte) 0);
        incSheetFileData5.setNameFields(companyFileData11);
        double[] doubleArray53 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray54 = incSheetFileData5.getCogsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(snpEnum14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(companyFileData46);
        org.junit.Assert.assertNotNull(cashFileData47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getDividendQtr();
        double[] doubleArray10 = fieldData2.getUnusualIncQtr();
        double[] doubleArray11 = fieldData2.getEpsDilQtr();
        double[] doubleArray12 = fieldData2.getNonrecurringItemsQtr();
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
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01570");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getName();
        int int4 = sharesFileData0.getInsiderSellShrs();
        java.lang.String str5 = sharesFileData0.getSector();
        sharesFileData0.setInsiderNetPercentOutstanding("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double8 = sharesFileData0.getDollar3m();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01571");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        sharesFileData0.setInsiderNetTrades("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        sharesFileData0.setBeta("out/BigDB/35/Q100/out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!-fundamental-data-35Q100.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01572");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double[] doubleArray10 = fieldData2.getStDebtQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01573");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01574");
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
        java.lang.String str15 = estimateFileData12.getIndustry();
        net.ajaskey.common.DateTime dateTime16 = estimateFileData12.getCurrFiscalYear();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dateTime16);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01575");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        sharesFileData0.setInsiderSells("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setFloatshr("hi!");
        sharesFileData0.setInsiderBuys("out/BigDB/35/Q100/out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!-fundamental-data-35Q100.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01576");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double[] doubleArray8 = fieldData2.getEpsDilContQtr();
        double[] doubleArray9 = fieldData2.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        double double11 = sharesFileData10.getFloatshr();
        sharesFileData10.setVolume10d("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01577");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getInventoryQtr();
        double[] doubleArray10 = fieldData2.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01578");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01579");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        companyFileData8.setCountry("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01580");
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
        fieldData2.setYear(100);
        double[] doubleArray22 = fieldData2.getTotalOpExpQtr();
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
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01581");
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
        double[] doubleArray48 = incSheetFileData24.getEpsDilYr();
        double[] doubleArray49 = incSheetFileData24.getEpsDilContYr();
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
        org.junit.Assert.assertNull(doubleArray49);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01582");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = estimateFileData3.getExchange();
        double double6 = estimateFileData3.getEpsY1();
        java.lang.Class<?> wildcardClass7 = estimateFileData3.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01583");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double double10 = fieldData2.getDollar3m();
        double[] doubleArray11 = fieldData2.getEpsDilQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01584");
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
        java.lang.String[] strArray43 = new java.lang.String[] { "Cash File Data", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "NONE" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList44);
        java.lang.String str47 = companyFileData46.getName();
        estimateFileData3.setNameFields(companyFileData46);
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(companyFileData46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01585");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        int int4 = sharesFileData0.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        int int6 = sharesFileData5.getInsiderBuys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01586");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray10 = incSheetFileData5.getOtherIncQtr();
        double[] doubleArray11 = incSheetFileData5.getPreTaxIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01587");
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
        double[] doubleArray14 = fieldData2.getOtherCurrLiabQtr();
        double[] doubleArray15 = fieldData2.getCogsYr();
        java.lang.String str16 = fieldData2.getWeb();
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
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01588");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01589");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getAcctRxYr();
        double[] doubleArray10 = fieldData2.getCashFromInv();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01590");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double[] doubleArray8 = fieldData2.getEpsDilContQtr();
        double[] doubleArray9 = fieldData2.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        double[] doubleArray11 = fieldData2.getSharesY();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = fieldData2.getBalSheetData();
        double[] doubleArray13 = balSheetFileData12.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(balSheetFileData12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01591");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01592");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.getTicker();
        java.lang.String str8 = balSheetFileData2.toDbOutput();
        double[] doubleArray9 = balSheetFileData2.getLiabEquityQtr();
        java.lang.String str10 = balSheetFileData2.getSector();
        java.lang.String str11 = balSheetFileData2.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01593");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        double double3 = sharesFileData0.getDollar3m();
        sharesFileData0.setMktCap("hi!");
        int int6 = sharesFileData0.getInsiderSellShrs();
        int int7 = sharesFileData0.getInsiderNetTrades();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01594");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
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
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01595");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01596");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        int int4 = fieldData2.getQuarter();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = fieldData2.getExchange();
        double[] doubleArray8 = fieldData2.getCashFromOps();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01597");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        java.lang.String str6 = fieldData2.getName();
        int int7 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("Cash File Data");
        java.lang.String str5 = companyFileData0.getCountry();
        java.lang.String str6 = companyFileData0.getName();
        boolean boolean7 = companyFileData0.isAdr();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01599");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        int int10 = companyFileData9.getNumEmployees();
        companyFileData9.setSector("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str13 = companyFileData9.toString();
        java.lang.String str14 = companyFileData9.getSnpIndexStr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01600");
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
        int int12 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01601");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum63 = companyFileData0.getSnpIndex();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.  price               : 0.000000??  price 52w high      : 0.000000??  price 52w low       : 0.000000??  float               : 0.000000??  market cap          : 0.000000??  volume 10d avg      : 0??  volume 3m avg       : 0??  dollars 3m avg      : 0.000000??  beta                : 0.000000??  insider ownership   : 0.000000??  insider buys        : 0??  insider sells       : 0??  insider buy shares  : 0??  insider sell shares : 0??  insider net shares  : 0??  inst buy shares     : 0??  inst sell shares    : 0??  inst shareholders   : 0??  inst ownership      : 0.000000??  shares quarterly    : ??  shares yearly       : ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + snpEnum63 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum.NONE + "'", snpEnum63.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum.NONE));
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01602");
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
        double[] doubleArray12 = incSheetFileData5.getNetIncYr();
        double[] doubleArray13 = incSheetFileData5.getIncTaxQtr();
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
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01603");
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
        double[] doubleArray16 = fieldData2.getRdYr();
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
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01604");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        java.lang.String str8 = fieldData2.getWeb();
        double[] doubleArray9 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderSellShrs("out/BigDB/");
        double double6 = sharesFileData0.getBeta();
        int int7 = sharesFileData0.getInsiderBuys();
        double double8 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01606");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01607");
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
        double[] doubleArray12 = incSheetFileData5.getEpsQtr();
        java.lang.String str13 = incSheetFileData5.toString();
        double[] doubleArray14 = incSheetFileData5.getIncPrimaryEpsYr();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01608");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray11 = incSheetFileData10.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData10.getIntExpNonOpQtr();
        double[] doubleArray13 = incSheetFileData10.getEpsDilContQtr();
        double[] doubleArray14 = incSheetFileData10.getEpsDilQtr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01609");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getIndustry();
        java.lang.String str4 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str4, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01610");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getDividendQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray12 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray13 = incSheetFileData5.getTotalOpExpQtr();
        double[] doubleArray14 = incSheetFileData5.getGrossIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = companyFileData1.getExchange();
        balSheetFileData0.setNameFields(companyFileData1);
        companyFileData1.setStreet("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean7 = companyFileData6.isAdr();
        java.lang.String str8 = companyFileData6.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum9 = companyFileData6.getSnpIndex();
        java.lang.String str10 = companyFileData6.toString();
        companyFileData6.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ0();
        double double15 = estimateFileData13.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int18 = sharesFileData17.getInstShareholders();
        double double19 = sharesFileData17.getDollar3m();
        double double20 = sharesFileData17.getDollar3m();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData28.getCurrLiabYr();
        double[] doubleArray31 = balSheetFileData28.getStDebtQtr();
        double[] doubleArray32 = balSheetFileData28.getOtherLtLiabYr();
        java.lang.String[] strArray38 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData41 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList39);
        double[] doubleArray43 = cashFileData42.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData6, estimateFileData16, sharesFileData17, incSheetFileData26, balSheetFileData28, cashFileData42, (int) (short) 10, (int) (byte) 0);
        java.lang.String str47 = estimateFileData16.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int49 = sharesFileData48.getInstShareholders();
        double double50 = sharesFileData48.getInsiderNetPercentOutstanding();
        java.lang.String str51 = sharesFileData48.getName();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData57 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList55);
        double[] doubleArray58 = incSheetFileData57.getEpsDilYr();
        double[] doubleArray59 = incSheetFileData57.getNetIncYr();
        double[] doubleArray60 = incSheetFileData57.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData61 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData63 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData62);
        double[] doubleArray64 = balSheetFileData63.getLtDebtYr();
        double[] doubleArray65 = balSheetFileData63.getAcctPayableQtr();
        double[] doubleArray66 = balSheetFileData63.getStDebtQtr();
        java.lang.String str67 = balSheetFileData63.getExchange();
        double[] doubleArray68 = balSheetFileData63.getGoodwillQtr();
        java.lang.String[] strArray74 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData77 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList75);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData78 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList75);
        double[] doubleArray79 = cashFileData78.getCashFromInvQtr();
        java.lang.String str80 = cashFileData78.toDbOutput();
        double[] doubleArray81 = cashFileData78.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData82 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData78);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData85 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData16, sharesFileData48, incSheetFileData57, balSheetFileData63, cashFileData78, (int) '#', 100);
        java.lang.String str86 = companyFileData1.getCountry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum87 = companyFileData1.getSnpIndex();
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(incSheetFileData26);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(companyFileData41);
        org.junit.Assert.assertNotNull(cashFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(incSheetFileData57);
        org.junit.Assert.assertNull(doubleArray58);
        org.junit.Assert.assertNull(doubleArray59);
        org.junit.Assert.assertNull(doubleArray60);
        org.junit.Assert.assertNull(doubleArray64);
        org.junit.Assert.assertNull(doubleArray65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(doubleArray68);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(companyFileData77);
        org.junit.Assert.assertNotNull(cashFileData78);
        org.junit.Assert.assertNull(doubleArray79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(snpEnum87);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01612");
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
        int int16 = fieldData2.getInsiderSellShrs();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01613");
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
        double[] doubleArray49 = fieldData47.getEquityQtr();
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
        org.junit.Assert.assertNull(doubleArray49);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01614");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray2 = incSheetFileData0.getRdQtr();
        double[] doubleArray3 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray4 = incSheetFileData0.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01615");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = sharesFileData7.getInstBuyShrs();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01616");
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
        double[] doubleArray15 = incSheetFileData5.getIntExpQtr();
        double[] doubleArray16 = incSheetFileData5.getEpsDilContYr();
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
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01617");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getSalesQtr();
        double[] doubleArray10 = incSheetFileData5.getSalesQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossIncYr();
        java.lang.String str12 = incSheetFileData5.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01618");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray4 = fieldData2.getAcctPayableQtr();
        double[] doubleArray5 = fieldData2.getInventoryQtr();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        double[] doubleArray7 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01619");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setInsiderBuyShrs("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setInsiderOwnership("out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01620");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str3 = companyFileData0.getDowIndexStr();
        java.lang.String str4 = companyFileData0.getCity();
        java.lang.String str5 = companyFileData0.getTicker();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01621");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray9 = balSheetFileData1.getCashYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01622");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double11 = sharesFileData0.getMktCap();
        double double12 = sharesFileData0.getInstOwnership();
        double double13 = sharesFileData0.getFloatshr();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01623");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.getTicker();
        double[] doubleArray8 = balSheetFileData2.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01624");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData5.getRdQtr();
        double[] doubleArray11 = incSheetFileData5.getIncPrimaryEpsYr();
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
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01625");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        double double2 = sharesFileData0.getBeta();
        int int3 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01626");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY0();
        java.lang.String str2 = estimateFileData0.toString();
        double double3 = estimateFileData0.getEpsY1();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01627");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getEquityYr();
        double[] doubleArray5 = balSheetFileData2.getPrefStockQtr();
        java.lang.String str6 = balSheetFileData2.toDbOutput();
        double[] doubleArray7 = balSheetFileData2.getLtInvestQtr();
        double[] doubleArray8 = balSheetFileData2.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01628");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        java.lang.String str4 = sharesFileData0.getSector();
        double double5 = sharesFileData0.getInsiderOwnership();
        java.lang.String str6 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01629");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray11 = incSheetFileData5.getCogsQtr();
        double[] doubleArray12 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray13 = incSheetFileData5.getIncPrimaryEpsQtr();
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
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01630");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        companyFileData0.setCity("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01631");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = fieldData2.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01632");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n", "out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!", "out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "out/BigDB/" };
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
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01633");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        double[] doubleArray10 = fieldData2.getCashFromFin();
        double[] doubleArray11 = fieldData2.getRdYr();
        java.lang.String str12 = fieldData2.getIndustry();
        double[] doubleArray13 = fieldData2.getNonrecurringItemsYr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01634");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(35, (int) (short) -1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01635");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getDividendQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray12 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray13 = incSheetFileData5.getGrossOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01636");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(35, (int) 'a', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01637");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01638");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setBeta("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        double double11 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01639");
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
        java.lang.String str16 = cashFileData15.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cash File Data" + "'", str16, "Cash File Data");
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01640");
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
        double[] doubleArray13 = fieldData2.getIncTaxQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01641");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        double[] doubleArray5 = balSheetFileData2.getLtInvestYr();
        double[] doubleArray6 = balSheetFileData2.getEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01642");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        double[] doubleArray10 = fieldData2.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01643");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderOwnership("out/BigDB/");
        long long6 = sharesFileData0.getVolume10d();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = sharesFileData0.getExchange();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getEpsDilQtr();
        java.lang.String str7 = fieldData2.getWeb();
        double[] doubleArray8 = fieldData2.getNetIncYr();
        double[] doubleArray9 = fieldData2.getBvpsQtr();
        double[] doubleArray10 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01645");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        double[] doubleArray9 = incSheetFileData8.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01646");
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
        java.lang.String str63 = balSheetFileData46.toString();
        double[] doubleArray64 = balSheetFileData46.getLtInvestYr();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(doubleArray64);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01647");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double double8 = sharesFileData0.getInstOwnership();
        sharesFileData0.setFromReport((int) '#', 1);
        double double12 = sharesFileData0.getPrice52hi();
        sharesFileData0.setFromReport(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double double8 = fieldData2.getMktCap();
        double[] doubleArray9 = fieldData2.getEquityQtr();
        int int10 = fieldData2.getInstBuyShrs();
        net.ajaskey.common.DateTime dateTime11 = fieldData2.getCurrFiscalYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(dateTime11);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01649");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isAdr();
        java.lang.String str4 = companyFileData0.getSic();
        companyFileData0.setName("");
        java.lang.String str7 = companyFileData0.getSector();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01650");
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
        java.lang.String str15 = estimateFileData12.getIndustry();
        java.lang.String str16 = estimateFileData12.getIndustry();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01651");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = balSheetFileData9.getStInvestYr();
        double[] doubleArray11 = balSheetFileData9.getOtherCurrAssetsYr();
        double[] doubleArray12 = balSheetFileData9.getLtDebtQtr();
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
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01652");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str13 = cashFileData12.getTicker();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(cashFileData12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01653");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        double[] doubleArray7 = fieldData2.getLtDebtYr();
        double[] doubleArray8 = fieldData2.getCurrLiabQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01654");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilYr();
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
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01655");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        long long4 = fieldData2.getVolumeMonth3m();
        double[] doubleArray5 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01656");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        sharesFileData0.setFromReport((int) (short) 0, (int) (short) 10);
        int int14 = sharesFileData0.getInsiderNetTrades();
        java.lang.String str15 = sharesFileData0.getName();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01657");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "");
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01658");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderBuyShrs("");
        double double6 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01659");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getLtInvestYr();
        double double6 = fieldData2.getEpsQ1();
        double double7 = fieldData2.getInstOwnership();
        java.lang.String str8 = fieldData2.getName();
        double double9 = fieldData2.getMktCap();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01660");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData41.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData41.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData41.setName("NONE");
        sharesFileData11.setNameFields(companyFileData41);
        companyFileData41.setState("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
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
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01661");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setInstSellShrs("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        double[] doubleArray13 = sharesFileData0.getSharesQ();
        int int14 = sharesFileData0.getInstBuyShrs();
        double double15 = sharesFileData0.getMktCap();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("");
        companyFileData0.setDowIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str10 = companyFileData0.toString();
        companyFileData0.setSnpIndex("hi!");
        java.lang.String str13 = companyFileData0.getWeb();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01663");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        double[] doubleArray7 = fieldData2.getEquityYr();
        double[] doubleArray8 = fieldData2.getIncPrimaryEpsYr();
        int int9 = fieldData2.getInsiderNetTrades();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01664");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, (int) (byte) 1);
        double[] doubleArray3 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01665");
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
        double[] doubleArray13 = fieldData2.getLiabEquityQtr();
        double[] doubleArray14 = fieldData2.getGoodwillQtr();
        double[] doubleArray15 = fieldData2.getTotalOpExpYr();
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
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01666");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData7);
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01667");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getGrossIncYr();
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
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01668");
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
        double[] doubleArray13 = fieldData2.getCashQtr();
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
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01669");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/-1/Q35/-fundamental-data--1Q35.", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01670");
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
        double[] doubleArray13 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray14 = fieldData2.getCashYr();
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
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01671");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData1.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01672");
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
        net.ajaskey.common.DateTime dateTime36 = estimateFileData3.getCurrFiscalYear();
        java.lang.String[] strArray42 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData46 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        int int47 = companyFileData46.getNumEmployees();
        companyFileData46.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData46.setStreet("NONE");
        estimateFileData3.setNameFields(companyFileData46);
        companyFileData46.setTicker("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(companyFileData45);
        org.junit.Assert.assertNotNull(companyFileData46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01673");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isAdr();
        companyFileData0.setIndustry("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        boolean boolean6 = companyFileData0.isDrp();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/100/Q10/ticker      : ??  name      : null??  exchange  : null??  sector    : null??  industry  : null??  sic       : null??  employees : 0??  snp index : ??  dow index : ??  adr       : false??  drp       : false??  street    : null??  city      : null??  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!??  country   : null??  zip       : null??  phone     : null??  web       : null??-fundamental-data-100Q10.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01674");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(35, (int) ' ', filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01675");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray11 = incSheetFileData5.getSalesQtr();
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
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01676");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 1, (int) (byte) 1, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!" + "'", str4, "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01677");
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
        double[] doubleArray36 = balSheetFileData25.getGoodwillYr();
        java.lang.String str37 = balSheetFileData25.toDbOutput();
        double[] doubleArray38 = balSheetFileData25.getOtherLtAssetsYr();
        double[] doubleArray39 = balSheetFileData25.getPrefStockQtr();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01678");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("hi!");
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01679");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray11 = incSheetFileData5.getSalesYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01680");
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
        double[] doubleArray12 = fieldData2.getDepreciationQtr();
        double[] doubleArray13 = fieldData2.getUnusualIncQtr();
        double[] doubleArray14 = fieldData2.getBvpsQtr();
        fieldData2.setYear(0);
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
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01681");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getAcctRxQtr();
        double[] doubleArray9 = balSheetFileData7.getLtInvestQtr();
        double[] doubleArray10 = balSheetFileData7.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01682");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData5.getRdQtr();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxYr();
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
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01683");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        java.lang.String str9 = fieldData2.getName();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getOtherIncQtr();
        int int12 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01684");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getDividendQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsQtr();
        double[] doubleArray12 = incSheetFileData5.getSalesQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01685");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str7 = companyFileData0.getSector();
        companyFileData0.setCountry("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setName("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01686");
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
        java.lang.String str37 = companyFileData0.getStreet();
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
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01687");
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
        double[] doubleArray15 = incSheetFileData14.getPreTaxIncQtr();
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
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01688");
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
        java.lang.String str49 = fieldData47.getWeb();
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
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01689");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        java.lang.String str6 = sharesFileData0.getName();
        double double7 = sharesFileData0.getPrice52hi();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01690");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "data/BigDB/", "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01691");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data", "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01692");
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
        double[] doubleArray14 = fieldData2.getCashFromInv();
        double[] doubleArray15 = fieldData2.getAcctPayableYr();
        double[] doubleArray16 = fieldData2.getUnusualIncYr();
        double[] doubleArray17 = fieldData2.getEpsDilYr();
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
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01693");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01694");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double double7 = fieldData2.getEpsY2();
        double[] doubleArray8 = fieldData2.getPreTaxIncYr();
        double[] doubleArray9 = fieldData2.getOtherIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01695");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        fieldData2.setYear((int) (byte) 100);
        java.lang.String str9 = fieldData2.getSic();
        double[] doubleArray10 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01696");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        java.lang.String str8 = fieldData2.getCountry();
        int int9 = fieldData2.getInstBuyShrs();
        double[] doubleArray10 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01697");
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
        sharesFileData0.setInstShareholders("out/BigDB/-1/Q35/-fundamental-data--1Q35.");
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
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01699");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int7 = companyFileData0.getNumEmployees();
        java.lang.String str8 = companyFileData0.getSnpIndexStr();
        java.lang.String str9 = companyFileData0.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01700");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray6 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray8 = incSheetFileData5.getIncPrimaryEpsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01701");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data");
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01702");
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
        java.lang.String str20 = companyFileData9.getCountry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01703");
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
        java.lang.String str10 = balSheetFileData2.getTicker();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01704");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double double6 = fieldData2.getPrice52lo();
        double[] doubleArray7 = fieldData2.getEquityYr();
        double[] doubleArray8 = fieldData2.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01705");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getStDebtQtr();
        double[] doubleArray7 = fieldData2.getUnusualIncYr();
        double[] doubleArray8 = fieldData2.getEquityYr();
        double[] doubleArray9 = fieldData2.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01706");
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
        double[] doubleArray13 = fieldData2.getLiabEquityQtr();
        int int14 = fieldData2.getInsiderSells();
        double[] doubleArray15 = fieldData2.getEpsDilContQtr();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01707");
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
        double[] doubleArray39 = incSheetFileData20.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean41 = companyFileData40.isAdr();
        java.lang.String str42 = companyFileData40.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum43 = companyFileData40.getSnpIndex();
        java.lang.String str44 = companyFileData40.toString();
        companyFileData40.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        incSheetFileData20.setNameFields(companyFileData40);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(snpEnum43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01708");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        sharesFileData0.setInsiderBuys("NONE");
        double double8 = sharesFileData0.getInstOwnership();
        sharesFileData0.setFromReport((int) '#', 1);
        long long12 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        java.lang.String str15 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01709");
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
        double double13 = fieldData2.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum14 = fieldData2.getDowIndex();
        java.lang.String str15 = fieldData2.getCountry();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(dowEnum14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01710");
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
        double[] doubleArray17 = sharesFileData0.getSharesY();
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01711");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData8.getIncTaxYr();
        java.lang.String str10 = incSheetFileData8.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01712");
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
        double[] doubleArray53 = incSheetFileData23.getEpsDilContYr();
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
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        java.lang.String str2 = sharesFileData0.getName();
        double[] doubleArray3 = sharesFileData0.getSharesY();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int5 = sharesFileData4.getInstShareholders();
        double double6 = sharesFileData4.getInsiderNetPercentOutstanding();
        java.lang.String str7 = sharesFileData4.getName();
        long long8 = sharesFileData4.getVolumeMonth3m();
        double[] doubleArray9 = sharesFileData4.getSharesY();
        sharesFileData0.setSharesQ(doubleArray9);
        java.lang.String str11 = sharesFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01714");
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
        double[] doubleArray13 = fieldData2.getLiabEquityQtr();
        java.lang.String str14 = fieldData2.getZip();
        int int15 = fieldData2.getInsiderBuyShrs();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01715");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 100);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        java.lang.String str7 = fieldData2.getZip();
        double[] doubleArray8 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01718");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01719");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getOtherIncQtr();
        double[] doubleArray7 = fieldData2.getCashFromInv();
        double[] doubleArray8 = fieldData2.getSalesYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01721");
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
        double[] doubleArray46 = balSheetFileData22.getStDebtQtr();
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
        org.junit.Assert.assertNull(doubleArray46);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01722");
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
        double[] doubleArray12 = fieldData2.getOtherCurrAssetsQtr();
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
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01723");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        double[] doubleArray6 = fieldData2.getAdjToIncYr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        int int8 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double double6 = fieldData2.getInsiderNetPercentOutstanding();
        int int7 = fieldData2.getInstBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01725");
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
        double[] doubleArray13 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray14 = incSheetFileData5.getIncPrimaryEpsQtr();
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
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01726");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getUnusualIncQtr();
        double[] doubleArray11 = fieldData2.getCashYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01727");
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
        double[] doubleArray15 = fieldData2.getEpsDilYr();
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
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01728");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpExpQtr();
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
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01729");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getCurrLiabQtr();
        double[] doubleArray8 = balSheetFileData6.getTotalAssetsQtr();
        double[] doubleArray9 = balSheetFileData6.getPrefStockQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01730");
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
        double[] doubleArray12 = fieldData2.getStDebtQtr();
        double double13 = fieldData2.getInsiderNetPercentOutstanding();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01731");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        double double3 = estimateFileData0.getEpsY1();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getLatestQtrEps();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01732");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str3 = companyFileData0.getTicker();
        companyFileData0.setTicker("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        boolean boolean6 = companyFileData0.isAdr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01733");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum6 = fieldData2.getSnpIndex();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGrossIncYr();
        double[] doubleArray10 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray11 = fieldData2.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(snpEnum6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01734");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 100, 100, filetypeEnum2);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01735");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        double[] doubleArray5 = fieldData2.getCashQtr();
        double[] doubleArray6 = fieldData2.getRdYr();
        double[] doubleArray7 = fieldData2.getCapEx();
        double[] doubleArray8 = fieldData2.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01736");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01737");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData1.getLatestQtrEps();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData1.getCurrFiscalYear();
        net.ajaskey.common.DateTime dateTime6 = estimateFileData1.getLatestQtrEps();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(dateTime5);
        org.junit.Assert.assertNull(dateTime6);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01738");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01739");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "", "out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01741");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData8);
        sharesFileData9.setInsiderBuyShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double12 = sharesFileData9.getPrice();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01742");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getSalesYr();
        double[] doubleArray10 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray11 = fieldData2.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01743");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        long long4 = fieldData2.getVolumeMonth3m();
        boolean boolean5 = fieldData2.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getOtherCurrLiabQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01744");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getPrefStockYr();
        double[] doubleArray4 = fieldData2.getOtherLtAssetsYr();
        double[] doubleArray5 = fieldData2.getUnusualIncQtr();
        double[] doubleArray6 = fieldData2.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01745");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n" };
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
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01746");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb(strList18);
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
        org.junit.Assert.assertNotNull(companyFileData20);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01747");
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
        double[] doubleArray12 = fieldData2.getIncPrimaryEpsQtr();
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
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01748");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData2);
        double[] doubleArray8 = balSheetFileData7.getGoodwillYr();
        double[] doubleArray9 = balSheetFileData7.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01749");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        java.lang.String str7 = cashFileData6.toString();
        java.lang.String str8 = cashFileData6.toDbOutput();
        double[] doubleArray9 = cashFileData6.getCashFromInvQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cash File Data" + "'", str7, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01750");
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
        double[] doubleArray13 = balSheetFileData7.getCurrLiabQtr();
        double[] doubleArray14 = balSheetFileData7.getNetFixedAssetsQtr();
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
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01751");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
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
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01752");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum9 = fieldData2.getDowIndex();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(dowEnum9);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01753");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01754");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = incSheetFileData5.getExchange();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray11 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01755");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
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
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, (int) (byte) 1);
        double[] doubleArray3 = fieldData2.getLtInvestYr();
        double[] doubleArray4 = fieldData2.getGoodwillQtr();
        double[] doubleArray5 = fieldData2.getCogsYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        double[] doubleArray7 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01757");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData7.getCashYr();
        double[] doubleArray10 = balSheetFileData7.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str8 = balSheetFileData1.getIndustry();
        double[] doubleArray9 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray10 = balSheetFileData1.getAcctRxQtr();
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
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01759");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getNetIncYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxQtr();
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
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01760");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        sharesFileData0.setDollar3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int9 = sharesFileData0.getInsiderSells();
        double double10 = sharesFileData0.getPrice52lo();
        sharesFileData0.setInstShareholders("out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01761");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (byte) 0, 0);
        double[] doubleArray4 = sharesFileData0.getSharesQ();
        sharesFileData0.setMktCap("out/BigDB/");
        sharesFileData0.setPrice("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData0.setInsiderOwnership("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        sharesFileData11.setInsiderOwnership("out/BigDB/");
        int int17 = sharesFileData11.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int19 = sharesFileData18.getInstShareholders();
        double double20 = sharesFileData18.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData21.setFromReport((int) (byte) 0, 0);
        double[] doubleArray25 = sharesFileData21.getSharesQ();
        sharesFileData18.setSharesQ(doubleArray25);
        sharesFileData11.setSharesQ(doubleArray25);
        sharesFileData0.setSharesQ(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01762");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        fieldData2.setQuarter(0);
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        double[] doubleArray10 = fieldData2.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01763");
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
        java.lang.String str12 = incSheetFileData5.toString();
        double[] doubleArray13 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray14 = incSheetFileData5.getEpsDilContYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray4 = fieldData2.getLiabEquityQtr();
        double[] doubleArray5 = fieldData2.getTotalOpExpYr();
        fieldData2.setQuarter((int) 'a');
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01765");
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
        double[] doubleArray15 = fieldData2.getInventoryQtr();
        java.lang.String str16 = fieldData2.getStreet();
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
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01766");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        int int10 = sharesFileData0.getInsiderBuys();
        long long11 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setBeta("out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01767");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        double double7 = fieldData2.getPrice();
        int int8 = fieldData2.getInsiderNetTrades();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01768");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data", "out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.", "out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!", "ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01769");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData36);
        double[] doubleArray38 = balSheetFileData37.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData37.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData40.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData40.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData37.setNameFields(companyFileData40);
        companyFileData40.setSic("hi!");
        companyFileData40.setCity("");
        incSheetFileData20.setNameFields(companyFileData40);
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
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01770");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContQtr();
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
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01771");
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
        sharesFileData0.setInsiderBuys("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        sharesFileData0.setMktCap("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        sharesFileData0.setBeta("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData0.setInsiderSells("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
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
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01772");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray7 = fieldData2.getLiabEquityQtr();
        double[] doubleArray8 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01773");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data", "out/BigDB/", "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!" };
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
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01774");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data", "out/BigDB/-1/Q35/-fundamental-data--1Q35.", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data", "out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-1Q1.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "hi!", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "Cash File Data" };
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
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01775");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getPrefStockYr();
        double[] doubleArray11 = fieldData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01776");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray6 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray8 = incSheetFileData5.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01777");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        double[] doubleArray10 = fieldData2.getIncTaxQtr();
        double[] doubleArray11 = fieldData2.getStInvestQtr();
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
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01779");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        double double5 = sharesFileData0.getPrice();
        double double6 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInsiderBuyShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int9 = sharesFileData0.getInsiderSells();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01780");
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
        double[] doubleArray21 = fieldData2.getInventoryQtr();
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
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01781");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = fieldData2.getIncSheetData();
        double[] doubleArray17 = fieldData2.getCurrLiabQtr();
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
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01782");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = incSheetFileData5.getExchange();
        double[] doubleArray10 = incSheetFileData5.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01783");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        double double5 = fieldData2.getEpsY0();
        double[] doubleArray6 = fieldData2.getCashFromInv();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01784");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setVolume3m("data/BigDB/");
        double double11 = sharesFileData0.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01785");
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
        java.lang.String str18 = companyFileData0.getCountry();
        companyFileData0.setDowIndex("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        companyFileData0.setSector("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        int int23 = companyFileData0.getNumEmployees();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01786");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01787");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = companyFileData0.getExchange();
        companyFileData0.setWeb("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(exchEnum1);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01788");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        int int7 = fieldData2.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        double[] doubleArray9 = fieldData2.getGrossIncYr();
        double[] doubleArray10 = fieldData2.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01789");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double double4 = fieldData2.getPrice();
        double[] doubleArray5 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01790");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NONE" + "'", str3, "NONE");
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01791");
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
        double[] doubleArray12 = fieldData2.getAcctPayableQtr();
        double[] doubleArray13 = fieldData2.getCurrAssetsYr();
        java.lang.String str14 = fieldData2.getIndustry();
        fieldData2.setQuarter((-1));
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
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01792");
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
        double[] doubleArray42 = balSheetFileData22.getOtherLtAssetsYr();
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
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01793");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray8 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsContQtr();
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
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01794");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getStInvestYr();
        double[] doubleArray10 = fieldData2.getGrossOpExpQtr();
        double double11 = fieldData2.getBeta();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01795");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(10, (int) '4', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01796");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getStDebtQtr();
        double[] doubleArray7 = fieldData2.getSharesQ();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01797");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double double8 = fieldData2.getFloatshr();
        double[] doubleArray9 = fieldData2.getEpsDilContQtr();
        long long10 = fieldData2.getVolumeMonth3m();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01798");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        int int4 = sharesFileData0.getInsiderNetTrades();
        int int5 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01799");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getDepreciationYr();
        double double6 = fieldData2.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum7 = fieldData2.getSnpIndex();
        double[] doubleArray8 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray9 = fieldData2.getTotalOpExpQtr();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getEpsQtr();
        double[] doubleArray12 = fieldData2.getInventoryQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(snpEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01800");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getStDebtYr();
        double[] doubleArray8 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray9 = balSheetFileData1.getOtherCurrLiabYr();
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
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01801");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        java.lang.String str4 = fieldData2.getIndustry();
        java.lang.String str5 = fieldData2.getTicker();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = sharesFileData7.getSharesY();
        sharesFileData7.setInsiderSellShrs("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData7.setInstBuyShrs("NONE");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = sharesFileData4.getExchange();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(exchEnum5);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01803");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getCurrLiabQtr();
        double[] doubleArray8 = balSheetFileData6.getGoodwillQtr();
        java.lang.String str9 = balSheetFileData6.toDbOutput();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01804");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        double[] doubleArray10 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01805");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        int int4 = fieldData2.getInsiderSellShrs();
        double[] doubleArray5 = fieldData2.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        java.lang.String str4 = estimateFileData1.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData1);
        java.lang.String str6 = estimateFileData1.getIndustry();
        double double7 = estimateFileData1.getEpsQ1();
        double double8 = estimateFileData1.getEpsQ1();
        net.ajaskey.common.DateTime dateTime9 = estimateFileData1.getLatestQtrEps();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(dateTime9);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01807");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        fieldData2.setQuarter(0);
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        java.lang.String str10 = fieldData2.getCountry();
        double[] doubleArray11 = fieldData2.getDividendYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01808");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getNetIncYr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray12 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray13 = incSheetFileData5.getGrossIncYr();
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
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01809");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getSalesYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
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
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01810");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str3 = companyFileData0.getState();
        java.lang.String str4 = companyFileData0.getSnpIndexStr();
        companyFileData0.setSector("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01811");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", (int) (short) 0, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01812");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        int int7 = fieldData2.getInsiderSellShrs();
        double[] doubleArray8 = fieldData2.getPrefStockYr();
        double[] doubleArray9 = fieldData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01813");
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
        double[] doubleArray16 = incSheetFileData5.getIntExpNonOpQtr();
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
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01814");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double[] doubleArray8 = fieldData2.getEpsDilContQtr();
        double[] doubleArray9 = fieldData2.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = fieldData2.getShares();
        double[] doubleArray11 = fieldData2.getCashYr();
        int int12 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01815");
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
        java.lang.String str15 = companyFileData13.getName();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01816");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        java.lang.String str6 = sharesFileData0.getName();
        double double7 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        double double10 = sharesFileData0.getPrice52hi();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double[] doubleArray4 = sharesFileData0.getSharesY();
        sharesFileData0.setFloatshr("Cash File Data");
        double double7 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01818");
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
        double[] doubleArray14 = incSheetFileData5.getDividendQtr();
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
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01819");
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
        double[] doubleArray38 = fieldData35.getSharesQ();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01820");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setSic("hi!");
        companyFileData4.setCity("");
        java.lang.String str14 = companyFileData4.getCity();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01821");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01822");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = companyFileData1.getExchange();
        balSheetFileData0.setNameFields(companyFileData1);
        double[] doubleArray4 = balSheetFileData0.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01823");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        double[] doubleArray8 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxQtr();
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
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01824");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData9);
        double[] doubleArray11 = balSheetFileData9.getNetFixedAssetsYr();
        java.lang.String str12 = balSheetFileData9.getName();
        double[] doubleArray13 = balSheetFileData9.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01825");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01826");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01827");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getRdYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01828");
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
        double[] doubleArray14 = incSheetFileData5.getGrossOpExpYr();
        double[] doubleArray15 = incSheetFileData5.getGrossIncYr();
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
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01829");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01830");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.", "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data");
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01831");
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
        double double13 = fieldData2.getPrice52lo();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01832");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int7 = companyFileData0.getNumEmployees();
        companyFileData0.setTicker("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str10 = companyFileData0.getPhone();
        companyFileData0.setDrp("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01833");
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
        java.lang.String str12 = incSheetFileData5.getIndustry();
        double[] doubleArray13 = incSheetFileData5.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01834");
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
        double[] doubleArray14 = fieldData2.getOtherCurrLiabQtr();
        double[] doubleArray15 = fieldData2.getGoodwillYr();
        double[] doubleArray16 = fieldData2.getSalesQtr();
        double[] doubleArray17 = fieldData2.getSalesYr();
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
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01835");
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
        java.lang.String str13 = fieldData2.getSector();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01836");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        java.lang.String str5 = fieldData2.getCity();
        double[] doubleArray6 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01837");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum6 = fieldData2.getSnpIndex();
        double[] doubleArray7 = fieldData2.getLiabEquityYr();
        int int8 = fieldData2.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = incSheetFileData9.getUnusualIncYr();
        double[] doubleArray11 = incSheetFileData9.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(snpEnum6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01838");
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
        sharesFileData39.setInstSellShrs("out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.");
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
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01839");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01840");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 1, (int) '#', filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01841");
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
        double[] doubleArray15 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray16 = fieldData2.getTotalOpExpYr();
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
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01842");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getInventoryQtr();
        java.lang.String str6 = balSheetFileData1.getIndustry();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01843");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getCashYr();
        double[] doubleArray8 = balSheetFileData2.getBvpsYr();
        double[] doubleArray9 = balSheetFileData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01844");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setDowIndex("hi!");
        companyFileData4.setWeb("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData4.setName("out/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01845");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double double10 = fieldData2.getDollar3m();
        double[] doubleArray11 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray12 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01846");
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
        double[] doubleArray15 = fieldData2.getLtDebtYr();
        int int16 = fieldData2.getInsiderBuys();
        net.ajaskey.common.DateTime dateTime17 = fieldData2.getCurrFiscalYear();
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
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(dateTime17);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01847");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getEpsContYr();
        int int4 = fieldData2.getInstShareholders();
        double[] doubleArray5 = fieldData2.getCurrLiabYr();
        long long6 = fieldData2.getVolumeMonth3m();
        double[] doubleArray7 = fieldData2.getSharesY();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getName();
        long long4 = sharesFileData0.getVolumeMonth3m();
        double[] doubleArray5 = sharesFileData0.getSharesY();
        sharesFileData0.setFloatshr("Cash File Data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01849");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getRdQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsContYr();
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
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getWeb();
        java.lang.String str2 = companyFileData0.getSic();
        boolean boolean3 = companyFileData0.isAdr();
        companyFileData0.setTicker("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01851");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "hi!" };
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
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01852");
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
        double[] doubleArray14 = fieldData2.getLtDebtYr();
        double[] doubleArray15 = fieldData2.getIncAfterTaxQtr();
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
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        double[] doubleArray10 = fieldData2.getCashFromFin();
        double[] doubleArray11 = fieldData2.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = fieldData2.getCompanyInfo();
        companyFileData12.setPhone("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(companyFileData12);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01854");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setDowIndex("");
        companyFileData0.setState("out/BigDB/");
        java.lang.String str10 = companyFileData0.getIndustry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01855");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum15 = fieldData2.getExchange();
        double[] doubleArray16 = fieldData2.getAcctRxYr();
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
        org.junit.Assert.assertNull(exchEnum15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01856");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData8);
        java.lang.String str10 = estimateFileData9.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01857");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setMktCap("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01858");
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
        double[] doubleArray18 = fieldData2.getGrossIncQtr();
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
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01859");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01860");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getEpsContYr();
        double[] doubleArray4 = fieldData2.getPreTaxIncYr();
        java.lang.String str5 = fieldData2.getIndustry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01861");
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
        double double38 = estimateFileData37.getEpsY1();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01862");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        double[] doubleArray10 = fieldData2.getCogsYr();
        double double11 = fieldData2.getEpsQ0();
        double[] doubleArray12 = fieldData2.getLtDebtQtr();
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
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01863");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray6 = balSheetFileData1.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01864");
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
        double[] doubleArray12 = fieldData2.getPreTaxIncYr();
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
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01865");
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
        java.lang.String str13 = incSheetFileData5.toString();
        double[] doubleArray14 = incSheetFileData5.getNonrecurringItemsYr();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01866");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray12 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray13 = incSheetFileData5.getNetIncYr();
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
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01867");
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
        companyFileData17.setName("out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
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
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01868");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str13 = sharesFileData12.getTicker();
        sharesFileData12.setInstSellShrs("");
        sharesFileData12.setDollar3m("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01869");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getNetIncYr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
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
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01870");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        long long4 = fieldData2.getVolumeMonth3m();
        double[] doubleArray5 = fieldData2.getBvpsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01871");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double8 = estimateFileData7.getEpsY0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01873");
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
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray13 = incSheetFileData5.getPreTaxIncQtr();
        java.lang.String str14 = incSheetFileData5.getName();
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01874");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01875");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getStDebtYr();
        int int12 = fieldData2.getYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.toString();
        java.lang.String str3 = companyFileData0.getSic();
        java.lang.String str4 = companyFileData0.toString();
        java.lang.String str5 = companyFileData0.getCountry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01877");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData5.getNetIncYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray9 = incSheetFileData5.getRdQtr();
        java.lang.String str10 = incSheetFileData5.getIndustry();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
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
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01878");
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
        java.lang.String str20 = incSheetFileData5.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        double[] doubleArray5 = fieldData2.getLiabEquityYr();
        double double6 = fieldData2.getDollar3m();
        double[] doubleArray7 = fieldData2.getStDebtYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        int int9 = fieldData2.getInstShareholders();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01880");
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
        double[] doubleArray21 = incSheetFileData5.getTotalOpExpYr();
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
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01881");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getLiabEquityQtr();
        double[] doubleArray8 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray9 = balSheetFileData2.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01882");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01883");
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
        double[] doubleArray14 = fieldData2.getGrossOpExpQtr();
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
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01884");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        double[] doubleArray7 = incSheetFileData6.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData6.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData6.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01885");
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
        double[] doubleArray39 = incSheetFileData20.getNonrecurringItemsYr();
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
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getCogsYr();
        double[] doubleArray6 = fieldData2.getCashFromFin();
        double[] doubleArray7 = fieldData2.getLtInvestYr();
        double[] doubleArray8 = fieldData2.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01887");
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
        double double43 = estimateFileData42.getEpsY0();
        java.lang.String str44 = estimateFileData42.getTicker();
        java.lang.String str45 = estimateFileData42.getTicker();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01888");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGoodwillQtr();
        double[] doubleArray5 = fieldData2.getAcctPayableYr();
        double[] doubleArray6 = fieldData2.getLtInvestYr();
        double[] doubleArray7 = fieldData2.getSalesYr();
        double double8 = fieldData2.getFloatshr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01889");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double double8 = fieldData2.getFloatshr();
        double[] doubleArray9 = fieldData2.getEpsDilContQtr();
        double[] doubleArray10 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray11 = fieldData2.getGrossIncQtr();
        double double12 = fieldData2.getPrice();
        int int13 = fieldData2.getInsiderSells();
        java.lang.String str14 = fieldData2.getName();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01890");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getCurrLiabQtr();
        java.lang.String str6 = balSheetFileData1.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData7.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int13 = sharesFileData12.getInstShareholders();
        double double14 = sharesFileData12.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData15.setFromReport((int) (byte) 0, 0);
        double[] doubleArray19 = sharesFileData15.getSharesQ();
        sharesFileData12.setSharesQ(doubleArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        double[] doubleArray28 = incSheetFileData27.getEpsContYr();
        double[] doubleArray29 = incSheetFileData27.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData31);
        double[] doubleArray33 = balSheetFileData32.getLtDebtYr();
        java.lang.String str34 = balSheetFileData32.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData38 = fieldData37.getCashData();
        double[] doubleArray39 = cashFileData38.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData21, incSheetFileData27, balSheetFileData32, cashFileData38, (int) '#', 0);
        double[] doubleArray43 = fieldData42.getCashFromInv();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData44 = fieldData42.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData45 = fieldData42.getCompanyInfo();
        companyFileData45.setAdr("NONE");
        balSheetFileData1.setNameFields(companyFileData45);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum49 = companyFileData45.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(incSheetFileData27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(cashFileData38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNotNull(estimateFileData44);
        org.junit.Assert.assertNotNull(companyFileData45);
        org.junit.Assert.assertNull(exchEnum49);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        java.lang.String str9 = fieldData2.getName();
        double[] doubleArray10 = fieldData2.getGrossOpExpYr();
        double double11 = fieldData2.getEpsY2();
        long long12 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01892");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        int int6 = sharesFileData0.getInstShareholders();
        java.lang.String str7 = sharesFileData0.toDbOutput();
        sharesFileData0.setVolume10d("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str7, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01894");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double double6 = fieldData2.getPrice52lo();
        java.lang.String str7 = fieldData2.getStreet();
        double[] doubleArray8 = fieldData2.getGrossIncYr();
        double[] doubleArray9 = fieldData2.getDividendYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01895");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray7 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray8 = incSheetFileData5.getDividendYr();
        java.lang.String[] strArray14 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        incSheetFileData5.setNameFields(companyFileData18);
        java.lang.String str20 = incSheetFileData5.toDbOutput();
        double[] doubleArray21 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(companyFileData17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01896");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        int int4 = sharesFileData0.getInsiderSellShrs();
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        double[] doubleArray7 = sharesFileData0.getSharesQ();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01897");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE", "out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE" };
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
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01898");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double[] doubleArray7 = fieldData2.getEpsYr();
        double double8 = fieldData2.getEpsY1();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        double double10 = fieldData2.getEpsY0();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01899");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        int int4 = fieldData2.getQuarter();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray6 = fieldData2.getEquityYr();
        java.lang.String str7 = fieldData2.getDowIndexStr();
        double double8 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01900");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/100/Q-1/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-100Q-1.out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/" };
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
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01901");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        double[] doubleArray6 = balSheetFileData2.getStInvestQtr();
        double[] doubleArray7 = balSheetFileData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = balSheetFileData2.getTotalAssetsYr();
        java.lang.String str9 = balSheetFileData2.getName();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01902");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getOtherIncQtr();
        double[] doubleArray7 = fieldData2.getEpsDilContQtr();
        double[] doubleArray8 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray9 = fieldData2.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01903");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str4 = estimateFileData0.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean6 = companyFileData5.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum7 = companyFileData5.getDowIndex();
        companyFileData5.setZip("");
        estimateFileData0.setNameFields(companyFileData5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = estimateFileData0.getExchange();
        double double12 = estimateFileData0.getEpsQ0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dowEnum7);
        org.junit.Assert.assertNull(exchEnum11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01904");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/-1/Q35/-fundamental-data--1Q35.");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLtInvestYr();
        double[] doubleArray10 = fieldData2.getCashFromFin();
        double[] doubleArray11 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01906");
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
        double[] doubleArray12 = fieldData2.getCurrAssetsYr();
        double[] doubleArray13 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray14 = fieldData2.getEpsYr();
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
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01907");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getGoodwillQtr();
        double[] doubleArray9 = fieldData2.getLiabEquityYr();
        double double10 = fieldData2.getEpsQ1();
        double double11 = fieldData2.getEpsQ1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01908");
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
        double[] doubleArray15 = fieldData2.getCapEx();
        double double16 = fieldData2.getFloatshr();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01909");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getTicker();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        companyFileData8.setState("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01910");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01911");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        double double10 = fieldData2.getInsiderNetPercentOutstanding();
        double[] doubleArray11 = fieldData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01912");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        java.lang.String str4 = fieldData2.getTicker();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01913");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(0, (int) (byte) -1, filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01914");
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
        companyFileData9.setName("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str22 = companyFileData9.toString();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01915");
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
        double double42 = estimateFileData3.getEpsQ0();
        java.lang.String str43 = estimateFileData3.getName();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01916");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getCountry();
        double double7 = fieldData2.getMktCap();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getCurrFiscalYear();
        double[] doubleArray9 = fieldData2.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01917");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        java.lang.String str10 = sharesFileData0.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData11.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData11.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData11.setName("NONE");
        companyFileData11.setAdr("NONE");
        companyFileData11.setState("");
        companyFileData11.setTicker("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setNameFields(companyFileData11);
        double[] doubleArray25 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01918");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getTicker();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = incSheetFileData9.getRdQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01919");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getLiabEquityYr();
        java.lang.String str5 = balSheetFileData2.getExchange();
        double[] doubleArray6 = balSheetFileData2.getOtherCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01920");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        long long4 = fieldData2.getVolumeMonth3m();
        double double5 = fieldData2.getPrice52lo();
        double[] doubleArray6 = fieldData2.getEpsContYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01921");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 1, (int) 'a');
        double[] doubleArray3 = fieldData2.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(estimateFileData4);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        double[] doubleArray8 = fieldData2.getAcctRxQtr();
        double[] doubleArray9 = fieldData2.getEpsDilContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01923");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray12 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray13 = incSheetFileData5.getIntExpNonOpQtr();
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
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01924");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getCurrLiabYr();
        double[] doubleArray8 = balSheetFileData6.getCurrLiabQtr();
        double[] doubleArray9 = balSheetFileData6.getEquityQtr();
        double[] doubleArray10 = balSheetFileData6.getCashYr();
        double[] doubleArray11 = balSheetFileData6.getStInvestYr();
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
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01925");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        java.lang.String str8 = incSheetFileData7.getIndustry();
        double[] doubleArray9 = incSheetFileData7.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01926");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.getName();
        long long4 = sharesFileData0.getVolumeMonth3m();
        double[] doubleArray5 = sharesFileData0.getSharesY();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        double[] doubleArray7 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01927");
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
        sharesFileData0.setInsiderSellShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        double double30 = sharesFileData0.getBeta();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray2 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray3 = balSheetFileData0.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01929");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str7 = fieldData2.getWeb();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getRdYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01930");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/-1/Q35/-fundamental-data--1Q35.", "out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01931");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01932");
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
        double[] doubleArray14 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray15 = incSheetFileData5.getIncPrimaryEpsQtr();
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
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01933");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getEpsDilYr();
        double double9 = fieldData2.getPrice52hi();
        double[] doubleArray10 = fieldData2.getEpsYr();
        double[] doubleArray11 = fieldData2.getNonrecurringItemsYr();
        java.lang.String str12 = fieldData2.getIndustry();
        double[] doubleArray13 = fieldData2.getNetIncYr();
        double[] doubleArray14 = fieldData2.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        double[] doubleArray5 = fieldData2.getLiabEquityYr();
        double double6 = fieldData2.getDollar3m();
        double double7 = fieldData2.getBeta();
        int int8 = fieldData2.getQuarter();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01935");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getGrossOpExpYr();
        double[] doubleArray9 = fieldData2.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01936");
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
        double[] doubleArray14 = fieldData2.getLtDebtQtr();
        java.lang.String str15 = fieldData2.getWeb();
        double[] doubleArray16 = fieldData2.getCashYr();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01937");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum13 = companyFileData12.getSnpIndex();
        companyFileData12.setPhone("out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNull(snpEnum13);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01938");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        double[] doubleArray8 = fieldData2.getGoodwillQtr();
        double[] doubleArray9 = fieldData2.getPrefStockYr();
        double[] doubleArray10 = fieldData2.getGrossOpExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01939");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double[] doubleArray9 = fieldData2.getCapEx();
        double double10 = fieldData2.getEpsQ1();
        double[] doubleArray11 = fieldData2.getLiabEquityQtr();
        long long12 = fieldData2.getVolumeMonth3m();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01940");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/100/Q0/out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/-fundamental-data-100Q0.Cash File Data", "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q0/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-0Q0.out/BigDB/0/Q32/out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q32.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/1/Q6/out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!-fundamental-data-1Q6.hi!" };
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
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (byte) -1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01942");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str11 = sharesFileData10.getName();
        int int12 = sharesFileData10.getInsiderSells();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01943");
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
        double[] doubleArray22 = sharesFileData0.getSharesY();
        long long23 = sharesFileData0.getVolume10d();
        double[] doubleArray24 = sharesFileData0.getSharesY();
        sharesFileData0.setBeta("out/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01944");
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
        double[] doubleArray12 = incSheetFileData5.getOtherIncQtr();
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
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01946");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        fieldData2.setQuarter(0);
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        double[] doubleArray10 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        companyFileData0.setTicker("hi!");
        java.lang.String str11 = companyFileData0.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData12);
        net.ajaskey.common.DateTime dateTime14 = estimateFileData13.getLatestQtrEps();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setFromReport((int) (byte) 0, 0);
        double[] doubleArray21 = sharesFileData17.getSharesQ();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList25);
        double[] doubleArray28 = incSheetFileData27.getEpsContYr();
        java.lang.String str29 = incSheetFileData27.getIndustry();
        double[] doubleArray30 = incSheetFileData27.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str32 = companyFileData31.getStreet();
        companyFileData31.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData31.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str37 = companyFileData31.getSic();
        java.lang.String str38 = companyFileData31.getIndustry();
        incSheetFileData27.setNameFields(companyFileData31);
        double[] doubleArray40 = incSheetFileData27.getEpsDilYr();
        java.lang.String str41 = incSheetFileData27.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getOtherLtLiabQtr();
        double[] doubleArray45 = balSheetFileData43.getNetFixedAssetsQtr();
        double[] doubleArray46 = balSheetFileData43.getTotalLiabYr();
        double[] doubleArray47 = balSheetFileData43.getOtherLtAssetsQtr();
        double[] doubleArray48 = balSheetFileData43.getEquityQtr();
        java.lang.String str49 = balSheetFileData43.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray53 = fieldData52.getCogsYr();
        double[] doubleArray54 = fieldData52.getIntExpYr();
        double[] doubleArray55 = fieldData52.getLtDebtQtr();
        double[] doubleArray56 = fieldData52.getGoodwillYr();
        double double57 = fieldData52.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData58 = fieldData52.getCashData();
        java.lang.String str59 = cashFileData58.toDbOutput();
        java.lang.String str60 = cashFileData58.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData63 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData13, sharesFileData17, incSheetFileData27, balSheetFileData43, cashFileData58, 6, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData27);
        double[] doubleArray65 = incSheetFileData64.getIncAfterTaxYr();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(dateTime14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(incSheetFileData27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Cash File Data" + "'", str60, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray65);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01948");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        double[] doubleArray7 = fieldData2.getEquityYr();
        double[] doubleArray8 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        double[] doubleArray10 = fieldData2.getSalesQtr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '#', 35, filetypeEnum2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01950");
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
        double[] doubleArray19 = incSheetFileData5.getIncPrimaryEpsQtr();
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
        org.junit.Assert.assertNull(doubleArray19);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01951");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/52/Q32/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-52Q32.", "out/BigDB/-1/Q35/-fundamental-data--1Q35.", "out/BigDB/0/Q52/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q52.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01952");
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
        java.lang.String str14 = companyFileData12.getStreet();
        companyFileData12.setState("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str13, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01953");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        double[] doubleArray10 = fieldData2.getBvpsYr();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        double[] doubleArray12 = fieldData2.getDividendQtr();
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
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01954");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double[] doubleArray6 = fieldData2.getEpsYr();
        java.lang.String str7 = fieldData2.getSector();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01955");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        int int10 = companyFileData9.getNumEmployees();
        companyFileData9.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData9.setStreet("NONE");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData9.setExchange("out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01956");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        double[] doubleArray7 = fieldData2.getRdYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01957");
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
        java.lang.String str12 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01958");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double double9 = estimateFileData8.getEpsY1();
        java.lang.String str10 = estimateFileData8.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01959");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getPrefStockYr();
        java.lang.String str11 = fieldData2.getIndustry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01960");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderSellShrs("out/BigDB/");
        double double6 = sharesFileData0.getBeta();
        java.lang.String str7 = sharesFileData0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01961");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        double[] doubleArray6 = fieldData2.getGoodwillQtr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01962");
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
        java.lang.String str41 = estimateFileData3.getName();
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
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01963");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        double[] doubleArray7 = fieldData2.getOtherCurrAssetsYr();
        double[] doubleArray8 = fieldData2.getCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum9 = fieldData2.getDowIndex();
        double double10 = fieldData2.getFloatshr();
        java.lang.String str11 = fieldData2.getTicker();
        double[] doubleArray12 = fieldData2.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(dowEnum9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01964");
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
        double[] doubleArray20 = fieldData2.getCashYr();
        double[] doubleArray21 = fieldData2.getEpsContYr();
        int int22 = fieldData2.getInstSellShrs();
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
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01965");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray11 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray12 = incSheetFileData5.getAdjToIncYr();
        java.lang.String str13 = incSheetFileData5.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01966");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str7 = fieldData2.getWeb();
        java.lang.String str8 = fieldData2.getCity();
        long long9 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01967");
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
        double[] doubleArray13 = fieldData2.getPreTaxIncYr();
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
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01968");
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
        double[] doubleArray13 = fieldData2.getPrefStockQtr();
        double[] doubleArray14 = fieldData2.getIncPrimaryEpsQtr();
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
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01969");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/1/Q10/-fundamental-data-1Q10.out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.hi!", "out/BigDB/" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/35/Q100/out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!-fundamental-data-35Q100.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01970");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.common.DateTime dateTime6 = fieldData2.getLatestQtrEps();
        java.lang.String str7 = fieldData2.getTicker();
        double[] doubleArray8 = fieldData2.getEpsQtr();
        double[] doubleArray9 = fieldData2.getCashFromOps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01971");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        int int9 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/0/Q-1/out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!-fundamental-data-0Q-1.hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01972");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getDepreciationQtr();
        double[] doubleArray8 = fieldData2.getSalesYr();
        double[] doubleArray9 = fieldData2.getSharesY();
        double[] doubleArray10 = fieldData2.getOtherIncYr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray9 = fieldData2.getDepreciationYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01974");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getTicker();
        double[] doubleArray7 = fieldData2.getCurrAssetsYr();
        boolean boolean8 = fieldData2.isDrp();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01975");
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
        companyFileData8.setState("out/BigDB/0/Q-1/NONE-fundamental-data-0Q-1.out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01976");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("NONE");
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01977");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData2.getLtInvestYr();
        double[] doubleArray5 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData2.getPrefStockYr();
        java.lang.String str7 = balSheetFileData2.getExchange();
        java.lang.String str8 = balSheetFileData2.toDbOutput();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01978");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = companyFileData0.getExchange();
        companyFileData0.setCity("out/BigDB/1/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n-fundamental-data-1Q10.ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str11 = companyFileData0.getCountry();
        companyFileData0.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01979");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getSalesQtr();
        double[] doubleArray10 = incSheetFileData5.getIncTaxYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01980");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        double[] doubleArray6 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01981");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData9);
        java.lang.String str11 = cashFileData9.toDbOutput();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01982");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        int int4 = fieldData2.getQuarter();
        double[] doubleArray5 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = fieldData2.getExchange();
        double[] doubleArray8 = fieldData2.getCashYr();
        double[] doubleArray9 = fieldData2.getSharesQ();
        int int10 = fieldData2.getInsiderSells();
        java.lang.String str11 = fieldData2.getWeb();
        java.lang.String str12 = fieldData2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01983");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double double8 = fieldData2.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = fieldData2.getGrossIncYr();
        double[] doubleArray11 = fieldData2.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double[] doubleArray4 = sharesFileData0.getSharesY();
        int int5 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01985");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume10d("out/BigDB/");
        int int6 = sharesFileData0.getInsiderSellShrs();
        double double7 = sharesFileData0.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01986");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        int int6 = sharesFileData0.getInstShareholders();
        java.lang.String str7 = sharesFileData0.getSector();
        sharesFileData0.setInsiderBuys("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        sharesFileData0.setMktCap("out/BigDB/100/Q0/Cash File Data-fundamental-data-100Q0.out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        sharesFileData0.setFromReport((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01987");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01988");
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
        boolean boolean38 = fieldData35.isDrp();
        double double39 = fieldData35.getInsiderNetPercentOutstanding();
        double[] doubleArray40 = fieldData35.getEpsDilYr();
        double[] doubleArray41 = fieldData35.getAcctPayableYr();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsQ0();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData1.getLatestQtrEps();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01990");
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
        double[] doubleArray16 = incSheetFileData5.getIntExpQtr();
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
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01991");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        java.lang.String str4 = fieldData2.getIndustry();
        double[] doubleArray5 = fieldData2.getNetFixedAssetsYr();
        java.lang.String str6 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = cashFileData7.getCashFromOpsQtr();
        double[] doubleArray9 = cashFileData7.getCashFromOpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01992");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01993");
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
        double double17 = sharesFileData0.getDollar3m();
        sharesFileData0.setInstSellShrs("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01994");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        double[] doubleArray7 = fieldData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01995");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getLtDebtYr();
        double[] doubleArray9 = fieldData2.getCashQtr();
        double[] doubleArray10 = fieldData2.getCogsQtr();
        double[] doubleArray11 = fieldData2.getAcctPayableQtr();
        double[] doubleArray12 = fieldData2.getAcctPayableQtr();
        java.lang.String str13 = fieldData2.getName();
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
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01996");
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
        double double12 = fieldData2.getFloatshr();
        double[] doubleArray13 = fieldData2.getGrossIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01997");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray3 = incSheetFileData1.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01998");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getEpsYr();
        double[] doubleArray11 = fieldData2.getIntExpQtr();
        double[] doubleArray12 = fieldData2.getStInvestQtr();
        double[] doubleArray13 = fieldData2.getIncTaxYr();
        double[] doubleArray14 = fieldData2.getLtDebtYr();
        double double15 = fieldData2.getEpsY2();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test01999");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean13 = companyFileData12.isAdr();
        java.lang.String str14 = companyFileData12.getState();
        companyFileData12.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData12);
        incSheetFileData5.setNameFields(companyFileData17);
        double[] doubleArray19 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray20 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray21 = incSheetFileData5.getEpsYr();
        double[] doubleArray22 = incSheetFileData5.getDividendYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests3.test02000");
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
        double double13 = fieldData2.getPrice52lo();
        double[] doubleArray14 = fieldData2.getEpsDilContQtr();
        double double15 = fieldData2.getBeta();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }
}
