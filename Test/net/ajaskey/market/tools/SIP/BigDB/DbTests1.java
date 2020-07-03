package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTests1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0501");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0502");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) ' ');
        java.lang.Class<?> wildcardClass15 = fieldDataList14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0503");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, 2020);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0504");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 0, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0506");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, 2020);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0507");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2020, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0508");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 2020, fieldDataList2);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0509");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 100, fieldDataList10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.Globals globals0 = new net.ajaskey.market.tools.SIP.BigDB.Globals();
        java.lang.Class<?> wildcardClass1 = globals0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0511");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0512");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 1, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0513");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 1, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList16);
        java.lang.Class<?> wildcardClass18 = fieldDataList16.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) -1, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0515");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) 'a', (int) (byte) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0516");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0517");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0518");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0519");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) -1, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0523");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, (int) (byte) 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0524");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0525");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList3, fieldDataArray2);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList3);
        java.lang.Class<?> wildcardClass6 = fieldDataList3.getClass();
        org.junit.Assert.assertNotNull(fieldDataArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0526");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) ' ', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0527");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, 10, filetypeEnum2);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0530");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0531");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, (int) (byte) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0532");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, (-1), filetypeEnum2);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0533");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, 1, filetypeEnum2);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0534");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0535");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', 2015);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0536");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0537");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, 100, filetypeEnum2);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0538");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0539");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) ' ', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0540");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0541");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0542");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (short) -1, (int) '4', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0543");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0544");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(100, (int) 'a', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0545");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (short) 0, fieldDataList2);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0546");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0547");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) '4', 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0548");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 2020, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0549");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0550");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0551");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0552");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0553");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0554");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 100, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0555");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0556");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0557");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0558");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 100, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) -1, fieldDataList13);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 10, fieldDataList13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0559");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0560");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2015, (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0561");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0562");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) '4', 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0563");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 100, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0564");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) -1, 2015);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0565");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (byte) -1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0566");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (short) 100, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0567");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '4');
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0568");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0570");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 0, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0571");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) 'a', (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0573");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0574");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0575");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2020, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0577");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) -1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0578");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) ' ', (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0579");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, (int) (short) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, 1, filetypeEnum2);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 100, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0582");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, (int) (byte) 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0584");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0585");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0586");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0587");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0588");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0589");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0590");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, 10, filetypeEnum2);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0591");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0592");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0593");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 10);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0594");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0595");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0596");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0597");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 10, (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0598");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0599");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', 2020);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 100, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0601");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 0, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0602");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0603");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0604");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 2015, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0605");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0606");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0607");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0608");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0609");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 0, fieldDataList14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0610");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 0, fieldDataList11);
        java.lang.Class<?> wildcardClass13 = fieldDataList11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0611");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0612");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 1, 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0613");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) (short) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0614");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', 2020, filetypeEnum2);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0615");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0616");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0617");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) ' ', 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0618");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', (int) (short) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0619");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0620");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, (int) 'a', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0621");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) 'a', 100, filetypeEnum2);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0622");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 2020, 2015, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0623");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0624");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (int) (byte) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0625");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0626");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0627");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0628");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 100, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0629");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0630");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0631");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, 0, filetypeEnum2);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0632");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '#', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0633");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0634");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0635");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0636");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0637");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 0, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0638");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 10, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0639");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, (int) (byte) 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0640");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0641");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (byte) 1, fieldDataList14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0642");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0643");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0644");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 1, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) 'a', fieldDataList16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0645");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) 10, fieldDataList22);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0646");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', (int) '4', filetypeEnum2);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0647");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0648");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 1, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList18);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) ' ', fieldDataList18);
        java.lang.Class<?> wildcardClass21 = fieldDataList18.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0649");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0650");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, 0, filetypeEnum2);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0651");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 1, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0652");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) 'a', (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0653");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "NONE" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.lang.Class<?> wildcardClass11 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0654");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 1, (int) 'a', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0655");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) (short) 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0656");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0657");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 0, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0658");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 2015);
        java.lang.Class<?> wildcardClass15 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0659");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0660");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 0, 2020);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0661");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0662");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0663");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0664");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0665");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0666");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) -1, (-1), filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0667");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 10, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0668");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0669");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (-1), (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 2020, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0672");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 2015, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0673");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) '#');
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0674");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, 2020);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0675");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 2015, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0676");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0677");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (byte) 10);
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0678");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0679");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(100, (int) 'a', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0680");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 100, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0681");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0682");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, 0, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0683");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0684");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0685");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0686");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0687");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, 2020, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0688");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (short) 0, fieldDataList23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0689");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 1, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0690");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (byte) 0, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0691");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(1, 100, filetypeEnum2);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0693");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2015, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, 2020, filetypeEnum2);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0695");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 10, (int) (byte) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0696");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', 100, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0697");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 0, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0698");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0699");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, 2015, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0701");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 1, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0702");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0704");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, 100, filetypeEnum2);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0705");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, (-1), filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0706");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 2020, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0707");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0708");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0709");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0710");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (-1), 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0711");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0712");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 10, fieldDataList11);
        java.lang.Class<?> wildcardClass13 = fieldDataList11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0713");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, (-1), filetypeEnum2);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0714");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) ' ', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0715");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 100);
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 10, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0717");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0718");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '4', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0719");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (short) 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0720");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) ' ', (int) 'a', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0721");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0722");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 10, (int) (byte) 10, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0723");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0725");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0726");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0727");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0728");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0729");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) '4', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0730");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) '#', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0731");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '#');
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0732");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0733");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0734");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) 'a', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0735");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', 2020, filetypeEnum2);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0736");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, 2015);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0737");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0738");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (short) 1, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0739");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 0, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0740");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, (int) 'a', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0741");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) '4', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 10, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0742");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, 2020, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0743");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) (byte) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0744");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '4', (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0745");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0746");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 100, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0747");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 100, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0748");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) -1, 2020, filetypeEnum2);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0750");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 100, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0751");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory(strList0, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0752");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0753");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) 'a', 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0754");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) ' ');
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0755");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) -1, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0756");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 100, 2015);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0757");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, 100, filetypeEnum2);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0758");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0759");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0760");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) '#', fieldDataList23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0762");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', (int) '#', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (short) 10, (int) (short) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0766");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((-1), 2015, filetypeEnum2);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0768");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 100, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0769");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList8, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (short) 100, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 2020, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) -1, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) -1, (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0771");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0772");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 10, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0773");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0774");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0775");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 0, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0776");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, (-1), filetypeEnum2);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0777");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (-1), filetypeEnum2);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (short) 0, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0779");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) -1, 2015);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0780");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0781");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0782");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', 100, filetypeEnum2);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0784");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) 'a', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0785");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 2015, (-1), filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0786");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 10);
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0787");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 100);
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0788");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 1, fieldDataList14);
        java.lang.Class<?> wildcardClass16 = fieldDataList14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0789");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0790");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, 2015, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0791");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 100, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0792");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2020, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2020, (int) (byte) 0, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0794");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (int) '4', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2015, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0796");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(1, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0797");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0798");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 0, (int) '4', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0799");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 0, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0800");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0801");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 10);
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, 100, filetypeEnum2);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0803");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, (int) (byte) 0, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0804");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0805");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0807");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0808");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 100, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0809");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (short) 10, 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0810");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0811");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 10, fieldDataList14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0812");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 10, fieldDataList23);
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0813");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0814");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 1, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0815");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) '#', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0816");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0817");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0818");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2020, (int) (short) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0819");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(1, 1, filetypeEnum2);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0820");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0821");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 0, fieldDataList23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0822");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0823");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, 2015);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0824");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = fieldDataList14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0825");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0826");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2015, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0827");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0828");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 2015, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0829");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 100, (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0830");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) ' ');
        java.lang.Class<?> wildcardClass15 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, 1, filetypeEnum2);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0832");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) ' ', 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0833");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), 100, filetypeEnum2);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0834");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0835");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0836");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '4', (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2020, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0838");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(2020, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0839");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) 'a', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 2020, fieldDataList22);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0840");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0841");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 10);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0842");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) ' ', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0843");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0844");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 100);
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0845");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0846");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, (int) ' ', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0847");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0849");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0850");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, 2020, filetypeEnum2);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0851");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0852");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0854");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 2020);
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0855");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 0, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0856");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 100, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0857");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) '#');
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0858");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) -1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0859");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) 'a', fieldDataList11);
        java.lang.Class<?> wildcardClass13 = fieldDataList11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0860");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) '4', 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0861");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0862");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#', (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0863");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) (byte) 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0864");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, (int) '4', filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0865");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 2015, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0866");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0867");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0868");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 10, (int) (byte) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0869");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', (int) (byte) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0870");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2015, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0871");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, 2020);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0872");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) 'a', fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0873");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (-1), (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0874");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) 'a', 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0875");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 100, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) 'a', (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0877");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 2020);
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0878");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (-1), (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0880");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 1, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0881");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) 'a', fieldDataList2);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0882");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2020);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0883");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, 100, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0884");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (int) (byte) 10, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0887");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0888");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0889");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "NONE" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = fieldDataList7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0890");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((-1), (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0891");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) '#', (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0892");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0894");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (-1), (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0895");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '4');
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0896");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0897");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0898");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 0, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0899");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, 1, 100);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0900");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0901");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 1);
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0902");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) ' ', fieldDataList26);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0903");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0904");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 1, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0905");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0906");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0907");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, 2015, filetypeEnum2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '4', 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0909");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, 1, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0910");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0911");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0912");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0913");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2020, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0914");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) 'a', (int) (short) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0915");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0916");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) '#', 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0917");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2020);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0918");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 1);
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0919");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0, 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0920");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, 100, filetypeEnum2);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0921");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 100, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0923");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0924");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 2020, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0925");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', 2020);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0926");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', 2020, filetypeEnum2);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0927");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 10, (int) (short) 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) ' ');
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0929");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0930");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0931");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, 2015);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0932");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, 2020);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0933");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, 0, filetypeEnum2);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 100, (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0935");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), (int) (byte) 0, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0936");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0937");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 100, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0938");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 2020, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0939");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 100, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) ' ', 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '#', (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0942");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 10, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0944");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0945");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0946");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) 'a', fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0947");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 0);
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0948");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 0, (int) (byte) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '4', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0950");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2020, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0951");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0952");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0953");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0954");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, (int) 'a', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0955");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2015, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0956");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 1, fieldDataList2);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0957");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, 10);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0958");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) (byte) 1, filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0959");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 100, (int) (byte) 10, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0960");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory(strList0, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0961");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass4 = fieldDataList3.getClass();
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0962");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0963");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) '4', filetypeEnum2, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0965");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) 'a', fieldDataList13);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) '4', fieldDataList13);
        java.lang.Class<?> wildcardClass16 = fieldDataList13.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0966");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 1, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList20);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) ' ', fieldDataList20);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (byte) 100, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0967");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) -1);
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0968");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) -1, 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0969");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, 2020, filetypeEnum2);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0970");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0971");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 0, fieldDataList14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0972");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '#', (int) '#', filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0974");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0975");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 2020, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0976");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0977");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) '#', (-1), filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0978");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 1, (-1), filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = net.ajaskey.market.tools.SIP.BigDB.Globals.getYear((int) (byte) -1);
        org.junit.Assert.assertNull(fieldDataYear1);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0980");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(100, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0981");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) -1, (int) (byte) 1, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0982");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, 2015, filetypeEnum2);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0983");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) -1, 0, filetypeEnum2);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0984");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '#');
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0985");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 0, 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0986");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0987");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0988");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0989");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0990");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, 2020, filetypeEnum2);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0991");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 10, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '4', (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', 100, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0994");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0995");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(100, 10, filetypeEnum2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0996");
        boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0997");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, 1, filetypeEnum2);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0998");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", 2015, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test0999");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, 0, filetypeEnum2);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests1.test1000");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 0);
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
}

