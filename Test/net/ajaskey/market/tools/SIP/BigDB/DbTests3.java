package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTests3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1501");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ');
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1502");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1503");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 0, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1504");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(10, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1506");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1507");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (byte) -1);
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1508");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1509");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, (int) 'a', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1510");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, 0);
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1511");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 1, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1512");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 10, 2020, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1513");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) 'a', 2015, filetypeEnum2);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1515");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) 'a', fieldDataList30);
        java.lang.Class<?> wildcardClass32 = fieldDataList30.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1516");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1517");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) 'a', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1518");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) '4');
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1519");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1520");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 0, (int) (short) 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1521");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 0, fieldDataList12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1522");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 10);
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1523");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1524");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1525");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) -1, (int) (byte) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1526");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory(strList0, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1527");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1528");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1529");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1530");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (-1));
        java.lang.Class<?> wildcardClass13 = fieldDataList12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1531");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1532");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (-1), filetypeEnum2);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1533");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1534");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 100);
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1535");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1536");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1537");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1538");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1539");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, 100, (-1));
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1540");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1541");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 2020, 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1542");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) -1, (int) (short) 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1543");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (short) 0);
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1544");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory(strList0, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1545");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 1);
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1546");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) 'a', fieldDataList35);
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1547");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1548");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1549");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) ' ', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1550");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1551");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) '4', fieldDataList18);
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1552");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) 'a', (int) (short) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1553");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1554");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1555");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (int) 'a', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1556");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 10, (-1), filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1557");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 0, (int) ' ', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1558");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '4');
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1559");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1560");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) -1, fieldDataList33);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1561");
        java.util.List<java.lang.String> strList2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList2, (int) (byte) 0, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', 0, fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataList5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1562");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, 2020, filetypeEnum2);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1563");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 0, (int) (byte) 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1565");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, 2015, filetypeEnum2);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1566");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) 'a');
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1567");
        java.util.List<java.lang.String> strList4 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList4, 1, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 1, fieldDataList7);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) -1, fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList7);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1568");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, (int) 'a', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1569");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) ' ', fieldDataList36);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
        org.junit.Assert.assertNotNull(fieldDataList33);
        org.junit.Assert.assertNotNull(fieldDataList36);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1570");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 0, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1571");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 10, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1572");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1573");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, (int) (byte) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1574");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, 2015, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1575");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, 10, filetypeEnum2);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1576");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '#', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList7, 2020, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 0, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) -1, fieldDataList29);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 0, fieldDataList29);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1577");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 2015);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1578");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1579");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 1, (int) '#', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1580");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, 10, filetypeEnum2);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1581");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (byte) -1, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1582");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
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
        org.junit.Assert.assertNotNull(fieldDataList34);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1583");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) -1);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1584");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, 1, filetypeEnum2);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1585");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) 'a', 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1586");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) 'a', 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1587");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1588");
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
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        org.junit.Assert.assertNotNull(fieldDataYearArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1589");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 10, fieldDataList2);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1590");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (-1), fieldDataList8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1591");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1592");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (-1), filetypeEnum2);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1593");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1594");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 2015, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1595");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1596");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 100, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1597");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1598");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 1);
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1599");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 100, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1600");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, 2015, 0);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1601");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1602");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1603");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#', (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1604");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1606");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (-1), (-1));
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1607");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1608");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (-1), fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 10, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1609");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', 0, filetypeEnum2);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1610");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, (int) ' ', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1611");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 1, 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1612");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 1, fieldDataList11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1613");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = fieldDataList9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1614");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 10, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1615");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 0);
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1616");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 1);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1617");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) '#');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1618");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) '4', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1619");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 0, (int) (short) 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1620");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1621");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1622");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) 'a', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1623");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1624");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1625");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (short) 10);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1626");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1627");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) ' ');
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1628");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1629");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 1);
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1630");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1631");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1632");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 1);
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1633");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1634");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, 2015, filetypeEnum2);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1635");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, 2015);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1636");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (-1), (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1637");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1638");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, 100, filetypeEnum2);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1639");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1640");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((-1), 2015, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1641");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1642");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1643");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 100);
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
        org.junit.Assert.assertNotNull(fieldDataList34);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1644");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1645");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 1, (int) (short) -1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1646");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 100, 10, filetypeEnum2);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1647");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 1, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 1, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1649");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 1, fieldDataList26);
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1650");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 10, 2015, filetypeEnum2);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1651");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 0, fieldDataList24);
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1652");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, 2020, filetypeEnum2);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1653");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1654");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2020, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1655");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) -1, (int) '4', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1656");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2015, 0, filetypeEnum2);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1657");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1658");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1659");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '#', (int) 'a', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1660");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 2015);
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
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1661");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 2020, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList6, 2015, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) ' ', fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) 0, fieldDataList19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1662");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 1, (int) (short) 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1663");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) -1, 2020, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1664");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 1);
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1665");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 0, (-1), filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1666");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', 2020);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1667");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (short) 100);
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1668");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((-1), 10, filetypeEnum2);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1669");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) ' ');
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1670");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) (byte) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1671");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, (-1), filetypeEnum2);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1672");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 0);
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
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1673");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 10, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) 'a', fieldDataList33);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1674");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) '4', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1675");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1676");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, (int) (byte) 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1677");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 1, (int) (byte) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1678");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 10);
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1679");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '4', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1680");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 10, (-1), filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1681");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, 2015);
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1682");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (-1), 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1683");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 2020);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1684");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 0);
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1685");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) ' ', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1686");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList9, 2015, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) ' ', fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (-1), fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) ' ', fieldDataList28);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(fieldDataList28);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1687");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 2020);
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1688");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 10, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) 1, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1689");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) '4', 2020, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1690");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 100);
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1691");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) '4', fieldDataList2);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1692");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) 'a');
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1693");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1694");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 10, fieldDataList24);
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1695");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1696");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1697");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, (int) (short) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1698");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, (int) '4', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1699");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 0);
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
        org.junit.Assert.assertNotNull(fieldDataList34);
        org.junit.Assert.assertNotNull(fieldDataList37);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1700");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 100);
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1701");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 0, (int) (byte) 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1702");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) -1, (int) (byte) 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests3.test1703");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 100, fieldDataList30);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(fieldDataList30);
    }
}

