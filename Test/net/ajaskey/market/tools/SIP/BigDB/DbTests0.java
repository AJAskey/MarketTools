package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTests0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0001");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) -1, (int) 'a', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0002");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncSheetData(fieldData0);
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCashFromFinQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getTotalOpExpQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0005");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 1, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNonrecurringItemsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNetIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDepreciationYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsY0(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getGoodwillQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsContYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getAdjToIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncAfterTaxQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0015");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getAcctRxQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0017");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNumEmployees(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherCurrLiabQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPrefStockQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0021");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCountry(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsDilContYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherCurrLiabYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLiabEquityQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderSellShrs(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncPrimaryEpsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0027");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.Globals.startYear;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2015 + "'", int0 == 2015);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getTotalOpExpYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCurrLiabQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getGrossOpIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0031");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInventoryQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0032");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsDilContQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getGrossIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCity(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getTicker(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDepreciationQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0037");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.Globals.endYear;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2020 + "'", int0 == 2020);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCogsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLtInvestQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInstShareholders(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDollar3m(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0042");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPrice52hi(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsDilYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFloatshr(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLtDebtYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInstOwnership(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getAdjToIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0048");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPhone(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getZip(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCurrAssetsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncTaxQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0053");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, 0, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherLtLiabQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0055");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInstSellShrs(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (byte) -1);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInstBuyShrs(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIntExpYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPreTaxIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDividendYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEquityYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsQ0(fieldData0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getBeta(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getAcctRxYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherLtAssetsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getQuarter(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0069");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncPrimaryEpsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0071");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDividendQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.common.DateTime dateTime1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCurrFiscalYear(fieldData0);
        org.junit.Assert.assertNull(dateTime1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherCurrAssetsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLiabEquityYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDowIndexStr(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCurrAssetsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderNetPercentOutstanding(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getAcctPayableYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsQ1(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNetFixedAssetsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPrefStockYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSharesYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCashData(fieldData0);
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSharesQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getBvpsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderNetTrades(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLtDebtQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getUnusualIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getRdYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0091");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderOwnership(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncAfterTaxYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0094");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, (int) (byte) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0095");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = fieldDataList7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCashFromOpsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIndustry(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSnpIndexStr(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NONE" + "'", str1, "NONE");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsY2(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIntExpQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.common.DateTime dateTime1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLatestQtrEps(fieldData0);
        org.junit.Assert.assertNull(dateTime1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getWeb(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0103");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', 1, filetypeEnum2);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSalesYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherCurrAssetsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCompanyInfo(fieldData0);
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getAcctPayableQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSic(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCashFromInvQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear(2020);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0111");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getStDebtQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getLtInvestYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getGrossOpIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCashQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (byte) 100);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCapExQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getStInvestQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0118");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 1, fieldDataList17);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 10, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getState(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        long long1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getVolumeMonth3m(fieldData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsContQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderBuys(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0124");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSalesQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        long long1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getVolume10d(fieldData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0127");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (-1), filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0128");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 10, 1, filetypeEnum2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getExchange(fieldData0);
        org.junit.Assert.assertNull(exchEnum1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsDilQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0132");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPrice(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIntExpNonOpQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getYear(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getDowIndex(fieldData0);
        org.junit.Assert.assertNull(dowEnum1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getStInvestYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPreTaxIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPrice52lo(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getRdQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSnpIndex(fieldData0);
        org.junit.Assert.assertTrue("'" + snpEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE + "'", snpEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherLtLiabYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getSector(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderBuyShrs(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getPricesQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getUnusualIncYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        int int1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInsiderSells(fieldData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0148");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2020);
        java.lang.Class<?> wildcardClass11 = fieldDataList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCurrLiabYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getBvpsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNetFixedAssetsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCashYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0153");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIncTaxYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, 0, filetypeEnum2);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getStDebtYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getName(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0157");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2020, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', 2015, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) ' ', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEquityQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getBalSheetData(fieldData0);
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getShares(fieldData0);
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEpsY1(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0165");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0166");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 100, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getEstimateData(fieldData0);
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNetIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getNonrecurringItemsYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getStreet(fieldData0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getCogsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0173");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', (int) 'a', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getIntExpNonOpYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getGoodwillYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0176");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) -1, (-1), filetypeEnum2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0177");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 0, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (short) 100);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (byte) 1);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0181");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) '4', (int) (short) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getGrossIncQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double double1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getMktCap(fieldData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0185");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = fieldDataList17.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0186");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0187");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (short) 10);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear(1);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0189");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) '4', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0190");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) ' ');
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0191");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0192");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0194");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 2020, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 0, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0197");
        net.ajaskey.market.tools.SIP.BigDB.MarketTools marketTools0 = new net.ajaskey.market.tools.SIP.BigDB.MarketTools();
        java.lang.Class<?> wildcardClass1 = marketTools0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0198");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0199");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, 10, fieldDataList2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0200");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, 2015, filetypeEnum2);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getOtherLtAssetsQtr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear(0);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0204");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = fieldDataList8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2020, (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '#', (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) ' ');
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0208");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData0 = null;
        double[] doubleArray1 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getInventoryYr(fieldData0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0210");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0211");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', (int) (byte) 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear(10);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0213");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0214");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, 100, filetypeEnum2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, 1, filetypeEnum2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0216");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0217");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0218");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), 2015, filetypeEnum2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0221");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 0, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) '#', (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0224");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (short) -1);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (short) 1);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0228");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0229");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0231");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 0, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0232");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, (int) '4', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0233");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 1, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0234");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0236");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0237");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory(strList0, (int) (short) 1, 100);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0238");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) '#', fieldDataList12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, 2020, filetypeEnum2);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) '4');
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0241");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) ' ', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0242");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0243");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, 2020);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0244");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0245");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0246");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2020, 2015, filetypeEnum2);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) '#');
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0248");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 2015, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0249");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) 100, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0250");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0251");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (-1), filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0252");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, (int) (short) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0253");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 10, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 2020, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList5, fieldDataArray4);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList5);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0256");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear(2015);
// flaky:         org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0258");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0259");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', 0, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0260");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0261");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0262");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 2015, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0263");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0264");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] fieldDataYearArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear> fieldDataYearList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>) fieldDataYearList1, fieldDataYearArray0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        java.lang.Class<?> wildcardClass7 = fieldDataYearList1.getClass();
        org.junit.Assert.assertNotNull(fieldDataYearArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0265");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (short) 10, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0266");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, 0, filetypeEnum2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (-1), (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0269");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 1, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 100, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0273");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, 100, filetypeEnum2);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0274");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0275");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0276");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0277");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) -1, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0278");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0279");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0280");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) -1, fieldDataList2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0281");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0282");
        net.ajaskey.market.tools.SIP.BigDB.Globals globals0 = new net.ajaskey.market.tools.SIP.BigDB.Globals();
        java.lang.Class<?> wildcardClass1 = globals0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0283");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0285");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', 100, filetypeEnum2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0287");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 1, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0288");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, (-1), filetypeEnum2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0289");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 100, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0291");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0292");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', 10, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0293");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0294");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 10, (int) (byte) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0295");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0296");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0297");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear(100);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0298");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0299");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0300");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) ' ', fieldDataList11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0301");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0302");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100, (int) (short) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0303");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, 2015, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0304");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 0, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, 0, filetypeEnum2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0306");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = fieldDataList14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 10, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0308");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0309");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 0, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0311");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 100, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0314");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, 0, filetypeEnum2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0315");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (short) 100, fieldDataList2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0316");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) '4', filetypeEnum2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0317");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (-1), fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0318");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (byte) 1, fieldDataList16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0320");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0321");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', 0, filetypeEnum2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0322");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) -1, (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0323");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', 2020, filetypeEnum2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0324");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) -1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0325");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) -1, (-1), filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0326");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) ' ', (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) (short) 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0328");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) '4', 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0330");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, 2020, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) ' ', (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0333");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass20 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0334");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0336");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', 100, filetypeEnum2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0337");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory(strList0, (int) '4', (-1));
        java.lang.Class<?> wildcardClass4 = fieldDataList3.getClass();
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 0, (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0339");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '#', (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0340");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, 0, filetypeEnum2);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0341");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0342");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass20 = fieldDataList19.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0343");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', 2015, filetypeEnum2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) (byte) 10, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 2015, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0347");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0348");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) -1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0349");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList11, (int) (short) 100, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (short) 0, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 0, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (short) 10, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 0, fieldDataList15);
        java.lang.Class<?> wildcardClass20 = fieldDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0350");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (-1), filetypeEnum2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0351");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2020, 0, filetypeEnum2);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', (int) ' ', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0353");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, 10, filetypeEnum2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0354");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0355");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0356");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 0, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0358");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0359");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (short) -1, fieldDataList18);
        java.lang.Class<?> wildcardClass20 = fieldDataList18.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0360");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 100, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) 'a', (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0362");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0363");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) '#', fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0364");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', (int) (short) 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0365");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) ' ', 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0367");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0370");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, (int) (byte) 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) '#', 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0372");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 10, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0373");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 0, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] fieldDataYearArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear> fieldDataYearList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>) fieldDataYearList1, fieldDataYearArray0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        java.lang.Class<?> wildcardClass8 = fieldDataYearList1.getClass();
        org.junit.Assert.assertNotNull(fieldDataYearArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0375");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0376");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 100, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) -1, 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0379");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] fieldDataYearArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear> fieldDataYearList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>) fieldDataYearList1, fieldDataYearArray0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        java.lang.Class<?> wildcardClass10 = fieldDataYearList1.getClass();
        org.junit.Assert.assertNotNull(fieldDataYearArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0380");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 0, (int) (byte) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0381");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0382");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) '4', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0383");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) ' ');
        java.lang.Class<?> wildcardClass14 = fieldDataList13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0384");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (-1), filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0385");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0386");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, 100, filetypeEnum2);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0387");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) 100, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (short) 0, fieldDataList13);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 0, fieldDataList13);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (short) 100, fieldDataList13);
        java.lang.Class<?> wildcardClass17 = fieldDataList13.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0388");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0389");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', 2020, filetypeEnum2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 10, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0391");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) 'a', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0394");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0395");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (short) 0);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0396");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) ' ', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0397");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', (int) '#', filetypeEnum2);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0398");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 2015, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 0, fieldDataList10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0399");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 100, (int) (short) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0400");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0401");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) ' ');
        java.lang.Class<?> wildcardClass32 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(fieldDataList28);
        org.junit.Assert.assertNotNull(fieldDataList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0402");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0403");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 1);
        java.lang.Class<?> wildcardClass17 = fieldDataList16.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0404");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((-1));
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0407");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 10, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0408");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', 10, filetypeEnum2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0409");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0410");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, 2015, filetypeEnum2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0411");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) ' ', 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0412");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0413");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (-1), 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, (int) (short) 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0416");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, 2015, filetypeEnum2);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '4', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0418");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) ' ', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0421");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass12 = fieldDataList11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0422");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) 'a', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0423");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0424");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', 100);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0425");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0426");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (short) 0, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 100, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2020, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0429");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) -1, 0, filetypeEnum2);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0430");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 1, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) 100, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0434");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', (int) '4', filetypeEnum2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 2015, (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0436");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, 1, filetypeEnum2);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0438");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0439");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0440");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0441");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', (int) (byte) 100, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0442");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, 2015, filetypeEnum2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0443");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (byte) 10);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0445");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (short) 0, fieldDataList13);
        java.lang.Class<?> wildcardClass15 = fieldDataList13.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0447");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0448");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) -1, (int) '#', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 100, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0450");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0451");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) -1, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0452");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, 10, filetypeEnum2);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0453");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 100, (int) (short) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0454");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 1, 2015, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0455");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', 10);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0456");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 100, 2020, filetypeEnum2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0457");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0458");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0459");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0460");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (-1));
        java.lang.Class<?> wildcardClass15 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0461");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, 10, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0462");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0463");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0464");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) (byte) -1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0465");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0466");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (int) (short) 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0467");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0468");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, 2015, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) -1, fieldDataList17);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (-1), fieldDataList17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0469");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0470");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 0, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0472");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0473");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((-1), (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0474");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) ' ', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0475");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', (-1), filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0476");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0477");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) 'a', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0479");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) '#', 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0480");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 10, (int) (short) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0481");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, 0, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0482");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (-1), fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0483");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0484");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0485");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0487");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) (byte) 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0488");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0489");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 2015, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0490");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0491");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, 1, filetypeEnum2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0492");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0493");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 2015, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (byte) -1, fieldDataList16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0494");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0495");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 1, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0497");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0498");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) (short) 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) -1, (int) '4', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests0.test0500");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (-1), filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}
