package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTests2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1001");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1002");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 10, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1005");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, (int) (short) 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 0, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1008");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) 10, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1009");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', (int) 'a', filetypeEnum2);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1010");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 1, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1012");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1013");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1014");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1015");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1016");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, 1, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1017");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) '#', filetypeEnum2);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1018");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2015, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1019");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1020");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1021");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1023");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1024");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (short) 1, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1025");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 10, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1026");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1027");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1028");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (-1), 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1029");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1030");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1031");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) -1, fieldDataList2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1032");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) (short) 10, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1033");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 0, fieldDataList17);
        java.lang.Class<?> wildcardClass19 = fieldDataList17.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1034");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(100, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 10, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1036");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1037");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 2015, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1038");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (-1), filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (-1), (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1040");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((-1), (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1042");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 2020, fieldDataList2);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1043");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1044");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = fieldDataList18.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1047");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 10, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1048");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (byte) 1, fieldDataList11);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) ' ', fieldDataList11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1049");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, (int) (short) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1050");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1051");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 10, 2020, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1052");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1053");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1054");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (-1), (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1055");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1056");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1057");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1058");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1059");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 2020);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1060");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1061");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1062");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1063");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 100, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 0, fieldDataList13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1064");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) '4', filetypeEnum2);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1065");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, 2015);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1066");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', 2020);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 0, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1068");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1069");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (short) 10, fieldDataList14);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) '#', fieldDataList14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1070");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', 2015, filetypeEnum2);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1071");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1072");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2020, (int) '4', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1074");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (-1), fieldDataList9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1075");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1076");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1077");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass23 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1078");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) '4', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1079");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), 2015);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1080");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) -1, (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1081");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1082");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1083");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1084");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1085");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (-1), (int) '4', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1086");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), (int) 'a', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 100, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1088");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1089");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) '4', filetypeEnum2);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1090");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1091");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 100, 2015, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1092");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) '4', (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1094");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, 2020, filetypeEnum2);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1095");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', 1, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1096");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 2015, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1097");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', (int) (short) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1099");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) -1, 0, filetypeEnum2);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1100");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1101");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, 2015, filetypeEnum2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1103");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1104");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 1, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1108");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1110");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, (int) '4', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1111");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 100, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1112");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, 10, filetypeEnum2);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1113");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1114");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) '4', (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1116");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(100, (int) (byte) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#', (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1118");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (byte) 10, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1119");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1120");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (short) 10, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 2015, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1122");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1123");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1124");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', fieldDataList27);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1125");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (-1), 2020, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1126");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1127");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1128");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, 2020, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1129");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1130");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 1, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1132");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 10, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (-1), fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) 10, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1133");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1135");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass25 = fieldDataList24.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1136");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, 2020, filetypeEnum2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1137");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1138");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', (int) (short) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1139");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 2020);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1140");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1142");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1143");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100, (int) (short) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 0, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1145");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 1, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1146");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1147");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1148");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) ' ', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1150");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1151");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1152");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, 100, filetypeEnum2);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1153");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1154");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), (int) '4', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1155");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 10, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 2015, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1158");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 1, (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1160");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1162");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1163");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1164");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', (int) (short) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1165");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1166");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1167");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (short) 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1168");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1170");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1171");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1173");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, 0, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1174");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1175");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 2015, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) -1, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1177");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) (short) 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1178");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1180");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1181");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 10, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1183");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1185");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) '4', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1186");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1187");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass29 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1188");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1189");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1191");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = fieldDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1192");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, (int) (byte) 10, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1194");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1195");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1196");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (short) 100, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 2020, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) ' ', fieldDataList15);
        java.lang.Class<?> wildcardClass19 = fieldDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1197");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) (short) -1, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1198");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1199");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (-1));
        java.lang.Class<?> wildcardClass16 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1200");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 10, (int) (short) 10, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1202");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 2015);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1203");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 10, 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) '4', 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1205");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1206");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 100, 2015, filetypeEnum2);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 10, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1208");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, (int) (byte) -1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1209");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '#');
        java.lang.Class<?> wildcardClass22 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1210");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 100, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1211");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1212");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2015, (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1213");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1214");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1215");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', 10, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1216");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1217");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, 1, filetypeEnum2);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1218");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) 'a', 2015);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1219");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '4', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1221");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 2015);
        java.lang.Class<?> wildcardClass22 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1222");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 2015, fieldDataList24);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1223");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(100, 2020);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1224");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1225");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1226");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 2015, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 10, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 1, fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1227");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2015);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 0, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1229");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (-1), 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1231");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '#');
        java.lang.Class<?> wildcardClass29 = fieldDataList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1232");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1233");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 10, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1234");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1235");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1236");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 0, 2020, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1237");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (short) 1, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (-1), (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1239");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', 2020, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1240");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1241");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), 2020);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1242");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '4', 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1244");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1245");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, 0, filetypeEnum2);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1246");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1248");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1249");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 10, fieldDataList14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1250");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1251");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, (-1), filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1252");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1253");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) ' ', fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1254");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (short) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) '#', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1256");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 0, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1257");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1258");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '#', (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) ' ', (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1261");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1262");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (-1), fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 1, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1264");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 100, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1265");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1266");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2015, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 2020, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1269");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1270");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1271");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 100, (int) (short) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1272");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1273");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(100, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1274");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '4', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1275");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1276");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1277");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1278");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1279");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, 2020, filetypeEnum2);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1280");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1281");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1282");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 1, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1284");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, (int) (short) 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1285");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1287");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(100, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1288");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1289");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) '#', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1290");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) -1, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1292");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (byte) 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1293");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1294");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1295");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 0, (int) 'a', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1296");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2020, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1297");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1298");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1299");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "NONE" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) 0, fieldDataList9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 100, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1301");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2020, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1302");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 100, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1304");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', 0, fieldDataList26);
        java.lang.Class<?> wildcardClass28 = fieldDataList26.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1305");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) 10, fieldDataList2);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1306");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1307");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 10, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 2020, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1309");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1310");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', 2015, filetypeEnum2);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1312");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1313");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '4', (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1314");
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
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        java.lang.Class<?> wildcardClass14 = fieldDataYearList1.getClass();
        org.junit.Assert.assertNotNull(fieldDataYearArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1315");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) ' ', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1316");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '#', 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1317");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 100, 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1318");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1320");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1321");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) 'a', (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1322");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1323");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1324");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 10, (int) (short) 10, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1325");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, 2020, filetypeEnum2);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (-1), 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1327");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2020, (-1), filetypeEnum2);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1328");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1329");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1330");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) -1, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 0, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 0, fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1331");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1332");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "NONE" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 2015, fieldDataList9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1333");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 2015, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1334");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1335");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1336");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2015, (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1337");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (byte) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1338");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1339");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1340");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) 'a', 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '4', 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1343");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1344");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 1, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1345");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 2015, (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1346");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 1, (int) (short) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1347");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1348");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1349");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (byte) 0, fieldDataList20);
        java.lang.Class<?> wildcardClass22 = fieldDataList20.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1350");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1352");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1353");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 100, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 2020, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 0, fieldDataList19);
        java.lang.Class<?> wildcardClass21 = fieldDataList19.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1354");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (-1), filetypeEnum2);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1355");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) 'a', (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1356");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1357");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, 2020);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1358");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.lang.Class<?> wildcardClass11 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1359");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1361");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1362");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, 10, filetypeEnum2);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1363");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass16 = fieldDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1364");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) 0, 2015);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1365");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass29 = fieldDataList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1366");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass23 = fieldDataList22.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1367");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 0, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1369");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, 10, filetypeEnum2);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1371");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 0);
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1372");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1373");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, 100, filetypeEnum2);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1374");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1375");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1376");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1377");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (short) 1, fieldDataList35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(fieldDataList32);
        org.junit.Assert.assertNotNull(fieldDataList35);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1379");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 2015, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1381");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, 100, filetypeEnum2);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1382");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (short) -1, fieldDataList23);
        java.lang.Class<?> wildcardClass25 = fieldDataList23.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1383");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1384");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1385");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (short) 0, fieldDataList20);
        java.lang.Class<?> wildcardClass22 = fieldDataList20.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1386");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 0, fieldDataList2);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1387");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 0, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1388");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) -1, fieldDataList16);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 1, fieldDataList16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1389");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1390");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) 'a', fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 10, fieldDataList19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1391");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 2015, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 1, fieldDataList16);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) '4', fieldDataList16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1392");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', (int) (byte) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1393");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, 1, filetypeEnum2);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1394");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) ' ', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1395");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1396");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1397");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1398");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 100, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1400");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1401");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1402");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass16 = fieldDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1403");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1404");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
        org.junit.Assert.assertNotNull(fieldDataList33);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1405");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) -1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1407");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, 0, filetypeEnum2);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1408");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 0, fieldDataList11);
        java.lang.Class<?> wildcardClass13 = fieldDataList11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1409");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1410");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1411");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (short) -1, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1412");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2020, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1413");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1414");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1415");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 10, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1416");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (byte) 1, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1418");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1419");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1420");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) 'a', 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1421");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) -1, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1423");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '4', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1425");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1426");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1427");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1428");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 100, (int) (byte) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1429");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2020, 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) ' ', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 2015, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1432");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 1, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList17);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) '4', fieldDataList17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 100, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1434");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 0, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1435");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1436");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) ' ', (int) (short) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1437");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, 2020, filetypeEnum2);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1438");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1439");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1440");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1441");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1442");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2015, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1443");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1444");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(1, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1446");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1447");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) '4', (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1448");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1449");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1450");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 10, (int) 'a', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1451");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 2020);
        java.lang.Class<?> wildcardClass25 = fieldDataList24.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1452");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 2020, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1453");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) 'a', fieldDataList20);
        java.lang.Class<?> wildcardClass22 = fieldDataList20.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1454");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1455");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1456");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 2015, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1457");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1458");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 10, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1460");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1461");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) -1, 10, filetypeEnum2);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1462");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 2015, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1463");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (byte) 0, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1464");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100, (int) (short) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1465");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', 2020, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1466");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1467");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1468");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 2020, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1469");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1470");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) -1, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1473");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, 2020, filetypeEnum2);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1474");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (-1), (-1), filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 0, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1476");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1477");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1478");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1479");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) -1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1481");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, 10, 2020);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1483");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2020, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1484");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 10);
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
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1485");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), 10, filetypeEnum2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 0, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1487");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1488");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1489");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1491");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1492");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1493");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1494");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1496");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 2020);
        java.lang.Class<?> wildcardClass22 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1497");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1498");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) 'a', 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1499");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests2.test1500");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

